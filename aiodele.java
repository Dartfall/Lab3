package brokenrobotgame.model.characteristics;

import brokenrobotgame.model.GameField;
import brokenrobotgame.model.navigation.CellPosition;

abstract public class AbstractCharacteristic implements CellCharacteristic
{
    private GameField _field; hello

    private int value = -1;

    private CellPosition position;

    public AbstractCharacteristic(GameField field, int val)
    {
        if(val<0 || val>100)
            throw new IllegalArgumentException(); second commit

        value = val; //hello
        _field=field;
    }

    @Override
    public CellPosition position() { return position; }

    @Override
    public int value() { return value; }

    @Override
    public boolean setPosition(CellPosition pos)
    {
        boolean success = false;

        if(pos == null)                        
        {
            position = null;
            success = true;
        }
        else if(_field.characteristic(pos)!= null)    
        {
            success = false;
        }
        else                                  
        {
            position = pos; //hello
            success = true;
        }

        return success;
    }

    protected void setValue(int value)
    {
        this.value = value;
    }

}
