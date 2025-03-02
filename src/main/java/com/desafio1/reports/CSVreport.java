package com.desafio1.reports;

public class CSVreport implements Reports {
    @Override
    public void generateReport() {
        System.out.println("Generating CSV report...");
    }

    @Override
    public void downloadReport() {
        System.out.println("Downloading CSV report...");
    }
}
