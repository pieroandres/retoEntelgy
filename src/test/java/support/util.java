package support;

import definitions.hooks;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class util extends hooks{
    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    public static Alert dialogo;

    public util() {
        wait = new WebDriverWait(driver,30);
        js = (JavascriptExecutor) driver;

    }

}
