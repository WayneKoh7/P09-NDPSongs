package sg.edu.rp.c346.id22016439.ps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.id22000210.p09_ndpsongs.R;
import sg.edu.rp.c346.id22000210.p09_ndpsongs.Song;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Song> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<Song> objects){
        super (context, resource, objects);
        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvStars = rowView.findViewById(R.id.textViewStars);
        TextView tvArtist = rowView.findViewById(R.id.textViewArtist);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);

        Song currentVersion = versionList.get(position);

        tvName.setText(currentVersion.getTitle());
        tvStars.setText(currentVersion.starsShow());
        tvYear.setText(String.valueOf(currentVersion.getYear()));
        tvArtist.setText(currentVersion.getSingers());

        return rowView;
    }

}