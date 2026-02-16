public class ItemSelectedState implements VendingMachineState {
    
    @Override
    public void selectItem(VendingMachine vm) {
        System.out.println("An item has already been selected.\n");
    }

    @Override
    public void insertCoin(VendingMachine vm, Double amount) {
        if (amount <= 0.0) {
            System.out.println("Invalid amount.");
            return;
        }

        System.out.println("Coin accepted.");
        Double newBalance = vm.getBalance() + amount;
        vm.setBalance(newBalance);
        System.out.println("Added $"+ amount +".\nCurrent: "+vm.getBalance());
    }

    @Override
    public void dispenseItem(VendingMachine vm) {
        if (vm.getBalance() >= vm.getDrinkPrice()) {
            System.out.println("Dispensing item...\n");
            vm.resetBalance();
            vm.setState(new DispensingState());
        }
        else {
            System.out.println("Insufficient balance. Please insert more coins.");
        }
        
    }

    @Override
    public void setOutOfOrder(VendingMachine vm) {
        vm.setState(new OutOfOrderState());
    }
}