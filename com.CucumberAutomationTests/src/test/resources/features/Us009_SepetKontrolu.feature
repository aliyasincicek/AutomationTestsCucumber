Feature: sepet kontrolu
  Background:
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder


  Scenario: TC11 sepet butonu kontrolu
    Given kullanici sepet butonunu tiklar
    And kullanici alt bilgiye ilerler
    And kullanici abonelik metnini dogrular
    And kullanici email adresini girer ve ok butonuna tiklar
    And kullanici basari mesajini dogrular

    Scenario: TC12 sepet listesinin kontrol edilmesi
      When kullanici products butonuna tiklar
      And kullanici ilk urun uzerine gelir ve sepete ekleyi tiklar
      And kullanici alisverise devam et butonuna tiklar
      And kullanici mouse'u ikinci urun uzerine getirir ve sepete ekleyi tiklar
      And kullanici sepeti goruntule butonunu tiklar
      And kullanici her iki urununde sepete eklendigini test eder
      Then kullanici fiyatlarini, miktarini ve toplam fiyatlari test eder



