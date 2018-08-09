package StringTest;
import static org.junit.Assert.*;

import org.junit.Test;

import mcppHW5.CharsTasks;

public class CharsTests 
{
	 //**********************************
    // 1.	английского алфавита от СAТ до СZТ
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
    //2.	английского алфавита от СzТ до СaТ
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
    //3.	русского алфавита от СаТ до С€Т
    //**********************************
    public static String RusAtoYa()
    {
     	String out = "";
        // for test  Line("абвгдеЄжзиийклмнопрстуфхцчшщъыьэю€");
        for (int i = 1072; i <= 1103; i++)
        {
        	out = String.valueOf( (char)i );
        }
        return out;         
    }
    //**********************************
    //4.	цифры от С0Т до С9Т
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
    //5. печатного диапазона таблицы ASCII
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
