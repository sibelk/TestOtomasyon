package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"classpath:features"}, glue = {"stepdefinitions"}, tags = "@login", plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
        monochrome = true)
//tags belirtilen feature file ları çalıştırmayı sağlar
//plugin = {"pretty"} ayrıntılı console çıktısı verir
// "html:target/cucumber" html olarak rapor sağlar
// json:target/cucumber.json" json olarak rapor sağlar
//dryRun = true -> eklenmeyen step definitionların metodlarını elde etmek için hızlı yöntem çünkü step def. metodlarının içlerini çalıştırmıyor
public class MainRunner extends AbstractTestNGCucumberTests {
//   testleri paralel çalıştırır
//    aynı anda senaryo kadar driver instance oluşur.
//    @DataProvider(parallel = true)
//    @Override
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}
