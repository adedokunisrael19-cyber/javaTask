public class OshoFreePromotionEngine{
    public static void main(String[] args){

    }

    public static double  promoDiscount(double cartTotal, String promoCode){
        
        double discountRate = 0.0;
        if(cartTotal <0)
        return 0.0;
        if(cartTotal <5000){
         discountRate = 0.0;
        }else if(cartTotal >= 5000 && cartTotal< 15000 && "STARTER10".equals(promoCode)) {
            discountRate = 0.1;
        }else if(cartTotal >= 15000 && cartTotal < 30000 && "BIGBOY20".equals(promoCode)){
            discountRate = 0.2;
        }else if (cartTotal > 30000 && "OSHOFREE35".equals(promoCode)){
            discountRate =  0.35;
        }
            double discountAmount = cartTotal * discountRate;
            return cartTotal - discountAmount;
    } 
}
