interface Add {
    int sum(int a, int b);
}

interface Product {
    int multiply(int x, int y);    
}

public class Lambda {
    // Lambda expression to define operate method
    Add AddObj = (a, b) -> a + b;
    Product ProdObj = (id,dk) -> {
        return id*dk;
    };

    public static void main(String[] args) {
        Lambda l = new Lambda();

        System.out.println(l.AddObj.sum(5, 3)); // Output: 8
        System.out.println(l.ProdObj.multiply(5, 3)); // Output: 15
    }
}
