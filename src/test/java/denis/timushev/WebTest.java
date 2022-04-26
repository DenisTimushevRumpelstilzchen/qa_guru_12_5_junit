package denis.timushev;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebTest {
    @DisplayName("Проверка поиска в яндексе по слову Selenide")
    @Test
    void selenideSearchTest() {
        // Предусловия
        Selenide.open("https://yandex.ru/");

        // Шаги
        $("").setValue("Selenide");
        $("").click();

        // Ожидаемый результат
        $$("").find(Condition.text("Selenide")).shouldBe(Condition.visible);
    }
}
