package com.desafio1.reports;

public class Excelreport implements Reports {
    @Override
    public void generateReport() {
        System.out.println("Generating Excel report...");
    }

    @Override
    public void downloadReport() {
        System.out.println("Downloading Excel report...");
    }
}
