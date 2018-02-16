package service

import com.fixer.api.Currency
import model.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Single

class CurrencyService(private val retrofit: Retrofit) {

    fun getLatest(): Single<Response> {
        return retrofit.create(FixerApi::class.java).getLatest()
    }

    fun getLatestByBase(base: Currency): Single<Response> {
        return retrofit.create(FixerApi::class.java).getLatestByBase(base.sign)

    }

    private interface FixerApi {
        @GET("latest")
        fun getLatest(): Single<Response>

        @GET("latest")
        fun getLatestByBase(@Query("base") base: String): Single<Response>
    }
}


