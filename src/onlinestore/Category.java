package onlinestore;

import java.util.Arrays;
import java.util.Scanner;

public class Category {
    private String name;
    private Product product[];

    public Category(String name, Product[] product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }
// 2
    @Override
    public String toString() {
        return "Category{" +
                "name='" + name+ '\'' +
                ", product=" + Arrays.toString(product) +
                '}';
    }
    // 3
    public void choosProduct(){
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            name=scanner.nextLine();
            System.out.println(product);
        } else {
            System.out.println("Введены не буквы");
    }
}}

