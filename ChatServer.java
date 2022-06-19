import java.net.*;
import java.io.*;
import java.util.*;
class ChatServer {
  public static void main(String[] args)throws Exception{
    ServerSocket ss = new ServerSocket(50000);
	System.out.println("Server is running at@50000");
	Socket s = ss.accept();
    Scanner kb = new Scanner(System.in);
	PrintStream out = new PrintStream(s.getOutputStream());
	Scanner in = new Scanner(s.getInputStream());
	String cmsg="",smsg="";
	while(true){
       try{
		   cmsg = in.nextLine();
		   System.out.println("Client: "+cmsg);
		   if(cmsg.equalsIgnoreCase("bye"))
			   break;
		   System.out.print("Server: ");
		   smsg = kb.nextLine();
		   out.println(smsg);
	   }
	   catch(Exception e){
		   break;
	   }
	}
  }
}


