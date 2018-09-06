package br.com.heiderlopes.listaitemsactivity.views.listener

import br.com.heiderlopes.listaitemsactivity.models.Item

interface OnItemSelectedListener {
    fun onItemSelected(i: Item?)
}