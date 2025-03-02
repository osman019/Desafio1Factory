import factories.ReportFactory;
import factories.PDFReportFactory;
import factories.ExcelReportFactory;
import factories.CSVReportFactory;
import reports.Report;

public class Client {
    public static void main(String[] args) {
        ReportFactory pdfFactory = new PDFReportFactory();
        Report pdfReport = pdfFactory.createReport();
        pdfReport.generateReport();
        pdfReport.downloadReport();

        ReportFactory excelFactory = new ExcelReportFactory();
        Report excelReport = excelFactory.createReport();
        excelReport.generateReport();
        excelReport.downloadReport();

        ReportFactory csvFactory = new CSVReportFactory();
        Report csvReport = csvFactory.createReport();
        csvReport.generateReport();
        csvReport.downloadReport();
    }
}