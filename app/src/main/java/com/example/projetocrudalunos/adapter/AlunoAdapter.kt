package com.example.projetocrudalunos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetocrudalunos.R
import com.example.projetocrudalunos.model.Aluno

class AlunoAdapter (private var listaAlunos:ArrayList<Aluno>) : RecyclerView.Adapter<AlunoAdapter.MyViewHolder>() {

    class MyViewHolder : RecyclerView.ViewHolder {
        var textMatricula: TextView
        var textNome: TextView
        var textTelefone: TextView
        constructor(view: View) : super(view) {
            textMatricula = view.findViewById(R.id.textoMatricula)
            textNome = view.findViewById(R.id.textoNome)
            textTelefone = view.findViewById(R.id.textTelefone)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): AlunoAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_aluno, parent, false) as View
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textMatricula.text = listaAlunos.get(position).matricula
        holder.textNome.text = listaAlunos.get(position).nome
        holder.textTelefone.text = listaAlunos.get(position).telefone
    }

    override fun getItemCount() = listaAlunos.size
}
