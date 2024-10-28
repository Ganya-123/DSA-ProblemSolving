package com.example.demo.stock;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    private List<Stock> stockList;

    public StockService() {
        stockList = new ArrayList<>();
        stockList.add(new Stock("1", "Maverick", 100000, 1000, 5000));
        stockList.add(new Stock("2", "Infosys", 200000, 500, 3000));
        stockList.add(new Stock("3", "TCS", 150000, 800, 7000));
        stockList.add(new Stock("4", "Wipro", 120000, 600, 3500));
    }

    /**
     * Find the stock with the highest expected profit per month.
     *
     * @return The stock with the highest expected profit.
     * Time Complexity:
     * Best Case: O(1)
     * This would happen if the first stock in the list is the one with the highest profit, so no need to iterate over the rest.
     * Average Case: O(n)
     * On average, you will need to iterate through half of the list before finding the best stock, but still, the overall iteration will take O(n).
     * Worst Case: O(n)
     * In the worst case, the stock with the highest profit is at the very end of the list, requiring a full iteration through the list.
     * Space Complexity:
     * O(1) (constant space, since no additional data structures are being used)
     */
    public Stock getBestStockForProfit() {
        if (stockList.isEmpty()) {
            return null;
        }

        Stock bestStock = stockList.get(0);
        for (Stock stock : stockList) {
            if (stock.getTotalExpectedProfitPerMonth() > bestStock.getTotalExpectedProfitPerMonth()) {
                bestStock = stock;
            }
        }
        return bestStock;
    }
}