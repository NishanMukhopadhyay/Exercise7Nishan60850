
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1Nishan60850 {
    String surnameNishan60850;
    String nameNishan60850;
    String streetNishan60850;
    String zipCodeNishan60850;
    String cityNishan60850;

    public void initialize() throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your surname");
        surnameNishan60850 = keyboard.readLine();
        System.out.println("Enter your first name");
        nameNishan60850 = keyboard.readLine();
        System.out.println("Enter street");
        streetNishan60850 = keyboard.readLine();
        System.out.println("Enter your zip code");
        zipCodeNishan60850 = keyboard.readLine();
        System.out.println("Enter city");
        cityNishan60850 = keyboard.readLine();

    }

    public void print() {
        System.out.println("++++++++++++++++++++++");
        System.out.println("Information Display");
        System.out.println("First name: " + nameNishan60850);
        System.out.println("Surname: " + surnameNishan60850);
        System.out.println("Street: " + streetNishan60850);
        System.out.println("Zip code: " + zipCodeNishan60850);
        System.out.println("City: " + cityNishan60850);
        System.out.println("++++++++++++++++++++++");
    }
}

class Staff extends task1Nishan60850 {
    String educationNishan60850;
    String positionNishan60850;

    public void initialize1() throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education Level");
        educationNishan60850 = keyboard.readLine();
        System.out.println("Enter your position");
        positionNishan60850 = keyboard.readLine();
    }


    public void print1() {
        print();
        System.out.println("Education: " + educationNishan60850);
        System.out.println("Position: " + positionNishan60850);
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Staff s = new Staff();
        s.initialize1();
        s.print1();
    }
}