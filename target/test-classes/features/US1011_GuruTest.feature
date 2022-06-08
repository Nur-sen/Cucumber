Feature: US1011 Web tablosundaki istenen sutunu yazdirma kullanici 
@guru
  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruURl" sayfasinda
    And kullanici cerez cikarsa kabul eder
    And "Company", sutunundaki tum degerleri yazdirir
    And sayfayi kapatir
    