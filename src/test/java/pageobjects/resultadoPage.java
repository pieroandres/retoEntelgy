package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class resultadoPage extends util {

    @FindBy(xpath = "//body/div[@id='app__content']/openmarket-pe-secure-card-template[@id='exit-filters-to-step-one']/openmarket-typography[1]") protected WebElement txtResultado;

    public resultadoPage() {
        PageFactory.initElements(driver,this);
    }

    public void compararTexto(String texto){
        wait.until(ExpectedConditions.visibilityOf(txtResultado));
        Assert.assertEquals(txtResultado.getText(),texto);
    }

}
