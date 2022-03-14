package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class homePage extends util {

    public homePage() {
        PageFactory.initElements(driver, this);
    }

    public void ingresarDNI(String dni) {

        System.out.println("1111555");
        WebElement shadowRoot1 = expandRootElement(driver.findElement(By.xpath("/html/body//openmarket-pe-basic-form")));
        System.out.println("22222");
         WebElement root2 = shadowRoot1.findElement(By.cssSelector("input[aria-label='Nº de DNI']"));
        System.out.println("3333333");
        wait.until(ExpectedConditions.visibilityOf(root2));
        root2.clear();
        root2.sendKeys(dni);

    }

    public void ingresarFechaNacimiento(String fechaNacimiento) {

        WebElement shadowRoot1 = expandRootElement(driver.findElement(By.xpath("/html/body//openmarket-pe-basic-form")));

        WebElement root2 = shadowRoot1.findElement(By.cssSelector("input[aria-label='Fecha de nacimiento']"));
        wait.until(ExpectedConditions.visibilityOf(root2));

        root2.clear();
        root2.sendKeys(fechaNacimiento);
    }

    public void ingresarCell(String cell) {

        WebElement shadowRoot1 = expandRootElement(driver.findElement(By.xpath("/html/body//openmarket-pe-basic-form")));

        WebElement root2 = shadowRoot1.findElement(By.cssSelector("input[aria-label='Nº de celular']"));
        wait.until(ExpectedConditions.visibilityOf(root2));

        root2.clear();
        root2.sendKeys(cell);
    }

    public void clickDescubrela() {
        WebElement shadowRoot1 = expandRootElement(driver.findElement(By.xpath("(/html/body//openmarket-form-button)[1]")));
  //     WebElement shadowRoot1 = expandRootElement(driver.findElement(By.xpath("//*[@id='basic\']/openmarket-pe-basic-form")));

        WebElement root2 = shadowRoot1.findElement(By.cssSelector("bbva-button-default[text='¡Descúbrela!']"));
        wait.until(ExpectedConditions.visibilityOf(root2));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", root2);
    }

    public WebElement expandRootElement(WebElement element) {
        WebElement ele = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",
                element);
        return ele;
    }
}
