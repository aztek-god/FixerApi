package com.fixer.api

import java.math.BigDecimal
import java.math.RoundingMode

class CurrencyManager(private val rates: CurrencyRate) {

    private fun convert(outCurrency: Currency, currencyAmount: CurrencyAmount): CurrencyAmount {
        val incomeAmount = currencyAmount.bigDecimalPresentation
        val incomeToBaseRel = rates.getAmountBySign(currencyAmount.currency.sign)
        val baseAmount = incomeAmount.divide(incomeToBaseRel, 2, RoundingMode.HALF_EVEN)

        return CurrencyAmount(outCurrency, baseAmount.multiply(rates.getAmountBySign(outCurrency.sign)).toPlainString())
    }

    private fun convert(outCurrency: Currency, currencyAmount: List<CurrencyAmount>): CurrencyAmount {
        var bg = BigDecimal("0.0")
        currencyAmount.forEach {
            bg += convert(outCurrency, it).bigDecimalPresentation
        }

        return CurrencyAmount(outCurrency, bg.toPlainString())
    }

    fun sum(outCurrency: Currency, amount1: CurrencyAmount, amount2: CurrencyAmount): CurrencyAmount {
        return convert(outCurrency, listOf(amount1, amount2))
    }

    fun sub(outCurrency: Currency, amount1: CurrencyAmount, amount2: CurrencyAmount): CurrencyAmount {
        val arg1 = convert(outCurrency, amount1)
        val arg2 = convert(outCurrency, amount2)

        return CurrencyAmount(outCurrency, arg1.bigDecimalPresentation.subtract(arg2.bigDecimalPresentation).toPlainString())
    }
}
