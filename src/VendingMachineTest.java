public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(100); // Instantiate a vending machine object, and set inventory.

        // STATE: Idle
        vm.insertCoin(10.0); // Should disallow insertion of coins until an item is selected.
        vm.dispenseItem(); // Should disallow dispensing.
        vm.selectItem(); // For current implementation, only one item is available and is selected by default.
        
        // STATE: ItemSelected
        vm.selectItem(); // Disallows item selection, since an item has already been selected.
        vm.insertCoin(19.9); // Added to the current balance
        vm.dispenseItem(); // Returns a message if balance is insufficient

        vm.insertCoin(0.1); // Add enough balance for drink
        vm.dispenseItem(); // Item is dispensed.

        // STATE: Dispensing
        vm.selectItem(); // Disallowed during dispensing.
        vm.insertCoin(10.0); // Disallowed during dispensing.
        vm.dispenseItem(); // Returns to idle state

        // STATE: Idle
        vm.setOutOfOrder();

        // STATE: OutOfOrder
        vm.setOutOfOrder(); // Machine is already out of order.
    }
}