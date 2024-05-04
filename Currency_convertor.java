


import java.util.Scanner;

        public class Currency_convertor {


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the base currency: ");
                String base = scanner.nextLine();

                System.out.print("Enter the target currency: ");
                String target = scanner.nextLine();
                double exchangeRate = getExchangeRate(base, target);

                if (exchangeRate == -1) {
                    System.out.println("Invalid");
                    System.exit(0);
                } else {
                    System.out.print("Enter the amount to convert from " + base + " to " + target + ": ");
                    double amountToConvert = scanner.nextDouble();
                    double convertedAmount = amountToConvert * exchangeRate;
                    System.out.println("Converted Amount: " + convertedAmount + " " + target);

                    scanner.close();
                }
            }

                private static double getExchangeRate (String base, String target){
                    if (base.equals("USD") && target.equals("EUR")) {
                        return 0.85;  // 1 USD = 0.85 EUR
                    } else if (base.equals("USD") && target.equals("GBP")) {
                        return 0.75;  // 1 USD = 0.75 GBP
                    } else if (base.equals("EUR") && target.equals("USD")) {
                        return 1.18;  // 1 EUR = 1.18 USD
                    } else if (base.equals("GBP") && target.equals("USD")) {
                        return 1.33;  // 1 GBP = 1.33 USD
                    } else {
                        return -1;  // Invalid
                    }
                }

        }