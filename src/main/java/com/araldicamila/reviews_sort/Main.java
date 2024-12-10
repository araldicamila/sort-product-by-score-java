package com.araldicamila.reviews_sort;

import com.araldicamila.reviews_sort.product.ProductModel;
import com.araldicamila.reviews_sort.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductModel> products = new ArrayList<>();

        products.add(new ProductModel("Product one", List.of(1.0, 2.0, 2.5, 3.0)));
        products.add(new ProductModel("Product two", List.of(4.5, 5.0, 5.0, 5.0)));
        products.add(new ProductModel("Product three", List.of(3.5, 5.0, 5.0, 5.0)));

        List<ProductModel> sortedProductsByScore = Utils.getMaxProductScore(products);

        for(ProductModel product : products) {
            System.out.println("Product name: " + product.getName() + "\nProduct feedbacks: " + product.getScore() + "\nProduct feedbacks sum: " + product.getScoreSum());
        }
    }
}