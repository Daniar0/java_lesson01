

public class Main {
   

    public static void main(String[] args) {
    HotDrinkwWithTemperature hotDrink1=new HotDrinkwWithTemperature("Tea", 100, 50);
    // HotDrinkwWithTemperature hotDrink2=new HotDrinkwWithTemperature("Coffee", 200, 40);
   
    
    System.out.println(hotDrink1);
        
    

    HotDrinkMachine hotDrinkMachine=new HotDrinkMachine();
    HotDrinkwWithTemperature product1=hotDrinkMachine.getProduct("Coffee", 50,  50);
    // HotDrinkwWithTemperature product2=hotDrinkMachine.getProduct("Tea", 100,  50);
    // HotDrinkwWithTemperature product3=hotDrinkMachine.getProduct("Tea", 100,  50);
    // System.out.println(hotDrinkMachine.getProducts());
    // hotDrinkMachine.addProducts(List.of(product1,product2,product3));
    // System.out.println(hotDrinks);   
    
    System.out.println(product1);
    }
}
    



