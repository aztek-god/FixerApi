package com.fixer.api

import java.math.BigDecimal

data class CurrencyAmount(val currency: Currency, private val amount: String) {
    val bigDecimalPresentation: BigDecimal
        get() {
            val b = amount.toBigDecimalOrNull()
            if (b != null) {
                return b
            }

            throw Exception("The value must contain only digit characters.")
        }

    init {
        amount.toBigDecimalOrNull() ?: throw Exception("The value must contain only digit characters.")
    }
}