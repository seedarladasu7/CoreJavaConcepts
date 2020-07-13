package com.concepts.core.java.designpatterns.frontcontroller;

class TeacherView {
	public void display() {
		System.out.println("Teacher View");
	}
}

class StudentView {
	public void display() {
		System.out.println("Student View");
	}
}

class Dispatching {
	private StudentView studentView;
	private TeacherView teacherView;

	public Dispatching() {
		studentView = new StudentView();
		teacherView = new TeacherView();
	}

	public void dispatch(String request) {
		if (request.equalsIgnoreCase("Student")) {
			studentView.display();
		} else {
			teacherView.display();
		}
	}
}

class FrontController {
	private Dispatching dispatching;

	public FrontController() {
		dispatching = new Dispatching();
	}

	private boolean isAuthenticUser() {
		System.out.println("Authentication successfull.");
		return true;
	}

	private void trackRequest(String request) {
		System.out.println("Requested View: " + request);
	}

	public void dispatchRequest(String request) {
		trackRequest(request);

		if (isAuthenticUser()) {
			dispatching.dispatch(request);
		}
	}
}

public class FrontControllerDesign {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("Teacher");
		frontController.dispatchRequest("Student");
	}
}
