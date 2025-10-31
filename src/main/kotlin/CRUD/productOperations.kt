package org.example.CRUD

import org.example.classes.Product
import org.example.enums.ProductUnit
import org.example.enums.SubtypeItem
import org.example.enums.TypeItem
import java.math.BigDecimal
import java.util.Date

/*
fun addProduct(
    product:Product, productList:MutableList<Product>
){
    println("ADICIONAR PRODUTO")
    println("nome do produto: ")
    val pName = readln()
    println("Unidade de Medida: ")
    val pUnit = readln()
    println("Quantidade: ")
    val pQuantity = readln().toDouble()
    println("Preço: ")
    val pPrice = readln().toBigDecimal()
    println("Validade: ")
    val validationDate = readln()
    println("Marca: ")
    val brand = readln()

    println("Escolha o tipo do produto: ")
    val ptype = readln()
    val product = Product(
        pName,
        type,
        subType,
        pUnit,
        pQuantity,
        pPrice,
        validationDate,
        brand
    )

    productList.add(product)
    println("Item adicionado com sucesso!!")

}
*/
fun listProducts(productList: List<Product>){
    if (productList.isEmpty()) {
        println("Nenhum produto cadastrado.")
        return
    }

    println("=== Lista de Produtos ===")
    productList.forEachIndexed { index, product ->
        println("${index + 1}. produto: ${product.name} - marca ${product.brand} - R$ ${product.price}")
    }
    println("=========================")
}


fun editProduct(
    productList: MutableList<Product>,
    index: Int,
    name: String? = null,
    type: TypeItem? = null,
    subType: SubtypeItem? = null,
    unitType: ProductUnit? = null,
    quantity: Double? = null,
    price: BigDecimal? = null,
    validationDate: Date? = null,
    brand: String? = null
) {
    if (index !in productList.indices) {
        println("Índice inválido. Nenhum produto encontrado.")
        return
    }

    val current = productList[index]

    // Cria um novo produto com os valores alterados (mantém os antigos se forem nulos)
    val updatedProduct = current.copy(
        name = name ?: current.name,
        type = type ?: current.type,
        subType = subType ?: current.subType,
        unitType = unitType ?: current.unitType,
        quantity = quantity ?: current.quantity,
        price = price ?: current.price,
//        validationDate = validationDate ?: current.validationDate,
        brand = brand ?: current.brand
    )

    productList[index] = updatedProduct
    println("Produto '${updatedProduct.name}' atualizado com sucesso!")
}