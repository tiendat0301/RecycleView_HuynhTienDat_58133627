package vn.edu.ntu.tiendat.controller;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ntu.tiendat.model.Product;

public class CartController extends Application implements ICartController{

    List<Product> productList = new ArrayList<>();
    List<Product> shoppingCart = new ArrayList<>();
    public CartController(){
        productList.add(new Product("Chuối vàng", 25000, "Chuối to, chín vàng"));
        productList.add(new Product("Sầu riêng", 75000, "Sầu riêng to, chín vàng"));
        productList.add(new Product("Khoai lang", 15000, "Khoai lang to, chín tím"));
        productList.add(new Product("Táo Trung Quốc", 5, "Táo có độc, không ăn được"));
        productList.add(new Product("Đào tươi", 200000, "Đào ngon, ngọt nước"));
        productList.add(new Product("Ghệ Hải Phòng", 300000, "Ghệ ngon, béo, bổ rẻ"));
        productList.add(new Product("Nho Mỹ", 60000, "Nho ngọt, quả mọng nước"));
        productList.add(new Product("Điều Rang", 200000, "Điều giòn, béo, bổ rẻ"));
    }
    @Override
    public List<Product> getALIProduct(){
        return productList;
    }

    @Override
    public boolean addToCart(Product p) {
        if(shoppingCart.contains(p))
            return false;
        shoppingCart.add(p);
            return true;
    }

    @Override
    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public void clearShoppingCart() {
        shoppingCart.clear();
    }

}
