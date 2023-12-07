public class SClass extends MersedesBenz{
    private Color colorBody;


    public SClass(String name,double volume,int years,typeBody Kuzov,Color colorBody){
        super(name, volume, years, Kuzov );
        this.colorBody = colorBody;
    }

    public Color getColorBody() {
        return colorBody;
    }

    public String getInfo(){
      return super.getInfo() + "\nЦвет кузова:" + getColorBody();
    }

}
