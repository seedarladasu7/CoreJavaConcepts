package com.concepts.core.java.java8;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.KeyStore;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ResourceUtils;

public class KeyStoreManagerTest {
	
	@Autowired
	static ResourceLoader resourceLoader;
	
	static String storename = "newstore";
	
  public static void main(String args[]) throws Exception {
    SSLContext context;
    KeyManagerFactory kmf;
    KeyStore ks;
    char[] storepass = "newpass".toCharArray();
    char[] keypass = "wshr.ut".toCharArray();
    

    context = SSLContext.getInstance("TLS");
    kmf = KeyManagerFactory.getInstance("SunX509");
    
		/*
		 * ClassLoader classLoader = new
		 * KeyStoreManagerTest().getClass().getClassLoader(); File file = new
		 * File(classLoader.getResource("static/"+storename).getFile());
		 */
    
    
    //Resource resource=resourceLoader.getResource("classpath:"+"static/"+storename);
    
    File file = ResourceUtils.getFile("classpath:static/"+storename);


    FileInputStream fin = new FileInputStream(file);
    ks = KeyStore.getInstance("JKS");
    ks.load(fin, storepass);

    kmf.init(ks, keypass);
    context.init(kmf.getKeyManagers(), null, null);
    SSLServerSocketFactory ssf = context.getServerSocketFactory();

    ServerSocket ss = ssf.createServerSocket(5432);
    while (true) {
      Socket s = ss.accept();
      PrintStream out = new PrintStream(s.getOutputStream());
      out.println("Hi");
      out.close();
      s.close();
    }

  }
}

