package stepdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.MainPageFunctionalities;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUserStepDefs {
    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();

    //steps


    @When("kullanici tarayiciyi baslatir")
    public void kullanici_tarayiciyi_baslatir() {
        Driver.getDriver();
    }
    @Then("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
       Driver.getDriver().get(ConfigReader.getProperty("automation_url"));
    }
    @Then("ana sayfanin gorunur oldugunu test eder")
    public void ana_sayfanin_gorunur_oldugunu_test_eder() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", actualTitle);
    }

    @Then("kullanici signup-login butonuna tiklar")
    public void kullaniciSignupLoginButonunaTiklar() {
      mainPageFunctionalities.signupButton.click();
    }

    @Then("kullanici,New User Signup! in gorunur oldugunu test eder")
    public void kullanici_new_user_signup_in_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(mainPageFunctionalities.signupText.isDisplayed());
    }

    @When("kullanici olarak isim ve maili girer")
    public void kullaniciOlarakIsimVeMailiGirer() {
        mainPageFunctionalities.nameBox.sendKeys("mehmet");
        mainPageFunctionalities.emailBox.sendKeys(Faker.instance().internet().emailAddress());
    }
    @Then("signup butonuna tiklar")
    public void signupButonunaTiklar() {
        mainPageFunctionalities.accountCreatSignupButton.click();

    }

    @Then("acilan sayfada ENTER ACCOUNT INFORMATION yazisinn gorunur oldugunu test eder")
    public void acilanSayfadaENTERACCOUNTINFORMATIONYazisinnGorunurOldugunuTestEder() {
        Assert.assertTrue(mainPageFunctionalities.createAccountPageVerification.isDisplayed());
    }

    @When("kullanici alt bilgiye ulasir")
    public void kullaniciAltBilgiyeUlasir() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true)",mainPageFunctionalities.sayfaninAltındakiEmailBox);
    }

    @And("kullanici subscription yazisini gorur")
    public void kullaniciSubscriptionYazisiniGorur() {
        String actualSubs=mainPageFunctionalities.subscriptionElementi.getText();
        Assert.assertTrue(actualSubs.contains("SUBSCRIPTION"));
    }

    @And("kullanici eposta adresini girer ve ok butonuna tiklar")
    public void kullaniciEpostaAdresiniGirerVeOkButonunaTiklar() {
        mainPageFunctionalities.sayfaninAltındakiEmailBox.sendKeys("almanpanzeri@gmail.com");
        mainPageFunctionalities.sayfaninAltindakiEmailOnayButonu.click();
    }

    @Then("kullanici basariyla abone oldugunu test eder")
    public void kullaniciBasariylaAboneOldugunuTestEder() {
        String actualBasariliAbone=mainPageFunctionalities.basariliAboneYazisiElementi.getText();
        Assert.assertFalse(actualBasariliAbone.contains("You have been successfully subscribed!"));
    }
}
