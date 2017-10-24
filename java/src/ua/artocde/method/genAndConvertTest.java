package ua.artocde.method;

import ua.artocde.method.ArrayUtils;
public class genAndConvertTest {
    public static void main(String[] args) {

       int []mas = ArrayUtils.genRandomMasEvenNam(5,150);
       String res = ArrayUtils.convert(mas);
        System.out.println(res);

    }
}
