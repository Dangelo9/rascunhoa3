package projetoA3.BackA3.dto;

import java.util.List;
import projetoA3.BackA3.model.Product;

public class OrderDTO {
    private String name;
    private String address;
    private List<Product> cart;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }
}
