package cn.com.ofashion.androidlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.nio.charset.MalformedInputException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnItemSelected;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.lv_door)
    ListView listView;

    public static String[] listDataSource = {OFConstants.Linear,
            OFConstants.Relative,
            OFConstants.Constraint,
            OFConstants.Retrofit,
            OFConstants.RxJava,
            OFConstants.ButterKnife};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        listView.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, listDataSource));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (MainActivity.listDataSource[position]) {
                    case OFConstants.Linear:
                        Toast.makeText(MainActivity.this, MainActivity.listDataSource[position], Toast.LENGTH_SHORT).show();
                    break;
                    case OFConstants.Constraint:
                        Intent intent = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
                        startActivity(intent);
                        break;
                }


            }
        });
    }

}
