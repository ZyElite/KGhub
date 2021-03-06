

package com.zyelite.kghub.http.api;

/**
 * This link are for OpenHub only. Please do not use this endpoint in your applications.
 * If you want to get trending repositories, you may stand up your own instance.
 * https://github.com/thedillonb/GitHub-Trending
 * Created by ThirtyDegreesRay on 2017/8/26 16:04:02
 */

public interface OpenHubService {

    /**
     * get trending repos, update every day
     * @param since daily, weekly, monthly
     * @param language language
     */
//    @Headers("Cache-Control: public, max-age=86400")
//    @NonNull
//    @GET("trending")
//    Observable<Response<ArrayList<Repository>>> getTrendingRepos(
//            @Query("since") String since,
//            @Query("language") String language
//    );

    /**
     * get trending languages, update every day
     */
//    @Headers("Cache-Control: public, max-age=86400")
//    @NonNull
//    @GET("languages")
//    Observable<Response<ArrayList<TrendingLanguage>>> getTrendingLanguages();

}
