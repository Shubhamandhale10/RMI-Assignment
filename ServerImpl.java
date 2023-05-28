import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {
    public ServerImpl() throws RemoteException{
        
    }
    
    public String stringjoin(String str1,String str2){
        String result=str1+str2;
        return result;
    }
    
}
