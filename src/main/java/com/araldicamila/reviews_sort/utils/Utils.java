package com.araldicamila.reviews_sort.utils;

import com.araldicamila.reviews_sort.product.ProductModel;

import java.util.List;

public class Utils {
    public static List<ProductModel> getMaxProductScore(List<ProductModel> products) {
        products.sort((a, b) -> {
            return Double.compare(b.getScoreSum(), a.getScoreSum());
        });

        return  products;
    }
}
