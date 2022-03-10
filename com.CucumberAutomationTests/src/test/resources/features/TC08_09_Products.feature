Feature: Products dogrulama ve arama
  Background:
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    When kullanici products butonuna tiklar
    And all products sayfasina basariyla yonlendirildigini test eder

  Scenario: TC08 Urun dogrulama
    And kullanici urun listesinin gorunur oldugunu test eder
    And kullanici ilk urunun View product sekmesine tiklar
    And urun detay sayfasina yonlendirildigini test eder
    And urun ayrintilarinin gorunur oldugunu test eder

    Scenario: TC09 Urun arama
      And  kullanici arama kutusuna urun adi girer ve ara butonuna tiklar
      And  Searched Products gorunur oldugunu test eder
      Then aramayla ilgili tum urunlerin gorunur oldugunu test eder



