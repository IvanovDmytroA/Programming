package ua.org.oa.ivanovd.homework2.stringUtils;

/**
 * Created by Администратор on 19.05.2016.
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Перевернутая строка: " + StringUtils.upendStrings("Hello world!"));
        System.out.println("Заданная строка - палиндром: " + StringUtils.checkPalindrome("А роза упала на лапу Азора!"));
        System.out.println("Проверка длинны строки: " + StringUtils.checkStringLength("Rashid"));
        System.out.println("Меняем местами первое и последнее слово: "
                + StringUtils.swapWords("What a beautiful read. It was insane game. Ggs, guys!"));
        System.out.println("Меняем местами первое и последнее слово в каждом предложении: "
                + StringUtils.swapWordsInSentences("I can't tell you anithing about that. Even if you deserve this."));
        System.out.println("В строке только буквы a, b, c: " + StringUtils.checkCharacters("aaabbcccccd"));
        System.out.println("Является ли строка датой: " + StringUtils.isDate("09.11.1982"));
        System.out.println("Является ли строка электронным адресом: " + StringUtils.isEmail("hfzlbvf3003@gmail.ru"));
        System.out.println("Номера телефонов: " + StringUtils.findPhoneNumbers("+8(057)222-12-31 и +8(055)56-483-12"));
    }
}
