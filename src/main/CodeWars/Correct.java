package CodeWars;//
//Программное обеспечение для распознавания символов широко используется для оцифровки печатных текстов. Таким образом, тексты можно редактировать, искать и сохранять на компьютере.
//
//        Когда документы (особенно довольно старые, написанные на пишущей машинке) оцифровываются, программное обеспечение для распознавания символов часто допускает ошибки.
//
//        Ваша задача - исправить ошибки в оцифрованном тексте. Вам нужно всего лишь обработать следующие ошибки:
//S неверно истолковывается как 5
//        O неверно истолковывается как 0
//        I неверно истолковывается как 1
//        Тестовые примеры содержат числа только по ошибке.


public class Correct {
    public static String correct(String string) {

        string = string.replace('5', 'S');
        string = string.replace('0', 'O');
        string = string.replace('1', 'I');


        return string;

    }
}
