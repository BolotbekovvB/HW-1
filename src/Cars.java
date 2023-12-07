public class Cars {
    private String name;
    private double volume;
    private int years;
    private typeBody kuzov;

    public Cars(String name, double volume, int years, typeBody kuzov){
        this.name = name;
        this.years = years;
        this.volume = volume;
        this.kuzov = kuzov;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public int getYears() {
        return years;
    }

    public typeBody getKuzov() {
        return kuzov;
    }
    public String getInfo(){
        return "Имя: " + getName() + "\nОбъём: " + getVolume() +
                "\nГод выпуска: " + getYears() + "\nТип кузова: " + kuzov.getKuzov() ;
    }
}
