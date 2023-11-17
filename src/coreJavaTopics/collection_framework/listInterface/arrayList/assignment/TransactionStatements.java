package coreJavaTopics.collection_framework.listInterface.arrayList.assignment;

public class TransactionStatements {
    private Long transactionId;
    private String transactionType;
    private String transactionDate;
    private double transactionAmount;

    public TransactionStatements(Long transactionId, String transactionType, String transactionDate, double transactionAmount) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

	@Override
	public String toString() {
		return "TransactionStatements [transactionId=" + transactionId + ", transactionType=" + transactionType
				+ ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount + "]";
	}

    
}
