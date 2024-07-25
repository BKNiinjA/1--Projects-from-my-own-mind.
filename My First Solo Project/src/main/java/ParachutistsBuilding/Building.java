package ParachutistsBuilding;
import java.util.*;

public class Building extends Apartments{

    Random wind = new Random();
    List<String> climate = new ArrayList<String>();

    private int heights = 700,i = 0;
    private int windSpeed;

    public Building() {

        System.out.println("---Welcome the Seven's Towers---");
        System.out.println("The building has " + this.heights + " meters high");
        System.out.println(" ");

        for (int i = 0; i < apartmentNumber.length; i++) {
            masterMethod();
        }

        System.out.println(" ");
        System.out.println("The tower is verifiyng the climate conditions!");
        climateSensor();
        packingTheParachute();
        firstEven();
        jumpingParachute();
    }

    private void pickClimate() {

        windSpeed = wind.nextInt(1,80);
        climate.add("Sunny");
        climate.add("Cloudy");
        climate.add("Stormy");
        Collections.shuffle(climate);
    }

    public void climateSensor() {
        pickClimate();

        if((windSpeed >= 70 && windSpeed < 80) && (climate.contains("Sunny"))) {
            System.out.println(" ");
            System.out.println("The wind speed is : " + windSpeed + " km/h");
            System.out.println("The climate is : Sunny");
            System.out.println("the weather conditions are suitable for jumping, sending a notice to parachutists!");
            System.out.println(" ");

        } else {
            climateSensor();
        }
    }



}
