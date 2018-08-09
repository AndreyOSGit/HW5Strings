package StringTest;
import static org.junit.Assert.*;

import org.junit.Test;

import mcppHW5.CharsTasks;

public class CharsTests 
{
	 //**********************************
    // 1.	����������� �������� �� �A� �� �Z�
    //**********************************
    @Test
	public void EndgAtoZ_AtoZ()
    {
    	String exp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String act = CharsTasks.EndgAtoZ();
        assertEquals(exp,act);
    }
    @Test
    public void EndgAtoZ_ZeroString()
    {
     	String exp = "";
     	String act = CharsTasks.EndgAtoZ();
        assertEquals(exp,act);
    }
    @Test
    public void EndgAtoZ_Null()
    {
     	String exp = null;
     	String act = CharsTasks.EndgAtoZ();
        assertEquals(exp,act);
    }
    @Test
    public void EndgAtoZ_ABC()
    {
     	String exp = "ABC";
     	String act = CharsTasks.EndgAtoZ();
        assertEquals(exp,act);
    }
    @Test
    public void EndgAtoZ_small()
    {
     	String exp = "abcdefghijklmnopqrstuvwxyz";
     	String act = CharsTasks.EndgAtoZ();
        assertEquals(exp,act);
    }
    //**********************************
    //2.	����������� �������� �� �z� �� �a�
    //**********************************
    public static String Endgztoa()
    {
     	String out = "";
        for (int i = 122; i >= 97; i--)
        {
        	out = String.valueOf ((char)i);
        }
        return out;
         
    }
    //**********************************
    //3.	�������� �������� �� ��� �� ���
    //**********************************
    public static String RusAtoYa()
    {
     	String out = "";
        // for test  Line("���������������������������������");
        for (int i = 1072; i <= 1103; i++)
        {
        	out = String.valueOf( (char)i );
        }
        return out;         
    }
    //**********************************
    //4.	����� �� �0� �� �9�
    //**********************************
    public static String Endg0to9()
    {
    	String out = "";
        for (int i = 0; i <= 9; i++)
        {
             out = String.valueOf(i);
        }
         return out;
    }
    //**********************************
    //5. ��������� ��������� ������� ASCII
    //**********************************
    public static String ASCIIsimb()
    {
    	String ASCIIsimb = "";
        for (int i = 53; i <= 126; i++)
        {
           ASCIIsimb.concat( String.valueOf( ((char)i) ) );
        }
         return ASCIIsimb;
    }
}
