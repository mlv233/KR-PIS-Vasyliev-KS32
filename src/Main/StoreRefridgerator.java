package Main;

import java.util.List;

public class StoreRefridgerator {
    private final List<Drink> topShelf;
    private final List<Drink> middleShelf;
    private final List<Drink> bottomShelf;

    public StoreRefridgerator() {
        var fridge = new AddDrink();
        topShelf = List.of(
                fridge.addDrink(DrinkType.COLA),
                fridge.addDrink(DrinkType.SPRITE),
                fridge.addDrink(DrinkType.COLA),
                fridge.addDrink(DrinkType.FANTA)
        );
        middleShelf = List.of(
                fridge.addDrink(DrinkType.COLA),
                fridge.addDrink(DrinkType.COLA),
                fridge.addDrink(DrinkType.FANTA)
        );
        bottomShelf = List.of(
                fridge.addDrink(DrinkType.BORJOMI),
                fridge.addDrink(DrinkType.BORJOMI),
                fridge.addDrink(DrinkType.SPRITE),
                fridge.addDrink(DrinkType.SPRITE)
        );
    }

    public List<Drink> getTopShelf() {
        return List.copyOf(this.topShelf);
    }
    public List<Drink> getMiddleShelf() {
        return List.copyOf(this.topShelf);
    }
    public List<Drink> getBottomShelf() {
        return List.copyOf(this.bottomShelf);
    }

    public void buyAllDrinks() {
        System.out.println("\nBuying all of the top shelf drinks:");
        topShelf.forEach(Drink::buy);
        System.out.println("\nBuying all of the middle shelf drinks:");
        middleShelf.forEach(Drink::buy);
        System.out.println("\nBuying all of the bottom shelf drinks:");
        bottomShelf.forEach(Drink::buy);
    }
}
