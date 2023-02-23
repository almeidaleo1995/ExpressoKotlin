package com.example.myapplication_one


import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule


@RunWith(AndroidJUnit4::class)
class TesteFormatoBasico {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testLogin() {
        onView(withText("Aplicativo de testes Leonardo")).check(matches(isDisplayed()))
        onView(withId(R.id.filedEmail)).perform(ViewActions.typeText("leonardo.almeida@sofist.co"))
        closeSoftKeyboard()
        onView(withId(R.id.fieldSenha)).perform(ViewActions.typeText("1234654"))
        closeSoftKeyboard()
        onView(withId(R.id.btn_login1)).perform(ViewActions.click())
        onView(withText("Logado com sucesso")).check(matches(isDisplayed()))
        onView(withText("Voltar")).perform(ViewActions.click())
        onView(withText("Aplicativo de testes Leonardo")).check(matches(isDisplayed()))
    }
}