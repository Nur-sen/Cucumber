package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruTestPage;
import utilities.Driver;

import java.util.List;

public class GuruTestStepDefinitions {

    GuruTestPage guruTestPage=new GuruTestPage();

    @Given("kullanici cerez cikarsa kabul eder")
    public void kullaniciCerezCikarsaKabulEder() {
    }

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String isteneSutun) {
       List<WebElement> tabloBaslikListesi= guruTestPage.baslikListesi;
        //listemiz webelementlerden olusuyor dolayisi
        // ile bu vebelementlerden hangisi
        //istenen sutun basligini tasiyor bilemeyiz
        int istenenBaslikIndexi=-3; //indexden gelmeyecek bir eleman oldugu icin - deger verildi

        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {
            if(tabloBaslikListesi.get(i).getText().equals(isteneSutun)){
                istenenBaslikIndexi=i+1;
                break;
            }

        }
        //for loop ile tum sutun basliklarini
        // bana verilen istenenSutun degeri ile karsilastirdim
        //loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve
        //bulundu ise yoluma devam etmek istiyorum


        if(istenenBaslikIndexi!=-3){//baslik bulundu
            List<WebElement> istenenStundakiElementler= Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
            for (WebElement each:istenenStundakiElementler) {
                System.out.println(each.getText());

            }

        }else{//baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }

    }


}
