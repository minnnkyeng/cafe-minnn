package buckscafe;

public class Barista {
    public void makeCoffee(String coffee, String nickname){
        System.out.println("("+coffee+" 만드는 중)");
        System.out.println("("+coffee+" 제조 완료)");
        System.out.println("<바리스타 Wade> "+nickname +"고객님 주문하신 "+coffee+" 한잔 나왔습니다.");
    }
}
