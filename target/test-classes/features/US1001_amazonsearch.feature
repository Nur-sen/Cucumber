
@tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @nutella @ikisi
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir


    @Java @ikisi
   Scenario: TC02 kullanici amazonda Java aratir

     Given kullanici amazon anasayfasinda
     Then kullanici Java aratir
     And sonuclarin Java icerdigini test eder
     And sayfayi kapatir

      @iphone
     Scenario: TC03 kullanici amazon sayfasinda iphone aratir
       Given kullanici amazon anasayfasinda
       Then kullanici iphone aratir
       And sonuclarin iphone icerdigini test eder
       And sayfayi kapatir