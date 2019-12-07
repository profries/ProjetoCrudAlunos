package com.example.projetocrudalunos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetocrudalunos.adapter.AlunoAdapter
import com.example.projetocrudalunos.model.Aluno

class MainActivity : AppCompatActivity() {
    private var listaAlunos: ArrayList<Aluno> = ArrayList()
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = AlunoAdapter(listaAlunos)

        listaAlunos.add(Aluno("001","Fulano","51-33445566"))
        listaAlunos.add(Aluno("002","Sicrano","51-44556677"))
        listaAlunos.add(Aluno("003","Beltrano","51-99887766"))

        recyclerView = findViewById<RecyclerView>(R.id.recyclerView).apply {

            setHasFixedSize(true)

            layoutManager = viewManager

            adapter = viewAdapter

        }
    }
}
