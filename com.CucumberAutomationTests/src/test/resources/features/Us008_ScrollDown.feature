Feature: Scroll down and main page functionalities
  Scenario: TC10 Subscription dogrulama
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    When kullanici products butonuna tiklar
    And all products sayfasina basariyla yonlendirildigini test eder
    And 1 saniye bekler
    When kullanici alt bilgiye ulasir
    And kullanici subscription yazisini gorur
    And 1 saniye bekler
    And kullanici eposta adresini girer ve ok butonuna tiklar
    Then kullanici basariyla abone oldugunu test eder





