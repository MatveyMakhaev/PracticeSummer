public class Frog extends Animal {
    private int landSpeed = 1;
    private int waterSpeed = 2;
    private boolean isCanOvercomesBarrier = false;
    private boolean hasTail = true;
    private String animalType = "Лягушка";

    public Frog(String color) {
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
