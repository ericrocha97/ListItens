package cf.ericrocha.listitens.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;
import cf.ericrocha.listitens.activity.RecyclerItemClickListener;
import java.util.ArrayList;
import java.util.List;

import cf.ericrocha.listitens.R;
import cf.ericrocha.listitens.adapter.Adapter;
import cf.ericrocha.listitens.model.Movie;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private List<Movie> listMovies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        this.createMovies();



        Adapter adapter = new Adapter( listMovies );

        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);

        recyclerView.addItemDecoration( new DividerItemDecoration(this,
                LinearLayout.VERTICAL));
        recyclerView.setAdapter( adapter );


        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),

                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            @Override

                            public void onItemClick(View view, int position) {
                                Movie movie = listMovies.get( position );

                                Toast.makeText(

                                        getApplicationContext(),
                                        "Item pressed: " +

                                                movie.getTitleMovie(),

                                        Toast.LENGTH_SHORT

                                ).show();
                            }
                            @Override
                            public void onLongItemClick(View view, int position)

                            {
                                Movie movie = listMovies.get( position );

                                Toast.makeText(

                                        getApplicationContext(),
                                        "Long click: " +

                                                movie.getTitleMovie(),

                                        Toast.LENGTH_SHORT

                                ).show();
                            }
                            @Override
                            public void onItemClick(AdapterView<?> adapterView,

                                                    View view, int i, long l) {
                            }
                        }
                )
        );
    }
    public void createMovies(){


        Movie movie = new Movie("Spider-Man: Homecoming", "Adventure", "2017");
        listMovies.add(movie);

        movie = new Movie("Wonder Woman", "Fantasy", "2017");
        listMovies.add(movie);

        movie = new Movie("Justice League", "Fiction", "2017");
        listMovies.add(movie);

        movie = new Movie("Captain America: Civil War", "Adventure/Fiction", "2016");
        listMovies.add(movie);

        movie = new Movie("It", "Drama/Horror", "2017");
        listMovies.add(movie);

        movie = new Movie("Woody Woodpecker", "Comedy/Animation", "2017");
        listMovies.add(movie);

        movie = new Movie("The Mummy", "Horror", "2017");
        listMovies.add(movie);

        movie = new Movie("Beauty and the Beast", "Romance", "2017");
        listMovies.add(movie);

        movie = new Movie("Despicable Me 3", "Comedy", "2017");
        listMovies.add(movie);

        movie = new Movie("Cars 3", "Comedy", "2017");
        listMovies.add(movie);
    }
}
