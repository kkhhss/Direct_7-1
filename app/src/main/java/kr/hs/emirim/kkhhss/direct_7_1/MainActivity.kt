package kr.hs.emirim.kkhhss.direct_7_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var editext : EditText
    lateinit var imgV : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "배경색과 버튼 변경"

        editext = findViewById(R.id.editext)
        imgV = findViewById(R.id.imgV)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemRotate -> {
                imgV.rotation = editext.text.toString().toFloat()
                return true
            }
            R.id.item1 -> {
                imgV.setImageResource(R.drawable.hamster02)
                item.setChecked(true)
                return true
            }
            R.id.item2 -> {
                imgV.setImageResource(R.drawable.rabbit01)
                item.setChecked(true)
                return true
            }
            R.id.item3 -> {
                imgV.setImageResource(R.drawable.ginipig01)
                item.setChecked(true)
                return true
            }
        }
        return false
    }
}