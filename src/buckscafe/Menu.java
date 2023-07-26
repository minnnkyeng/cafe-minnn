package buckscafe;

public class Menu {
    private String menu;
    private String size;
    private int price;
    public Menu(String menu, String size){
        this.menu = menu;
        this.size = size;
    }
    public Menu(String menu, String size, int price){
        this(menu, size);
        this.price = price;
    }

    public String getMenu() {
        return menu;
    }

    public int getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}
