package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    public void onTestSuccess(ITestResult result){
        CommonMethods.takeScreenshot(result.getName());
    }

    public void onTestFailure(ITestResult result){
        CommonMethods.takeScreenshot(result.getName());
    }
}
