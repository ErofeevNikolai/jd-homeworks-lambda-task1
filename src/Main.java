public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        /*
        в методе минус у нас происходит вычитание из первого аргумента второго соответственно переменная с = 0;

        в методе devide происходит деление первого аргумента на второй;
        в качестве второго аргумента мы передаем переменную С, значение которой мы вычислили ранее, и оно равно 0;
        получается что в методе devide мы делим на 0 что математически не верно;

        пути решения:
        1. ввести проверку делителя != 0
        2.
         */

        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

    }
}

