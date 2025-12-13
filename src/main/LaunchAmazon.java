package main;    //com.Ayush.Amazon.main

import services.BlueDart;
import services.FedEx;
import services.FirstFlight;

//? from main method perspective Amazon class is a Target Class
//? bcz inside Amazon class i am using make of services from bluedart,firstflight, fedex.
public class LaunchAmazon 
{
    public static void main(String[] args) {

 //todo Target class/Object = a class where services of other class is used  (eg - Amazon class) 
 //todo dependent object/class = a class whose services will be used in target class  (eg - FirstFight,FedEx, BlueDart)
//? Injecting the Dependent Object to Traget class is called Dependency INjection
//? If this is donr Through setter we call as setter injection
//? Id this is done throrgh constructor it is calles as constructor Injection
        //? Dependent Object Injecting to the target class from Constructor is called Constructor Innjection
//todo CONSTRUCTOR INJECTION
        Amazon amz = new Amazon(new FirstFlight());  // pasisng service from paratrimized constructor

        //FedEx fedEx = new FedEx();  //?creating object and passing object refrence
        //amz.setService(fedEx);      

//?  Setter Injection = Injecting Dependent Object to Target class, through setter
        //! amz.setService(new FedEx());  //! directly Passing the address for FedEx
        //! amz.setService(new BlueDart()); //todo uding this we can set service as BlueDart


        Boolean status = amz.deliveryTheProduct(585.5); 

        if(status)
            System.out.println("Product Delivery Successfull");
        else
            System.out.println("Failed to Deliver The Product");

    }
}

