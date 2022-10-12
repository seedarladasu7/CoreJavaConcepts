package com.concepts.core.java.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Compares multiple parts of the Report object.
 */
public class ComparatorReportClassWithMulFields {

    public static void main(String[] args) {
        List<Report> reportList = new ArrayList<>();
        reportList.add(new Report("reportKey2", "studentNumber2", "school1"));
        reportList.add(new Report("reportKey4", "studentNumber4", "school6"));
        reportList.add(new Report("reportKey1", "studentNumber1", "school1"));
        reportList.add(new Report("reportKey3", "studentNumber2", "school4"));
        reportList.add(new Report("reportKey2", "studentNumber2", "school3"));

        System.out.println("pre-sorting");
        System.out.println(reportList);
        System.out.println();

        Collections.sort(reportList, Comparator.comparing(Report::getReportKey)
            .thenComparing(Report::getStudentNumber)
            .thenComparing(Report::getSchool));

        System.out.println("post-sorting");
        System.out.println(reportList);
    }

    private static class Report {

        private String reportKey;
        private String studentNumber;
        private String school;

        public Report(String reportKey, String studentNumber, String school) {
            this.reportKey = reportKey;
            this.studentNumber = studentNumber;
            this.school = school;
        }

        public String getReportKey() {
            return reportKey;
        }

        public void setReportKey(String reportKey) {
            this.reportKey = reportKey;
        }

        public String getStudentNumber() {
            return studentNumber;
        }

        public void setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        @Override
        public String toString() {
            return "Report{" +
                   "reportKey='" + reportKey + '\'' +
                   ", studentNumber='" + studentNumber + '\'' +
                   ", school='" + school + '\'' +
                   '}';
        }
    }
}