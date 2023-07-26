package buckscafe;

import java.util.List;

public class Customer {
    private String nickname;
    private BucksPay bucksPay;

    public Customer(String nickname, BucksPay bucksPay){
        System.out.println("("+nickname+" 고객님 카페 입장)");
        this.nickname = nickname;
        this.bucksPay = bucksPay;
    }

    public String orderMenu(String size, String menu, String option, List<Menu> menus){
        boolean isMenuEqual = false;
        boolean isOptionEqual = false;
        int price = 0;

        System.out.println("<고객 "+nickname+"> "+size+" "+menu+" "+"한잔 "+option+"로 주세요.");

        for(int i=0; i<menus.size(); i++){
            isMenuEqual = menus.get(i).getMenu().equals(menu);
            isOptionEqual = menus.get(i).getSize().equals(size);
            price = menus.get(i).getPrice();
            if(isMenuEqual&&isOptionEqual) {
                bucksPay.pay(price);
            }
        }
        menu = option+menu;
        return menu;
    }

    public String getNickname() {
        return nickname;
    }

    public void pickupCoffee() {
        System.out.println("<고객 "+nickname+"> 감사합니다.");
    }
}
