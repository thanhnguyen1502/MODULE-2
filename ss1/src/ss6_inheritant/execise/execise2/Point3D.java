package ss6_inheritant.execise.execise2;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }
    public void setXYZ(float x, float y, float z){
        getX();
        getY();
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getY(),getY(),z};
    }

    @Override
    public String toString() {
        return
                super.toString() + '\t' +
                " z = " + z
             ;
    }
}
