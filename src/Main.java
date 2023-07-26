import buckscafe.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu("아메리카노","톨",4500));
        menus.add(new Menu("아메리카노","그란데",5000));
        menus.add(new Menu("아메리카노","벤티",5500));
        menus.add(new Menu("카페라떼","톨",5000));
        menus.add(new Menu("카페라떼","그란데",5500));
        menus.add(new Menu("카페라떼","벤티",6000));

        Barista barista = new Barista();

        BucksPay bucksPay = new BucksPay(5000);
        Customer customer = new Customer("Ember", bucksPay);

        String menu = customer.orderMenu("톨","카페라떼","아이스",menus);

        barista.makeCoffee(menu, customer.getNickname());

        customer.pickupCoffee();
    }
}