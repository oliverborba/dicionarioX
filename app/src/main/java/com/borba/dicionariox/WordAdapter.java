package com.borba.dicionariox;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResoucedId) {
        super(context, 0, words);
        mColorResourceId = colorResoucedId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista, parent, false);
        }

        Word currentWord = getItem(position);

        TextView inglesTextView = (TextView) listItemView.findViewById(R.id.ingles_text_view);

        inglesTextView.setText(currentWord.getTradIngles());

        TextView portuguesTextView = (TextView) listItemView.findViewById(R.id.portugues_text_view);
        portuguesTextView.setText(currentWord.getPortugues());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imagem);

        if (currentWord.hasImagem()) {
            iconView.setImageResource(currentWord.getIdImagem());
            iconView.setVisibility(View.VISIBLE);

        } else
            iconView.setVisibility(View.GONE);

        View textContainer = listItemView.findViewById(R.id.container_texto);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}
