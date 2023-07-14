import java.util.*;
public class PasswordGenerator{
    public static void main(String[] args){
        int length =10;
        System.out.println(get_Password(length));
    }

static char[] get_Password(int len){
    System.out.println("Generating password using random");
    System.out.println("Your new password is ");
    String capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String small_chars="abcdefghijklmnopqrstuvwxyz";
    String numbers="0123456789";
    String symbols="*!@#$%^&*()_+=/.?<>,-";
    String values=capital_chars+small_chars+numbers+symbols;
    Random rndm_method= new Random();
    char[] password= new char[len];
    int[] pin= new int[6];
    for(int i=0;i<len;i++){
        password[i]=values.charAt(rndm_method.nextInt(values.length()));
    }
    return password;
}
}