package com.syntax.classes.HWClass19;

public class userClass {
/*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.
 */
    String name;
    int mobileNumber;
}
class userInfo extends userClass{
String address;
    userInfo(String name, int mobileNumber, String address){
        this.name=name;
        this.mobileNumber=mobileNumber;
        this.address=address;
    }
    void print(){

        System.out.println(name+ "   "+ mobileNumber+ "    "+ address+ "    ");
    }
}
