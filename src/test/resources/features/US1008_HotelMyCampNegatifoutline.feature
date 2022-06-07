Feature: US1008 kullanici farkli ve yanlis sifre ve kullanici adi ile giris yapamaz

  Scenario Outline: TC13 yanlis kullanici adi ve sifreler ile giris yapilamaz
    Given kullanici "HotelMyCampUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilmadigini kontrol eder
    And  sayfayi kapatir

    Examples:
    |username |password |
    |Manager5 |Manager5!|
    |Manager6 |Manager6!|
    |Manager7 |Manager7!|
    |Manager8 |Manager8!|
    |Manager9 |Manager9!|