package ChapterFive;

public class Circle {
    private static final int INVALID_DIMENSION = -1;
    private double radius;
    private boolean isRadiusValid;

    public Circle() {
    }

    public double getArea() {
        double result = INVALID_DIMENSION;
        if (isRadiusValid){
            result = Math.PI * radius * radius;
        }

        return result;
    }

    public double getCircumference() {
        double result = INVALID_DIMENSION;
        if (isRadiusValid){
            result = 2.00 * Math.PI * radius;
        }
        return result;
    }

    public double getDiameter() {
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

    public boolean isRadiusValid(){
        return radius != INVALID_DIMENSION;
    }

}
