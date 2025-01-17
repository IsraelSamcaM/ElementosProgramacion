public class Main {
    public static void main(String[] args) {
        Integer integer = 1;
        Float floatNumber = 1.0f;
        Double doubleNumbe = 1.7;
        Byte byteNumber = 1;
        ProgramObjets programObjets = new ProgramObjets();
        programObjets.addNumber(integer);
        programObjets.addNumber(floatNumber);
        programObjets.addNumber(doubleNumbe);
        programObjets.addNumber(byteNumber);
        programObjets.getObjets();
    }
}