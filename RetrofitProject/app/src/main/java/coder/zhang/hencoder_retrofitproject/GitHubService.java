package coder.zhang.hencoder_retrofitproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GitHubService {

    @GET("users/rengwuxian/repos")
    Call<List<Repos>> getRepos();
}
