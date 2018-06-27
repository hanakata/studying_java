class Order {
    String name;
    int quantity;

    public String toString() {
        return super.toString() + ",name=" + name + ",quantity=" + quantity;
    }
}

class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.name = "apple";
        order.quantity = 10;
        System.out.println(order);
    }
}