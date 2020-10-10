package uaslp.enginering.labs;

public class LastnameAscendantComparator implements Comparator {
    @Override
    public int compare(Object left, Object right) {

        Alumno studentLeft = (Alumno) left;

        Alumno studentRight = (Alumno) right;

        return studentRight.getLastName().compareTo((studentLeft.getLastName()));
    }
}
