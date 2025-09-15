package demo.src.main.java.com.example;

public class ConversorTemperatura {
    public class ConversorTemperatura {

        /**
         * @param celsius  
         * @return 
         */
        public double celsiusParaFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        /**
         * @param fahrenheit  
         * @return  
         */
        public double fahrenheitParaCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }
}

