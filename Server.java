import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try{
            ServerImpl serverImpl =new ServerImpl();
            Naming.rebind("server", serverImpl);
            System.out.println("Server Conneccted!");
        }

        catch(Exception e){
            System.out.println("Exception Occoured At Server!"+e.getMessage());
        }
    }
}
