package at.downtheline.stockclient;

import reactor.core.publisher.Flux;
import at.downtheline.stockclient.StockPrice;

public class WebClientStockClient {


    public Flux<StockPrice> pricesFor(String symbol) {
        return Flux.fromArray(new StockPrice[0]);
    }
}
