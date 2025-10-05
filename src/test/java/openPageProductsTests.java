import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

public class openPageProductsTests {
    String baseURL = "https://dzen.ru/?yredirect=true";
    private final SelenideElement title = $(byXpath("//div[text()='Новости']"));

    @Test
    public void openPageProducts() {
            open(baseURL);
            title.shouldHave(text("Новости"));
    }
}

