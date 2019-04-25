package jstore;

public enum InvoiceType

{
    Buy("Buy"), Sell("Sell");

    private String InvoiceType;

    private InvoiceType(String InvoiceType)
    {
        this.InvoiceType = InvoiceType;
    }

    private String InvoiceType()
    {
        return InvoiceType();
    }
}
