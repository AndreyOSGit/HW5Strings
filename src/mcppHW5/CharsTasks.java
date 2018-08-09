package mcppHW5;

public class CharsTasks 
{
	 //**********************************
    // 1.	английского алфавита от СAТ до СZТ
    //**********************************
    public static String EndgAtoZ()
    {
     	String out = "";
        for (int i = 65; i <= 90; i++)
        {
        	out = String.valueOf ((char)i);
             
        }
        return out;
         
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
