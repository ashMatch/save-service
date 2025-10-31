package org.example.menus

//import org.example.CRUD.addProduct
import org.example.classes.Product
import org.example.enums.Roles

fun signUp(): Short {
    var mainMenu :Short

    do{

        println(" Bem Vindo ao Save&Service \n\n")

        println("1. Sou ONG")
        println("2. Não sou ONG")
        println("3. Já tenho cadastro")
        println("Digite o numero da opção...")

        mainMenu = readln().toShort()

        if(mainMenu.toInt() < 1 && mainMenu.toInt() > 3){
            println("Opção Inválida... por favor digite uma das opções")
        }

    }while(mainMenu > 3 || mainMenu <= 0)

    return mainMenu
}

fun signIn():List<Any>{

    println("Entrar")
    print("digite 1 para empresa ou 2 para ONG:")
    val type =  readln()
    print("digite o usuário:")
    val user = readln()
    print("digite a senha:")
    val password = readln()
    val role : Roles
    if(type.toInt() == 1){
        println("Digite 1 para administrador ou 2 para funcionário")
        val roleInt = readln().toInt()
        if (roleInt !in 1..2) println("Digite uma opção válida")
        role = if(roleInt == 1) Roles.COMPANY else Roles.COMPANYWORKER
    }else{
        println("Digite 1 para administrador ou 2 para auxiliar")
        val roleInt = readln().toInt()
        if (roleInt !in 1..2) println("Digite uma opção válida")
        role = if(roleInt == 1) Roles.ONG else Roles.ONGHELPER

    }
    return listOf(type, user, password, role)
}

fun signupValidation(userInfo: List<String>) {
    if (userInfo[0].length < 3 || userInfo[1].length < 3){
        println("usuario e senha incorretos")
        return
    }
    println("dados validados...")
}


fun companyUser(userInfo: List<Any>){
    val role = userInfo.last().toString()
    if (role == "COMPANY"){
        println("admin aqui!")
    }else{
        println("funcionario aqui")
//        addItem()
    }
}

fun ongUser(userInfo: List<Any>){
    val role = userInfo.last().toString()
    if (role == "COMPANY"){
        println("ONG aqui!")
    }else{
        println("Voluntário da ONG aqui")
    }
}

fun whichUser(userInfo: List<Any>): Int{
    val userType = if((userInfo[0] as String).toInt() == 1) companyUser(userInfo) else ongUser(userInfo)
    return 0
}

fun addItem(product:Product ,productList:MutableList<Product>){
    menuItem(product, productList)
}

fun menuItem(product: Product, productList: MutableList<Product>){
    var productOption:Int = 0
    println("Produtos")
    println("1.Cadastrar produto")
    println("2.Remover produto")
    println("3.Listar produtos")
    println("4.Editar produto")
    println("digite a opção...")
    productOption = readln().toInt()
   // val resultOption = if(productOption==1) addProduct(product)
}
