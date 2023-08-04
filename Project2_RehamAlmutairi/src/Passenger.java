public abstract class Passenger {
    private String name;
    private String id;
    private Car reserved_car;
    private double trip_cost;
    public Passenger(){

    }
    public Passenger(String name, String id, Car reserved_car) {
        this.name = name;
        this.id = id;
        this.reserved_car = reserved_car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReserved_car() {
        return reserved_car;
    }

    public void setReserved_car(Car reserved_car) {
        this.reserved_car = reserved_car;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }

    public abstract double compute_Tripcost();
    public abstract void display_Info();

}
