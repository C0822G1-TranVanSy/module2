package ss6_inheritance.exercise.exercise2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXyz() {
        return new float[]{getX(), getY(),getZ()};
    }

    public void setXyz(float x, float y, float z) {
        super.setXy(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "xyz=" + Arrays.toString(getXyz())+
                '}';
    }
}
