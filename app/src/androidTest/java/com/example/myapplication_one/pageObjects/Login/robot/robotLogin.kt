package com.example.myapplication_one.pageObjects.Login.robot

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.myapplication_one.R
import com.example.myapplication_one.pageObjects.Login.constants.constantsLogin.BTN_VOLTAR
import com.example.myapplication_one.pageObjects.Login.constants.constantsLogin.EMAIL_SUCESSO
import com.example.myapplication_one.pageObjects.Login.constants.constantsLogin.SENHA_SUCESSO
import com.example.myapplication_one.pageObjects.Login.constants.constantsLogin.TEXTO_LOGADO
import com.example.myapplication_one.pageObjects.Login.constants.constantsLogin.TITULO_APLICATIVO

class robotLogin {

    fun validarTituloNaTela(){

        onView(ViewMatchers.withText(TITULO_APLICATIVO))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
    fun escreverEmail(){
        onView(ViewMatchers.withId(R.id.filedEmail)).perform(ViewActions.typeText(
            EMAIL_SUCESSO))

    }

    fun fechaTeclado(){
        closeSoftKeyboard()
    }

    fun escreverSenha(){
        onView(ViewMatchers.withId(R.id.fieldSenha)).perform(ViewActions.typeText(SENHA_SUCESSO))
    }

    fun clicarBotaoLogin(){
        onView(ViewMatchers.withId(R.id.btn_login1)).perform(ViewActions.click())
    }

    fun validarLoginSucesso(){
        onView(ViewMatchers.withText(TEXTO_LOGADO)).check(
            ViewAssertions.matches(
                ViewMatchers.isDisplayed()
            )
        )
    }

    fun clicarBotaoVoltar(){
        onView(ViewMatchers.withText(BTN_VOLTAR)).perform(ViewActions.click())
    }

}