package ua.ithillel.homework.fx.calculator;

import java.util.Currency;
import java.util.List;

public class FxRateParser implements Parser<List<FxRate>, FxRate> {

    private final Currency target;

    public FxRateParser(Currency target) {
        this.target = target;
    }

    @Override
    public FxRate parse(List<FxRate> rates) {
        return rates.stream()
                .filter(rate -> rate.foreignCurrency().equals(target))
                .findFirst()
                .orElseThrow();
    }

}
