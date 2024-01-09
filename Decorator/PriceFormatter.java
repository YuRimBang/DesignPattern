package hf.dp.Decorator;

import java.text.DecimalFormat;

public class PriceFormatter
{
    public static String formatPrice(double price) {
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(price);
    }
}
