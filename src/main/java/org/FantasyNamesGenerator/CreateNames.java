package org.FantasyNamesGenerator;

public class CreateNames {

    public static String namesGenerator() {
        try {

            RandomNumbers randomNumbers = new RandomNumbers();
            randomNumbers.randomNumbers();


            if (randomNumbers.getX() == 3) {
                return Controller.getSyllabefirstArrayList().get(randomNumbers.getA()) + Controller.getSyllabesecondArrayList().get(randomNumbers.getC())
                        + Controller.getSyllabelastArrayList().get(randomNumbers.getB());
            }

            if (randomNumbers.getX() == 2) {
                return Controller.getSyllabefirstArrayList().get(randomNumbers.getA()) + Controller.getSyllabelastArrayList().get(randomNumbers.getB());
            }
            return "";
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return "";
    }
}
