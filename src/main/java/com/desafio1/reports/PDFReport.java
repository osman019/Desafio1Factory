package com.desafio1.reports;

public class PDFReport implements Reports {
    @Override
    public void generateReport() {
        System.out.println("Generating PDF report...");
    }

    @Override
    public void downloadReport() {
        System.out.println("Downloading PDF report...");
    }
}
