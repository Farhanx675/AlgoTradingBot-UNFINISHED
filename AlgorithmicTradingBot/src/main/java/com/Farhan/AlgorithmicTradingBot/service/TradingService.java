package com.Farhan.AlgorithmicTradingBot.service;

import com.Farhan.AlgorithmicTradingBot.repository.StockDataRepository;
import io.github.mainstringargs.AlphaVantageConnector;
import io.github.mainstringargs.TimeSeries;
import io.github.mainstringargs.input.timeseries.Interval;
import io.github.mainstringargs.output.timeseries.IntraDay;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TradingService
{
private static final String APIKEY = "QY46RBLJTLFEE8KS";
private final StockDataRepository stockDataRepository;

public void fetchStockData(String symbol)
{
    AlphaVantageConnector apiConnector = new AlphaVantageConnector(APIKEY, 3000);
    TimeSeries timeSeries = new TimeSeries(apiConnector);

try {
    IntraDay response = timeSeries.intraDay(symbol, Interval.ONE_MIN)
}


}
}
