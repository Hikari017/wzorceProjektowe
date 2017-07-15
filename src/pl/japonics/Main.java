package pl.japonics;

import builder.Dog;

//    //DRY
//    public static void main(String[] args) {
//        // write your code here
//        Main main = new Main();
//
//        main.walk();
//        main.eat();
//    }
//
//    private void walk() {
//// szuru szuru szuru
//        communicate();
//    }
//
//    private void eat() {
//        communicate();
//    }
//
//    private void communicate() {
//        System.out.println("Udało się !");
//    }
public class Main {



    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Dog dog = new Dog.Builder("Aleks")
                .setAge(5)
                .setSpecies("Ssak")
                .setVac(true)
                .build();

        System.out.println(dog.getAge());

    }



}
