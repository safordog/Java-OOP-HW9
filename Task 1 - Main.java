/*
 * Написать метод, который создаст список, положит в него 10
 * элементов, затем удалит первые два и последний, а затем выведет
 * результат на экран.
 */
package homework9;

import java.util.ArrayList;

/**
 *
 * @author safordog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getList();
        
    }
    
    public static void getList() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 11);
            arr.add(n);
        }
        arr.remove(0);
        arr.remove(1);
        arr.remove(7);
        arr.forEach((temp) -> System.out.print(temp + " "));  
    }
    
}
