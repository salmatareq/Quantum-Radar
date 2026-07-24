import model.Observation;
import model.Violation;
import radar.Radar;
import rules.SeatbeltRule;
import rules.SpeedLimitRule;
import model.CarType;


void main() {
    try{
    Radar radar = new Radar();

    radar.addRule(new SpeedLimitRule());
        radar.addRule(new SeatbeltRule());
    Observation o1 = new Observation("ABC1234", LocalDate.now(), CarType.PRIVATE, 94, false);

    Observation o2 = new Observation("XYZ999", LocalDate.now(), CarType.TRUCK, 70, true);

    Observation o3 = new Observation("MMM555", LocalDate.now(), CarType.PRIVATE, 50, true);

    radar.observe(o1);
    radar.observe(o2);
    radar.observe(o3);

    radar.printAllFines();

    System.out.println("All:");
    radar.getAllPossibleFines();

    System.out.println();


    System.out.println("Violated  rules Count:");
       radar. getViolatedRulesCount();

        System.out.println("Violations of car ABC1234 : ");


        for (Violation v : radar.getViolationsForCar("ABC1234")) {
            System.out.println(v+"\n");
        }

    } catch (Exception e) {

        System.out.println(e.getMessage());

        }

}
