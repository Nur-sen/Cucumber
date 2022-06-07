Feature: US1004 Kullanici parametre ile configuration file kullanabilmeli

  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" sayfasinda
    Then kullanici 3 sn bekler
    And url'i "amazon" icerdigini test eder
    Then sayfayi kapatir