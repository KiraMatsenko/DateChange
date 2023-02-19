package generator;

import com.github.javafaker.Faker;
import entity.FakedUser;
import lombok.experimental.UtilityClass;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@UtilityClass
public class UserGenerator {

    @UtilityClass
    public static class Registration {
        public static FakedUser generation() {
            Faker faker = new Faker(new Locale("ru"));
            return new FakedUser(
                    faker.address().city(),
                    String.format(faker.date().future(30, 3, TimeUnit.DAYS).toString(), DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                    faker.name().fullName(),
                    faker.phoneNumber().cellPhone());
        }
    }
}

