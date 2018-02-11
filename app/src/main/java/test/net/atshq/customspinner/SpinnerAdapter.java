package test.net.atshq.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 2/11/2018.
 */

public class SpinnerAdapter extends BaseAdapter {

    private Context context;
    private List<SpinnerModelClass> spinnerModelClasseList;

    public SpinnerAdapter(Context context, List<SpinnerModelClass> spinnerModelClasses) {
        this.context = context;
        this.spinnerModelClasseList = spinnerModelClasses;
    }

    @Override
    public int getCount() {
        return spinnerModelClasseList.size();
    }

    @Override
    public Object getItem(int position) {
        return spinnerModelClasseList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.spinner_item,parent,false);

        SpinnerModelClass spinnerModelClass = spinnerModelClasseList.get(position);

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView name = convertView.findViewById(R.id.tvName);
        TextView discription = convertView.findViewById(R.id.tvDiscription);

        imageView.setImageResource(spinnerModelClass.getPic());
        name.setText(spinnerModelClass.getName());
        discription.setText(spinnerModelClass.getDiscription());

        return convertView;
    }
}
