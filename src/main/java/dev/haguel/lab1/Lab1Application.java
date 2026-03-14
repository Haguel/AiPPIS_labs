package dev.haguel.lab1;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Lab1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MathPower mathPower = new MathPower();

        double base = 2.0;
        int exp = 3;

        double result = mathPower.power(base, exp);

        System.out.println(base + " raised to the power of " + exp + " is: " + result);

        System.out.println("2 raised to the power of -3 is: " + mathPower.power(2.0, -3));
    }
}
