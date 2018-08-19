/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework9a;

import java.util.ArrayDeque;

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
        getQueue(2);
    }
    
    public static void getQueue(int num) {
        ArrayDeque<String> arr = new ArrayDeque<String>();
        arr.push("Penny");
        arr.push("Kutrapalli");
        arr.push("Volovitc");
        arr.push("Leonard");
        arr.push("Sheldon");
        for (int i = 0; i < num; i++) {
            arr.addLast(arr.getFirst());
            arr.addLast(arr.removeFirst());
        }
        arr.forEach((temp) -> System.out.println(temp));
    }
    
}
