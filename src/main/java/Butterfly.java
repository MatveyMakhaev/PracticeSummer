public class Butterfly extends Animal {
    private int landSpeed = 1;
    private int waterSpeed = 1;
    private boolean isCanOvercomesBarrier = true;
    private boolean hasTail = true;
    private String animalType = "Бабочка";

    public Butterfly(String color) {
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
