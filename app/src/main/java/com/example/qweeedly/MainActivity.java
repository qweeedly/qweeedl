package com.example.qweeedly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<User> users = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.listUsersView);
        // создаем адаптер
        DataAdapter adapter = new DataAdapter(this, users);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){

        users.add(new User ("Шаблон - Рабочий интернет",  R.drawable.ic_baseline_favorite_24));
        users.add(new User ("Шаблон - Рабочий телефон",  R.drawable.ic_baseline_favorite_24));
        users.add(new User ("Мой мобильный",  R.drawable.ic_baseline_favorite_24));

    }

}