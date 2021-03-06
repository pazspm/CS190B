package api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import system.Computer;

/**
 *
 * @author Peter Cappello
 */
public interface Space extends Remote 
{
    public static int PORT = 24001;
    public static String SERVICE_NAME = "Space";
    public static Shared shared = null;
    
    void putAll (List<Task<?>> taskList) throws RemoteException;

    void putTask(Task<?> task) throws RemoteException;
    
    void putResult(Result<?> result) throws RemoteException;
    
    Task<?> getTask() throws RemoteException;
    
    Result<?> take() throws RemoteException;

    void updateWaiting(String id, Map<String,Object> map) throws RemoteException;

	void putTask(Task<?> task, String finalId) throws RemoteException;

	void putTasks(List<Task<?>> tasks) throws RemoteException;

	List<Task<?>> getTasks(int processors) throws RemoteException;

	void register(Computer computer, int threadsNumber) throws RemoteException;

	void putResults(List<Result<?>> results) throws RemoteException;
	
	
	void setShared(Shared shared) throws RemoteException;
	
	Shared getShared() throws RemoteException;
	
	void broadcast() throws RemoteException;
		
}


