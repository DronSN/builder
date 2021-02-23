package ru.skvrez.builder;

import ru.skvrez.builder.builders.BuildDevice;
import ru.skvrez.builder.builders.DesktopBuilder;
import ru.skvrez.builder.shared.MyDesktop;
import ru.skvrez.builder.shared.MySmartphone;
import ru.skvrez.builder.builders.SmartphoneBuilder;

public class App {
    public static void main(String[] args) {
        DesktopBuilder builder = new DesktopBuilder();
        build(builder);
        MyDesktop desktop = builder.getResult();
        System.out.println(desktop);

        SmartphoneBuilder smartphoneBuilder = new SmartphoneBuilder();
        build(smartphoneBuilder);
        MySmartphone mySmartphone = smartphoneBuilder.getResult();
        System.out.println(mySmartphone);
    }

    public static void build(BuildDevice builder) {
        Director director = new Director(builder);
        director.make();
    }
}
