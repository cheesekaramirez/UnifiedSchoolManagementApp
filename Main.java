public class Main {

    public static void main(String[] args) {
        AttendanceSystemAdapter attendAdapt = new AttendanceSystemAdapter();
        GradingSystemAdapter gradeAdapt = new GradingSystemAdapter();
        LibrarySystemAdapter libAdapt = new LibrarySystemAdapter();

        System.out.println("---School Management Appplication--");
        attendAdapt.integrateSystem();
        gradeAdapt.integrateSystem();
        libAdapt.integrateSystem();
    }
}