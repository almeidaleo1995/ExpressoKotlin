package com.example.myapplication_one.pageObjects.Login


import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.myapplication_one.MainActivity
import com.example.myapplication_one.pageObjects.Login.robot.robotLogin
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class testeLogin {

    private val robot = robotLogin()

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testLoginModelPage() {
        robot.validarTituloNaTela()
        robot.escreverEmail()
        robot.fechaTeclado()
        robot.escreverSenha()
        robot.fechaTeclado()
        robot.clicarBotaoLogin()
        robot.validarLoginSucesso()
        robot.clicarBotaoVoltar()
        robot.validarTituloNaTela()

    }

}