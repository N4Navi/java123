package unit1;

public class MyNewExecption {
    public static void main(String[] args) {
        UserDefinedException udf = new UserDefinedException();
        try{
        udf.validate(12);
    } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
