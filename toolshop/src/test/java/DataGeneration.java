import com.github.javafaker.Faker;

public class DataGeneration {

    private static DataGeneration instance = null;
    Faker faker = new Faker();

    String firstName;
    String lastName;
    String street;
    String postalCode;
    String city;
    String state;
    String country;
    String phone;
    String email;
    String password;


    private DataGeneration(){
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        street = faker.address().streetAddress();
        postalCode = faker.address().zipCode();
        city = faker.address().city();
        state = faker.address().state();
        country = faker.address().country();
        phone = faker.phoneNumber().phoneNumber();
        email= faker.internet().emailAddress();
        password = "Testington123!";

    }

    public static DataGeneration getInstance() {
        if (instance == null) {
            instance = new DataGeneration();
        }
        return instance;
    }
}
