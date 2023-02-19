package entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
public class FakedUser {
    private final String city;
    private final String date;
    private final String name;
    private final String phone;

}
