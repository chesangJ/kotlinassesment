package dev.mitingi.assesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.mitingi.assesment.databinding.ActivityLoginBinding

class activity_login : AppCompatActivity() {
    lateinit var  binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btsignup.setOnClickListener { var intent=Intent(this,MainActivity::class.java)
        startActivity(intent)}
        validate1()
    }
    fun validate1(){
        var username=binding.tilusername1.editText.toString()
        var password=binding.tilpassword.editText.toString()
 var error =false
        if (username.isBlank()){
            binding.tilusername1.error="Username required"
            error=true
        }
        if (password.isBlank()){
            binding.tilpassword.error="Phonenumber required"
            error=true
        }
        if(!error){
            Toast.makeText(this,"Congradulation on your log in", Toast.LENGTH_SHORT)
                .show()
        }





    }
}