@contactUs
Feature:contact Us Form


  Scenario: TC06 Form doldurma ve gonderme
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici contact us butonuna tiklar
    Then kullanici get in touch gorunur oldugunu test eder
    Then kullanici, adi eposta adresi konu ve mesaji girer
    Then kullanici dosyayi yukler
    And kullanici gonder butonuna tiklar
    And 1 saniye bekler
    And kullanici ok butonuna tiklar
    And kullanici bilgilerin basariyla gonderildigini test eder
    And kullanici ana sayfa butonunu tiklar ve anasayfaya gectigini test eder
Scenario: TC07 Test Case ssyfasina gitme
  When kullanici tarayiciyi baslatir
  Then kullanici anasayfaya gider
  Then ana sayfanin gorunur oldugunu test eder
  And 2 saniye bekler
  When kullanici test case butonuna tiklar
  And kullanici test case sayfasina basari ile ulastigini test eder



