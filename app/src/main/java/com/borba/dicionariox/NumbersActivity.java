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
        setContentView(R.layout.lista_view);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("um", "one", R.drawable.number_one));
        words.add(new Word("dois", "two", R.drawable.number_two));
        words.add(new Word("três", "thres", R.drawable.number_three));
        words.add(new Word("quatro", "four"));
        words.add(new Word("cinco", "five"));
        words.add(new Word("seis", "six"));
        words.add(new Word("sete", "seven"));
        words.add(new Word("oito", "eight"));
        words.add(new Word("nove", "nine"));
        words.add(new Word("dez", "ten"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.cat_numeros);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
