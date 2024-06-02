public class HotDrinkwWithTemperature extends HotDrink {
    private int temperature;

    public HotDrinkwWithTemperature(String name, int volume,int temperature){
        super(name,volume,temperature);
        this.temperature=temperature;
    }
    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature=temperature;
    }

    
}
