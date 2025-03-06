package HW2;

public class Ex8 {
    public static void main(String[] args) {
        var totalHours = 640;
        var workingDayLength = 8;
        var numberEmployees = totalHours / workingDayLength;

        System.out.println("Всего работников в компании — "+ numberEmployees +" человек");

        numberEmployees += 94;
        totalHours = workingDayLength * numberEmployees;
        System.out.println("Если в компании работает " + numberEmployees + " человек, " +
                "то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}
