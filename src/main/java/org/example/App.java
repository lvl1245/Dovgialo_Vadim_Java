package org.example;

import java.util.*;

public class App
{
    private  static  void HigherThanSeven(int number){
        if (number > 7 ) {System.out.println("Привет");}
    }
    private  static  void HelloToVyacheslav(String name){
        if (name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else {
            System.out.println("Нет такого имени");
        }
    }
    private static void ArrayValuesMultipleOfThree (Integer[] arr){
        for (int current:
             arr) {
            if (current % 3 == 0){
                System.out.println(current);
            }
        }
    }

    public static String SolveBrackets(String sequence){
        StringBuilder sb = new StringBuilder(sequence);
        ArrayList<Character>  openBrackets = new ArrayList<>(List.of('(', '[', '{'));
        ArrayList<Character>  closedBrackets = new ArrayList<>(List.of(')', ']', '}'));
        Stack<Character> stack = new Stack<>();
        for (char ch:
             sequence.toCharArray()) {
            if (openBrackets.contains(ch)){
                stack.add(ch);
            }else {
                if (closedBrackets.contains(ch)){
                    if (stack.isEmpty() || openBrackets.indexOf(stack.pop()) != closedBrackets.indexOf(ch)){
                        System.out.println("Последовательность неверна ");
                        return "Добавьте открывающие скобки!";
                    }
                }
            }
        }
        return stack.size() == 0 ? "Последовательность верная! " + sequence : "Добавьте закрывающие скобки!";
    }

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Введите число для проверки: ");
            HigherThanSeven(scanner.nextInt());

            System.out.print("Введите имя для проверки: ");
            HelloToVyacheslav(scanner.next());

            System.out.println("Введите элементы массива");
            System.out.println("Для остановки ввода введите пустую строку");
            scanner.skip("[\r\n]+");

            ArrayList<Integer> values = new ArrayList<>();

            while (true){
                String Current = scanner.nextLine();
                if (Current.isEmpty()) {
                    break;
                }else{
                 values.add(Integer.parseInt(Current));
                }
            }
            ArrayValuesMultipleOfThree(values.toArray(new Integer[0]));
            System.out.println("Введите скобочную последовательногсть: ");

            System.out.println( SolveBrackets(scanner.nextLine()));

        }
        catch (NumberFormatException e){
            System.out.println("Введено некорректное значение для элемента массива");
        }
        catch (InputMismatchException e){
            System.out.println("Введено некорректное значение для проверяемого числа");
        }

    }
}
