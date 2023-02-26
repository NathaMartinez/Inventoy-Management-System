package com.inventory.inventoryfx;

public class Part {
    String name;
    int inventoryLevel;
    int price;
    int max;
    int min;
    int machineId;

    public Part(String name, int inventoryLevel, int price, int max, int min, int machineId) {
        this.name = name;
        this.inventoryLevel = inventoryLevel;
        this.price = price;
        this.max = max;
        this.min = min;
        this.machineId = machineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInventoryLevel() {
        return inventoryLevel;
    }

    public void setInventoryLevel(int inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
}
