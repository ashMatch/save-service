package org.example

import org.example.menus.signIn
import org.example.menus.signUp
import org.example.menus.whichUser
import java.sql.DriverManager
import java.sql.SQLException

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    databaseConnection()

    val mainMenu = signUp()
    clearTerminal()
    println("Opção escolhida foi o $mainMenu")
    if (mainMenu.toInt() == 3){
        val userInfo = signIn()
        whichUser(userInfo)
    }
}

fun clearTerminal(){
    print("\u001b[H\u001b[2J")
    System.out.flush()
}

fun databaseConnection(){
    val url = "jdbc:mysql://localhost:3307/Meu_banco_de_dados"
    val user = "Usuario"
    val password = "Usuario_Senha"

    try {
        Class.forName("com.mysql.cj.jdbc.Driver")
        val connection = DriverManager.getConnection(url, user, password)
        println("Conectado com sucesso!")
        connection.close()
    } catch (e: SQLException) {
        println("Erro de SQL: ${e.message}")
        e.printStackTrace()
    } catch (e: ClassNotFoundException) {
        println("Driver JDBC não encontrado!")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro inesperado: ${e.message}")
        e.printStackTrace()
    }
}