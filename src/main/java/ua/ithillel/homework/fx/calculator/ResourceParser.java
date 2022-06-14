package ua.ithillel.homework.fx.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.List;

public class ResourceParser implements Parser<InputStream, List<FxRate>> {

    @Override
    public List<FxRate> parse(InputStream in) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            reader.readLine();

            return reader.lines()
                    .map(line -> line.split("\\|"))
                    .map(parts -> new FxRate(
                                    LocalDateTime.parse(parts[0] + "T" + parts[1], DateTimeFormatter.ISO_DATE_TIME),
                                    Currency.getInstance(parts[3]),
                                    parts[4],
                                    BigDecimal.valueOf(Double.parseDouble(parts[6]))
                            )
                    )
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException("SWW during resource reading.", e);
        }
    }

}
