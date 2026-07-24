package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Violation {

    private  String ruleName;
    private  String description;
    private BigDecimal fees;
    private LocalDate date;

    public Violation(String ruleName,String description,BigDecimal fees) {
        this.ruleName = ruleName;
        this.description = description;
        this.fees = fees;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getRuleName() {
        return ruleName;
    }

     public String getDescription() {
          return description;
      }

    public BigDecimal getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return "ruleName='" + ruleName + '\'' +
                ", description='" + description + '\'' +
                ", fees=" + fees ;
    }
}
