import org.junit.Assert;
import org.junit.jupiter.api.*;
import assignment.Project;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test {
    @org.junit.jupiter.api.Test
    public void TC1() {
        int num = 7;
        Project p = new Project();
        boolean actual = true;
        boolean expected = true;
        actual = p.prime(num);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void TC2() {
        int num = 9;
        Project p = new Project();
        boolean actual = true;
        boolean expected = false;
        actual = p.prime(num);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void TC3() {
        int num = 2;
        Project p = new Project();
        boolean actual = true;
        boolean expected = true;
        actual = p.even(num);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void TC4() {
        int num = 275;
        Project p = new Project();
        boolean actual = true;
        boolean expected = false;
        actual = p.even(num);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void TC5() {
        double cel = 34;
        Project p = new Project();
        double[] expected = new double[]{308, 95};
        double[] actual = p.temp(cel);
        Assert.assertArrayEquals(expected,actual,5.0);
    }
    @org.junit.jupiter.api.Test
    public void TC6() {
        int[] arr = new int[]{4, 4, 4, 4, 4};
        Project array = new Project();
        int expected = 4;
        int actual = array.CalculateAverage(arr);
        Assert.assertEquals((long)expected, (long)actual);
    }
    @org.junit.jupiter.api.Test
    public void TC7() {
        int[] arr = new int[]{8, 0, 0, 8, 15};
        Project array = new Project();
        int expected = 6;
        int actual = array.CalculateAverage(arr);
        Assert.assertEquals((long)expected, (long)actual);
    }
    @org.junit.jupiter.api.Test
    public void TC8() {
        int[] arr = new int[]{0, 0, 0, 8};
        Project array = new Project();
        int expected = 2;
        int actual = array.CalculateAverage(arr);
        Assert.assertEquals((long)expected, (long)actual);
    }
    @org.junit.jupiter.api.Test
    public void TC9() {
        String st1="676";
        String st2="676";
        Project obj = new Project();
        boolean expected = true;
        boolean actual = obj.checkPalen(st1,st2);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void TC10() {
        String st1="sasd676";
        String st2="asd676";
        Project obj = new Project();
        boolean expected = false;
        boolean actual = obj.checkPalen(st1,st2);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void TC11() {
        String st1="sdfas";
        String st2="xcvxc";
        Project obj = new Project();
        boolean expected = false;
        boolean actual = obj.checkPalen(st1,st2);
        Assert.assertEquals(expected, actual);
    }
}
