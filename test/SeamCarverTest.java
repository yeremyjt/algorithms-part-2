import edu.princeton.cs.algs4.Picture;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SeamCarverTest
{
    @Test
    public void testEnergy()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        assertEquals(1000.00, seamCarver.energy(0, 0), 0.01);
        assertEquals(1000.00, seamCarver.energy(1, 0), 0.01);
        assertEquals(1000.00, seamCarver.energy(2, 0), 0.01);
        assertEquals(1000.00, seamCarver.energy(0, 1), 0.01);
        assertEquals(228.53, seamCarver.energy(1, 1), 0.01);
        assertEquals(1000.00, seamCarver.energy(2, 1), 0.01);
        assertEquals(1000.00, seamCarver.energy(0, 2), 0.01);
        assertEquals(228.09, seamCarver.energy(1, 2), 0.01);
        assertEquals(1000.00, seamCarver.energy(2, 2), 0.01);
        assertEquals(1000.00, seamCarver.energy(0, 3), 0.01);
        assertEquals(1000.00, seamCarver.energy(1, 3), 0.01);
        assertEquals(1000.00, seamCarver.energy(2, 3), 0.01);
    }

    @Test
    public void testFindVerticalSeam3x4()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int [] verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(0, verticalSeam[0]);
        assertEquals(1, verticalSeam[1]);
        assertEquals(1, verticalSeam[2]);
        assertEquals(0, verticalSeam[3]);
    }

    @Test
    public void testFindVerticalSeam6x5()
    {
        File file = new File(getClass().getResource("6x5.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int [] verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(3, verticalSeam[0]);
        assertEquals(4, verticalSeam[1]);
        assertEquals(3, verticalSeam[2]);
        assertEquals(2, verticalSeam[3]);
        assertEquals(1, verticalSeam[4]);
    }

    @Test
    public void testFindVerticalSeam12x10()
    {
        File file = new File(getClass().getResource("12x10.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int [] verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(6, verticalSeam[0]);
        assertEquals(7, verticalSeam[1]);
        assertEquals(7, verticalSeam[2]);
        assertEquals(6, verticalSeam[3]);
        assertEquals(6, verticalSeam[4]);
        assertEquals(7, verticalSeam[5]);
        assertEquals(7, verticalSeam[6]);
        assertEquals(7, verticalSeam[7]);
        assertEquals(8, verticalSeam[8]);
        assertEquals(7, verticalSeam[9]);
    }

    @Test
    public void testFindHorizontalSeam12x10()
    {
        File file = new File(getClass().getResource("12x10.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int [] horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(7, horizontalSeam[0]);
        assertEquals(8, horizontalSeam[1]);
        assertEquals(7, horizontalSeam[2]);
        assertEquals(8, horizontalSeam[3]);
        assertEquals(7, horizontalSeam[4]);
        assertEquals(6, horizontalSeam[5]);
        assertEquals(5, horizontalSeam[6]);
        assertEquals(6, horizontalSeam[7]);
        assertEquals(6, horizontalSeam[8]);
        assertEquals(5, horizontalSeam[9]);
        assertEquals(4, horizontalSeam[10]);
        assertEquals(3, horizontalSeam[11]);
    }

    @Test
    public void testFindHorizontalSeam3x4()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(1, horizontalSeam[0]);
        assertEquals(2, horizontalSeam[1]);
        assertEquals(1, horizontalSeam[2]);
    }

    @Test
    public void testFindHorizontalSeam6x5()
    {
        File file = new File(getClass().getResource("6x5.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(1, horizontalSeam[0]);
        assertEquals(2, horizontalSeam[1]);
        assertEquals(1, horizontalSeam[2]);
        assertEquals(2, horizontalSeam[3]);
        assertEquals(1, horizontalSeam[4]);
        assertEquals(0, horizontalSeam[5]);
    }

    @Test
    public void testFindVerticalAndHorizontalSeam3x4()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int [] verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(0, verticalSeam[0]);
        assertEquals(1, verticalSeam[1]);
        assertEquals(1, verticalSeam[2]);
        assertEquals(0, verticalSeam[3]);
        int[] horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(1, horizontalSeam[0]);
        assertEquals(2, horizontalSeam[1]);
        assertEquals(1, horizontalSeam[2]);
        verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(0, verticalSeam[0]);
        assertEquals(1, verticalSeam[1]);
        assertEquals(1, verticalSeam[2]);
        assertEquals(0, verticalSeam[3]);
    }

    @Test
    public void testTwoHorizontalSeams3x4()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(1, horizontalSeam[0]);
        assertEquals(2, horizontalSeam[1]);
        assertEquals(1, horizontalSeam[2]);
        horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(1, horizontalSeam[0]);
        assertEquals(2, horizontalSeam[1]);
        assertEquals(1, horizontalSeam[2]);
    }

    @Test
    public void testFindVerticalAndHorizontalSeam3x4_v2()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(1, horizontalSeam[0]);
        assertEquals(2, horizontalSeam[1]);
        int [] verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(0, verticalSeam[0]);
        assertEquals(1, verticalSeam[1]);
        assertEquals(1, verticalSeam[2]);
        assertEquals(0, verticalSeam[3]);
        assertEquals(1, horizontalSeam[2]);
        horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(1, horizontalSeam[0]);
        assertEquals(2, horizontalSeam[1]);

    }

    @Test
    public void testFindVerticalAndHorizontalSeam6x5()
    {
        File file = new File(getClass().getResource("6x5.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(3, verticalSeam[0]);
        assertEquals(4, verticalSeam[1]);
        assertEquals(3, verticalSeam[2]);
        assertEquals(2, verticalSeam[3]);
        assertEquals(1, verticalSeam[4]);
        int[] horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(1, horizontalSeam[0]);
        assertEquals(2, horizontalSeam[1]);
        assertEquals(1, horizontalSeam[2]);
        assertEquals(2, horizontalSeam[3]);
        assertEquals(1, horizontalSeam[4]);
        assertEquals(0, horizontalSeam[5]);
        verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(3, verticalSeam[0]);
        assertEquals(4, verticalSeam[1]);
        assertEquals(3, verticalSeam[2]);
        assertEquals(2, verticalSeam[3]);
        assertEquals(1, verticalSeam[4]);
    }

    @Test
    public void testFindVerticalAndHorizontalSeam12x10()
    {
        File file = new File(getClass().getResource("12x10.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(6, verticalSeam[0]);
        assertEquals(7, verticalSeam[1]);
        assertEquals(7, verticalSeam[2]);
        assertEquals(6, verticalSeam[3]);
        assertEquals(6, verticalSeam[4]);
        assertEquals(7, verticalSeam[5]);
        assertEquals(7, verticalSeam[6]);
        assertEquals(7, verticalSeam[7]);
        assertEquals(8, verticalSeam[8]);
        assertEquals(7, verticalSeam[9]);
        int[] horizontalSeam = seamCarver.findHorizontalSeam();
        assertNotNull(horizontalSeam);
        assertEquals(7, horizontalSeam[0]);
        assertEquals(8, horizontalSeam[1]);
        assertEquals(7, horizontalSeam[2]);
        assertEquals(8, horizontalSeam[3]);
        assertEquals(7, horizontalSeam[4]);
        assertEquals(6, horizontalSeam[5]);
        assertEquals(5, horizontalSeam[6]);
        assertEquals(6, horizontalSeam[7]);
        assertEquals(6, horizontalSeam[8]);
        assertEquals(5, horizontalSeam[9]);
        assertEquals(4, horizontalSeam[10]);
        assertEquals(3, horizontalSeam[11]);
        verticalSeam = seamCarver.findVerticalSeam();
        assertNotNull(verticalSeam);
        assertEquals(6, verticalSeam[0]);
        assertEquals(7, verticalSeam[1]);
        assertEquals(7, verticalSeam[2]);
        assertEquals(6, verticalSeam[3]);
        assertEquals(6, verticalSeam[4]);
        assertEquals(7, verticalSeam[5]);
        assertEquals(7, verticalSeam[6]);
        assertEquals(7, verticalSeam[7]);
        assertEquals(8, verticalSeam[8]);
        assertEquals(7, verticalSeam[9]);
    }

    @Test
    public void testRemoveVerticalSeam()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] verticalSeam = seamCarver.findVerticalSeam();
        seamCarver.removeVerticalSeam(verticalSeam);
    }

    @Test
    public void testRemoveHorizontalSeam()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] verticalSeam = seamCarver.findHorizontalSeam();
        seamCarver.removeHorizontalSeam(verticalSeam);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveHorizontalSeam_InvalidSeam()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] horizontalSeam = {1, 5, 1};
        seamCarver.removeHorizontalSeam(horizontalSeam);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveHorizontalSeam_WrongArrayLength()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] horizontalSeam = {1, 2, 1, 1};
        seamCarver.removeHorizontalSeam(horizontalSeam);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveHorizontalSeam_InvalidSeamDistanceGreaterThanOne()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] horizontalSeam = {0, 2, 1};
        seamCarver.removeHorizontalSeam(horizontalSeam);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveHorizontalSeam_NullSeam()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        seamCarver.removeHorizontalSeam(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveVerticalSeam_InvalidSeam()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] verticalSeam = {1, 1, 5, 0};
        seamCarver.removeVerticalSeam(verticalSeam);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveVerticalSeam_WrongArrayLength()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] verticalSeam = {0, 1, 1, 0, 0};
        seamCarver.removeVerticalSeam(verticalSeam);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveVerticalSeam_InvalidSeamDistanceGreaterThanOne()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        int[] verticalSeam = {0, 2, 2, 0};
        seamCarver.removeVerticalSeam(verticalSeam);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveVerticalSeam_NullSeam()
    {
        File file = new File(getClass().getResource("3x4.png").getFile());
        Picture picture = new Picture(file);
        SeamCarver seamCarver = new SeamCarver(picture);
        seamCarver.removeVerticalSeam(null);
    }
}
