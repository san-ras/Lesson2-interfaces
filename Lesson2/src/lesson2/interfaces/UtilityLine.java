package lesson2.interfaces;
public class UtilityLine implements Mappable {

    private String name;
    private UtilityType type;

    @Override
    public String getLabel() {
        return String.format("%s (%s)", name, type);
    }

    @Override
    public String getMarker() {
        switch (type) {
            case ELECTRICAL -> {
                return Color.RED + " " + LineMarker.DASH_DOTTED;
            }
            case FIBER_OPTIC -> {
                return Color.BLACK + " " + LineMarker.DASHED;
            }
            case WATER -> {
                return Color.BLUE + " " + LineMarker.DOUBLE;
            }
            case GAS -> {
                return Color.ORANGE + " " + LineMarker.DOTTED;
            }
            case SEWER -> {
                return Color.MAGENTA + " " + LineMarker.WAVE;
            }
            case HEATING -> {
                return Color.PURPLE + " " + LineMarker.SOLID;
            }
            default -> {
                return "not defined";
            }
        }
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }


    public UtilityType getType() {
        return type;
    }


}
