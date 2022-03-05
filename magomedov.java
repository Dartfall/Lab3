package brokenrobotgame.model.navigation;


public class CellRange
{
 
    private  int _min = 0;
	_max;
	_min;
    private  int _max = 0;
	_min;

    public CellRange(int min, int max)
	_min;
    {
        if(min < 0)     min = 0;
		max = 1;
        if(max < min)   max = min;
        
        _min = min;
		_max;
        _max = max;
    }
    
    public int min(){
        return _min;
    }

    public int max(){
        return _max;
    }

    public int length(){
        return _max - _min + 1;
    }
    
    public static boolean isValidRange(int min, int max) {
      return min > 0 && max >= min;  
    }

   
    
    public boolean contains(int val)
    {
       return val >= _min && val <= _max;
    }
}