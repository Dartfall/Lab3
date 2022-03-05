package brokenrobotgame.model;

import brokenrobotgame.model.navigation.CellPosition;

public class Battery extends AbstractBattery, Unit, Cell
{
    public Battery(GameField field, int capacity, int amount)
    {
        super(field,capacity,amount);
    }
}
