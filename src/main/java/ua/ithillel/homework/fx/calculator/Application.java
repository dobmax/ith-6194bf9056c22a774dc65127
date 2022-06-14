package ua.ithillel.homework.fx.calculator;


import java.util.Currency;

public class Application {
    public static void main(String[] args) {
        FxRate foundRate = new FxRateParser(Currency.getInstance(args[0]))
                .parse(
                        new ResourceParser()
                                .parse(new ResourceLoader().load())
                );

        System.out.printf(
                "Средняя стоимости UAH [Ukrainian Hryvnia] к %s [%s] -> %s%n",
                foundRate.foreignCurrency().getCurrencyCode(),
                foundRate.foreignCurrency().getDisplayName(),
                foundRate.nationalCurrencyValue().doubleValue()
        );
    }
}
