package geolab.lecture.lecture3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import geolab.lecture.lecture3.adapters.JemoAdapter;
import geolab.lecture.lecture3.model.Student;


public class CustomAdapterActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        ListView listview = (ListView) findViewById(R.id.listview);

        JemoAdapter adapter = new JemoAdapter(this, initAdapter());

        listview.setAdapter(adapter);

    }

    private ArrayList<Student> initAdapter(){
        ArrayList<Student> list = new ArrayList<>();
        Student jemo = new Student("Jemo", "Student", "599888888");
        Student jemoShavi = new Student("Shavi Jemo", "Chorna", "888888888");

        for (int i = 0; i < 30; i++){
            if(i % 2 == 0){
                list.add(jemoShavi);
            }else{
                list.add(jemo);
            }
        }

        return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom_adapter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
