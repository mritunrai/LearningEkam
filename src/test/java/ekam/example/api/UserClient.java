package ekam.example.api;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import com.testvagrant.ekam.reports.annotations.APIStep;
import retrofit2.Call;
import retrofit2.http.GET;

public class UserClient extends RetrofitBaseClient {

    private final UserClientService service;

    @Inject
    public UserClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(UserClientService.class);
    }

    @APIStep(keyword = "When", description = "I invoke getSingleUser API")
    public GetSingleUserResponse getSingleUser() {
        Call<GetSingleUserResponse> call = service.getSingleUser();
        return httpClient.execute(call);
    }

    private interface UserClientService {
        @GET("/api/users/2")
        Call<GetSingleUserResponse> getSingleUser();
    }
}