import org.testng.annotations.Test;

public class AdminTest extends TestBase {

    @Test
    public void test002(){
        startLoginPage()
                .loginToPIMPage()
                .navigateToAdminPage()
                .searchUserName("Aaliyah.Haq")
                .validateUserName("Aaliyah.Haq");

//add a comment

    }
}
