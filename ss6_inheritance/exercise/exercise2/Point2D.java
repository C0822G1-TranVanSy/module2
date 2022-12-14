package ss6_inheritance.exercise.exercise2;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXy() {
        return new float[]{getX(), getY()};
    }

    public void setXy(float x, float y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "Point2D{" +
                "xy=" + Arrays.toString(getXy()) +
                '}';
    }
}
