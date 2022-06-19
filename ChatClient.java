import java.net.*;
import java.io.*;
import java.util.*;
class ChatClient{ 
  public static void main(String[] args)throws Exception{
    Socket s = new Socket("localhost",50000);
    Scanner kb = new Scanner(System.in);
	PrintStream out = new PrintStream(s.getOutputStream());
	Scanner in = new Scanner(s.getInputStream());
	String cmsg="",smsg="";
	while(true){
       try{
		   System.out.print("Client: ");
		   cmsg = kb.nextLine(); 
		   out.println(cmsg);

		   smsg = in.nextLine();
		   System.out.println("Server: "+smsg);
           if(smsg.equalsIgnoreCase("bye"))
			   break;
	   }
	   catch(Exception e){
		   break;
	   }
	}
  }
}


