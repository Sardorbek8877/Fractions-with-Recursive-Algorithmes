public class PraktikumBlatt_4 {

    public static Fraction maximum( Fraction[] arr, int i ){
        if( i < 0 || i >= arr.length ){
            throw new RuntimeException();
        }
        else {
            if( i==0 ){
                return arr[0];
            }
            else {
                Fraction max = maximum(arr, i-1);
                if (arr[i].toDouble() > max.toDouble()){
                    return arr[i];
                }
                else {
                    return max;
                }
            }
        }
    }

    public static Fraction lastPositive( Fraction[] arr, int i ){
        if( i<0 || i>=arr.length ){
            throw new RuntimeException();
        }
        else {
            if (i==0){
                if(arr[i].toDouble() > 0){
                    return arr[i];
                }
                else {
                    return null;
                }
            }
            else {
                if( arr[i].toDouble() > 0 ){
                    return arr[i];
                }
                else {
                    return lastPositive(arr, i-1);
                }
            }
        }
    }

    public static Fraction firstPositive( Fraction[] arr, int i ){
        if( i<0 || i>=arr.length ){
            throw new RuntimeException();
        }
        else {
            if (i==0){
                if (arr[0].toDouble() > 0){
                    return arr[i];
                }
                else {
                    return null;
                }
            }
            else {
                Fraction first = firstPositive(arr, i-1);
                if( first == null && arr[i].toDouble()>0){
                    return arr[i];
                }
                else {
                    return first;
                }
            }
        }
    }



}





