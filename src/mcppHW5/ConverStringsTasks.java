package mcppHW5;

public class ConverStringsTasks 
{
	   //**********************************
    //2.1	������ ����� � ������
    //**********************************
    public String CeloeToString(int i)
    {
        String stroka = i.ToString();
        return stroka;
    }
    //**********************************
    //2.2 ������������� ����� � ������
    //**********************************
    public String VeshestvennoeToString(int i)
    {
        if (i < 1) throw new ArgumentException("ArgumentException");
        String stroka = i.ToString();
        return stroka;
    }
    //**********************************
    //2.3 ������ � ����� �����
    //**********************************
    public int StrokaInZeloe(String s)
    {
        if (s == null) throw new ArgumentNullException("ArgumentNullException");
        if (s == "") throw new ArgumentException("ArgumentException"); int a = Convert.ToInt32(s);
        return a;
    }
    //**********************************
    //2.4 ������ � ������������ �����
    //**********************************
    public int StrokaInVeshestvennoe(String s)
    {
        if (s == null) throw new ArgumentNullException("ArgumentException");
        if (s == "") throw new ArgumentException("ArgumentException");
        int a = Convert.ToInt32(s);
        if (a < 1) throw new ArgumentException("ArgumentException");
        return a;
    }
}
