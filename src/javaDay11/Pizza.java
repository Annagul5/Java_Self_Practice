package javaDay11;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;



    public int calcCost(){
        if(size.toLowerCase().equalsIgnoreCase("small")){
            int totalCost = 10+(2*numberOfPepperoniTopping)+(2*numberOfCheeseTopping);
            return totalCost;
        }
        if(size.toLowerCase().equalsIgnoreCase("medium")){
            int totalCost = 12+(2*numberOfPepperoniTopping)+(2*numberOfCheeseTopping);
            return totalCost;
        }
        if(size.toLowerCase().equalsIgnoreCase("large")){
            int totalCost = 14+(2*numberOfPepperoniTopping)+(2*numberOfCheeseTopping);
            return totalCost;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    }
}



