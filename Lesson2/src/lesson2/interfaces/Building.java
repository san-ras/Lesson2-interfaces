package lesson2.interfaces;

public class Building implements Mappable {

    private String name;
    private UsageType type;

    @Override
    public String getLabel() {
        return String.format("%s (%s)", name, type);
    }

    @Override
    public String getMarker() {
        switch (type) {
            case SPORTS -> {
                return Color.ORANGE + " " + PointMarker.CIRCLE;
            }
            case BUSINESS -> {
                return Color.MAGENTA + " " + PointMarker.SQUARE;
            }
            case ENTERTAINMENT -> {
                return Color.CYAN + " " + PointMarker.STAR;
            }
            case GOVERNMENT -> {
                return Color.BLACK + " " + PointMarker.DIAMOND;
            }
            case RESIDENTIAL -> {
                return Color.BLUE + " " + PointMarker.PLUS;
            }
            case EDUCATIONAL -> {
                return Color.YELLOW + " " + PointMarker.TRIANGLE;
            }
            case HEALTHCARE -> {
                return Color.RED + " " + PointMarker.PIN;
            }
            case INDUSTRIAL -> {
                return Color.GRAY + " " + PointMarker.DROP;
            }
            case RECREATION -> {
                return Color.PINK + " " + PointMarker.FLOWER;
            }
            default -> {
                return "not defined";
            }
        }


    }


    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    public Building(String name, UsageType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public UsageType getType() {
        return type;
    }
}
