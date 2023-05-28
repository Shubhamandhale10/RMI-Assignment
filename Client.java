import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            String serverUrl="rmi://localhost/server";
            ServerIntf serverIntf=(ServerIntf)Naming.lookup(serverUrl);

            System.out.println("Enter first String");
            String str1=sc.nextLine();

            System.out.println("Enter second String");
            String str2=sc.nextLine();

            System.out.println("-------------Result--------------");
            System.out.println("String after joining:"+serverIntf.stringjoin(str1,str2));


        }

        catch(Exception e){
            System.out.println("Exception Occoured At Client!"+e.getMessage());
        }
    }
}
