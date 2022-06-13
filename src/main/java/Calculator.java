public class Calculator {

    private int number1;
    private int number2;

    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public int getNumber1() {
        return this.number1;
    }

    public int addNumber() {
        return this.number1 + this.number2;
    }

    public Object setNumber1(int inputNumber) {
        this.number1 = inputNumber;
        return this.number1;
    }
    public Object setNumber2(int inputNumber) {
        this.number2 = inputNumber;
        return this.number2;
    }

    public int subtractNumber() {
        return this.number1 - this.number2;
    }

    public float divideNumber() {
        return this.number1 / this.number2;
    }
}
