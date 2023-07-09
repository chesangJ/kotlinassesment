package dev.mitingi.assesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.mitingi.assesment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onResume() {

        super.onResume()
        binding.btlogin.setOnClickListener { val intent=Intent(this,activity_login::class.java)
        startActivity(intent)
            validate()
        }


    }

    fun validate(){
        var username=binding.tilusername.editText.toString()
        var number=binding.tilnumber.editText.toString()
        var email=binding.tilemail.editText.toString()
        var password=binding.tilpassword.editText.toString()

        var error=false

        if (username.isBlank()){
            binding.tilusername.error="Username required"
            error=true
        }
        if (number.isBlank()){
            binding.tilnumber.error="Phonenumber required"
            error=true
        }
        if (email.isBlank()){
            binding.tilemail.error="Email required"
            error=true
        }
        if (password.isBlank()){
            binding.tilpassword.error="Password required"
            error=true
        }
        if(!error){
            Toast.makeText(this,"Congradulation on your sign in",Toast.LENGTH_SHORT)
                .show()
        }



    }


}






//You are building billz. A bills management solution for the urban, financially
//responsible and tech savvy millennial. The first part of your workstream is
//onboarding and authentication. Your registration should capture the following
//details:Submit both a github link and an apk on appetize.io
//- username
//- phone number
//- email address
//- password
//You will then use the appropriate combination of those details in your login.
//Additional requirements:
//- Provide a way to navigate between both screens
//- Both forms should be properly validated
//- Use view binding
//
//(25 pts)
//
//Non functional requirements:
//The next 5 points will be awarded for the following:
//- Usage of appropriate images and icons
//- Styling of your UI beyond the basic default themes and fonts
//- Proper code formatting and organization of functionality (5 pts)


//btsm.setonclicklistner for linking thr pages
//
//
//        for validation
//        fun validate (){
//            var firdtname=binding.tilfirstname.text.tostring
//             var error=false
//
//            if (firstname.isBLANK)
//                BI
//        }

