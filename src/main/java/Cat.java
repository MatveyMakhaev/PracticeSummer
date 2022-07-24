public class Cat extends Animal {
    private int landSpeed = 2;
    private int waterSpeed = 1;
    private boolean isCanOvercomesBarrier = true;
    private boolean hasTail = true;
    private String animalType = "Кот";

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public int getLandSpeed() {
        return landSpeed;
    }

    @Override
    public int getWaterSpeed() {
        return waterSpeed;
    }

    @Override
    public boolean canOvercomesBarrier() {
        return isCanOvercomesBarrier;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }
}
