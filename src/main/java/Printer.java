public class Printer {
    private int numberOfSheets;
    private int numberOfCopies;

    public Printer(int numberOfSheets, int numberOfCopies) {
        this.numberOfSheets = numberOfSheets;
        this.numberOfCopies = numberOfSheets;

    }

    public int getSheets() {
        return this.numberOfSheets;
    }
    public int printAction(){
        if (this.numberOfSheets <= this.numberOfCopies){
            return this.numberOfSheets - this.numberOfCopies;
        }
        else{
            return 000;
        }

    }

    public int setCopies(int inputNumber) {
        this.numberOfCopies = inputNumber;
        return numberOfCopies;
    }
}
