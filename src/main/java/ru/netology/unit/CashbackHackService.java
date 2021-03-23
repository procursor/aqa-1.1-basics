package ru.netology.unit;

/**
 * @version 0.1
 */
public class CashbackHackService {
    final static int BOUNDARY = 1000;   // defines cashback _threshold_

    public int calculateRemainder(int amount) {
        return BOUNDARY - amount % BOUNDARY;
    }
}