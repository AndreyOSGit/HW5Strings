package mcppHW5;

public class ConverStringsTasks 
{
	   //**********************************
    //2.1	������ ����� � ������
    //**********************************
    public String CeloeToString(int i)
    {
    	
    	
    	String stroka = String.valueOf(i);
        return stroka;
    }
    //**********************************
    //2.2 ������������� ����� � ������
    //**********************************
    public String VeshestvennoeToString(int i)
    {
        if (i < 1) throw new IllegalArgumentException("ArgumentException");
        String stroka = String.valueOf(i);
        return stroka;
    }
    //**********************************
    //2.3 ������ � ����� �����
    //**********************************
    public int StrokaInZeloe(String s)
    {
        if (s == null) throw new IllegalArgumentException("ArgumentNullException");
        if (s == "") throw new IllegalArgumentException("ArgumentException"); 
        int a = Integer.parseInt(s);
        return a;
    }
    //**********************************
    //2.4 ������ � ������������ �����
    //**********************************
    public double StrokaInVeshestvennoe(String s)
    {
        if (s == null) throw new IllegalArgumentException("ArgumentException");
        if (s == "") throw new IllegalArgumentException("ArgumentException");
        double a = Double.valueOf(s);
        if (a < 1) throw new IllegalArgumentException("ArgumentException");
        return a;
    }
}
