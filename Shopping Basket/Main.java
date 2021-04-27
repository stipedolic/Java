package academy.leanprogramming;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.59, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket basket = new Basket("Stipe");
        sellItem(basket,"car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);
        System.out.println(basket);
        System.out.println(stockList);

        sellItem(basket,"car", 1);
        System.out.println(basket);

        System.out.println();
        sellItem(basket, "spanner", 5);


        sellItem(basket, "juice", 4);
        sellItem(basket, "cup", 12);
        sellItem(basket, "bread", 1);
        System.out.println(basket);

        stockList.get("car").adjustStock(2000);

        System.out.println(stockList);
    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item,quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        System.out.println("No more " + item + " on stock to put in basket!");
        return 0;
    }
}
