package com.fixer.api

import java.math.BigDecimal

data class CurrencyRate(private val base: Currency) {
    private val currencyMap: MutableMap<Currency, BigDecimal> = HashMap()

    init {
        currencyMap.put(base, BigDecimal("1.0"))
    }

    fun getAmountBySign(sign: String): BigDecimal {
        return currencyMap.entries.find { it.key.sign == sign }?.value ?: throw Exception("Ooops something went wrong.")
    }

    fun getAmountByCurrency(sign: Currency): BigDecimal {
        return currencyMap[currencyMap.keys.find { it == sign }] ?: throw Exception("Ooops something went wrong.")
    }

    fun setAmount(currency: Currency, amount: String) {
        val bgAmount = amount.toBigDecimalOrNull() ?: throw Exception("Amount must contains only digital characters.")

        currencyMap[currency] = bgAmount
    }

    fun setAmount(currency: String, amount: String) {
        val bgAmount = amount.toBigDecimalOrNull() ?: throw Exception("Amount must contains only digital characters.")

        currencyMap[Currency.valueOf(currency)] = bgAmount
    }
}