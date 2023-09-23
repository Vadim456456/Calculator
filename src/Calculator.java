public class Calculator {
    public int calculate(int firstNumber, String oops, int secondNumber) {
        int result = 0;
        switch (oops) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0 && firstNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Деление на ноль не возможно");
                }
                break;
            default:
                System.out.println("Неизвестный оператор" + oops);

        }
        System.out.println(String.valueOf(firstNumber) + oops + secondNumber + "=" + result);
        return result;
    }

}
