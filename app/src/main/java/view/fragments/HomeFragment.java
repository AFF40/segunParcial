package view.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recovery.R;
import com.example.recovery.adapter.cardViewAdapter;
import com.example.recovery.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        //toolbar
        showToolBar(getString(R.string.title_home_fragment),false,view);
        //recicler
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        //layout manager
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //adapter
        cardViewAdapter CardViewAdapter = new cardViewAdapter(buildImage(),R.layout.cardview_image,getActivity());

        return view;

    }

    public void showToolBar(String titulo, boolean botonsubir,View view) {
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonsubir);
    }
    public ArrayList<Image> buildImage(){
        ArrayList<Image> images= new ArrayList<>();

        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/8/8c/Virgen_del_Socav%C3%B3n.jpg","carlos valdivia","2 dias","1 me gusta"));
        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/La_Glorieta_-_Sucre.jpg/1280px-La_Glorieta_-_Sucre.jpg","luis perez","2 dias","11 me gusta"));
        images.add(new Image("https://www.piensageotermia.com/wp-content/uploads/2018/04/LagunaColorada_1_Bolivia-1024x683-1024x683.jpg","gerardo sosa","2 dias","7 me gusta"));
        images.add(new Image("https://boliviaturistica.com/wp-content/uploads/2018/08/Fuerte-de-Samaipata-Bolivia-1024x535.jpg","carlos quinto","2 dias","42 me gusta"));
        images.add(new Image("https://boliviatravelsite.com/Images/Attractionphotos/incachaca-004.jpg","enrique gomez","2 dias","43 me gusta"));
        images.add(new Image("https://kintan.tv/wp-content/uploads/2022/04/monumento-del-cristo-de-la-concordia.jpg","gerardo mamani","2 dias","6 me gusta"));
        images.add(new Image("https://www.laregion.bo/wp-content/uploads/2015/10/COROICO.jpg","laura garcia","2 dias","2 me gusta"));
        images.add(new Image("https://www.adonde-y-cuando.es/site/images/illustration/lac-titicaca-copacabana_115.jpg","julian colque","2 dias","8 me gusta"));
        images.add(new Image("https://i.ytimg.com/vi/OlmPlTIvU8U/maxresdefault.jpg","pedro torres","2 dias","5 me gusta"));
        images.add(new Image("https://s1.dmcdn.net/v/RP1xx1VtHnyCXz6zX/x720","andrea acosta","2 dias","33 me gusta"));

        return images;
    }
}