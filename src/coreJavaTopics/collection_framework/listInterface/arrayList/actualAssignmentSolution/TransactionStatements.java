package coreJavaTopics.collection_framework.listInterface.arrayList.actualAssignmentSolution;

import java.util.Objects;

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


	@Override
	public int hashCode() {
		return Objects.hash(transactionId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionStatements other = (TransactionStatements) obj;
		return Objects.equals(transactionId, other.transactionId);
	}


	@Override
	public String toString() {
		return "TransactionStatements [transactionId=" + transactionId + ", transactionType=" + transactionType
				+ ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount + "]";
	}

    
}
