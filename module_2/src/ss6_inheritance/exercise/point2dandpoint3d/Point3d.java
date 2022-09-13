package ss6_inheritance.exercise.point2dandpoint3d;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), this.z};
    }

//    @Override
//    public String toString() {
//        return "Point3d{" +
//                super.toString()
//                + "," + "z=" + z
//                + '}';
//    }
    public String toString(){
        return "\"" + String.format("(%.0f,%.0f,%.0f)" ,getX(),getY(),z ) +"\"";
    }
}
