package br.com.heiderlopes.listaitemsactivity.views.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.heiderlopes.listaitemsactivity.R
import br.com.heiderlopes.listaitemsactivity.models.Item
import br.com.heiderlopes.listaitemsactivity.views.fragments.DetalheItemFragment

class DetalheItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detalhe_item)

        val item = intent.getSerializableExtra("item") as Item

        if (savedInstanceState == null) {
            val detalheItemFragment = DetalheItemFragment.newInstance(item)
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.flDetailContainer, detalheItemFragment)
            ft.commit()
        }
    }
}
