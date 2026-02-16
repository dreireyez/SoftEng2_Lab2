public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("Currently dispensing item. Please wait...\n");
    }

    @Override
    public void insertCoin(VendingMachine vm, Double amount) {
        System.out.println("Wait for dispensing to finish.\n");
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        vm.updateInventory(-1);
        System.out.println("Item dispensed.\n");
        vm.setState(new IdleState()); // Transition back to default state automatically
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        vm.setState(new OutOfOrderState());
    }
}