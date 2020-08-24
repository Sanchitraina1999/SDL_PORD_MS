public class RandomNumberGen {
    public static Long getNumericString(){
        String NumericString = "0123456789";  
        String NumericStringWithout9 = "012345678";  
        StringBuilder sb = new StringBuilder(10);
        int index = (int) (NumericStringWithout9.length() * Math.random());
        sb.append(NumericStringWithout9.charAt(index));
        for (int i = 1; i < 10; i++) {
            index = (int) (NumericString.length() * Math.random());
            sb.append(NumericString.charAt(index));
        }
        Long acNumber = Math.abs(Long.parseLong(sb.toString()));
        return acNumber;
    }
}

//Generates a Number of 10 digits with first digit being Non Zero