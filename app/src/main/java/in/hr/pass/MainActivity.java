package in.hr.pass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TextView textKey, textValue;
    EditText editTextKey, editTextValue;
    final ArrayList<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listView);
        textKey = findViewById(R.id.textKey);
        textValue = findViewById(R.id.textValue);
        editTextKey = findViewById(R.id.EditTextKey);
        editTextValue = findViewById(R.id.EditTectValue);

        adapter = new ArrayAdapter<String>(this, R.layout.list_items,R.id.textKey, list);
        listView.setAdapter(adapter);
    }

    public void AddNew(View view) {
        String key = editTextKey.getText().toString();
        String value = editTextValue.getText().toString();

        list.add(0 ,key);
        list.add(1, value);
        adapter.notifyDataSetChanged();
       /* textKey.setText(key);
        textValue.setText(value);
        list.add();
        */
    }
}