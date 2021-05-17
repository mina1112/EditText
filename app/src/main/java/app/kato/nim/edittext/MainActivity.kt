package app.kato.nim.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            //入力したテキストを取得 EditTextの中身が空ではないとき
            if(editText.text != null){
                //取得したテキストをTextViewに表示する
                textView.text = editText.text.toString()
            }
        }
    }
}