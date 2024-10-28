package com.example.demo.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to handle stock-related API requests.
 */
@RestController
@RequestMapping("/api/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    /**
     * API to fetch the stock with the highest expected profit per month.
     *
     * @return The best stock for profit.
     */
    @GetMapping("/best-profit")
    public ResponseEntity<Stock> getBestStockForProfit() {
        Stock bestStock = stockService.getBestStockForProfit();
        return ResponseEntity.ok(bestStock);
    }
}