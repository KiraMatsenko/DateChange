import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class OldTests {

    public String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }


//    @Test
//    void shouldSendWithSimpleCity() {
//        Configuration.holdBrowserOpen = true;
//        open("http://localhost:9999/");
//        $("span[data-test-id=city] input").setValue("Сыктывкар");
//        $("span[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
//        $("span[data-test-id=date] input").setValue(generateDate(4));
//        $("[name=name]").setValue("Чупров Олег");
//        $("[name=phone]").setValue("+79111111111");
//        $x("//span[text()='Я соглашаюсь с условиями обработки и использования моих персональных данных']").click();
//        $x("//span[text()='Запланировать']").click();
//        $x("//div[text()='Успешно!']").shouldBe(visible, Duration.ofSeconds(15));
//        $(".notification__content").shouldHave(Condition.text("Встреча успешно запланирована на " + generateDate(4)), Duration.ofSeconds(15)).shouldBe(Condition.visible);
//    }
//
//    @Test
//    void shouldSendWithDoubleCity() {
//        Configuration.holdBrowserOpen = true;
//        open("http://localhost:9999/");
//        $("span[data-test-id=city] input").setValue("Санкт-Петербург");
//        $("span[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
//        $("span[data-test-id=date] input").setValue(generateDate(4));
//        $("[name=name]").setValue("Чупров Олег");
//        $("[name=phone]").setValue("+79111111111");
//        $x("//span[text()='Я соглашаюсь с условиями обработки и использования моих персональных данных']").click();
//        $x("//span[text()='Запланировать']").click();
//        $x("//div[text()='Успешно!']").shouldBe(visible, Duration.ofSeconds(15));
//        $(".notification__content").shouldHave(Condition.text("Встреча успешно запланирована на " + generateDate(4)), Duration.ofSeconds(15)).shouldBe(Condition.visible);
//    }
//
//    @Test
//    void shouldSendWithDoubleName() {
//        Configuration.holdBrowserOpen = true;
//        open("http://localhost:9999/");
//        $("span[data-test-id=city] input").setValue("Кострома");
//        $("span[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
//        $("span[data-test-id=date] input").setValue(generateDate(4));
//        $("[name=name]").setValue("Петров-Водкин Кузьма");
//        $("[name=phone]").setValue("+79111111111");
//        $x("//span[text()='Я соглашаюсь с условиями обработки и использования моих персональных данных']").click();
//        $x("//span[text()='Запланировать']").click();
//        $x("//div[text()='Успешно!']").shouldBe(visible, Duration.ofSeconds(15));
//        $(".notification__content").shouldHave(Condition.text("Встреча успешно запланирована на " + generateDate(4)), Duration.ofSeconds(15)).shouldBe(Condition.visible);
//    }
}
