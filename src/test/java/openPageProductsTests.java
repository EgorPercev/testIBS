import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

public class openPageProductsTests {
    String baseURL = "http://localhost:8080/food";
    private final SelenideElement title = $(byXpath("//a[text()='QualIT']"));

    @Test
    public void openPageProducts() {
            open(baseURL);
            title.shouldHave(text("QualIT"));
    }
}

