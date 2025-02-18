package lesson2.interfaces;

public interface Mappable {

    String JSON_PROPERTY = "\"properties\": {%s}";

    String getLabel();

    String getMarker();

    Geometry getShape();

    static void mapIt(Mappable mappable) {
        String name;
        String type;
        if (mappable instanceof Building) {
            name = ((Building) mappable).getName();
            type = ((Building) mappable).getType().toString();
        } else if (mappable instanceof UtilityLine) {
            name = ((UtilityLine) mappable).getName();
            type = ((UtilityLine) mappable).getType().toString();
        } else {
            name = "undefined";
            type = "undefined";
        }
        System.out.println(mappable.toJSON(("\"type\": " + "\"" + mappable.getShape().toString() + "\""), ("\"label\": " + "\"" + mappable.getLabel() + "\""), ("\"marker\": " + "\"" + mappable.getMarker() + "\""), ("\"name\": " + "\"" + name + "\""), ("\"utility\": " + "\"" + type + "\"")));
    }

    default String toJSON(String... details) {
        String allDetails = String.join(", ", details);
        return String.format(JSON_PROPERTY, allDetails);
    }


}
