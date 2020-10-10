package uaslp.enginering.labs;

public class DateAscendantComparator implements Comparator {
    @Override
    public int compare(Object left, Object right) {

        Alumno dateLeft = (Alumno) left;

        Alumno dateRight = (Alumno) right;

        return dateRight.getBirthday().compareTo(dateLeft.getBirthday());

    }
}
