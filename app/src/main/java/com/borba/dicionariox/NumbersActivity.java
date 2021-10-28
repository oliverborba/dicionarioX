package com.borba.dicionariox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("um");
        words.add("dois");
        words.add("três");
        words.add("quatro");
        words.add("cinco");
        words.add("seis");
        words.add("sete");
        words.add("oito");
        words.add("nove");
        words.add("dez");

        ArrayAdapter<String> itensAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.rootView);

        listView.setAdapter(itensAdapter);

    }

}
