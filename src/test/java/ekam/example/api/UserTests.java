package ekam.example.api;

import com.testvagrant.ekam.testBases.testng.APITest;
import org.testng.annotations.Test;

import static com.testvagrant.ekam.commons.LayoutInitiator.Client;
import static org.testng.Assert.assertNotNull;

public class UserTests extends APITest {

    @Test(groups = "api")
    public void apiExampleTest() {
        GetSingleUserResponse user = Client(UserClient.class)
                .getSingleUser();
        assertNotNull(user.getData().getEmail());
    }
}