package uaslp.enginering.labs;

public class KeyAscendantComparator implements Comparator {
    @Override
    public int compare(Object left, Object right) {
        Alumno keyLeft = (Alumno) left;
        Alumno keyRight = (Alumno) right;

        return  String.valueOf(keyRight.getClave()).compareTo( String.valueOf(keyLeft.getClave()));
    }
}
