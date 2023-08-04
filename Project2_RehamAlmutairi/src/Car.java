public class Car {
    private String code;
    private Route fixed_route;
    private int max_capacityPassenger = 10;


    public Car(){}
    public Car(String code, Route fixed_route, int max_capacityPassenger) {
        this.code = code;
        this.fixed_route = fixed_route;
        this.max_capacityPassenger = max_capacityPassenger;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixed_route() {
        return fixed_route;
    }

    public void setFixed_route(Route fixed_route) {
        this.fixed_route = fixed_route;
    }

    public int getMax_capacityPassenger() {
        return max_capacityPassenger;
    }

    public void setMax_capacityPassenger(int max_capacityPassenger) {
        this.max_capacityPassenger = max_capacityPassenger;
    }


}
