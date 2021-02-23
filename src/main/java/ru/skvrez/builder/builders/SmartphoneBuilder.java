package ru.skvrez.builder.builders;

import ru.skvrez.builder.enums.Case;
import ru.skvrez.builder.enums.Motherboard;
import ru.skvrez.builder.enums.Storage;
import ru.skvrez.builder.shared.MySmartphone;

public class SmartphoneBuilder implements BuildDevice {

    MySmartphone smartphone;

    @Override
    public void reset() {
        smartphone = new MySmartphone();
    }

    @Override
    public void setMotherBoard() {
        smartphone.setMotherboard(Motherboard.REGULAR);
        System.out.println("В смартфон установлена материнская плата");
    }

    @Override
    public void setStorage() {
        smartphone.setStorage(Storage.SDD);
        System.out.println("В смартфон установлен твердотельный диск");
    }

    @Override
    public void installAllToCase() {
        smartphone.setaCase(Case.PALM_CASE);
        System.out.println("Все компаненты смартфона собраны в компактном корпусе");
    }

    public MySmartphone getResult() {
        return smartphone;
    }
}
