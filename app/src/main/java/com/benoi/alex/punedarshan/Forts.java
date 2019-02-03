package com.benoi.alex.punedarshan;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Forts extends Fragment {
    public Forts() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.screen_list, container, false);
        List<Details> forts = new ArrayList<>();
        forts.add(new Details(
                getString(R.string.fort_sinhagad_name),
                getString(R.string.fort_sinhagad_detail),
                getString(R.string.fort_sinhagad_location),
                null,
                null,
                null,
                getString(R.string.fort_sinhagad_visiting_hours),
                getString(R.string.fort_sinhagad_height),
                null,
                R.drawable.sinhagad_fort
        ));

        forts.add(new Details(
                getString(R.string.fort_rajgad_name),
                getString(R.string.fort_rajgad_detail),
                getString(R.string.fort_rajgad_location),
                null,
                null,
                null,
                getString(R.string.fort_rajgad_visiting_hours),
                getString(R.string.fort_rajgad_height),
                null,
                R.drawable.rajgad
        ));

        forts.add(new Details(
                getString(R.string.fort_shivneri_name),
                getString(R.string.fort_shivneri_detail),
                getString(R.string.fort_shivneri_location),
                null,
                null,
                null,
                getString(R.string.fort_shivneri_visiting_hours),
                getString(R.string.fort_shivneri_height),
                null,
                R.drawable.shivneri
        ));

        forts.add(new Details(
                getString(R.string.fort_tung_name),
                getString(R.string.fort_tung_detail),
                getString(R.string.fort_tung_location),
                null,
                null,
                null,
                getString(R.string.fort_tung_height),
                getString(R.string.fort_tung_visiting_hours),
                null,
                R.drawable.tung
        ));

        forts.add(new Details(
                getString(R.string.fort_pratapgad_name),
                getString(R.string.fort_pratapgad_detail),
                getString(R.string.fort_pratapgad_location),
                null,
                null,
                null,
                getString(R.string.fort_pratapgad_height),
                getString(R.string.fort_pratapgad_visiting_hours),
                null,
                R.drawable.pratapgarh
        ));

        forts.add(new Details(
                getString(R.string.fort_malhargad_name),
                getString(R.string.fort_malhargad_detail),
                getString(R.string.fort_malhargad_location),
                null,
                null,
                null,
                getString(R.string.fort_malhargad_height),
                getString(R.string.fort_malhargad_visiting_hours),
                null,
                R.drawable.malhargad
        ));

        forts.add(new Details(
                getString(R.string.fort_lohgad_name),
                getString(R.string.fort_lohgad_detail),
                getString(R.string.fort_lohgad_location),
                null,
                null,
                null,
                getString(R.string.fort_lohgad_height),
                getString(R.string.fort_lohgad_visiting_hours),
                null,
                R.drawable.lohgad
        ));

        forts.add(new Details(
                getString(R.string.fort_korigad_name),
                getString(R.string.fort_korigad_detail),
                getString(R.string.fort_korigad_location),
                null,
                null,
                null,
                getString(R.string.fort_korigad_height),
                getString(R.string.fort_korigad_visiting_hours),
                null,
                R.drawable.korigad
        ));

        forts.add(new Details(
                getString(R.string.fort_purandar_name),
                getString(R.string.fort_purandar_detail),
                getString(R.string.fort_purandar_location),
                null,
                null,
                null,
                getString(R.string.fort_purandar_height),
                getString(R.string.fort_purandar_visiting_hours),
                null,
                R.drawable.purandar
        ));


        ListView listView = (ListView) view.findViewById(R.id.listView);
        DetailsAdapter adapter = new DetailsAdapter(getActivity(), -1, forts);

        listView.setAdapter(adapter);

        return view;
    }
}
