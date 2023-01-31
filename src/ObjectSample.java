
public class ObjectSample {

    public static void main(String[] args) {
        Employee emp = new Employee();
        //emp.employeeName = "大島";
        //emp.divisionName = "営業部";
        //emp.vitality = 150;
        emp.introduce();
        emp.showVitality();

        Employee emp02 = new Employee("原川", "営業部", 250);
        emp02.introduce();
        emp02.greeting();

    }

}
