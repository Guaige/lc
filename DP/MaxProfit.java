package DP;
/*
剑指 Offer 63. 股票的最大利润
https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE,profit = 0;
        for (int price : prices){
            cost = Math.min(cost,price);
            //cost:之前最低成本 price：当前成本
            profit = Math.max(profit,price - cost);
            //profit：之前最大利润 price-最低成本 = 当前最大利润
        }
        return profit;
    }
}
