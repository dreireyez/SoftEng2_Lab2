public interface VendingMachineState {
    public void selectItem(VendingMachine vm);
    public void insertCoin(VendingMachine vm, Double amount);
    public void dispenseItem(VendingMachine vm);
    public void setOutOfOrder(VendingMachine vm);
}