public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking , int hourOfDay){

        if(hourOfDay >=0 && hourOfDay < 24){
            if(barking == true && ((hourOfDay >= 0 && hourOfDay < 8)||(hourOfDay > 22 && hourOfDay < 24))){
                return true;
            }else {
                return false;
            }

        } else {
            return false;
        }
    }

}
