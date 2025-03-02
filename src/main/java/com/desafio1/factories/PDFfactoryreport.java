package com.desafio1.factories;

import com.desafio1.reports.PDFReport;
import com.desafio1.reports.Reports;

public class PDFfactoryreport implements ReportFactory {
  @Override
    public Reports createReport() {
        return new PDFReport();
}
}
