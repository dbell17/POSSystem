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
public class ItemPurchased {
    private String productId;
    private String productName;
    private double price;
    // type maybe?
    private DiscountStrategy discountStrategy;

    public ItemPurchased(String productId, String productName, double price, DiscountStrategy discountStrategy) {
        // setter method change this
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    public double getDiscountedTotal(double qty){
        return discountStrategy.getDiscountedTotal(price, qty);
    }
    
    public double getAmountSaved(double qty){
        return discountStrategy.getAmountSaved(price, qty);
    }
    
}
