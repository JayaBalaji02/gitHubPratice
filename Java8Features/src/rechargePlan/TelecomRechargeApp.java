package rechargePlan;


import java.util.*;
import java.util.stream.*;

public class TelecomRechargeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<RechargePlan> plans = Arrays.asList(
                new RechargePlan(1, "1 GB per day for 28 days", 199),
                new RechargePlan(2, "1.5 GB per day for 54 days", 399),
                new RechargePlan(3, "2 GB per day for 84 days", 599),
                new RechargePlan(4, "Unlimited Data for 5 days", 499)
        );

        System.out.println("Available Recharge Plans");

        plans.stream().forEach(RechargePlan::display);

        System.out.println("Plans under Rs.500:");
        plans.stream()
                .filter(p -> p.amount < 500)
                .forEach(p -> System.out.println(p.id + ": " + p.description + " - ₹" + p.amount));

        System.out.print("Enter the plan number you want to recharge with: ");
        int choice = scanner.nextInt();

        Optional<RechargePlan> selectedPlanOpt = plans.stream()
                .filter(p -> p.getId() == choice)
                .findFirst();

        if (!selectedPlanOpt.isPresent()) {
            System.out.println("Invalid plan selected, Please try again");
            return;
        }

        RechargePlan selectedPlan = selectedPlanOpt.get();
        System.out.println("You selected: " + selectedPlan.getDescription() + " - " + selectedPlan.getAmount());

        System.out.print("Enter payment amount: ");
        double payment = scanner.nextDouble();

        if (payment >= selectedPlan.getAmount()) {
            System.out.println("Recharge Successful Enjoy your plan");
        } else {
            System.out.println("Payment Failed, Insufficient amount");
        }
    }
}
