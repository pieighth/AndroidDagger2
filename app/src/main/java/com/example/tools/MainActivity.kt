package com.example.tools

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tools.di.components.JokesComponent

class MainActivity : AppCompatActivity() {

    // Reference to the Login graph
    lateinit var jokesComponent: JokesComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        // Creation of the login graph using the application graph
        jokesComponent = (applicationContext as MyApplication).appComponent.loginComponent().create()
        // Make Dagger instantiate @Inject fields in LoginActivity
        jokesComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
