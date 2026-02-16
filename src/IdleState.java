public class IdleState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Item selected.\n");
        vm.setState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine vm, Double amount) {
        System.out.println("Please select an item first.\n");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        System.out.println("No item to dispense.\n");
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        vm.setState(new OutOfOrderState());
    }
}