public class GradingSystemAdapter implements SchoolManagementApp{
private GradingSystem gradesys= new GradingSystem();

@Override
public void integrateSystem() {
    gradesys.recordGrades();
}
    
}