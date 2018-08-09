package mcppHW5;

import java.awt.image.SampleModel;

public class StringTasks 
{
    
public static void main(String[] args)
{
	System.out.println(samoeKorotkoeSlovo("aaa, ! d! bb-b ccc ssf"));
}
	
	//**********************************
    // 3.1 ���� ������, ��������� �� ����, ����������� ��������� � ������� ����������. ���������� ����� ������ ��������� �����.
    //**********************************
    public static int samoeKorotkoeSlovo(String inString)
	{
    	int shortest = Integer.MIN_VALUE;
    	String[] arrSt; 
//    	 arrSt = inString.split("[ !?'-.,'':;]");
//    	 arrSt = inString.split("\\!\\?\\,\\.");
    	 System.out.println(arrSt.length);
    	 
    	for (int i = 0; i < arrSt.length; i++) 
    	{
			if(shortest > arrSt[i].length() & arrSt[i].length() != 0 )
			{
				shortest = arrSt[i].length();
				System.out.println(arrSt[i]);
			} 
//			else 
//			{
//				throw new IllegalArgumentException("AAA!!!");
//			}
		}
    	return shortest;
	}
   
    //**********************************
    // 3.1 ���� ������, ��������� �� ����, ����������� ��������� � ������� ����������. ���������� ����� ������ ��������� �����.
    //**********************************
    public  static int SamoeKorotkoeSlovo(String s) {

        if (s == null) throw new NullPointerException("ArgumentNullException");
        if (s == "") throw new IllegalArgumentException("ArgumentException");
        int shortS = Integer.MAX_VALUE;
        String[] wordS = {};
       s = s.replaceAll("[.,\"?!:;()']", "");
       s = s.replace(" -", "");
       wordS = s.split(" ");

        for (int i = 0; i < wordS.length; i++)
        {
           if (wordS[i].length() < shortS
                   && wordS[i].length() != 0)
           {
               shortS = wordS[i].length();
           }
        }
        return shortS;
    }

    //**********************************
    // 3.1 ���� ������, ��������� �� ����, ����������� ��������� � ������� ����������. ���������� ����� ������ ��������� �����.
    //**********************************
    public int SamoeKorotkoeSlovo(String s)
    {
        if (s == null) throw new ArgumentNullException("ArgumentNullException");
        if (s == "") throw new ArgumentException("ArgumentException");
        int shortS = 0;
        String[] wordS = { };

            s = s.Trim(new char[] {' ', '.', ',', '?', '!', ':', ';', '(', ')', '\'', '\"' });

            wordS = s.Split(' ');
        for (int i = 0; i < wordS.Length; i++)
        {
            wordS[i] = wordS[i].Trim(new char[] {' ', '.', ',', '?', '!', ':', ';', '(', ')', '\'', '\"' });
                    
        }
        shortS = wordS.Min().Length;
        return shortS;
    }
    //*************************
    //3.2 ��� ������ ����. �������� ��������� ��� ������� ����, ������� �������� ����� �� ������ "$"
    //*******************************************
    
    public String[] ChangWordsArray(String[] WordArray, int len)
     {
        if (WordArray == null) throw new ArgumentNullException("ArgumentNullException");
        if (WordArray.Length <= 0) throw new ArgumentOutOfRangeException("ArgumentOutOfRangeException");

        try
        {
                for (int i = 0; i < WordArray.Length; i++)
            {
            
                    if (WordArray[i].Length == len)
                    {
                        WordArray[i] = WordArray[i].Remove(len - 3, 3);
                        WordArray[i] = WordArray[i].Insert(len - 3, "$");
                    }
            
            }
                
          }  catch (ArgumentOutOfRangeException) { }
        return WordArray;
     }
   
    //*************************
    //3.3	�������� � ������ ������� ����� ������ ����������, ���� ��� ��� �����������.
    //*******************************************
    public String AddSpaces(String s)
    {
        if (s == "") throw new ArgumentException("ArgumentException");
        if (s == null) throw new ArgumentNullException("ArgumentNullException");
        String znaki = ".,?!:;()\'\""; 
        for (int j = 0; j < znaki.Length; j++)
        {

            for (int i = 0; i < s.Length; i++)
            {
                if (s[i] == znaki[j])
                {
                 s = s.Insert(i+1, " ");
                }

            }
        }
        return s;
    }
    //*************************
    //3.4	�������� � ������ ������ ���� ��������� ������� �������������� �������.
    //**********static ***************
    public String OnlyOneSimb(String s)
    {
        if (s == null) throw new ArgumentNullException("ArgumentNullException");
        if (s == "") throw new ArgumentException("ArgumentException");
        s = s.Trim();
         char[] charArray = s.Distinct().ToArray();
        s = new string(charArray);        
       

        return s;

    }
    //*************************
    //3.5 ���������� ���������� ���� �� ��������� ������������� ������.
    //*******************************************
    public int ChisloSlov(String s)
    {
        if (s == null) throw new ArgumentNullException("ArgumentNullException");
        if (s == "") throw new ArgumentException("ArgumentException");
        int nWords = 0;
        String[] words = { };

        s = s.Trim();
        words = s.Split(' '); // ������� ������ �� �����������  � ������ �����
        
        nWords = words.Length;
                 
        return nWords;
    }
    //*************************
    //3.6 ������� �� ������ �� ����� � �������� ������� � �������� �����.
    //*******************************************
    public String DeletePartOfString(String s, int start, int length)
    {
        if (s == null) throw new ArgumentNullException("ArgumentNullException");
        if (s.Length < (length - start)) throw new ArgumentException("ArgumentException");
        s = s.Remove(start, length);
        return s;
    }
    //*************************
    //3.7	����������� ������, �.�.��������� ������� ������ ����� �������, � ������ ����������.
    //*******************************************
    public String ReversString(String s)
    {
        if (s == null) throw new ArgumentNullException("ArgumentNullException");
        char[] charArray = s.ToCharArray();
        Array.Reverse(charArray);
        s = new string(charArray);

        return s;
    }

    //*************************
    //4.6 ���������� ���������� ���� �� ��������� ������������� ������.
    //*******************************************
    public static int ChisloSlov(String s)
    {
        if (s == null) throw new NullPointerException("ArgumentNullException");
        if (s == "") throw new IllegalArgumentException("ArgumentException");
        int nWords = 0;
        String[] words = { };

        s = s.trim();
        words = s.split(" "); // ������� ������ �� �����������  � ������ �����

        nWords = words.length;

        return nWords;
    }

    //*************************
    //3.8 � �������� ������ ������� ��������� �����
    //*******************************************
    public static String DeleteLastWord(String s)
    {
        if (s == null) throw new NullPointerException("ArgumentNullException");
        if (s.equals("")) throw new IllegalArgumentException("ArgumentException");

        String[] words = s.trim().split(" "); // ������� ������ �� �����������  � �LJ,����� �����
        s = "";
        for (int i = 0; i<words.length-1;i++)
        {
            s+=(words[i]+" ");
        }
        return s;
    }
}
