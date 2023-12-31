package Lab_03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class FruitOrVegetable_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String type = "";

        switch (product){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                type = "fruit";
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                type = "vegetable";
                break;
            default:
                type = "unknown";
                break;
        }

        System.out.println(type);
    }
}
