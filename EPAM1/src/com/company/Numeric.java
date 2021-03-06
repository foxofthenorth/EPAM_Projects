package com.company;

public class Numeric {
    public static char[] bin (int inputNumber){
        int Iterator=1, CopyNumber=inputNumber;
        while (CopyNumber>1){
            Iterator++;
            CopyNumber/=2;
        }
        char[] Bin=new char[Iterator];
        int Ostacha;
        while (inputNumber!=0){
            Ostacha=inputNumber%2;
            inputNumber=(inputNumber-Ostacha)/2;
            Bin[--Iterator]=(Ostacha==0)?'0':'1';
        }
        return Bin;
    }
    public static char[] Oct (char[] inputBinString){
        char[]Symbols={'0','1','2','3','4','5','6','7'};
        //inputBinString=binToBin(inputBinString);
        int CharArrLength=inputBinString.length;
        while ((CharArrLength)%3!=0){
            CharArrLength++;
        }
        char[] inBinNumber=new char[CharArrLength];
        for (int i=0;i<CharArrLength;i++){
            if(inputBinString.length+i<CharArrLength)inBinNumber[i]='0';
            else inBinNumber[i]=inputBinString[i-(CharArrLength-inputBinString.length)];
        }
        char[]Res=new char[CharArrLength/3];
        int PartNumb=0;
        int j=0;
        for (int i=0;i<inBinNumber.length;i=i+3){
            PartNumb=(inBinNumber[0+i]=='0'?0:1)*4+(inBinNumber[1+i]=='0'?0:1)*2+(inBinNumber[2+i]=='0'?0:1)*1;
            Res[j++]=Symbols[PartNumb];
        }
        return Res;
    }
    public static char[] Hex (char[] inputBinString){
        char[]Symbols={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //inputBinString=binToBin(inputBinString);
        int CharArrLength=inputBinString.length;
        while ((CharArrLength)%4>0){
            CharArrLength++;
        }
        char[] inBinNumber=new char[CharArrLength];
        for (int i=0;i<CharArrLength;i++){
            if(inputBinString.length+i<CharArrLength)inBinNumber[i]='0';
            else inBinNumber[i]=inputBinString[i-(CharArrLength-inputBinString.length)];
        }
        char[]Res=new char[CharArrLength/4];
        int j=0;
        for (int i=0, PartNumb=0;i<inBinNumber.length;i+=4){
            PartNumb=(inBinNumber[0+i]=='0'?0:1)*8+(inBinNumber[1+i]=='0'?0:1)*4+(inBinNumber[2+i]=='0'?0:1)*2+(inBinNumber[3+i]=='0'?0:1)*1;
            Res[j++]=Symbols[PartNumb];
        }
        return Res;
    }
    public static char[] binToBin(char[] inputBinString){
        for (int i=0; i<inputBinString.length;i++) inputBinString[i]=(inputBinString[i]=='0')?((char)0):((char)1);
        return inputBinString;
    }
}
