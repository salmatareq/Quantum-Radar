package rules;

import model.Observation;
import model.Violation;
import utils.FeesOfViolation;

public class SeatbeltRule implements Rules {
    double fees;


    @Override
    public String getRuleName() {
        return "";
    }

    @Override
    public Violation check(Observation Obs) {


            if (Obs.getSeatbeltFastened() == false)

                return new Violation("Seatbelt",Obs.getDate().toString()+
                        " Seatbelt not fastened",
                        FeesOfViolation.Fees_of_Seatbelt);

            return null;
        }
    }
