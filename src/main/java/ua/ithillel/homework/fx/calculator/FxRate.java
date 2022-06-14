package ua.ithillel.homework.fx.calculator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Currency;

public record FxRate(LocalDateTime date, Currency foreignCurrency, String unit, BigDecimal nationalCurrencyValue) {

}
