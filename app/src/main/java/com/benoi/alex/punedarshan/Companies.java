package com.benoi.alex.punedarshan;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;


public class Companies extends Fragment {
    public Companies() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.screen_list, container, false);
        List<Details> companies = new ArrayList<>();
        companies.add(new Details(
                getString(R.string.company_tcs_name),
                getString(R.string.company_tcs_details),
                getString(R.string.company_tcs_address),
                getString(R.string.company_tcs_phone),
                getString(R.string.company_tcs_mail),
                getString(R.string.company_tcs_website),
                null,
                null,
                null,
                R.drawable.tcs
        ));

        companies.add(new Details(
                getString(R.string.company_infosys_name),
                getString(R.string.company_infosys_details),
                getString(R.string.company_infosys_address),
                getString(R.string.company_infosys_phone),
                getString(R.string.company_infosys_mail),
                getString(R.string.company_infosys_website),
                null,
                null,
                null,
                R.drawable.infosys
        ));

        companies.add(new Details(
                getString(R.string.company_persistent_name),
                getString(R.string.company_persistent_details),
                getString(R.string.company_persistent_address),
                getString(R.string.company_persistent_phone),
                getString(R.string.company_persistent_mail),
                getString(R.string.company_persistent_website),
                null,
                null,
                null,
                R.drawable.persistent_systems
        ));

        companies.add(new Details(
                getString(R.string.company_wipro_name),
                getString(R.string.company_wipro_details),
                getString(R.string.company_wipro_address),
                getString(R.string.company_wipro_phone),
                getString(R.string.company_wipro_mail),
                getString(R.string.company_wipro_website),
                null,
                null,
                null,
                R.drawable.wipro
        ));

        companies.add(new Details(
                getString(R.string.company_capgemini_name),
                getString(R.string.company_capgemini_details),
                getString(R.string.company_capgemini_address),
                getString(R.string.company_capgemini_phone),
                getString(R.string.company_capgemini_mail),
                getString(R.string.company_capgemini_website),
                null,
                null,
                null,
                R.drawable.capgemini
        ));

        companies.add(new Details(
                getString(R.string.company_synechron_name),
                getString(R.string.company_synechron_details),
                getString(R.string.company_synechron_address),
                getString(R.string.company_synechron_phone),
                getString(R.string.company_synechron_mail),
                getString(R.string.company_synechron_website),
                null,
                null,
                null,
                R.drawable.synechron
        ));

        companies.add(new Details(
                getString(R.string.company_accenture_name),
                getString(R.string.company_accenture_details),
                getString(R.string.company_accenture_address),
                getString(R.string.company_accenture_phone),
                getString(R.string.company_accenture_mail),
                getString(R.string.company_accenture_website),
                null,
                null,
                null,
                R.drawable.accenture
        ));


        ListView listView = (ListView) view.findViewById(R.id.listView);
        DetailsAdapter adapter = new DetailsAdapter(getActivity(), -1, companies);

        listView.setAdapter(adapter);

        return view;
    }
}


