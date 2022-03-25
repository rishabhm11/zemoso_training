package com.company;
//*********************************************************************
class getStockPrice{
    void getprice(String stock, String service){
        if(service=="email"){
            //logic
        }else if(service=="sms"){
            //logic
        }else if(service=="whatsapp"){
            //logic
        }
    }
}
//*********************************************************************
//now, if we want to add another service, we have to make changes in getStockPrice class
//and it will violate the law
//so we will extend this classes to it for better approach
//*********************************************************************
interface getStockPrice1{
    public void getprice(String stock, String service);
}
class email implements getStockPrice1 {
    @Override
    public void getprice(String stock, String service){
        //logic
    }
}
class sms implements getStockPrice1{
    @Override
    public void getprice(String stock, String service){
        //logic
    }
}
class whatsapp implements getStockPrice1{
    @Override
    public void getprice(String stock, String service){
        //logic
    }
}
class telegram implements getStockPrice1{
    @Override
    public void getprice(String stock, String service){
        //logic
    }
}
//*****************************************************
public class open_closed {
// The open close principle state that according to a new requirements
// the module should be open for extension but closed for modification
// Therefore, we created an interface and extends it to various classes
// this will resolve the issue for modifications
}
