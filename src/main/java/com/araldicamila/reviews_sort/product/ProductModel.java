package com.araldicamila.reviews_sort.product;

import lombok.Getter;

import java.util.List;

@Getter
public class ProductModel {
    String name;
    List<Double> score;

    public ProductModel(String name, List<Double> score) {
        this.name = name;
        this.score = score;
    }

    public double getScoreSum() {
        return score.stream().mapToDouble(Double::doubleValue).sum();
    }
}

