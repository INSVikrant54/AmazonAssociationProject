package services;

public class FedEx implements IDeliveryService {

    @Override
    public Boolean deliverProduct(Double amount) {
        
        System.out.println("Product delivered through FedEx and amouny paid is "+amount);
        return true;
    }

}
