import java.util.Scanner;

public class CostToInstallFence {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the width of the rectangular yard in foot: ");
        double width = scanner.nextDouble();

        System.out.println("Input the length of the rectangular yard in foot: ");
        double length = scanner.nextDouble();

        double perimeter = (2*width) + (2*length);
        double woodenFenceCost = 25 * perimeter;
        double chainLinkCost = 15 * perimeter;
        int gateCost = 150;
        int buildingPermit = 50;
        double addedCost = woodenFenceCost + chainLinkCost + gateCost;
        double totalFenceCost = (addedCost * 1.06) + buildingPermit;

        System.out.printf("Total cost to install a fence for %.2f ft by %.2f ft yard. is: %.2f", width, length, totalFenceCost);
        
    }

}
