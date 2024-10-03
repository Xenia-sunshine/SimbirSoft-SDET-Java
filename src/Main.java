public class Main extends  Languages{
    public Main(){
        super("Russia",150000,173);
    }
    public static void main(String[] args) {
        Main main=new Main();
        main.setName("There we have Spanish and Chineese languages");
        main.setCountries(21);
        main.Person("China");
        Spanish spanish = new Spanish();
        Chinese chinese = new Chinese();
        chinese.seyHello("Chinese");
        chinese.AgeofChina();
        chinese.ChineseInfo();
        chinese.ChineseInfo2("Chinese", 12, 23);
        chinese.take();
        spanish.funcforenter();
        Spanish.TrailtoSpain(0);
        spanish.Info(spanish.name, spanish.people, spanish.countries);
        spanish.setSpenishCountries(21);
        spanish.population(spanish.people);
        spanish.setSpanishName("Spanish");
        spanish.ColorOfFlagFromSpain(spanish.color1, spanish.color2);
        spanish.learn();


    }



}


