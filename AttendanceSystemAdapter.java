public class AttendanceSystemAdapter implements SchoolManagementApp{
private AttendanceSystem attendsys = new AttendanceSystem();
@Override
public void integrateSystem() {
    attendsys.markAttendance();
}
    
}