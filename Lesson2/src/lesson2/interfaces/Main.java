package lesson2.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("OVO Arena Wembley", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Parliament building", UsageType.GOVERNMENT));
        mappables.add(new Building("Central hospital", UsageType.HEALTHCARE));
        mappables.add(new UtilityLine("Electrum", UtilityType.ELECTRICAL));
        mappables.add(new UtilityLine("Vodafone", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("London water", UtilityType.WATER));

        for (Mappable mappable: mappables) {
            Mappable.mapIt(mappable);
        }
    }

}
