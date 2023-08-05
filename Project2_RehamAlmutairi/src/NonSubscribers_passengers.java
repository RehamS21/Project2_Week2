public class NonSubscribers_passengers extends Passenger{
    private boolean discount_coupon = false;

    public NonSubscribers_passengers(){

    }
    public NonSubscribers_passengers(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    public NonSubscribers_passengers(String name, String id, Car reserved_car, boolean discount_coupon) {
        super(name, id, reserved_car);
        this.discount_coupon = discount_coupon;
    }

    @Override
    public double compute_Tripcost() {
        try
        {
            check_Maximum(super.getReserved_car().getMax_capacityPassenger());
            double trip_price = super.getReserved_car().getFixed_route().getTrip_price();
            if(isDiscount_coupon()){
               double discount  = trip_price * 0.1;
               super.setTrip_cost(trip_price - discount);
               return super.getTrip_cost();
            }else {
               super.setTrip_cost(trip_price);
               return super.getTrip_cost();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    @Override
    public void display_Info() {
        System.out.println("Non-Subscriber passenger : "+ super.getName()+" with id = "+super.getId()+"\n"
        +"Have a code of car : "+ super.getReserved_car().getCode()+" \n"+((isDiscount_coupon())? "Have discount 10%, then the price = "+ compute_Tripcost():"No discount coupon, then the price ="+ compute_Tripcost()+"\n"));
    }

    public void check_Maximum(int max) throws Exception{
        if(!(max > 0 &&max< 11) ){
            throw new Exception("The maximum capacity of passenger must less than 10 and not equal to zero");
        }
    }
}
