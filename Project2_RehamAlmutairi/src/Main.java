import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Route route_1 = new Route("Mecca","Almadinah",5000);
        Route route_2 = new Route("Sulaymaniyah district","Mahdia district",400);

        Car car_1 = new Car("#2123",route_1,2);
        Car car_2 = new Car("#24212",route_2,5);
        Car car_3 = new Car("#14242",route_1,1);
        Car car_4 = new Car("#12321",route_2,0);

        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(new Subscribers_passengers("Reham","101",car_1));
        passengers.add(new NonSubscribers_passengers("Sara","102",car_2,true));
        passengers.add(new NonSubscribers_passengers("Rahaf","103",car_3,false));
        passengers.add(new NonSubscribers_passengers("Mohammed","104",car_4,false));

        for (int i = 0; i < passengers.size(); i++) {
            if(passengers.get(i).compute_Tripcost() != -1){ // if method return zero when throws the maximum passengers
                passengers.get(i).display_Info();
                System.out.println();
            }
        }
    }
}