package INN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class InnTest 
{
	
	public static void main(String[] args) throws BadInnException 
	{
       
        HashMap<String,String> TableNameInn = new HashMap<String, String>();//Создаем структуру данных HashMap для хранения нашего ключа и его значения. 
        
        TableNameInn.put("Ivan Isaacovich", "121");//Добавляем элементы 
        TableNameInn.put("Roma Veslovovich","123");
        TableNameInn.put("Lena Kuka","341");
        
        ArrayList<String> namsur = new ArrayList<String>();//Создаем массив для хранения введенных данных с клавиатуры. 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your full name: ");//Вводим наши ключ и значение.
        namsur.add(scanner.nextLine());
        
        System.out.println("Enter your INN: ");
        namsur.add(scanner.nextLine());
        
        try
        {	
            if(TableNameInn.containsKey(namsur.get(0)) && TableNameInn.get(namsur.get(0)).equals(namsur.get(1)))
            //Проверка на содержание 			|//Возвращает значение |//Сравниваются введенный и содержащийся ключи 
            //в коллекции введенного нами ключа	|//обьекта ключ которого 
            								  //|//равен нашему введенному ключу
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

