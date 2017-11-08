package com.company;

import java.util.Scanner;
import com.company.Numeric;

public class InOut {
    public static int inNumber(){
        int Res=-1;
        while (Res<0) {
            System.out.println("write number");
            int NewNumber;
            Scanner Scan = new Scanner(System.in);
            NewNumber = Scan.nextInt();
            if(NewNumber>=0) Res=NewNumber;
            else System.out.println("please, write number >=0");
        }
        return Res;
    }
    public static int Cikle(){
        int IntRes=0;
        int Number=inNumber();
        System.out.println("Please, choose method to conver: '0' to Oct, '1' to Hex, '2' or more to Bin");
        Scanner Scan = new Scanner(System.in);
        int InCase=Scan.nextInt();
        if (InCase==0){
            System.out.println(Numeric.Oct(Numeric.bin(Number)));
        }
        if (InCase==1){
            System.out.println(Numeric.Hex(Numeric.bin(Number)));
        }
        if (InCase>1){
            System.out.println(Numeric.bin(Number));
        }
        System.out.println("If you want to convert other, please, enter '1' or more, else - '0'");
        IntRes=Scan.nextInt();
        return IntRes;
    }
}
