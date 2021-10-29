package Lab2;

import java.util.Random;

public class Temperature {
        static double[] temperature = new double[365];
        public static void main(String[] args) {

            setTemperature();
            double minVal = getMinimumTemperature(temperature);
            System.out.println("the min temperature is " + minVal);
            double maxVal = getMaximumTemperature(temperature);
            System.out.println("the max temperature is " + maxVal  );

        }

        public static void setTemperature() {

            for (int i = 0; i < 365; i++) {
                Random rand = new Random();
                //temperature[i] = Double.parseDouble(String.format("%.2f", rand.nextDouble() * 80));
                temperature[i] = rand.nextInt(80);
            }
        }

        public static double getMinimumTemperature(double[] num) {
            double minimumValue = num[0];
            for (int i = 1; i < num.length; i++) {
                if (minimumValue > num[i]) {
                    minimumValue = num[i];
                }
            }
            return minimumValue;
        }

        public static double getMaximumTemperature(double[] num) {
            double maximumValue = num[0];
            for (int i = 1; i < num.length; i++) {
                if (maximumValue < num[i])
                    maximumValue = num[i];
            }
            return maximumValue;
        }

    }




