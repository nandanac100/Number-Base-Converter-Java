import java.util.Scanner;
public class Frequency
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("CHOOSE ANY ONE OF THE FOLLOWING CONVERSIONS:");
        System.out.println("1.To convert any number to decimal choose 1\n2.To convert any number to binary choose 2\n3.To convert any number to octal number choose 3\n4.To convert any number to hexadecimal choose 4");
        int num=sc.nextInt();
        Frequency f=new Frequency();
        if(num==1){
            f.dec();
        }
        else if(num==2){
           f.bin();
        }
        else if(num==3){
            f.octal();
        }
        else if(num==4){
            f.hexaDecimal();
        }
        else{
            System.out.println("INVALID NUMBER");
        }
    }
    void dec() {
        int t = 0;
        int i;
        int g;
        Scanner s = new Scanner(System.in);

        System.out.println("ENTER THE BASE OF THE NUMBER TO BE CONVERTED:");
        int r = s.nextInt();
        if (r == 16) {
            System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
            String n =s.next();
            int d = Integer.parseInt(n, 16);
            System.out.println("CORRESPONDING DECIMAL NUMBER:" + d);
        }
        else if(r==2){

            System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
            int n =s.nextInt();

            int l = (int) (Math.log10(n) + 1);
            g = l - 1;
            for (i = 0; i <= g; i++) {

                int m = n % 10;

                if((m != 0)&&(m!=1)){
                    System.out.println("IT IS NOT A BINARY NUMBER");
                    break;
                }else{
                    n = n / 10;
                }t = t + (int) (m * (Math.pow(r, i)));
            }
            System.out.println("CORRESPONDING DECIMAL NUMBER:"+t);
        }
        else {
            System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
            int n =s.nextInt();
            int l = (int) (Math.log10(n) + 1);
            g = l - 1;
            for (i = 0; i <= g; i++) {
                int m;
                m = n % 10;
                n = n / 10;
                t = t + (int) (m * (Math.pow(r, i)));
            }
            System.out.println("CORRESPONDING DECIMAL NUMBER:" + t);

        }
    }
    void bin(){
        int t=0;
        int i;
        int g;
        Scanner s=new Scanner(System.in);

        System.out.println("ENTER THE BASE OF THE NUMBER TO BE CONVERTED:");
        int r=s.nextInt();
        if(r == 16) {
            System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
            String n = s.next();
            int d = Integer.parseInt(n, 16);
            System.out.print("CORRESPONDING BINARY NUMBER:");
            System.out.println(Integer.toBinaryString(d));

        }
        else{
            System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
            int n =s.nextInt();
            int l = (int)(Math.log10(n)+1);
            g=l-1;
            for(i=0;i<=g;i++)
            {   int m;
                m=n%10;
                n=n/10;
                t=t+(int)(m*( Math.pow(r,i)));
            }
           // System.out.println("corresponding decimal="+ t);
            System.out.print("CORRESPONDING BINARY NUMBER:");
            System.out.println(Integer.toBinaryString(t));
        }
    }
        void octal(){
        int t=0;
        int i;
        int g;
        Scanner s=new Scanner(System.in);

        System.out.println("ENTER THE BASE OF THE NUMBER TO BE CONVERTED:");
        int r=s.nextInt();
        if (r == 16) {
            System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
            String n = s.next();
            int d = Integer.parseInt(n, 16);
            System.out.print("CORRESPONDING OCTAL NUMBER:");
            System.out.println(Integer.toBinaryString(d));
        }else if(r==2){

            System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
            int n =s.nextInt();

            int l = (int) (Math.log10(n) + 1);
            g = l - 1;
            for (i = 0; i <= g; i++) {

                int m = n % 10;

                if((m != 0)&&(m!=1)){
                    System.out.println("IT IS NOT A BINARY NUMBER");
                    break;
                }else{
                    n = n / 10;
                }t = t + (int) (m * (Math.pow(r, i)));
            }
            System.out.println("CORRESPONDING OCTAL NUMBER:");
            System.out.println(Integer.toOctalString(t));
        }
        else{
            System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
            int n =s.nextInt();
             int l = (int)(Math.log10(n)+1);
             g=l-1;
            for(i=0;i<=g;i++)
            {   int m;
                m=n%10;
                n=n/10;
                t=t+(int)(m*( Math.pow(r,i)));
            }
            System.out.println("CORRESPONDING OCTAL NUMBER:");
            System.out.println(Integer.toOctalString(t));
        }
    }
    void hexaDecimal(){
        int t=0;
        int i;
        int g;
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
        int n=s.nextInt();
        System.out.println("ENTER THE BASE OF THE ENTERED NUMBER:");
        int r=s.nextInt();
        int l = (int)(Math.log10(n)+1);
        g=l-1;
        if(r==2){

            System.out.println("ENTER THE NUMBER TO BE CONVERTED:");
            n =s.nextInt();

            l = (int) (Math.log10(n) + 1);
            g = l - 1;
            for (i = 0; i <= g; i++) {

                int m = n % 10;

                if((m != 0)&&(m!=1)){
                    System.out.println("IT IS NOT A BINARY NUMBER");
                    break;
                }else{
                    n = n / 10;
                }t = t + (int) (m * (Math.pow(r, i)));
            }
            System.out.println("CORRESPONDING HEXADECIMAL NUMBER:");
            System.out.println(Integer.toOctalString(t));
        }else {
            for (i = 0; i <= g; i++) {
                int m;
                m = n % 10;
                n = n / 10;
                t = t + (int) (m * (Math.pow(r, i)));
            }
            System.out.println("CORRESPONDING HEXADECIMAL NUMBER:");
            System.out.println(Integer.toString(t, 16));
        }
    }
}