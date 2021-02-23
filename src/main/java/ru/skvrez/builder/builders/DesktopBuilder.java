package ru.skvrez.builder.builders;

import ru.skvrez.builder.enums.Case;
import ru.skvrez.builder.enums.Motherboard;
import ru.skvrez.builder.enums.Storage;
import ru.skvrez.builder.shared.MyDesktop;

public class DesktopBuilder implements BuildDevice {

    private MyDesktop desktop;

    @Override
    public void reset() {
        desktop = new MyDesktop();
    }

    @Override
    public void setMotherBoard() {
        desktop.setMotherboard(Motherboard.SUPER);
        System.out.println("В компьютер установлена материнская плата");
    }

    @Override
    public void setStorage() {
        desktop.setStorage(Storage.HDD);
        System.out.println("В компьютер установлен жесткий диск");
    }

    @Override
    public void installAllToCase() {
        desktop.setaCase(Case.DESKTOP_CASE);
        System.out.println("Все компоненты собраны в системном блоке");
    }

    public MyDesktop getResult() {
        return desktop;
    }
}
