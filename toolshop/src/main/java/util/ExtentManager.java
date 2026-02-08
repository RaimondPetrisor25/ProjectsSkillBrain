package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports createInstance() {
        ExtentSparkReporter spark = new ExtentSparkReporter("report/report.html");

        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Test report");
        spark.config().setReportName("Test report");

        extent = new ExtentReports();
        extent.attachReporter(spark);

        return extent;
    }

    public static ExtentTest startTest(String name){
        test = extent.createTest(name);
        return  test;
    }

    public static void endReport() {
        if (extent != null) {
            extent.flush();
        }
    }
        public static ExtentTest getTest(){
            return test;
        }

}
