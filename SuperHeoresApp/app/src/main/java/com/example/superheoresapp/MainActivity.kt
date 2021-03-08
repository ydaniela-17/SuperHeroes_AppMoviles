package com.example.superheoresapp

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import com.example.superheoresapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.btnSend.setOnClickListener {
            val intent = Intent(this, VerDatosActivity::class.java)
            val heroe:String = viewBinding.eTHeroeName.text.toString()
            val power:Float = viewBinding.rbPower.rating
            val bitmap:Bitmap = viewBinding.ivPhoto.drawable.toBitmap()

            intent.putExtra(VerDatosActivity.HEROE_KEY, heroe)
            intent.putExtra(VerDatosActivity.POWER_KEY, power)
            intent.putExtra(VerDatosActivity.IMAGEN_KEY, bitmap)
            startActivity(intent)
        }

        viewBinding.ivPhoto.setOnClickListener{
            val intentImplicito = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intentImplicito, 7)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==7 && resultCode==Activity.RESULT_OK){
            val imagen:Bundle? = data?.extras
            val heroImagen:Bitmap? = imagen?.getParcelable<Bitmap>("data")
            viewBinding.ivPhoto.setImageBitmap(heroImagen)
        }
    }
}