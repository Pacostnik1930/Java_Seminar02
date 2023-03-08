import java.util.Scanner;

// Дано четное число N(>0)и символы с1 и с2.
// Написать метод,который вернет строку длины N,которая состоит из чередующихся символов с1 и с2,начиная с с1

public class Task01 {
    public static void main(String[] args) {
System.out.println(build());
    }

    public static StringBuilder build() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int limit = in.nextInt();
        System.out.println("Введите первый символ: ");
        String first = in.next();
        System.out.println("Введите второй символ: ");
        String second = in.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                sb.append(first);
            } else {
                sb.append(second);

            }
        
        }
        return sb;
        
    }
}