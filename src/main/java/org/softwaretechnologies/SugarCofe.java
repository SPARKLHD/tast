package org.softwaretechnologies;

public class SugarCofe implements CofeInterface {
    /**
     * Создайте класс SugarCofe, поддерживающий интерфейс CofeIntrface
     * к стоимости базового напитка добавьте 20.
     * к описанию добавьте " + sugar"
     */
    CofeInterface cofeInterface;
    public SugarCofe(CofeInterface cofeInterface) {
        this.cofeInterface = cofeInterface;
    }
    @Override
    public int getCost() {
        return cofeInterface.getCost()+20;
    }

    @Override
    public String description() {
        return cofeInterface.description()+"+ sugar";
    }
}
