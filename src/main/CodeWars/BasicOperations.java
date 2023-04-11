package CodeWars;
//Ваша задача - создать функцию, которая выполняет четыре основные математические операции.
//
//        Функция должна принимать три аргумента - operation(строка/символ), value1(число), value2(число).
//        Функция должна возвращать результат чисел после применения выбранной операции.


public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2)
    {
        int sum = 0;
        if (op == "+"){
        sum = v1 + v2;}
        if (op == "-"){
            sum = v1 - v2;}
        if (op == "*"){
            sum = v1 * v2;}
        if (op == "/"){
            sum = v1 / v2;}

        return sum;}


}
