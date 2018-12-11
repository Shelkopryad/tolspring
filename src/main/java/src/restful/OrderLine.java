package src.restful;

import java.math.BigDecimal;

/**
 * Created by Svirin2-DA on 11.12.2018.
 */
public class OrderLine {

    private Product product;
    private int amount;
    private BigDecimal purchasePrice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
