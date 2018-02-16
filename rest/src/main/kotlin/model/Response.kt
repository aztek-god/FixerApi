package model

import com.fixer.api.Currency
import com.fixer.api.CurrencyRate
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Response(
        @SerializedName("base")
        @Expose
        var base: String,
        @SerializedName("date")
        @Expose
        var date: String? = null,
        @SerializedName("rates")
        @Expose
        var rates: Rates
) {
    fun getCurrencyRates(): CurrencyRate {
        val currencyRate = CurrencyRate(Currency.valueOf(base))

        Currency.values().forEach { it: Currency ->
            currencyRate.setAmount(it.sign, rates.getRatesMap()[it.sign].toString())
        }

        return currencyRate
    }
}