package Task01;

public class Triples {
    public int noTriples(String s) {

        int l = s.length();
        int counter = 0;
        for (int i = 0; i < l-2; i = i+1) {

            char temp = s.charAt(i); //возвращает значение char по указанному индексу. Индекс колеблется от 0 до length()-1
            if (temp == s.charAt(i+1) && temp == s.charAt(i+2)) //проверяет текущий символ равен ли следующиму и через один.
                counter = counter + 1;
        }
        return counter;
    }
    public static void main (String[] args) {

        Triples t = new Triples();

        String str =  "Hellooo Senlaaa"; // Строка в которой считаются символы повторяющиеся три раза подряд.

        System.out.println("Заданная строка: " + str);
        System.out.println("Количество \"троек\" в строке: " + t.noTriples(str));
    }
}

