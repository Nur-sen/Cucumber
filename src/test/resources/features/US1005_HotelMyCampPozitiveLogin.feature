Feature: US1005 dogru kullanici adi ve sifre ile giris yapilabilmeli

  @wip
  Scenario: TC08 pozitif login test
    Given kullanici "HotelMyCampUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapildigini kontrol eder
    And  sayfayi kapatir