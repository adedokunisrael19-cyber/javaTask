
public class BackToSender{


    int parcel =0;
public static int PayPerParcel(int parcel ){ 
    int basepay = 5000;
    int pay =0;
        int parcel =0;
    
  
    if (parcel <50 ){
    pay = (parcel * 160) +basepay;
    return pay;
       }else if ( parcel >=50 && parcel <60){
        pay = (parcel * 200) + basepay;
         return pay;
       }else if ( parcel >=60 && parcel <60){
        pay = (parcel * 200) + basepay;
        return pay;
       }else if ( parcel >=50 && parcel <70){
        pay = (parcel * 250) + basepay;
        return pay;
       }else if ( parcel >=70){
        pay = (parcel * 500) + basepay;
        return pay;
        }return pay;
   } 

}
