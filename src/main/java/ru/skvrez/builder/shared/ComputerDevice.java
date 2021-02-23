package ru.skvrez.builder.shared;

import ru.skvrez.builder.enums.Case;
import ru.skvrez.builder.enums.Motherboard;
import ru.skvrez.builder.enums.Storage;

public class ComputerDevice {

    protected Motherboard motherboard;
    protected Storage storage;
    protected Case aCase;

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }
}
