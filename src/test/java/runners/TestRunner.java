package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features ="src/test/resources/features",
        glue = "stepDefinitions",
        tags = " @aut",
        dryRun = true

)

public class TestRunner {

    /*
    bir fraemwork'de bir tek Runner class'i yeterli olabilir
    Runner class'inda class bodysinde hicbirsey olmaz
    runner class'imizi onemli yapan iki notasyondur
    @@RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi kadar
    bu notasyon oldugu icin cucumber fraemwork'umuzda Junit kullanmayi
    tercih ediyoruz
    features: Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue: step definitions dosyalarini nerede bulacagimizi gosterir
    tags:o an hangi tagi calistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
    dryRun=true yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir
    dryRun=false yazdigimizda testlerimizi calistirir


     */
}
