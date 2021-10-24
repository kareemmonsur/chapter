package ChapterFive;

public class Circle {
    private static final int INVALID_DIMENSION = -1;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(boolean isRadiusValid) {
        double result = INVALID_DIMENSION;
        if (isRadiusValid){
            result = Math.PI * radius * radius;
        }

        return result;
    }

    public double getCircumference(boolean isRadiusValid) {
        double result = INVALID_DIMENSION;
        if (isRadiusValid){
            result = 2.00 * Math.PI * radius;
        }
        return result;
    }
    public double getDiameter(boolean isRadiusValid) {
        double result = INVALID_DIMENSION;
        if (isRadiusValid){
            result = 2.00 * radius;
        }
        return result;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
        else{radius = INVALID_DIMENSION;
        }
    }
}
