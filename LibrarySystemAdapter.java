
public class LibrarySystemAdapter implements SchoolManagementApp{
    private LibrarySystem libsys = new LibrarySystem();
   @Override
   public void integrateSystem() {
       libsys.manageBooks();
   }
}