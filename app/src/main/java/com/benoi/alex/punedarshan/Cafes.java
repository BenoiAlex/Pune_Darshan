package com.benoi.alex.punedarshan;

import android.content.Context;

import android.location.Location;
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


public class Cafes extends Fragment {

    public Cafes() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.screen_list, container, false);
        List<Details> cafes = new ArrayList<>();
        cafes.add(new Details(
                getString(R.string.cafe_bawa_name),
                getString(R.string.cafe_bawa_details),
                getString(R.string.cafe_bawa_address),
                getString(R.string.cafe_bawa_phone),
                null,
                null,
                null,
                getString(R.string.cafe_bawa_timings),
                getString(R.string.cafe_bawa_cost),
                R.drawable.bawa
        ));


        cafes.add(new Details(
                getString(R.string.cafe_piatto_name),
                getString(R.string.cafe_piatto_details),
                getString(R.string.cafe_piatto_address),
                getString(R.string.cafe_piatto_phone),
                null,
                null,
                null,
                getString(R.string.cafe_piatto_timings),
                getString(R.string.cafe_piatto_cost),
                R.drawable.piatto
        ));

        cafes.add(new Details(
                getString(R.string.cafe_waari_name),
                getString(R.string.cafe_waari_details),
                getString(R.string.cafe_waari_address),
                getString(R.string.cafe_waari_phone),
                null,
                null,
                null,
                getString(R.string.cafe_waari_timings),
                getString(R.string.cafe_waari_cost),
                R.drawable.waari_book_cafe
        ));

        cafes.add(new Details(
                getString(R.string.cafe_pondi_name),
                getString(R.string.cafe_pondi_details),
                getString(R.string.cafe_pondi_address),
                getString(R.string.cafe_pondi_phone),
                null,
                null,
                null,
                getString(R.string.cafe_pondi_timings),
                getString(R.string.cafe_pondi_cost),
                R.drawable.cafe_pondi
        ));

        cafes.add(new Details(
                getString(R.string.cafe_mamgoto_name),
                getString(R.string.cafe_mamgoto_details),
                getString(R.string.cafe_mamgoto_address),
                getString(R.string.cafe_mamgoto_phone),
                null,
                null,
                null,
                getString(R.string.cafe_mamgoto_timings),
                getString(R.string.cafe_mamgoto_cost),
                R.drawable.mamagoto
        ));

        cafes.add(new Details(
                getString(R.string.cafe_stonned_name),
                getString(R.string.cafe_stonned_details),
                getString(R.string.cafe_stonned_address),
                getString(R.string.cafe_stonned_phone),
                null,
                null,
                null,
                getString(R.string.cafe_stonned_timings),
                getString(R.string.cafe_stonned_cost),
                R.drawable.bawa
        ));

        ListView listView = (ListView) view.findViewById(R.id.listView);
        DetailsAdapter adapter = new DetailsAdapter(getActivity(), -1, cafes);

        listView.setAdapter(adapter);

        return view;
    }
}
