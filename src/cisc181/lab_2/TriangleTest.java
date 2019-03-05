package cisc181.lab_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {


    @Test
    public void getArea() throws Exception {
        System.out.println("Testing getArea");
        Triangle testTriangle = new Triangle(5.5,3.4,8.7);
        assertEquals(3.96, testTriangle.getArea(),0.00001);

    }
    @Test
    public void getPerimeter() throws Exception {
        System.out.println("Testing getPerimenter");
        Triangle testTriangle = new Triangle(3.0,4.0,5.0);
        assertEquals(12.0, testTriangle.getPerimeter(),0.00001);
        Triangle testTriangle1 = new Triangle(13.0,14.0,15.0);
        assertEquals(42.0, testTriangle1.getPerimeter(),0.00001);
        Triangle testTriangle2 = new Triangle(6.0,6.0,7.0);
        assertEquals(19.0, testTriangle2.getPerimeter(),0.00001);

    }
    @Test
    public void makeIsosRightTri() throws Exception {
        System.out.println("Testing makeIsosRightTri");
        // declare a variable of type Triangle
        Triangle myIsosRightTri = Triangle.makeIsosRightTri(6.5);
        assertEquals(6.5,myIsosRightTri.getSideA(),0.0001);
        assertEquals(6.5,myIsosRightTri.getSideB(),0.0001);
        assertEquals(9.19,myIsosRightTri.getSideC(),0.01);


        Triangle myIsosRightTri2 = Triangle.makeIsosRightTri(1);
        assertEquals(1, myIsosRightTri2.getSideA(), 0.0001);
        assertEquals(1, myIsosRightTri2.getSideB(), 0.0001);
        assertEquals(1.41, myIsosRightTri2.getSideC(), 0.01);

    }


}