package com.zemoso.valid;
import com.zemoso.valid.canceledAmount;
import com.zemoso.valid.refund;

public class refundPolicy1 implements canceledAmount,refund{
@Override
public void getMoney(int ticketID) {
        System.out.println("This the amount left");
        }
@Override
public void creditBalance() {
        System.out.println("This amount is credited to the linked AccountNumber");
        }
        }
