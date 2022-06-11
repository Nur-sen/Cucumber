package stepDefinitions_Calismalarim;

import Page_Calismalarim.GittigidiyorPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GittigidiyorSetepDefinitions {
    GittigidiyorPage gittigidiyorPage = new GittigidiyorPage();

    @Then("kullanici cikan cerezi kabul eder")
    public void kullaniciCikanCereziKabulEder() {

        gittigidiyorPage.cereziKabulet.click();
    }

    @Then("kullanici bilgisayar icin arama yapar")
    public void kullanici_bilgisayar_icin_arama_yapar() throws InterruptedException {

        gittigidiyorPage.aramaKutusu.sendKeys("bilgisayar" + Keys.ENTER);

    }

    @Then("kullanici arama sonuclarindan ikinci sayfayi acar")
    public void kullanici_arama_sonuclarindan_ikinci_sayfayi_acar() {

        gittigidiyorPage.ikinciSayfayaGecisTiki.click();

    }

    @Then("kullanici ikinci sayfanin acildigini kontrol eder")
    public void kullanici_ikinci_sayfanin_acildigini_kontrol_eder() {
        Assert.assertTrue(gittigidiyorPage.ikinciSayfaGorunurlugu.isDisplayed());

    }

    @Then("kullanici sonuca gore cikan urunlerden rastgele urun secer")
    public void kullanici_sonuca_gore_cikan_urunlerden_rastgele_urun_secer() {


        Random random = new Random();
        int rastgeleBirUrunSec = random.nextInt(gittigidiyorPage.ikinciSayfadakiUrunler.size());

            ReusableMethods.waitFor(3);
           System.out.println(rastgeleBirUrunSec);
           gittigidiyorPage.ikinciSayfadakiUrunler.get(rastgeleBirUrunSec).click();

    }

    @Then("kullanici urun bilgilerini ve fiyat bilgisini txt dosyasina yazar")
    public void kullanici_urun_bilgilerini_ve_fiyat_bilgisini_txt_dosyasina_yazar() {


        System.out.println("urun ozellikleri : " + gittigidiyorPage.urunOzellikleri.getText());
        System.out.println("urunun fiyati : " + gittigidiyorPage.urunFiyati.getText());

    }

    @Then("kullanici urunu sepete ekler")
    public void kullanici_urunu_sepete_ekler() {
        ReusableMethods.waitFor(3);
        gittigidiyorPage.sepeteEkler.click();

    }

    @Then("kullanici sayfadaki fiyat ile sepetteki urun fiyatinin ayni oldugunu gorur")
    public void kullanici_sayfadaki_fiyat_ile_sepetteki_urun_fiyatinin_ayni_oldugunu_gorur() {
        String sayfatakiFiyat = gittigidiyorPage.urunFiyati.getText();

        gittigidiyorPage.sepetegitTikla.click();
        ReusableMethods.waitFor(3);

        String sepettekiUrunFiyati = gittigidiyorPage.sepettekiUrunFiyati.getText();
        Assert.assertEquals(sepettekiUrunFiyati, sayfatakiFiyat);

    }

    @Then("kullanici urun adedini bir artirarak toplam urunun iki adet oldugunu gorur")
    public void kullanici_urun_adedini_bir_artirarak_toplam_urunun_iki_adet_oldugunu_gorur() {
        Select select = new Select(gittigidiyorPage.urunAdediGuncelleme);
        select.selectByIndex(1);
        Assert.assertTrue(gittigidiyorPage.urunAdedininGuncellendigiDogrulama.isDisplayed());
        ReusableMethods.waitFor(3);

    }

    @Then("kullanici urunleri sepetten silerek sepetin bos oldugunu gorur")
    public void kullanici_urunleri_sepetten_silerek_sepetin_bos_oldugunu_gorur() {
        gittigidiyorPage.sepetiSil.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(gittigidiyorPage.sepetteUrunYokMetni.isDisplayed());
        ReusableMethods.waitFor(3);
    }

}
