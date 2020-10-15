package edu.example.pizza;

public class Pizza {
    //Assume "30 min or less"
    enum  PizzaStatus {
    ORDERED(30){
        @Override
        public boolean isOrdered(){ return true;}
    },
    COOKING(25){
        @Override
        public boolean isCooking(){ return true;}
    },
    READY(15){
        @Override
        public boolean isDeliverable(){ return true;}
    },
    ENROUTE(12){
        @Override
        public boolean isEnroute(){ return true;}
    },
    DELIVERED(0){
        @Override
        public boolean isDelivered(){ return true;}
    };

    int timeLeft;

    //default constructor
    PizzaStatus(int timeLeft){
        this.timeLeft = timeLeft;
    }
    int getTimeLeft(){
        return timeLeft;
    }
    public boolean isOrdered(){ return false; }
    public boolean isCooking(){ return false; }
    public boolean isEnroute(){ return false; }
    public  boolean isDelivered(){ return false; }
    public boolean isDeliverable(){ return false;}
}

    protected PizzaStatus status;

    //could do but instead
    /* TODO: Make this an abstract - subclass = crust-types */
//    private final String[] crustTypes = {"Whole Wheat", "Regular", "Gluten-free"};
//    private String crust;

    protected Topping toppings = new Topping();

    public Pizza(){
        status = PizzaStatus.ORDERED;
    }

    protected String getStatus(){
        return status.toString();
    }

    //can do this with the enum
//    protected int getTimeLeft(){
//        if(status == PizzaStatus.ORDERED){
//            return 30;
//        }
//        else if(status == PizzaStatus.COOKING){
//            return 25;
//        }
//        else if (status == PizzaStatus.READY){
//            return 15;
//        }
//        else if (status == PizzaStatus.ENROUTE){
//            return 12;
//        }
//        else if (status == PizzaStatus.DELIVERED){
//            return 0;
//        }
//        else
//            return -1;
//    }


// way you shouldn't do it
//    protected void changeStatus(String status){
//        switch (status){
//            case "Cooking":
//                this.status = PizzaStatus.COOKING;
//                break;
//            case "Ready":
//                this.status = PizzaStatus.READY;
//                break;
//            case "enroute":
//                this.status = PizzaStatus.ENROUTE;
//                break;
//            case "delivered":
//                this.status = PizzaStatus.DELIVERED;
//                break;
//        }
//    }

}
