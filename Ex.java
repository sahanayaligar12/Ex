package pull;

public class Ex {
    
    private int num1 = 12;
    private int num2 = 13;

    public static void main(String[] args) {
        Ex add = new Ex();
        System.out.println("Addition result: " + add.addNumbers());
        System.out.println("Subtraction result: " + add.subtractNumbers());
    }

    private int addNumbers() {
        return num1 + num2;
    }

    private int subtractNumbers() {
        return num1 - num2;
    }
}



