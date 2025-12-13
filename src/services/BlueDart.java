package services;

public class BlueDart implements IDeliveryService {

    @Override
    public Boolean deliverProduct(Double amount) {
        
        System.out.println("Product delivered through BlueDart and amouny paid is "+amount);
        return true;
    }

}
