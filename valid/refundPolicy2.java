package com.zemoso.valid;
import com.zemoso.valid.canceledAmount;

public class refundPolicy2 implements canceledAmount {
    @Override
    public void getMoney(int ticketID) {
        System.out.println("This the amount left and it will saved for your future transactions");
    }
}
