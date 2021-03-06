package ado.edu.itla.taskapp.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

import ado.edu.itla.taskapp.R;
import ado.edu.itla.taskapp.entidad.Categoria;
import ado.edu.itla.taskapp.repositorio.CategoriaRepositorio;
import ado.edu.itla.taskapp.repositorio.db.CategoriaRepositorioDblmp;

import static ado.edu.itla.taskapp.vista.CategoriaActivity.LOG_TAG;

public class CategoriaListaActivity extends AppCompatActivity {
    private CategoriaRepositorio categoriaRepositorio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_lista);
        categoriaRepositorio = new CategoriaRepositorioDblmp(this);

        List<Categoria> categorias = categoriaRepositorio.buscar(null);
        Log.i(LOG_TAG, "Total de categoria: " + categorias.size());

        ListView catListView = findViewById(R.id.categoria_listView);
        catListView.setAdapter(new CategoriaListAdapter(this, categorias));

    }
}
