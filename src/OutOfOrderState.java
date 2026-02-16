public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("This machine is currently out of order.\n");
    }

    @Override
    public void insertCoin(VendingMachine vm, Double amount) {
        System.out.println("This machine is currently out of order.\n");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        System.out.println("This machine is currently out of order.\n");
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("This machine is already out of order.\n");
    }
}