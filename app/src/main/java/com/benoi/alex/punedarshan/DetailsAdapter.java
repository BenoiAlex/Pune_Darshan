package com.benoi.alex.punedarshan;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailsAdapter extends ArrayAdapter<Details> {

    public DetailsAdapter(Context context, int resources, List<Details> detailsList) {
        super(context, 0, detailsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Details currentDetails = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        TextView nameDetails = (TextView) listItemView.findViewById(R.id.name);
        nameDetails.setText(currentDetails.getName());

        TextView descriptionDetails = (TextView) listItemView.findViewById(R.id.description);
        descriptionDetails.setText(currentDetails.getDescription());

        TextView addressDetails = (TextView) listItemView.findViewById(R.id.address);
        addressDetails.setText(currentDetails.getAddress());

        TextView scheduleDetails = (TextView) listItemView.findViewById(R.id.schedule);
        scheduleDetails.setText(currentDetails.getSchedule());

        TextView priceDetails = (TextView) listItemView.findViewById(R.id.cost);
        priceDetails.setText(currentDetails.getPrice());

        TextView phoneDetails = (TextView) listItemView.findViewById(R.id.phone);
        phoneDetails.setText(currentDetails.getPhone());

        TextView mailDetails = (TextView) listItemView.findViewById(R.id.mail);
        mailDetails.setText(currentDetails.getMail());

        TextView websiteDetails = (TextView) listItemView.findViewById(R.id.website);
        websiteDetails.setText(currentDetails.getWebsite());

        TextView heightDetails = (TextView) listItemView.findViewById(R.id.height);
        heightDetails.setText(currentDetails.getHeight());

        ImageView photoDetails = (ImageView) listItemView.findViewById(R.id.photo);

        if (currentDetails.hasImage()) {
            photoDetails.setImageResource(currentDetails.getImageResourceId());
            photoDetails.setVisibility(View.VISIBLE);
        } else {
            photoDetails.setVisibility(View.GONE);
        }

        if (currentDetails.hasPrice()) {
            priceDetails.setVisibility(View.VISIBLE);
        } else {
            priceDetails.setVisibility(View.GONE);
        }

        if (currentDetails.hasSchedule()) {
            scheduleDetails.setVisibility(View.VISIBLE);
        } else {
            scheduleDetails.setVisibility(View.GONE);
        }

        if (currentDetails.hasAddress()) {
            addressDetails.setVisibility(View.VISIBLE);
        } else {
            addressDetails.setVisibility(View.GONE);
        }

        if (currentDetails.hasPhone()) {
            phoneDetails.setVisibility(View.VISIBLE);
        } else {
            phoneDetails.setVisibility(View.GONE);
        }

        if (currentDetails.hasMail()) {
            mailDetails.setVisibility(View.VISIBLE);
        } else {
            mailDetails.setVisibility(View.GONE);
        }

        if (currentDetails.hasWebsite()) {
            websiteDetails.setVisibility(View.VISIBLE);
        } else {
            websiteDetails.setVisibility(View.GONE);
        }

        if (currentDetails.hasHeight()) {
            heightDetails.setVisibility(View.VISIBLE);
        } else {
            heightDetails.setVisibility(View.GONE);
        }

        return listItemView;
    }


}
