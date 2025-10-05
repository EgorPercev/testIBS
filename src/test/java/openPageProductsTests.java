import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class openPageProductsTests {
    String baseURL = "https://gradle.org/";
    private final SelenideElement title = $(byXpath("//span[text()='Gradle Build Tool']"));

    @Test
    public void openPageProducts() {
        Assertions.assertTrue(true);
    }
}

