package com.desafio1.factories;
 
import com.desafio1.reports.Reports;
import com.desafio1.reports.Excelreport;

public class Excelfactoryreport implements ReportFactory {
    @Override
    public Reports createReport() {
        return new Excelreport();
    }
}
