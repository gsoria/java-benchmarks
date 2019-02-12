package org.sample.billing.service;

import org.sample.billing.model.Invoice;
import org.sample.billing.model.LineItem;

import java.util.List;

public interface InvoiceService {

    Long createInvoice(Invoice invoice);
    Invoice getInvoice(Long invoiceNumber);
    void addLineItem(Long invoiceNumber, LineItem item);
    void addLineItems(Long invoiceNumber, List<LineItem> items);
    Invoice issueInvoice(Long invoiceNumber);

}
