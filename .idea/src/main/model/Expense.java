import model.User;

public class Expense {
    private int expense_ID;
    private double amount;
    private List<User> participants;
    private boolean paid_or_not;

    public Expense(int expense_ID, double amount, List<User> participants, boolean paid_or_not) {
        this.expense_ID = expense_ID;
        this.amount = amount;
        this.participants = participants;
        this.paid_or_not = paid_or_not;
    }

    public int getExpense_ID() {
        return expense_ID;
    }

    public void setExpense_ID(int expense_ID) {
        this.expense_ID = expense_ID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public boolean isPaid_or_not() {
        return paid_or_not;
    }

    public void setPaid_or_not(boolean paid_or_not) {
        this.paid_or_not = paid_or_not;
    }
}