public class Main {
    public static void main(String[] args) {
        typeBody typeBody = new typeBody("W213");
        typeBody typeBody1 = new typeBody("W223");
        MersedesBenz mersedesBenz = new MersedesBenz("E-class",
                5.5,2022,typeBody) ;
        SClass sClass = new SClass("S-class",
                6.3,2023,typeBody1,Color.BLACK);
        System.out.println(mersedesBenz.getInfo());
        System.out.println("----------");
        System.out.println(sClass.getInfo());
    }
}