package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ContactUsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ContactUsStepDefs {
    ContactUsPage  contactUsPage=new ContactUsPage();

    @Then("kullanici contact us butonuna tiklar")
    public void kullanici_contact_us_butonuna_tiklar() {

        contactUsPage.contactUsButonu.click();
    }
    @Then("kullanici get in touch gorunur oldugunu test eder")
    public void kullanici_get_in_touch_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(contactUsPage.getInTouchYazisi.isDisplayed());
    }
    @Then("kullanici, adi eposta adresi konu ve mesaji girer")
    public void kullanici_adi_eposta_adresi_konu_ve_mesaji_girer() {
        Actions actions=new Actions(Driver.getDriver());
       actions.click(contactUsPage.nameButonu).sendKeys("Mario Gomez").sendKeys(Keys.TAB).sendKeys("almanpanzeri@gmail.com")
               .sendKeys(Keys.TAB).sendKeys("Sikayet").sendKeys(Keys.TAB).sendKeys("siteniz cok kotu").perform();


    }
    @Then("kullanici dosyayi yukler")
    public void kullanici_dosyayi_yukler() {
        String dosyaYolu=System.getProperty("user.home")+("\\Desktop\\Sikayet\\automation.docx");
        contactUsPage.dosyaSecButonu.sendKeys(dosyaYolu);

    }
    @Then("kullanici gonder butonuna tiklar")
    public void kullanici_gonder_butonuna_tiklar() {
        contactUsPage.gonderButonu.click();

    }
    @Then("kullanici ok butonuna tiklar")
    public void kullanici_ok_butonuna_tiklar() {
       Driver.getDriver().switchTo().alert().accept();
    }

    @Then("kullanici bilgilerin basariyla gonderildigini test eder")
    public void kullanici_bilgilerin_basariyla_gonderildigini_test_eder() {
        Assert.assertTrue(contactUsPage.basariliGonderiYazisi.isDisplayed());
    }
    @Then("kullanici ana sayfa butonunu tiklar ve anasayfaya gectigini test eder")
    public void kullanici_ana_sayfa_butonunu_tiklar_ve_anasayfaya_gectigini_test_eder() {
        contactUsPage.homeButonu.click();
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise",actualTitle);
    }
    @When("kullanici test case butonuna tiklar")
    public void kullaniciTestCaseButonunaTiklar() {
        contactUsPage.testCaseButonu.click();
    }
    @And("kullanici test case sayfasina basari ile ulastigini test eder")
    public void kullaniciTestCaseSayfasinaBasariIleUlastiginiTestEder() {
        Assert.assertTrue(contactUsPage.testCaseYaziElementi.isDisplayed());
    }
    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        ReusableMethods.waitFor(saniye);
    }
}
