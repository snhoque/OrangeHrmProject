import org.testng.annotations.Test;

public class RecruitmentTest extends TestBase{

    @Test
    public void test01(){
        startLoginPage()
                .loginToPIMPage()
                .navigateToRecruitmentPage()
                .selectOptionFromDropdown("QA Lead")
                .selectCheckBox("Martine Tennat");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
