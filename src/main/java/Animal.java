import java.util.ArrayList;

public class Animal {
    protected int landSpeed;
    protected int waterSpeed;
    protected boolean isCanOvercomesBarrier;
    protected String color;
    protected boolean hasTail;
    protected String animalType;

    public int getLandSpeed() {
        return landSpeed;
    }

    public int getWaterSpeed() {
        return waterSpeed;
    }

    public boolean canOvercomesBarrier() {
        return isCanOvercomesBarrier;
    }

    public String getAnimalType() {
        return animalType;
    }

    // дистанции поступают в метрах
    public String calculateRoutes(int landDistance, int waterDistance, boolean barrier) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Integer> times = new ArrayList<>();

        animals.add(new Dog("Рыжая"));
        animals.add(new Cat("Белая"));
        animals.add(new Frog("Синяя"));
        animals.add(new Butterfly("Огненная"));

        // скорости всех животных захардходил в сами классы -
        // по тз мы не можем переопредеять метод ("реализация только в методу базового класса"),
        // за то переопределяем свойства (данные)
        // 60 - не магическая константа, а перевод из сек в мин
        for (int i = 0; i < animals.size(); i++) {
            // если имеется барьер и животное не умеет его преодолевать, то время увеличивается
            if (barrier && !animals.get(i).canOvercomesBarrier()) {
                times.add((landDistance / animals.get(i).getLandSpeed() + waterDistance / animals.get(i).getWaterSpeed() + 2000) / 60);
            } else {
                times.add((landDistance / animals.get(i).getLandSpeed() + waterDistance / animals.get(i).getWaterSpeed()) / 60);
            }
        }

        String results = animals.get(0).getAnimalType() + ": " + times.get(0) + " мин\n" +
                animals.get(1).getAnimalType() + ": " + times.get(1) + " мин\n" +
                animals.get(2).getAnimalType() + ": " + times.get(2) + " мин\n" +
                animals.get(3).getAnimalType() + ": " + times.get(3) + " мин\n";

        return results;
    }
}
