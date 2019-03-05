package cisc181.lab_2;

public class Triangle {
    //three sides of Triangle
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * no parameter constructor
     */
    public Triangle() {
        sideA = 1;
        sideB = 1;
        sideC = 1;
    }

    /**
     * constructor with 3 parameters
     * @param sideA value of side A
     * @param sideB value of side B
     * @param sideC value of side C
     * @throws Exception these three sides can't make triangle
     */
    public Triangle(double sideA, double sideB, double sideC) throws Exception {
        if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {

            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            Exception exception = new Exception("No Triangle");
            throw exception;
        }
    }

    /**
     * accessor methods
     * @return value of side A
     */
    public double getSideA() {
        return sideA;
    }

    /**
     * accessor methods
     * @return value of side B
     */
    public double getSideB() {
        return sideB;
    }

    /**
     * accessor methods
     * @return value of side C
     */
    public double getSideC() {
        return sideC;
    }

    /**
     * Heron’s formula
     * @return area of Triangle
     */
    public double getArea() {
        double q = (sideA + sideB + sideC) / 2;
        return Math.sqrt(q * (q - sideA) * (q - sideB) * (q - sideC));
    }

    /**
     * get Perimeter
     * @return Perimeter of triangle
     */
    public double getPerimeter() {
        return (sideA + sideB + sideC);
    }

    /**
     * created Triangle that is an isosceles right triangle
     * @param side a side
     * @return an isosceles right triangle
     * @throws Exception these three sides can't make triangle
     */
    public static Triangle makeIsosRightTri(double side) throws Exception {
        Triangle triangle = new Triangle(side, side, side * Math.sqrt(2));
        return triangle;
    }

}
