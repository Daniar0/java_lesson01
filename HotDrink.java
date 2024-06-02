public class HotDrink{
    private String name;
    private int volume;
    private int temperature;
    

    public HotDrink(String name, int volume,int temperature){
        this.name=name;
        this.volume=volume;
        this.temperature=temperature;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;


    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature=temperature;
    }
    public String toString(){
        return "Product{" +
               "name='" + name + '\'' +
               ", volume='" + volume + '\'' +
               ", temperature='" + temperature +'\''+
               '}';
        
    }

}      