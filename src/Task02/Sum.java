package Task02;



public class Sum {

    public int sumOfDigits(String s) {

        int l = s.length();
        int sum = 0;

        for (int i = 0; i < l; i = i + 1) {

            if (Character.isDigit(s.charAt(i))) {
                String temp = s.substring(i,i+1);
                sum += Integer.parseInt(temp);
            }
        }
        return sum;
    }
    public static void main (String[] args) {

        Sum m = new Sum();
        String str =  "s5e2n4l1a2"; // Строка в которой считается сумма всех присутствующих цифр.
        System.out.println("Данная строка: " + str);
        System.out.println("Сумма цифр в данной строке: " + m.sumOfDigits(str));
    }
}
