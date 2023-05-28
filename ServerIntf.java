import java.rmi.Remote;
import java.rmi.RemoteException;

interface ServerIntf extends Remote{
    public String stringjoin(String str1,String str2) throws RemoteException;
}