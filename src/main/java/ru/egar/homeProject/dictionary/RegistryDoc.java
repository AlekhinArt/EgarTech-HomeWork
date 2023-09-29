package ru.egar.homeProject.dictionary;

public class RegistryDoc {

    String one;
    String two;
    String three;


    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public RegistryDoc(Input input) {
        this.one = input.fieldOne;
        this.two = input.fieldTwo;
        this.three = input.fieldThree;
    }
}
