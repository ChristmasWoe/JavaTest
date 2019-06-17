
package calctest;

public class Eval {
    public char[] operators={'+','-','*','/'}; 
    public char[] allowed={'0','1','2','3','4','5','6','7','8','9','I','V','X','L','D','C','M',' '};
    public char o;
    public static int indO;
    public static String a,b;
    public char getOper(String x){
        boolean found=false;
        for(int i=0;i<x.length();i++){
            for(int j=0;j<4;j++){
                if(x.charAt(i)==operators[j]){
                    o=x.charAt(i);
                    found=true;
                    break;
                }
        }
    }
          if(found==false){
                    System.out.println("Incorrect request2");
                    return 0;}
    return o;    
    }
    public void split(String x, String delim){
        String[] subStr;
        subStr=x.split(delim);
        a=subStr[0];
        b=subStr[1];
        System.out.println(a);
                System.out.println(b);
    }
    public void Check(String x){
        for(int i=0;i<x.length();i++){
            boolean found=false;
            for(int j=0;j<allowed.length;j++){
                if(x.charAt(i)==allowed[j]){
                    found=true;
                    break;
                }
            }
            if(found!=true){
                 System.out.println("Incorrect request3");
                    System.exit(0);
            }
        }
    }
    public String typ(String x){
        String typ="roman";
        for(int i=0;i<x.length();i++){
            for(int j=0;j<10;j++){
                  if(x.charAt(i)==allowed[j]){
                      typ="arabic";
                  }
            }
    }
       return typ;
    }
    public int parsing(String x, String typ){
    int result=0;
    switch (typ){
        case ("roman"):
            result=ToArabic(x);
            break;
         case("arabic"):
             
             break;
    }
    return result;
    }
    public static int ToArabic(String number) {
        if(number.isEmpty()==true) return 0;
        if (number.startsWith("M")) return 1000 + ToArabic(number.substring(1));
        if (number.startsWith("CM")) return 900 + ToArabic(number.substring(2));   //2
        if (number.startsWith("D")) return 500 + ToArabic(number.substring(1));//1
        if (number.startsWith("CD")) return 400 + ToArabic(number.substring(2));//2
        if (number.startsWith("C")) return 100 + ToArabic(number.substring(1));//1
        if (number.startsWith("XC")) return 90 + ToArabic(number.substring(2));//2
        if (number.startsWith("L")) return 50 + ToArabic(number.substring(1));//1
        if (number.startsWith("XL")) return 40 + ToArabic(number.substring(2));//2
        if (number.startsWith("X")) return 10 + ToArabic(number.substring(1));//1
        if (number.startsWith("IX")) return 9 + ToArabic(number.substring(2));//2
        if (number.startsWith("V")) return 5 + ToArabic(number.substring(1));//1
        if (number.startsWith("IV")) return 4 + ToArabic(number.substring(2));//2
        if (number.startsWith("I")) return 1 + ToArabic(number.substring(1));//1
        //throw new ArgumentOutOfRangeException("something bad happened");
        return 0;
    }
}
