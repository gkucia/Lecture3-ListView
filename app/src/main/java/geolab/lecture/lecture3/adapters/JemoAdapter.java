package geolab.lecture.lecture3.adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import geolab.lecture.lecture3.R;
import geolab.lecture.lecture3.model.Student;

/**
 * Created by Jay on 6/10/2015.
 */
public class JemoAdapter extends BaseAdapter {
    private ArrayList<Student> data;
    private LayoutInflater inflater;
    private Context context;

    public JemoAdapter(Context context, ArrayList<Student> data) {
        this.data = data;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return this.data.size();
    }

    @Override
    public Object getItem(int position) {
        return this.data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        ViewHolder viewHolder;
        if(convertView == null){
            itemView = inflater.inflate(R.layout.list_item_layout, null);
            viewHolder = new ViewHolder();

            TextView saxeli = (TextView) itemView.findViewById(R.id.saxeli);
            TextView statusi = (TextView) itemView.findViewById(R.id.status);
            TextView nomeri = (TextView) itemView.findViewById(R.id.nomeri);

            ImageView img = (ImageView) itemView.findViewById(R.id.imageView);

            img.setImageDrawable(context.getResources().getDrawable(R.drawable.abc_ab_share_pack_mtrl_alpha));

            viewHolder.saxeliView = saxeli;
            viewHolder.statusView = statusi;
            viewHolder.nomeriView = nomeri;

            itemView.setTag(viewHolder);
        }else{
            itemView = convertView;

            viewHolder = (ViewHolder) itemView.getTag();
        }

        Student student = (Student) getItem(position);

        viewHolder.saxeliView.setText(student.getSaxeli());
        viewHolder.statusView.setText(student.getStatus());
        viewHolder.nomeriView.setText(student.getPhoneNumber());

        return itemView;
    }

    private class ViewHolder{
        TextView saxeliView, statusView, nomeriView;
    }
}
