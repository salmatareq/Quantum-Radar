package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Fine {

    private String plateNumber;
    private List<Violation> violations = new ArrayList<>();

    public Fine(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void addViolation(Violation violation) {
        violations.add(violation);
    }

    public BigDecimal getTotalAmount() {

      BigDecimal sum = BigDecimal.ZERO;

        for (Violation v : violations)
        {  sum = sum.add(v.getFees());
       // System.out.println( v.getFees());
        }
        return sum;
    }

    public List<Violation> getViolations() {
        return violations;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Traffic \n");
        sb.append("for car ").append(plateNumber).append("\n");
        sb.append("Total amount: ").append(getTotalAmount()).append(" EGP\n");
        sb.append("Violations:\n");
        for (Violation v : violations) {
            sb.append("- ").append(v.getDescription()).append(" : ").append(v.getFees()).append(" EGP\n");
        }

        return sb.toString();
    }
}
