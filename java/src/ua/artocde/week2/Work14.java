package ua.artocde.week2;
//Заменить в строке все символы 'a' на '@' и вывести новую строку // "array is a data type" -> "@rr@y is @ d@t@ type"
public class Work14 {
    public static void main(String[] args) {

       String line = "array is a data type";
       String res = "";
        for (int i = 0; i < line.length(); i++) {
            res = line.replace("a","@");
        }
        System.out.println(res);
    }
}
