import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ques-1
//        int n = sc.nextInt();
//        int ans=0;
//        int temp=n;
//        while(n>0){
//            int rem = n%10;
//            n=n/10;
//            ans=ans*10+rem;
//        }
//        if(temp==ans){
//            System.out.println("The number is palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome");
//        }

        //Ques:2
//        System.out.println("Enter 1st number");
//        int n1 = sc.nextInt();
//        System.out.println("Enter 2nd number");
//        int n2 = sc.nextInt();
//        System.out.println("Enter your choice :");
//        char op = sc.next().trim().charAt(0);
//        switch(op){
//            case '+':
//                System.out.println(n1+n2);
//                break;
//            case '-':
//                System.out.println(n1-n2);
//                break;
//            case '*':
//                System.out.println(n1*n2);
//                break;
//            case '/':
//                if(n2!=0) {
//                    System.out.println(n1 / n2);
//                }
//                break;
//            case '%':
//                System.out.println(n1%n2);
//                break;
//            default:
//                System.out.println("Invalid Operator");
//        }

        //Ques:3
//        int binary = sc.nextInt();
//        int decimalno=0;
//        int i=0;
//        while(binary!=0){
//            int rem = binary%10;
//            binary=binary/10;
//            decimalno+=rem*Math.pow(2,i);
//            i++;
//        }
//        System.out.println(decimalno);

        //Ques:4
//        int n= sc.nextInt();
//        int ans=0;
//        while(n>0){
//            int rem = n%10;
//            n=n/10;
//            ans=ans*10+rem;
//        }
//        System.out.println(ans);

        //Ques:5
        System.out.print("Enter your character : ");
        char ch = sc.next().charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println("This character is an alphabet");
        }
        else if(ch>='0'&& ch<='9'){
            System.out.println("The character is an digit");
        }
        else{
            System.out.println("The character is a special character");
        }

        //Ques:6
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int temp;
//        temp = n1;
//        n1=n2;
//        n2=temp;
//        System.out.print("After Swapping : ");
//        System.out.println(n1 + " " + n2);

        //Ques:7
//        int[][] a = {{1,1,1},{2,2,2},{3,3,3}};
//        int[][] b = {{1,1,1},{2,2,2},{3,3,3}};
//        int[][] c = new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                c[i][j]=0;
//                for(int k=0;k<3;k++){
//                    c[i][j] +=a[i][k] * b[k][j];
//                }
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }





    }
}
