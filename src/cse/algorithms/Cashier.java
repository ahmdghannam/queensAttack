package cse.algorithms;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfCustomers = scanner.nextInt();
        int workDay = scanner.nextInt();
        int breakTime = scanner.nextInt();

        int numberOfBreaks = 0;

        Customer[] customers = new Customer[numberOfCustomers + 2];

        customers[0] = new Customer(0, 0);
        customers[customers.length - 1] = new Customer(workDay, workDay);

        for (int i = 1; i < customers.length - 1; i++) {
            int arrivalTime = scanner.nextInt();
            int serviceTime = scanner.nextInt();
            customers[i] = new Customer(arrivalTime, serviceTime);
        }

        for (int i = 1; i < customers.length; i++) {
            int notWorkingTime = customers[i].arrivalTime - customers[i - 1].getFinishTime();
            numberOfBreaks += (notWorkingTime / breakTime);
        }


        System.out.println(numberOfBreaks);

    }

    public static class Customer {
        private int arrivalTime;
        private int serviceTime;

        public Customer(int arrivalTime, int serviceTime) {
            this.arrivalTime = arrivalTime;
            this.serviceTime = serviceTime;
        }

        public int getFinishTime() {
            return arrivalTime + serviceTime;
        }

    }
}
