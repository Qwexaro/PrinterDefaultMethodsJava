public interface BasicSimpleFunctionsPrinter {
    void printWhiteAndBlack();

    default void printColor() {
        System.out.println("Печать текущего цвета");
    }
}
