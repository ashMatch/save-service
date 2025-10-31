package org.example.classes

import org.example.enums.ProductUnit
import org.example.enums.SubtypeItem
import org.example.enums.TypeItem
import java.math.BigDecimal
import java.util.Date

data class Product(
    val name:String,
    val type: TypeItem,
    val subType: SubtypeItem,
    val unitType: ProductUnit,
    val quantity: Double,
    val price: BigDecimal,
    val validationDate: String,
    val brand: String

    )
