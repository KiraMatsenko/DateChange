package generator;
import com.github.javafaker.Faker;
import entity.FakedUser;
import lombok.experimental.UtilityClass;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@UtilityClass
public class UserGenerator {

    @UtilityClass
    public static class Registration {
        public static FakedUser generation() {
            Faker faker = new Faker(new Locale("ru"));
            return new FakedUser(
                    faker.address().city(),
                    faker.name().fullName(),
                    faker.phoneNumber().cellPhone());
        }

        public static String dateGeneration(int min, int max) {
            Faker faker = new Faker(new Locale("ru"));
            String randomDate = LocalDateTime.now().plusDays(faker.number().numberBetween(min, max)).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            return randomDate;
        }
    }
}

