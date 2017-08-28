package com.yjg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qin on 17-8-26.
 */
public class Test {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        Scanner scanner=new Scanner(System.in);
        while (true){
            stringBuffer.append(scanner);
            if (scanner.equals(".")){
                break;
            }
        }
        String a=String.valueOf(stringBuffer);
        String[] strings=a.split(",");

        int result=0;
        int b=3;
        String max= String.valueOf(0);
        for (int i=0;i<strings.length;i++){
            for (int j=i;j<b;j++){
                max +=strings[j];
            }
        }
        System.out.println(max);






    }
}
