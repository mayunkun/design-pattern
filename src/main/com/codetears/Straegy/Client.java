package main.com.codetears.Straegy;

/**
 * @Description 策略模式测试
 * @Date 2019-05-13 14:30
 * @Author l'amour solitaire
 */
public class Client {
    public static void main(String[] args) {
        ChargeContext charge = new ChargeContext("折扣收款");
        System.out.println(charge.money(1000));
        ChargeContext charge1 = new ChargeContext("正常收款");
        System.out.println(charge1.money(1000));
    }
}
