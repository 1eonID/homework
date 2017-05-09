
import java.util.LinkedList;


public class Task9 {
    public static void main(String[] args) {
	String s1 = "12+2+2";
	String s2 = "2-2+2";
	String s3 = "2*2*2";
	String s4 = "2+2*10";
        System.out.println(s1 + " = " + calc(s1)); // =16
        System.out.println(s2 + " = " + calc(s2)); // =2
        System.out.println(s3 + " = " + calc(s3)); // =8
        System.out.println(s4 + " = " + calc(s4)); // =22
    }
    // Определяем, если символ оператор, вернуть true
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // Определяем приоритет операций
    public static int priority(char element){
        switch(element){
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
        }
        return 0;
    }


    static void HowCalc(LinkedList<Integer> st, char oper) {

        //Обьявление двух переменных, берём последнее значение
        //из списка чисел, запоминаем и удаляем его из списка
        int FirstNum = st.removeLast();
        int SecondNum = st.removeLast();

        //В зависимости от оператора, выполняем
        //операции над двумя взятыми из списка числами
        switch(oper) {
            case '+':
                st.add(SecondNum + FirstNum);
                break;
            case '-':
                st.add(SecondNum - FirstNum);
                break;
            case '*':
                st.add(SecondNum * FirstNum);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }

    public static int calc(String expression) {
        //Обьявляем списки чисел и операторов
        LinkedList<Integer> someInts = new LinkedList<>();
        LinkedList<Character> someOpers = new LinkedList<>();

        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // В первую очередь проверяем, на вход поступил оператор? Если да, то
            // выполняяеи цикл. Если список операторов не пустой и приоритет операции выше
            // у последнего оператора из списка операторов, чем у поступившего к нам, то
            // выполняет операцию с двумя последними цифрами в списке.
            if (isOperator(c)) {
                while(!someOpers.isEmpty() && priority(someOpers.getLast()) >= priority(c)) {
                    HowCalc(someInts, someOpers.removeLast());
                }
                // Если цикл не выполнился, то добавлям оператор в список операторов
                someOpers.add(c);
            }
            // Если верхнее условие не выполнилось, то ожидаемый символ - число
            else {
                // Строка позволяет работать с числами больше 9, где 2 символа и более
                String operand = "";
                // пока текущий элемент строки меньше длины строки и текущий
                // элемент это число, то составляем строку числа из символов
                while(i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    operand += expression.charAt(i++);
                }
                // Если цикл не выполнился, то уменьшаем i, т.к. в цикле
                // отработало увеличение i лишний раз. Преобразуем строку в число а
                // после добавляем её в список
                --i;
                someInts.add(Integer.parseInt(operand));
            }
        }

        // Пока список операторов не пустой, то делаем вычисления, посылая методу
        // HowCalc полученные числа и оператор
        while(!someOpers.isEmpty()) {
            HowCalc(someInts, someOpers.removeLast());
        }
        // В итоге, в списке чисел окажется наш результат, который мы и возвращаем
        return someInts.get(0);
    }
}

