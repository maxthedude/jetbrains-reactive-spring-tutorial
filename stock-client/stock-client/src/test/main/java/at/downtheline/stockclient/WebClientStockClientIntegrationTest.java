package main.java.at.downtheline.stockclient;

import at.downtheline.stockclient.StockPrice;
import at.downtheline.stockclient.WebClientStockClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;


class WebClientStockClientIntegrationTest {
    @Test
    void shouldRetrieveStockPriceFromTheservice() {
        WebClientStockClient webClientStockClient = new WebClientStockClient();
        Flux<StockPrice> prices = webClientStockClient.pricesFor("Symbol");
        Assertions.assertNotNull(prices);
        Assertions.assertTrue(prices.take(5).count().block() > 0);

    }
}