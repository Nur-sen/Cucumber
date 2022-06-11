Feature: US100 Kullanici gittigidiyor urun arar

  Scenario: TC01 Kullanici gittigidiyor sitesinde sepet kontrolu Yapar

    Given kullanici "gittigidiyorUrl" sayfasinda
    Then kullanici cikan cerezi kabul eder
    Then kullanici bilgisayar icin arama yapar
    And kullanici arama sonuclarindan ikinci sayfayi acar
    And kullanici ikinci sayfanin acildigini kontrol eder
    And kullanici sonuca gore cikan urunlerden rastgele urun secer
    And kullanici urun bilgilerini ve fiyat bilgisini txt dosyasina yazar
    And kullanici urunu sepete ekler
    And kullanici sayfadaki fiyat ile sepetteki urun fiyatinin ayni oldugunu gorur
    And kullanici urun adedini bir artirarak toplam urunun iki adet oldugunu gorur
    And kullanici urunleri sepetten silerek sepetin bos oldugunu gorur








