import java.util.ArrayList;

public class ProgramObjets {

    private ArrayList<Number> numbers;

    public ProgramObjets() {
        numbers = new ArrayList<>();
    }

    
    public void addNumber(Number number) {
        numbers.add(number);
    }

    public void getObjets() {
        for (Number number : numbers) {
            System.out.println("Value: " + number + " | Type: " + number.getClass().getSimpleName());
        }
    }
}
