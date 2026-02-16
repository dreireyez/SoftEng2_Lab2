public class VendingMachine {
    private int inventory;
    private Double balance;
    private VendingMachineState state;
    private final Double drinkPrice = 20.0; // For testing of current implementation.

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0.0;
        this.state = new IdleState(); // Sets the default state when initializing a vending machine object.
    }

    // Getters and Setters
    public VendingMachineState getState() {
        return state;
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getDrinkPrice() {
        return drinkPrice;
    }
    
    // Utility Methods
    public void resetBalance() {
        this.balance = 0.0;
    }
    public void updateInventory(int quantity) {
        this.inventory += quantity;
    }

    // State Methods
    public void selectItem() {
        state.selectItem(this);
    }

    public void insertCoin(Double amount) {
        state.insertCoin(this, amount);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }
}