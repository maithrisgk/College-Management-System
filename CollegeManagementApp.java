package collegemanagement;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
public class CollegeManagementApp extends SingleFrameApplication {
    @Override protected void startup() {
        show(new CollegeManagementView(this));
    }
    @Override protected void configureWindow(java.awt.Window root) {
    }
   public static CollegeManagementApp getApplication() {
        return Application.getInstance(CollegeManagementApp.class);
    }
   public static void main(String[] args) {
        launch(CollegeManagementApp.class, args);
    }
}
