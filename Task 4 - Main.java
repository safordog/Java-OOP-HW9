/*
 * Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди
 * за «двойной колой». Как только человек выпьет такой колы, он
 * раздваивается и оба становятся в конец очереди, чтобы выпить еще
 * стаканчик. Напишите программу, которая выведет на экран
 * состояние очереди в зависимости от того, сколько стаканов колы
 * выдал аппарат с чудесным напитком. Например, если было выдано
 * только два стакана, то очередь выглядит как:
 * [Volovitc, Kutrapalli, Penny, Sheldon, Sheldon, Leonard, Leonard]
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
