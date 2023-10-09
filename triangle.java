import java.util.Scanner;
public class triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap canh b: ");
        float b = scanner.nextFloat();
        System.out.println("Nhap canh c: ");
        float c = scanner.nextFloat();
        float perimeter = a + b + c;
        float p = perimeter/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        if(a*a == b*b+c*c || b*b == a*a+c*c || c*c == a*a+b*b){
            System.out.println("tam giac vuong");
            System.out.println("chu vi tam giac " + perimeter);
            System.out.println("Dien tich tam giac " + S);
        }else if(a == b && b == c){
            System.out.println("tam giac deu");
            System.out.println("chu vi tam giac " + perimeter);
            System.out.println("Dien tich tam giac " + S);
        }else if(a == b || b == c || a == c){
            System.out.println("tam giac can");
            System.out.println("chu vi tam giac " + perimeter);
            System.out.println("Dien tich tam giac " + S);
        }else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b){
            System.out.println("tam giac tu");
            System.out.println("chu vi tam giac " + perimeter);
            System.out.println("Dien tich tam giac " + S);
        }else {
            System.out.println("tam giac nhon");
            System.out.println("chu vi tam giac " + perimeter);
            System.out.println("Dien tich tam giac " + S);
        }
    }
}
