package possystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbell17
 */
public class PercentOffDiscount implements DiscountStrategy {

    
    private double percent =.10 ;

    public PercentOffDiscount(double percent){
        setPercent(percent);
    }
    
    @Override
    public double getDiscountedTotal(double price, double qty){
        return price * qty - getAmountSaved(price,qty);
    }
    
    @Override
    public double getAmountSaved(double price, double qty){
        return price * qty * percent;
    }

    public double getPercent() {
        return percent;
    }

    public final void setPercent(double percent) {
        this.percent = percent;
    }
//    public static void main(String[] args) {
//        PercentOffDiscount pod = new PercentOffDiscount();
//        
//        double amtSaved = pod.getAmountSaved(10.00, 2);
//        System.out.println("expect amount saved = 2 but got : " + amtSaved);
//    }
}
