public class BaNgoiException {
    public static void main (String[] args)
    {

       try{
           String str = null;
           String message = (str == null) ? "" :
                   str.substring(0,5);
           System.out.println(message);
           // Initializing String variable with null value
            str = "ha";
            message = (str == null) ? "" :
                   str.substring(0,5);
           System.out.println(message);
           str = "Geeksforgeeks";
            message = (str == null) ? "" : str.substring(0,5);
           System.out.println(message);
       }catch(Exception e){
        System.out.println("loi:" + e.getMessage());
    }



        // Initializing String variable with null value

    }

}
