package util;

public class CurrencyConverter {

    public static double converter(double priceDollar, double value){
        return (priceDollar * value) * 1.06;
    }
}
