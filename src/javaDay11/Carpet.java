package javaDay11;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        if (isPersian==true){
            double totalcost=200+((width*length)*unitPrice);
            return totalcost;
        }else {
            double totalcost=unitPrice*(width*length);
            return totalcost;
        }

    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost=" + calcCost() +
                '}';
    }
}
