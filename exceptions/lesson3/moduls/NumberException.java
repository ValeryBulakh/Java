package lesson3.moduls;

public class NumberException extends NumberFormatException{
    public NumberException(){
        super("Это не является цифрой!");
    }
}