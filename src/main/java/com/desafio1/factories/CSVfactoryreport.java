package com.desafio1.factories;

import com.desafio1.reports.CSVreport;

import com.desafio1.reports.Reports;

public class CSVfactoryreport implements ReportFactory {
    @Override
    public Reports createReport() {
        return new CSVreport();
}
}
