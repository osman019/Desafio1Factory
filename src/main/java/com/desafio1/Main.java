package com.desafio1;

import com.desafio1.factories.ReportFactory;
import com.desafio1.factories.PDFfactoryreport;
import com.desafio1.factories.Excelfactoryreport;
import com.desafio1.factories.CSVfactoryreport;
import com.desafio1.reports.Reports;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de reporte que desea generar:");
        System.out.println("1. PDF");
        System.out.println("2. Excel");
        System.out.println("3. CSV");
        System.out.print("Ingrese su opción (1/2/3): ");
        
        int option = scanner.nextInt();
        ReportFactory reportFactory = null;

        if (option == 1) {
            reportFactory = new PDFfactoryreport();
        } else if (option == 2) {
            reportFactory = new Excelfactoryreport();
        } else if (option == 3) {
            reportFactory = new CSVfactoryreport();
        } else {
            System.out.println("Opción no válida.");
            System.exit(0);
        }

        Reports report = reportFactory.createReport();
        report.generateReport();
        report.downloadReport();
    }
}