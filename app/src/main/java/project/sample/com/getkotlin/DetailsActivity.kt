package project.sample.com.getkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import android.widget.TextView
import kotlin.sample.com.getkotlin.R

class DetailsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var tvFlowerName: TextView
    private lateinit var ivFlowerImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        init()

        val stringArray = resources.getStringArray(R.array.key)
        var stringValueArray:Array<String>? = null
        val list = ArrayList<FlowerModel>()
        val string = intent.extras.getString(AppConstant.FLOWER)

        tvFlowerName.text = string
        ivFlowerImage.setImageResource(intent.extras.getInt(AppConstant.FLOWER_IMAGE,0))

        when (string) {
            AppConstant.ACONITE ->
                    stringValueArray = resources.getStringArray(R.array.aconite)

            AppConstant.AGERATUM ->
                    stringValueArray = resources.getStringArray(R.array.ageratum)

            AppConstant.ALLIUM ->
                    stringValueArray = resources.getStringArray(R.array.allium)

            AppConstant.ANEMONE ->
                    stringValueArray = resources.getStringArray(R.array.anemone)

            AppConstant.ANGELICA ->
                    stringValueArray = resources.getStringArray(R.array.angelica)

            AppConstant.ANGELONIA ->
                    stringValueArray = resources.getStringArray(R.array.angelonia)

            AppConstant.ARTEMISIA ->
                    stringValueArray = resources.getStringArray(R.array.artemisia)

            AppConstant.ASTER ->
                    stringValueArray = resources.getStringArray(R.array.aster)

            AppConstant.ASTILBE ->
                    stringValueArray = resources.getStringArray(R.array.astilbe)
        }

        for (counter in 0..5) {
            list.add(FlowerModel(stringArray[counter], stringValueArray?.get(counter)))
        }

        val recyclerAdapter = RecyclerAdapter(list)
        recyclerView.adapter = recyclerAdapter
    }

    fun init() {
        recyclerView = findViewById(R.id.recycler_view) as RecyclerView
        tvFlowerName = findViewById(R.id.tv_flower_name) as TextView
        ivFlowerImage = findViewById(R.id.iv_flower) as ImageView

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }
}
