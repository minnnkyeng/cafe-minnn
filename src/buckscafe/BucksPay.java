package buckscafe;

public class BucksPay {
    private int amount;

    public BucksPay(int amount){
        this.amount = amount;
    }

    public void pay(int price){
        if(amount<price){
            System.out.println("잔액이 부족합니다. 충전하세요.");
        }else {
            this.amount -= price;
            if (this.amount <= 3000) {
                System.out.println("현재 충전금액이 " + this.amount + "입니다. 충전하세요.");
            }
        }
    }

    public void recharge(int amount){
        this.amount += amount;
    }
}
