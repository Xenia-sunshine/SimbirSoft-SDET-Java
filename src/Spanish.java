public class Spanish extends Languages implements WhatIneedtolearn{
    String color1="Red",color2="yellow";//цвета флага Испании
    String name = "Spanish";// испансикй язык
    int people = 540000000;//примерное количество людей , который говорят на этом языке
    int countries = 21;//21 страна говорит на Испанском языке
    //статические поля
    static int counter=1;
    static String state="Spain";
    //статический метод
    public static void TrailtoSpain(int idofcountry) {
        idofcountry=0;
        while (idofcountry <= 3) {
            System.out.println(idofcountry);
            idofcountry+=1;
        }
        System.out.println("Hello ,you are in the "+state);
        System.out.println("You are "+counter+" in the "+state);

    }
    //интерфейс
    @Override
    public void learn(){
        System.out.println("The alphabet do you need for travaling to Spain");
    }

    public Spanish() {
        super("Spanish", 540, 21);

    }
    // сеттеры и геттеры
    public String  getSpanishName(){
        return name;
    }
    public int getSpanishCountries(){
        return countries;
    }
    public void setSpanishName(String name ){
        this.name=name;
    }
    public void setSpenishCountries(int countries){
        this.countries=countries;
    }

    //метод
    protected void Info(String name, int people, int countries) {
        System.out.println(name + " is spoken by " + countries + " and " + people + " milions people");
    }
    // 1 метод , ничего не возвращает
    //находит максимальное количество человек
    void population(int people) {
        int Mexico = 132274416;
        int Colombia = 52008538;
        int Cuba = 11194449;
        int maxi = Mexico;
        String country="Mexico";
        if (Colombia > maxi) {
            maxi = Colombia;
            country="Colombia";
        }
        if (Cuba > maxi) {
            maxi = Cuba;
            country="Cuba";
        }
        System.out.println(maxi+" live in "+country);
    }
    //второй метод
    //выводит 3 раза "Испанский это очень хороший язык"
    int ColorOfFlagFromSpain(String color1,String color2){
        for(int i=1;i<=1;i++){
            System.out.println(color1);
            for(int j=0;j<=1;j++){
                System.out.println(color2);
            }

        }
        System.out.println(color1);
        return 0;
    }
    void funcforenter(){
        System.out.println(' ');
    }


}

