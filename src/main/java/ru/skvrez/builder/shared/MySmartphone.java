package ru.skvrez.builder.shared;

public class MySmartphone extends ComputerDevice implements Smartphone {

    @Override
    public void call() {
        System.out.println("Мой смартфон звонит");
    }

    @Override
    public void on() {
        System.out.println("Мой смартфон включился");
    }

    @Override
    public void off() {
        System.out.println("Мой смартфон выключился");
    }

    @Override
    public String toString() {
        return "MySmartphone{" +
                "motherboard=" + motherboard +
                ", storage=" + storage +
                ", aCase=" + aCase +
                '}';
    }
}
