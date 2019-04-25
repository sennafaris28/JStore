package jstore;

public enum InvoiceStatus
    {
    Paid("Paid"), Unpaid("Unpaid"), Installment("Installment");

    private String InvoiceStatus;

    private InvoiceStatus(String InvoiceStatus)
    {
        this.InvoiceStatus = InvoiceStatus;
    }

    private String InvoiceStatus()
    {
        return InvoiceStatus();
    }
}

