package store.management.type;

public enum BorrowStatus {
    BORROWED("B"), IDLE("I");

    private String value;

    BorrowStatus(String status) {
        this.value = status;
    }

    public static String checkStatus(final String value) {
        if (value == BorrowStatus.IDLE.value) {
            return IDLE.value;
        }

        return BORROWED.value;
    }
}
