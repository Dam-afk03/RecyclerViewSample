package lat.pam.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import lat.pam.samplerecyclerview.ItemsViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // Membuat layout manager berbentuk vertikal
        recyclerview.layoutManager = LinearLayoutManager(this)

        // Menyiapkan array list untuk data
        val data = ArrayList<ItemsViewModel>()

        // Loop ini akan membuat 20 item dummy
        for (i in 1..20) {
            data.add(ItemsViewModel("Item " + i))
        }

        // Memasukkan array list ke Adapter
        val adapter = CustomAdapter(data)
        Log.d("test string", "Jumlah data: " + data.size)

        // Memasang adapter ke recyclerview
        recyclerview.adapter = adapter
    }
}