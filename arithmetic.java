class Main {
    int add(int a, int b) {
        return b+a;
    }
    int sub (int a, int b) {
        return b-a;
    }
    int multi (int a, int b) {
        return a*b;
    }
    int division (int a, int b) {
        return a/b;
    }
public static void main(String [] args) {
    System.out.println("PSNA");
    Main obj = new Main();
    System.out.println(obj.add(10, 20));
    System.out.println(obj.sub(10, 20));
    System.out.println(obj.multi(5, 2));
    System.out.println(obj.division(20,2));
    
}
}
