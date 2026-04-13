import java.util.Scanner;

public class MenuMaps {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Pick the menu: ");
        int menu = input.nextInt();

        System.out.print("Pick the submenu: ");
        int submenu = input.nextInt();

        System.out.print("Pick the option: ");
        int options = input.nextInt();
        System.out.print("Pick the option: ");
        int suboptions = input.nextInt();


        switch(menu) {
            case 1:
                if(submenu == 1) {
                    System.out.println("Search");
                }
                else if(submenu == 2) {
                    System.out.println("Service name");
                }
                else if(submenu == 3) {
                    System.out.println("Erase");
                }
                else if(submenu == 4) {
                    System.out.println("Edit");
                }
                else if(submenu == 5) {
                    System.out.println("Assign Tone");
                }
                else if(submenu == 6) {
                    System.out.println("Send b'card");
                }
                else if(submenu == 7) {
                    System.out.println("Options");
                }
                else if(submenu == 8) {
                    if(options == 1) {
                        System.out.println("Type of view");
                    }
                    else if(options == 2) {
                        System.out.println("Memory status");
                    }
                }
                else if(submenu == 9) {
                    System.out.println("Speed dials");
                }
                else if(submenu == 10) {
                    System.out.println("Voice Tags");
                }
                break;
               
        
              case 2:
                if(submenu == 1) {
                    System.out.println("Write Sub menu");
                }
                else if(submenu == 2) {
                    System.out.println("Inbox");
                }
                else if(submenu == 3) {
                    System.out.println("Outbox");
                }
                else if(submenu == 4) {
                    System.out.println("picture messages");
                }
                else if(submenu == 5) {
                    System.out.println("templates");
                }
                else if(submenu == 6) {
                    System.out.println("Smiley's'");
                }
                else if(submenu == 7) {
                    if(options == 1) { 
                            if(suboptions == 1) {
                            System.out.println("Message centre everyday");
                            }
                            else if(suboptions == 2) {
                            System.out.println("Message sent as");
                            }
                            else if(suboptions == 3) {
                            System.out.println("Message validity");
                    }
                 }
                }
                else if(options == 2) { 
                            if(suboptions == 1) {
                            System.out.println("Delivery report");
                            }
                            else if(suboptions == 2) {
                            System.out.println("Reply via same centre");
                            }
                            else if(suboptions == 3) {
                            System.out.println("Character support");
                    }
                    
                }
                else if(submenu == 8) {
                      System.out.println("info service");
                }
                else if(submenu ==9 ) {
                    System.out.println("Voice mailbox number");
                }
                 else if(submenu ==10 ) {
                    System.out.println("service comman editor");
                }
                break;

              case 3:
                  System.out.print("Chat");
                break;

               case 4:
                if(submenu == 1) {
                    System.out.println("missed calls");
                }
                else if(submenu == 2) {
                    System.out.println("Received calls");
                }
                else if(submenu == 3) {
                    System.out.println("Dialed calls");
                }
                else if(submenu == 4) {
                    System.out.println("Erase recent call list");
                }
                else if(submenu == 5) {
                      if(options == 1) {
                        System.out.println("last call duration");
                    }
                    else if(options == 2) {
                        System.out.println("all calls duration");
                    }
                     else if(options == 3) {
                        System.out.println("eceived calls duration");
                    }
                     else if(options == 4) {
                        System.out.println("Dialled calls duration");
                    }
                     else if(options == 5) {
                        System.out.println("clear timers");
                    }
                }
                 else if(submenu == 6) {
                      if(options == 1) {
                        System.out.println("last call cost");
                    }
                    else if(options == 2) {
                        System.out.println("all calls cost");
                    }
                     else if(options == 3) {
                        System.out.println("clear counters");
                    }   
             }
        
                 else if(submenu == 7) {
                      if(options == 1) {
                        System.out.println("call cost limit");
                    }
                    else if(options == 2) {
                        System.out.println("show cost in");
                    }
                }
                else if (submenu ==8){
                    System.out.print("Prepaid credit");
            }
        break;  
                case 5:
                if(submenu == 1) {
                    System.out.println("Ringing Tones");
                }
                else if(submenu == 2) {
                    System.out.println("ringing volume");
                }
                else if(submenu == 3) {
                    System.out.println("incoming call alert");
                }
                else if(submenu == 4) {
                    System.out.println("composer");
                }
                else if(submenu == 5) {
                    System.out.println("message alert tone");
                }
                else if(submenu == 6) {
                    System.out.println("keypad tones");
                }
                else if(submenu == 7) {
                    System.out.println("warning and game tones");
                }
                 else if(submenu == 8) {
                    System.out.println("vibrating alert");
                }
                else if (submenu == 9){
                    System.out.println("screen saver");
                }
                
                break;  
                             case 6:
                    if(submenu == 1) {
                      if(options == 1){
                        System.out.println("call Settings");
                    }
                    else if(options == 2) {
                        System.out.println("automatic redial");
                    }
                     else if(options == 3) {
                        System.out.println("call waiting decision");
                    }
                     else if(options == 4) {
                        System.out.println("own number sending");
                    }
                     else if(options == 5) {
                        System.out.println("phone line in use");
                    }
                     else if(options == 6) {
                        System.out.println("automatic answer");
                    }
                }

                  else if(submenu == 2) {
                      if(options == 1) {
                        System.out.println("language");
                    }
                    else if(options == 2) {
                        System.out.println("Cell info display");
                    }
                     else if(options == 3) {
                        System.out.println("welcome note");
                    }
                     else if(options == 4) {
                        System.out.println("network selection");
                    }
                     else if(options == 5) {
                        System.out.println("lights");
                    }
                     else if(options == 6) {
                        System.out.println("confirm SIm service actions");
                    }
                }
                  else if(submenu == 3) {
                      if(options == 1) {
                        System.out.println("Pin code request");
                    }
                    else if(options == 2) {
                        System.out.println("call barring service");
                    }
                     else if(options == 3) {
                        System.out.println("fixed dailing");
                    }
                     else if(options == 4) {
                        System.out.println("closed user group");
                    }
                     else if(options == 5) {
                        System.out.println("phone security");
                    }
                     else if(options == 6) {
                        System.out.println("change access codes");
                    }
              
                    else if(submenu == 4){
                        System.out.print("Restore factory Settings");
                        }
                }
                 break; 
                 
               case 7: System.out.println("Call divert"); break;
               case 8: System.out.println("Games") ;break;
               case 9: System.out.println("Reminders") ;break;
               case 10: System.out.println("Clock"); break;

            case 11:
                if(submenu == 1) {
                    System.out.println("Search");
                }
                else if(submenu == 2) {
                    System.out.println("Service name");
                }
                else if(submenu == 3) {
                    System.out.println("Erase");
                }
                else if(submenu == 4) {
                    System.out.println("Edit");
                }
                else if(submenu == 5) {
                    System.out.println("Assign Tone");
                }
                else if(submenu == 6) {
                    System.out.println("Send b'card");
                }
                
            break;
                 case 12: System.out.println("Profiles") ;break;
                 case 13: System.out.println("Sim Services"); break;
                

        
        }
    }
}
