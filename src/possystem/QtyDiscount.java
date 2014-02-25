/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem;

/**
 *
 * @author dbell17
 */
public class QtyDiscount implements DiscountStrategy{
    private double percent =.10 ;
    private double minQuatity =5;

    public QtyDiscount(double percent, double qty) {
        setPercent(percent);
        setMinQuatity(minQuatity);
    }
    
    @Override
    public double getDiscountedTotal(double price, double qty){
        double discountedTotal = price *qty;
        if(qty >= minQuatity){
            discountedTotal = price * qty - getAmountSaved(price, qty);
        }
        return discountedTotal;
    }
    
    public double getMinQuatity() {
        return minQuatity;
    }

    public final void setMinQuatity(double minQuatity) {
        this.minQuatity = minQuatity;
    }
    
    @Override
    public double getAmountSaved(double price, double qty){
        double amtSaved = 0;
        if(qty >= minQuatity){
            amtSaved = price * qty * percent;
        }
        return amtSaved;
    }

    public double getPercent() {
        return percent;
    }

    public final void setPercent(double percent) {
        this.percent = percent;
    }
    
}
