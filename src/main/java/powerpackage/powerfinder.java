package powerpackage;

public class PowerFinder //Class name should start with upper case letter
{
	//Method name should start with lower case letter
	
	/*Also, it is better if methods have meaningful names, 
	this way it is easier to understand what the method does*/
	
    public static int powerOf(int xyz, int pqr)
    {
        int p = 1;
        for (int i = 0; i<pqr; i++) 
        {
            p*=xyz;
        }
        return p;
    }
}

