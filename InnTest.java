package INN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class InnTest 
{
	
	public static void main(String[] args) throws BadInnException 
	{
       
        HashMap<String,String> TableNameInn = new HashMap<String, String>();//������� ��������� ������ HashMap ��� �������� ������ ����� � ��� ��������. 
        
        TableNameInn.put("Ivan Isaacovich", "121");//��������� �������� 
        TableNameInn.put("Roma Veslovovich","123");
        TableNameInn.put("Lena Kuka","341");
        
        ArrayList<String> namsur = new ArrayList<String>();//������� ������ ��� �������� ��������� ������ � ����������. 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your full name: ");//������ ���� ���� � ��������.
        namsur.add(scanner.nextLine());
        
        System.out.println("Enter your INN: ");
        namsur.add(scanner.nextLine());
        
        try
        {	
            if(TableNameInn.containsKey(namsur.get(0)) && TableNameInn.get(namsur.get(0)).equals(namsur.get(1)))
            //�������� �� ���������� 			|//���������� �������� |//������������ ��������� � ������������ ����� 
            //� ��������� ���������� ���� �����	|//������� ���� �������� 
            								  //|//����� ������ ���������� �����
            {
                System.out.println("INN is OK!");
                
            }
            else 
            {
            	throw new Exception();
            }
        } 
        catch (Exception e) 
        {
            throw new BadInnException("Bad name or INN");
        }
    }
}

