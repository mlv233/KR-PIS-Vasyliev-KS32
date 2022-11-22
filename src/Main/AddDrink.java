package Main;

import Main.Drinks.BorjomiDrink;
import Main.Drinks.ColaDrink;
import Main.Drinks.FantaDrink;
import Main.Drinks.SpriteDrink;

import java.util.EnumMap;
import java.util.Map;

public class AddDrink {

    private final Map<DrinkType, Drink> drinks;

    public AddDrink() {
        drinks = new EnumMap<>(DrinkType.class);
    }

    Drink addDrink(DrinkType type) {
        var drink = drinks.get(type);
        if (drink == null) {
            switch (type) {
                case FANTA:
                    drink = new FantaDrink();
                    break;
                case SPRITE:
                    drink = new SpriteDrink();
                    break;
                case COLA:
                    drink = new ColaDrink();
                    break;
                case BORJOMI:
                    drink = new BorjomiDrink();
                    break;
                default:
                    break;
            }
            if (drink != null) {
                drinks.put(type, drink);
            }
        }
        return drink;
    }
}
