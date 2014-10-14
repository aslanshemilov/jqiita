/*
 * Copyright (C) 2014 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jqiita.user;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

import java.util.List;

public interface Users {
    /**
     * @see <a href="http://qiita.com/api/v2/docs#get-/api/v2/users">API SPEC</a>
     */
    @GET("/users")
    List<User> list();

    /**
     * @see <a href="http://qiita.com/api/v2/docs#get-/api/v2/users">API SPEC</a>
     */
    @GET("/users")
    List<User> list(@Query("page") int page, @Query("per_page") int perPage);

    /**
     * @see <a href="http://qiita.com/api/v2/docs#get-/api/v2/users/:id">API SPEC</a>
     */
    @GET("/users/{id}")
    User get(@Path("id") String id);
}