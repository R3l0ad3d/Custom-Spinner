package test.net.atshq.customspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private List<SpinnerModelClass> list;
    SpinnerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        spinner = findViewById(R.id.spinner);

         adapter = new SpinnerAdapter(this,list);
        spinner.setAdapter(adapter);

        populateSpinner();
    }

    private void populateSpinner() {
        for(int i=0;i<10;i++){
            SpinnerModelClass model = new SpinnerModelClass("Joy","hello joy",R.mipmap.ic_launcher);
            list.add(model);
        }
        adapter.notifyDataSetChanged();
    }
}
