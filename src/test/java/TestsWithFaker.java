import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import entity.FakedUser;
import generator.UserGenerator;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TestsWithFaker {

//    public String generateDate(int days) {
//        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//    }

    @Test
    void shouldSendWithSimpleCity() {
        FakedUser user = UserGenerator.Registration.generation();
        Faker faker = new Faker(new Locale("ru"));
        String planningDate = LocalDateTime.now().plusDays(faker.number().numberBetween(3, 7)).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String newPlanningDate = LocalDateTime.now().plusDays(faker.number().numberBetween(8, 30)).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Configuration.holdBrowserOpen = true;
        open("http://localhost:7777/");
        $("span[data-test-id=city] input").setValue(user.getCity());
        $("span[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("span[data-test-id=date] input").setValue(planningDate);
        $("[name=name]").setValue(user.getName());
        $("[name=phone]").setValue(user.getPhone());
        $x("//span[text()='Я соглашаюсь с условиями обработки и использования моих персональных данных']").click();
        $x("//span[text()='Запланировать']").click();
        $x("//div[text()='Успешно!']").shouldBe(visible, Duration.ofSeconds(15));
        $(".notification__content").shouldHave(Condition.text("Встреча успешно запланирована на " + planningDate), Duration.ofSeconds(15)).shouldBe(Condition.visible);
        $("span[data-test-id='date'] input").click();
        $("span[data-test-id='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("span[data-test-id=date] input").setValue(newPlanningDate);
        $x("//span[text()='Запланировать']").click();
        $x("//div[text()='Необходимо подтверждение']").shouldBe(visible, Duration.ofSeconds(15));
        $x("//div[text()='У вас уже запланирована встреча на другую дату. Перепланировать?']").shouldBe(Condition.visible);
        $x("//span[text()='Перепланировать']").shouldHave(Condition.text("Перепланировать")).click();
        $(".notification__content").shouldHave(Condition.text("Встреча успешно запланирована на " + newPlanningDate), Duration.ofSeconds(15)).shouldBe(Condition.visible);
    }
}
