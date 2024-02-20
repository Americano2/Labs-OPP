import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Formula {
    private double c, f , x, y ,z;

    public Formula(){
        x = 1.825;
        y = 18.225;
        z = -3.298;
    }

    public void getInitialValues(){
        System.out.println("x = 1.825" + x + ", y = 18.225" + y + ", z = " + z);
    }

    public double calculateC(){
        c = Math.abs(Math.pow(x, y/x) - Math.cbrt( y/x));
        return c;
    }

    public double calculateF(){
        f = (y - x) * ((y - z) / (y - x)) / (1 + Math.pow(y - x, 2));
        return f;
    }

    public void printValue(String nameValue, double value){
        System.out.println(nameValue + " " + value);
    }

    public void printTime(){
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formattedNow = DateTimeFormatter.ofPattern("HH:mm dd.MM.yy");

        String formattedDate = now.format(formattedNow);

        System.out.println(formattedDate);
    }

    public void setValues(){
        Scanner readValues = new Scanner(System.in);

        System.out.println("Set values:");
        System.out.print("x = ");
        this.x = readValues.nextDouble();
        System.out.print("y = ");
        this.y = readValues.nextDouble();
        System.out.print("z = ");
        this.z = readValues.nextDouble();
    }

    public void run(){
        double c, f;

        setValues();

        c = calculateC();
        f = calculateF();

        printValue("c =", c);
        printValue("f =", f);
    }
}

