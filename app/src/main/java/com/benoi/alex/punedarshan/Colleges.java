package com.benoi.alex.punedarshan;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Colleges extends Fragment {
    public Colleges() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.screen_list, container, false);
        List<Details> colleges = new ArrayList<>();
        colleges.add(new Details(
                getString(R.string.college_mit_name),
                null,
                getString(R.string.college_mit_address),
                getString(R.string.college_mit_phone),
                getString(R.string.college_mit_mail),
                getString(R.string.college_mit_website),
                null,
                null,
                null,
                R.drawable.mit_adt
        ));

        colleges.add(new Details(
                getString(R.string.college_coep_name),
                null,
                getString(R.string.college_coep_address),
                getString(R.string.college_coep_phone),
                getString(R.string.college_coep_mail),
                getString(R.string.college_coep_website),
                null,
                null,
                null,
                R.drawable.coep
        ));

        colleges.add(new Details(
                getString(R.string.college_sinhagad_name),
                null,
                getString(R.string.college_sinhagad_address),
                getString(R.string.college_sinhagad_phone),
                getString(R.string.college_sinhagad_mail),
                getString(R.string.college_sinhagad_website),
                null,
                null,
                null,
                R.drawable.sinhagad
        ));

        colleges.add(new Details(
                getString(R.string.college_fergusson_name),
                null,
                getString(R.string.college_fergusson_address),
                getString(R.string.college_fergusson_phone),
                getString(R.string.college_fergusson_mail),
                getString(R.string.college_fergusson_website),
                null,
                null,
                null,
                R.drawable.fergusson
        ));

        colleges.add(new Details(
                getString(R.string.college_symbiosis_name),
                null,
                getString(R.string.college_symbiosis_address),
                getString(R.string.college_symbiosis_phone),
                getString(R.string.college_symbiosis_mail),
                getString(R.string.college_symbiosis_website),
                null,
                null,
                null,
                R.drawable.symbiosis
        ));


        ListView listView = (ListView) view.findViewById(R.id.listView);
        DetailsAdapter adapter = new DetailsAdapter(getActivity(), -1, colleges);

        listView.setAdapter(adapter);

        return view;
    }
}
