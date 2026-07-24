package radar;

import model.Fine;
import model.Observation;
import model.Violation;
import rules.Rules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Radar {

    private List<Rules> rules = new ArrayList<>();

    private List<Fine> fines = new ArrayList<>();

    public void addRule(Rules rule) {
        rules.add(rule);
    }

    public void observe(Observation observation) {

        Fine fine = new Fine(observation.getPlateNumber());

        for (Rules rule : rules) {

            Violation violation = rule.check(observation);

            if (violation != null)
            {  fine.addViolation(violation);
            violation.setDate(observation.getDate());
            }

        }

        if (!fine.getViolations().isEmpty())
            fines.add(fine);
    }

    public void getAllPossibleFines() {

        for (Fine fine : fines) {

            System.out.println(
                    fine.getPlateNumber() + " : " + fine.getTotalAmount() + " EGP");
        }
    }

    public void getViolatedRulesCount() {
        Map<String, Integer> map = new HashMap<>();

        for (Fine fine : fines) {
            for (Violation violation : fine.getViolations()) {
                String rule = violation.getRuleName();

                if (map.containsKey(rule))
                    map.put(rule, map.get(rule) + 1);
                else
                    map.put(rule, 1);
            }
        }

        map.forEach((rule, count) ->
                System.out.println(rule + " : " + count));
    }

    public List<Violation> getViolationsForCar(String plateNumber) {

        List<Violation> result = new ArrayList<>();

        for (Fine fine : fines) {

            if (fine.getPlateNumber().equals(plateNumber)) {
                result.addAll(fine.getViolations());
            }

        }

        return result;
    }
    public void printAllFines() {
        for (Fine fine : fines) {
            System.out.println(fine);
            System.out.println();
        }
    }
}
