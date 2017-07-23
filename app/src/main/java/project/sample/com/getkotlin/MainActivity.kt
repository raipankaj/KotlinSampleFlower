package project.sample.com.getkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.sample.com.getkotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    internal fun setListeners() {
        findViewById(R.id.flower_aconite).setOnClickListener(mOnClickListener)
        findViewById(R.id.flower_ageratum).setOnClickListener(mOnClickListener)
        findViewById(R.id.flower_allium).setOnClickListener(mOnClickListener)
        findViewById(R.id.flower_anemone).setOnClickListener(mOnClickListener)
        findViewById(R.id.flower_angelica).setOnClickListener(mOnClickListener)
        findViewById(R.id.flower_angelonia).setOnClickListener(mOnClickListener)
        findViewById(R.id.flower_artemisia).setOnClickListener(mOnClickListener)
        findViewById(R.id.flower_aster).setOnClickListener(mOnClickListener)
        findViewById(R.id.flower_astilbe).setOnClickListener(mOnClickListener)
    }

    internal val mOnClickListener = View.OnClickListener { view ->

        val intent = Intent(applicationContext, DetailsActivity::class.java)
        when (view.id) {
            R.id.flower_aconite -> {
                intent.putExtra(AppConstant.FLOWER, AppConstant.ACONITE)
                intent.putExtra(AppConstant.FLOWER_IMAGE, R.drawable.aconite)
            }

            R.id.flower_ageratum -> {
                intent.putExtra(AppConstant.FLOWER, AppConstant.AGERATUM)
                intent.putExtra(AppConstant.FLOWER_IMAGE, R.drawable.ageratum)
            }

            R.id.flower_allium -> {
                intent.putExtra(AppConstant.FLOWER, AppConstant.ALLIUM)
                intent.putExtra(AppConstant.FLOWER_IMAGE, R.drawable.allium)
            }

            R.id.flower_anemone -> {
                intent.putExtra(AppConstant.FLOWER, AppConstant.ANEMONE)
                intent.putExtra(AppConstant.FLOWER_IMAGE, R.drawable.anemone)
            }

            R.id.flower_angelica -> {
                intent.putExtra(AppConstant.FLOWER, AppConstant.ANGELICA)
                intent.putExtra(AppConstant.FLOWER_IMAGE, R.drawable.angelica)
            }

            R.id.flower_angelonia -> {
                intent.putExtra(AppConstant.FLOWER, AppConstant.ANGELONIA)
                intent.putExtra(AppConstant.FLOWER_IMAGE, R.drawable.angelonia)
            }

            R.id.flower_artemisia -> {
                intent.putExtra(AppConstant.FLOWER, AppConstant.ARTEMISIA)
                intent.putExtra(AppConstant.FLOWER_IMAGE, R.drawable.artemisia)
            }

            R.id.flower_aster -> {
                intent.putExtra(AppConstant.FLOWER, AppConstant.ASTER)
                intent.putExtra(AppConstant.FLOWER_IMAGE, R.drawable.aster)
            }

            R.id.flower_astilbe -> {
                intent.putExtra(AppConstant.FLOWER, AppConstant.ASTILBE)
                intent.putExtra(AppConstant.FLOWER_IMAGE, R.drawable.astible)
            }
        }
        startActivity(intent)
    }
}
