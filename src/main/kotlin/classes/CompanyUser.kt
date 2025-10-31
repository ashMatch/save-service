package org.example.classes

data class CompanyUser(
    override val id: Int,
    override val userName: String,
    override val userPassword: String,
    val address: String,
    val openTime: String,
    val closeTime: String,
    val cnpj: String
): BaseUser {

}