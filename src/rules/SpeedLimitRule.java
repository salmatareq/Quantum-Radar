package rules;

import model.Observation;
import model.Violation;
import model.CarType;
import constants.FeesOfViolation;
import constants.MaxSpeed;

public class SpeedLimitRule implements Rules {
    CarType carType;
    double maxSeed;
    double fees;

    @Override
    public String getRuleName() {
        return "";
    }

    @Override
    public Violation check(Observation Obs) {

        int max = MaxSpeed.Max_SpeedOf_PrivateCar;

        if (Obs.getCarType() == CarType.TRUCK)
            max = MaxSpeed.Max_SpeedOf_TRUCK;

        if (Obs.getSpeed() > max) {

            return new Violation("exceed speed",Obs.getDate().toString()+ " speed of " + Obs.getSpeed() + " exceeded max allowed " + max, FeesOfViolation.Fees_of_speed);
        }

        return null;
    }



}
