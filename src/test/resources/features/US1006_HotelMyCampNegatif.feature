#hotel my camp sitesinde 3 adet negatif test senaryosu olusturaliment
  #1-dogru username-yanlis sifre
  #2-yanlis username-dogru sifre
  #3yanlis username-yanlis sifre
  Feature: US1006 yanlis bilgilerle siteye giris yapilamaz

    Scenario: TC09 yanlis sifre ile giris yapilamaz
      Given kullanici "HotelMyCampUrl" sayfasinda
      Then Log in yazisina tiklar
      And gecerli username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilmadigini kontrol eder
      And  sayfayi kapatir

      Scenario: TC10 yanlis kullanici adi ile giris yapilamaz
        Given kullanici "HotelMyCampUrl" sayfasinda
        Then Log in yazisina tiklar
        And gecersiz username girer
        And gecerli password girer
        And Login butonuna basar
        Then sayfaya giris yapilmadigini kontrol eder
        And  sayfayi kapatir

        Scenario: TC11 yanlis kullanici adi ve yanlis sifre ile giris yapilamaz
          Given kullanici "HotelMyCampUrl" sayfasinda
          Then Log in yazisina tiklar
          And gecersiz username girer
          And gecersiz password girer
          And Login butonuna basar
          Then sayfaya giris yapilmadigini kontrol eder
          And  sayfayi kapatir

