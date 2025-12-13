package main;

//import services.FedEx;
import services.IDeliveryService;
//! Amazon class is a Trget class from main class perspective
//? Dependent Object -  classes used by Amazon for its services(Bluedart etc) are called Dependent Object
public class Amazon
{
    private IDeliveryService service;  //? service is a reference 

    public Amazon(IDeliveryService service)
    {
        this.service = service;
    }

    //! IDeliveryService service::(equals to) IDeliveryService service = new FedEx(); AS new FedEx()is forwaded fom main class
    public void setService(IDeliveryService service)  
    {
        this.service = service;
    }


    public Boolean deliveryTheProduct(Double amount)
    {
         //! Losely Coupled
          
        return service.deliverProduct(amount);     //! This will call the any class i.e. delivery partner as needed (without object)


        //FedEx fed = new FedEx();           //? Tightly Coupled due to Object and particularly calling a class
        //return fed.deliverProduct(amount);
        
        //!same Working
        //Boolean status = fed.deliverProduct(amount);
        //return status;
    }


    
}
