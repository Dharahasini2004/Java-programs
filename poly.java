//notification code by polymorphism 
import java.util.*;
class notification{                      //base class
    void notifyUser(){
        System.out.println("Sending a general Notification");
    }
}       
//email notification
class emailnotification extends notification{
    void notifyUser(){
        System.out.println("Sending E-mail Notification to abc@example.com");
    }
}
//sms Notification
class smsnotification extends notification{
    void notifyUser(){
        System.out.println("Sending SMS notification to +91 9876543210");
    }
}
//push notification
class pushnotification extends notification{
    void notifyUser(){
        System.out.println("Sending Push Notification mobile app WhatsApp");
    }
}
public class poly{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        notification notify;
        System.out.println("Select notification type: ");
        System.out.println("1.Email");
        System.out.println("2.SMS");
        System.out.println("#.Whatsapp");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                notify=new emailnotification();
                break;
            case 2:
                notify=new smsnotification();
                break;
            case 3:
                notify=new pushnotification();
                break;
            default:
                notify=new notification();
        }
        notify.notifyUser();
    }
}