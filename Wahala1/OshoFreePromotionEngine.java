public class OshoFreePromotionEngine{
    public static void main(String[] args){

    }

    public static double  promoDiscount(double cartTotal, String promoCode){
        
        double discountRate = 0.0;
        double discountAmount =0.0;
        double newPrice = 0.0;       
        if(cartTotal <0)
        return 0.0;
        if(cartTotal <5000){
         discountRate = 0.0;
            newPrice = cartTotal;
        }else if(cartTotal >= 5000 && cartTotal< 15000 && "STARTER10".equals(promoCode)) {
            discountRate = 0.1;
            discountAmount = cartTotal * discountRate;
            newPrice = cartTotal - discountAmount;
        }else if(cartTotal >= 15000 && cartTotal < 30000 && "BIGBOY20".equals(promoCode)){
            discountRate = 0.2;
            discountAmount = cartTotal * discountRate;
            newPrice = cartTotal - discountAmount;
        }else if (cartTotal > 30000 && "OSHOFREE35".equals(promoCode)){
            discountRate =  0.35;
            discountAmount = cartTotal * discountRate;
            newPrice = cartTotal - discountAmount;
        }
            return newPrice;
    } 
}
