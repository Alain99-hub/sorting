package uaslp.enginering.labs;

public class FirstNameAscendantComparator implements Comparator {
    @Override
    public int compare(Object left, Object right) {

        Alumno nameLeft = (Alumno) left;

        Alumno nameRight = (Alumno) right;

        if (nameRight.getLastName().compareTo(nameLeft.getLastName()) == 0) {
            if (nameRight.getFirstName().compareTo(nameLeft.getFirstName()) > 0) {
                return nameRight.getFirstName().compareTo(nameLeft.getFirstName());
            }
            return nameRight.getFirstName().compareTo(nameLeft.getFirstName());
        }
        return nameRight.getLastName().compareTo((nameLeft.getLastName()));
    }
}