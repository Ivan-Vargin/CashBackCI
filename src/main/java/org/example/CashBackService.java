package org.example;

public class CashBackService {
    public int cashBackCalculation(int purcheseAmount,boolean subscribed) {
        int bonus;
        if (subscribed) {
            bonus = (int) (purcheseAmount * 0.05);
        } else {
            bonus = (int) (purcheseAmount * 0.01);
        }
        if (bonus>1000) {bonus=1000;}
        return bonus;

    }
}
