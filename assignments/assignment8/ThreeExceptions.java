package com.zemoso.java.assignments.assignment8;

class InvalidPhoneException extends Exception {
    public InvalidPhoneException (String str){
        super(str);
    }

}
class InvalidPinCodeException extends Exception{
    public InvalidPinCodeException(String str){
        super(str);
    }
}
class InvalidNameException extends Exception{
    public InvalidNameException(String str){
        super(str);
    }
}
class Verify extends Exception{
    public void CheckDetails(String phone,String pin,String Name) throws InvalidPinCodeException,InvalidPhoneException,InvalidNameException{
        if(phone.length() !=10){
            throw new InvalidPhoneException("Invalid phone number inserted");
        }
        if(pin.length() !=6){
            throw new InvalidPinCodeException("Wrong PinCode inserted");
        }
        if(!nameCheck(Name)){
            throw new InvalidNameException("Invalid Name");
        }

    }
    public boolean nameCheck(String name){
        for(char ch:name.toCharArray()){
            int index=(int)ch;
            if(index<65||(index>90&&index<97)||index>122){
                return false;
            }
        }
        return true;
    }
}
public class ThreeExceptions {
    public static void main(String[] args) {
        Verify obj = new Verify();
        try {
            obj.CheckDetails("1234567890", "123456", "Rishabh");
        }catch (InvalidNameException | InvalidPhoneException | InvalidPinCodeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Exception not caught.");
        }
    }
}
