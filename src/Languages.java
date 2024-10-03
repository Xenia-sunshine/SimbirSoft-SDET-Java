abstract  class Languages  {
    String country;
    String name;//название языка на котором говорят люди
    int people;//примерное количество людей , который говорят на этом языке
    int countries;//количество стран в которых говорят на этом языке
    //конструктор
    Languages(String name, int people, int countries) {
        this.name = name;
        this.people = people;
        this.countries = countries;
    }
    // сеттеры и геттеры
    public String  getName(){
        return name;
    }
    public int getCountries(){
        return countries;
    }
    public void setName(String name ){
        this.name=name;
        System.out.println(name);
    }
    public void setCountries(int countries){
        this.countries=countries;
    }
    public String Person(String country){
        this.country=country;
        System.out.println("Now you are in the "+ country);
        return country;

    }

}




