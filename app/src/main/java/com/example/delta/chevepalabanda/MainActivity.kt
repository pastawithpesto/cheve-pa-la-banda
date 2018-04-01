package com.example.delta.chevepalabanda
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val caguamear: Button = findViewById<Button>(R.id.button)
        var leibol: TextView  = findViewById<TextView>(R.id.tv)

        caguamear.setOnClickListener{
            Toast.makeText(this, "Caguameale!", Toast.LENGTH_LONG ).show()
            try{
            // Cantidades de los pomos
            val ml_mofle: EditText = findViewById<EditText>(R.id.mofle_cantidad)
            val ml_mofle_str = ml_mofle.text.toString()
            val ml_mofle_int = ml_mofle_str.toInt()
            val ml_caguama: EditText = findViewById<EditText>(R.id.caguama_cantidad)
            val ml_caguama_str = ml_caguama.text.toString()
            val ml_caguama_int = ml_caguama_str.toInt()

            // Precios del pomo
            val seis: EditText = findViewById<EditText>(R.id.six_precio)
            val six_str = seis.text.toString()
            val six_int  = six_str.toInt()
            val six_precio_final = (1000 * six_int) / (355*6)

            val lata: EditText = findViewById<EditText>(R.id.lata_precio)
            val lata_str = lata.text.toString()
            val lata_int = lata_str.toInt()
            val lata_precio_final = (1000 * lata_int) / 355

            val mofle: EditText = findViewById<EditText>(R.id.mofle_precio)
            val mofle_str = mofle.text.toString()
            val mofle_int = mofle_str.toInt()
            val mofle_precio_final = (1000 * mofle_int) / ml_mofle_int

            val caguama: EditText = findViewById<EditText>(R.id.caguama_precio)
            val caguama_str = caguama.text.toString()
            val caguama_int = caguama_str.toInt()
            val caguama_precio_final = (1000 * caguama_int) / ml_caguama_int

            var min = six_precio_final
            var mensaje = "El six esta mas bara "
            if (min > lata_precio_final){
                min = lata_precio_final
                mensaje = "Por lata te sobra pa los cigarros "
            }
            else if(min > mofle_precio_final){
                min = mofle_precio_final
                mensaje = "Los moflecitos mejor "
            }
            else if(min > caguama_precio_final){
                min = caguama_precio_final
                mensaje = "Dale con una caguamona "
            }

            var msj = min

            leibol.setText(mensaje + msj.toString() + "$/Litro")

            }
            catch(e: Exception){
                Toast.makeText(this, "LLENAME TODA <3", Toast.LENGTH_LONG ).show()
                //Toast.makeText(this, e.toString(), Toast.LENGTH_LONG ).show() // Es posible agregarlo para debuggear
            }
        }
    }
}
