package vn.edu.ntu.tiendat.controller;

import java.util.List;

import vn.edu.ntu.tiendat.model.Product;

public interface ICartController {
    List<Product> getALIProduct();
    public boolean addToCart(Product p);
    public List<Product> getShoppingCart();
    public void clearShoppingCart();
}