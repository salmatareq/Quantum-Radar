package rules;

import model.Observation;
import model.Violation;

public interface Rules {

    String getRuleName();
    Violation check(Observation Obs);
}
