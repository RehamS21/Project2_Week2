public class Subscribers_passengers extends Passenger{


    public Subscribers_passengers() {
    }

    public Subscribers_passengers(String name, String id, Car reserved_car) {
        super(name, id, reserved_car);
    }

    @Override
    public double compute_Tripcost() {
        try{
        check_Maximum(super.getReserved_car().getMax_capacityPassenger());
        double trip_price  =  super.getReserved_car().getFixed_route().getTrip_price();
        double discount  = super.getReserved_car().getFixed_route().getTrip_price() * 0.5;
        super.setTrip_cost(trip_price - discount);
        return super.getTrip_cost();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return -1;
    }

    @Override
    public void display_Info() {
        System.out.println("Subscriber passenger : "+ super.getName()+", with id = "+super.getId()+"\n"
                +"Have a code of car : "+ super.getReserved_car().getCode()+" \nWith discount 50%, then price= "+ compute_Tripcost());
    }

    public void check_Maximum(int max) throws Exception{
        if(!(max > 0 &&max< 11) ){
            throw new Exception("The maximum capacity of passenger must less than 10 and not equal to zero");
        }
    }
}
