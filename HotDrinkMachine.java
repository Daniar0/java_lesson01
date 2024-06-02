

public class HotDrinkMachine implements VendingMachine {
    public void getProduct(){


    }
    public HotDrinkwWithTemperature getProduct(String name,int volume,int temperature){
        return new HotDrinkwWithTemperature(name, volume, temperature);
    }
    

    
}