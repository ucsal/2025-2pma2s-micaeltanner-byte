package br.com.mariojp.solid.srp;

public class ReceiptFormatter {

    public String format(Order order, double subtotal, double tax, double total) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RECIBO ===\n");

        for (var i : order.getItems()) {
            double lineTotal = i.getUnitPrice() * i.getQuantity();
            sb.append(i.getName())
              .append(" x")
              .append(i.getQuantity())
              .append(" = ")
              .append(lineTotal)
              .append("\n");
        }

        sb.append("Subtotal: ").append(subtotal).append("\n");
        sb.append("Tax: ").append(tax).append("\n");
        sb.append("Total: ").append(total).append("\n");

        return sb.toString();
    }
}
