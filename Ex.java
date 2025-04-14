package pull;

public class Ex {
    
    private int num1 = 12;
    private int num2 = 13;
    private int num3 = 14;

    public static void main(String[] args) {
        Ex add = new Ex();
        System.out.println("Addition result: " + add.addNumbers());
        System.out.println("Subtraction result: " + add.subtractNumbers());
        System.out.println("Multiplication result: " + add.multiplytNumbers());

    
    }

    private int addNumbers() {
        return num1 + num2;
    }

    private int subtractNumbers() {
        return num1 - num2;
    }
    private int multiplytNumbers() {
        return num1 * num2;
    }
}



