package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ProductsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class ProductsStepDefs {
    ProductsPage productsPage=new ProductsPage();

    @When("kullanici products butonuna tiklar")
    public void kullanici_products_butonuna_tiklar() {
        productsPage.productsButonu.click();

    }
    @When("all products sayfasina basariyla yonlendirildigini test eder")
    public void all_products_sayfasina_basariyla_yonlendirildigini_test_eder() {
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("All Products"));
    }
    @When("kullanici urun listesinin gorunur oldugunu test eder")
    public void kullanici_urun_listesi_gorunur_oldugunu_test_eder() {
        //List<WebElement> webelemetUrunListesi=productsPage.allProducts;
       // List<String> stringUrunListesi= ReusableMethods.getElementsText(webelemetUrunListesi);
        Assert.assertTrue(productsPage.allProducts.isDisplayed());
    }
    @When("kullanici ilk urunun View product sekmesine tiklar")
    public void kullanici_ilk_urunun_view_product_sekmesine_tiklar() {
        productsPage.ilkUrunViewProduct.click();

    }
    @When("urun detay sayfasina yonlendirildigini test eder")
    public void urun_detay_sayfasina_yonlendirildigini_test_eder() {
        String actualDetayTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualDetayTitle.contains("Product Details"));
    }
    @When("urun ayrintilarinin gorunur oldugunu test eder")
    public void urun_ayrintilarinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(productsPage.ilkUrununAyrintiliBilgisi.isDisplayed());
            }
    @And("kullanici arama kutusuna urun adi girer ve ara butonuna tiklar")
    public void kullaniciAramaKutusunaUrunAdiGirerVeAraButonunaTiklar() {
        productsPage.searchBox.sendKeys("tops");
        productsPage.aramaButonu.click();

    }
    @And("Searched Products gorunur oldugunu test eder")
    public void searchedProductsGorunurOldugunuTestEder() {
        Assert.assertTrue( productsPage.searchedProductsYaziElementi.isDisplayed());
       
    }

    @Then("aramayla ilgili tum urunlerin gorunur oldugunu test eder")
    public void aramaylaIlgiliTumUrunlerinGorunurOldugunuTestEder() {
        Assert.assertTrue(productsPage.poloYaziElementi.isDisplayed());
        Assert.assertTrue(productsPage.hmYaziElementi.isDisplayed());
        Assert.assertTrue(productsPage.madameYaziElementi.isDisplayed());
        Assert.assertTrue(productsPage.masthYaziElementi.isDisplayed());
        Assert.assertTrue(productsPage.babyhugYaziElementi.isDisplayed());
        Assert.assertTrue(productsPage.allensjYaziElementi.isDisplayed());
        Assert.assertTrue(productsPage.kookieYzaiElementi.isDisplayed());
        Assert.assertTrue(productsPage.bibaYaziElementi.isDisplayed());


    }
}
