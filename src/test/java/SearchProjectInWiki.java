import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchProjectInWiki {
    @Test
    void seachJunitProject(){
        open("https://github.com/selenide/selenide");
        $("[data-content=Wiki]").click();
        $(".markdown-body").shouldHave(text("Soft assertions"));
        $(byText("Soft assertions")).click();
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));

    }
}
