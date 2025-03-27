package abstraction;

public class Remote implements remoteI {
    
    public void Onremote(){
       System.out.println("the remote is on"); 
    }
    public void Ofremote(){
        System.out.println("the remote is of"); 

    }
    // public static void main(String []args){
    //     Remote  user1 = new Remote();
    //     user1.Onremote();
    //     user1.Ofremote();
    // }
}
