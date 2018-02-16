package model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Rates(
        @SerializedName("EUR")
        @Expose
        val eur: Double = 0.0,
        @SerializedName("AUD")
        @Expose
        val aud: Double = 0.0,
        @SerializedName("BGN")
        @Expose
        val bgn: Double = 0.0,
        @SerializedName("BRL")
        @Expose
        val brl: Double = 0.0,
        @SerializedName("CAD")
        @Expose
        val cad: Double = 0.0,
        @SerializedName("CHF")
        @Expose
        val chf: Double = 0.0,
        @SerializedName("CNY")
        @Expose
        val cny: Double = 0.0,
        @SerializedName("CZK")
        @Expose
        val czk: Double = 0.0,
        @SerializedName("DKK")
        @Expose
        val dkk: Double = 0.0,
        @SerializedName("GBP")
        @Expose
        val gbp: Double = 0.0,
        @SerializedName("HKD")
        @Expose
        val hkd: Double = 0.0,
        @SerializedName("HRK")
        @Expose
        val hrk: Double = 0.0,
        @SerializedName("HUF")
        @Expose
        val huf: Double = 0.0,
        @SerializedName("IDR")
        @Expose
        val idr: Double = 0.0,
        @SerializedName("ILS")
        @Expose
        val ils: Double = 0.0,
        @SerializedName("INR")
        @Expose
        val inr: Double = 0.0,
        @SerializedName("ISK")
        @Expose
        val isk: Double = 0.0,
        @SerializedName("JPY")
        @Expose
        val jpy: Double = 0.0,
        @SerializedName("KRW")
        @Expose
        val krw: Double = 0.0,
        @SerializedName("MXN")
        @Expose
        val mxn: Double = 0.0,
        @SerializedName("MYR")
        @Expose
        val myr: Double = 0.0,
        @SerializedName("NOK")
        @Expose
        val nok: Double = 0.0,
        @SerializedName("NZD")
        @Expose
        val nzd: Double = 0.0,
        @SerializedName("PHP")
        @Expose
        val php: Double = 0.0,
        @SerializedName("PLN")
        @Expose
        val pln: Double = 0.0,
        @SerializedName("RON")
        @Expose
        val ron: Double = 0.0,
        @SerializedName("RUB")
        @Expose
        val rub: Double = 0.0,
        @SerializedName("SEK")
        @Expose
        val sek: Double = 0.0,
        @SerializedName("SGD")
        @Expose
        val sgd: Double = 0.0,
        @SerializedName("THB")
        @Expose
        val thb: Double = 0.0,
        @SerializedName("TRY")
        @Expose
        val `try`: Double = 0.0,
        @SerializedName("USD")
        @Expose
        val usd: Double = 0.0,
        @SerializedName("ZAR")
        @Expose
        val zar: Double = 0.0
) {
    fun getRatesMap(): Map<String, Double> {
        return mapOf(
                "EUR" to eur,
                "AUD" to aud,
                "BGN" to bgn,
                "BRL" to brl,
                "CAD" to cad,
                "CHF" to chf,
                "CNY" to cny,
                "CZK" to czk,
                "DKK" to dkk,
                "GBP" to gbp,
                "HKD" to hkd,
                "HRK" to hrk,
                "HUF" to huf,
                "IDR" to idr,
                "ILS" to ils,
                "INR" to inr,
                "ISK" to isk,
                "JPY" to jpy,
                "KRW" to krw,
                "MXN" to mxn,
                "MYR" to myr,
                "NOK" to nok,
                "NZD" to nzd,
                "PHP" to php,
                "PLN" to pln,
                "RON" to ron,
                "RUB" to rub,
                "SEK" to sek,
                "SGD" to sgd,
                "THB" to thb,
                "TRY" to `try`,
                "USD" to usd,
                "ZAR" to zar
        )
    }
}