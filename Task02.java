// Напишете метод,который сжимает строкую
// Пример: вход aaaabbbcdd
// String.ToCharArray(); or  String.CharAt(0) -> "a" перевод строки в массив полностью или по индексам

public class Task02 {
    public static void main(String[] args) {
        System.out.println(letterCount());

    }

    public static StringBuilder letterCount() {
        StringBuilder sb = new StringBuilder();
        String str = "aaaabbbcdd";
        int count = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;

            }
            
            
        }
        sb.append(str.charAt(str.length()-1)).append(count);
        return sb;
    }

}
