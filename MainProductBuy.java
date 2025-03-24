package S102ExceptionsNivel1;

import java.util.Scanner;

public class MainProductBuy {
    public static void main(String[] args) {

    ProductBuy productBuy = new ProductBuy(0.0);
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Calculating the total...");

            double total = productBuy.calculateTotal(0.0);

            System.out.println("The total price is " + total);
        }catch (EmptySaleException e){
            System.out.println("Error " + e.getMessage());
        }finally {
            System.out.println("Thank you for using the app");
        }

    }
}