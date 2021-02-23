package ru.skvrez.builder.shared;

public class MyDesktop extends ComputerDevice implements Desktop {

    @Override
    public void compute() {
        System.out.println("Мой компьютер работает над задачей");
    }

    @Override
    public void on() {
        System.out.println("Мой компьютер включился");
    }

    @Override
    public void off() {
        System.out.println("Мой компьютер выключился");
    }

    @Override
    public String toString() {
        return "MyDesktop{" +
                "motherboard=" + motherboard +
                ", storage=" + storage +
                ", aCase=" + aCase +
                '}';
    }
}
