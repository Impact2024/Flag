package com.example.flag;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Находим ListView в разметке активити
        ListView listView = (ListView) this.findViewById(R.id.listViews);

        // Создаём ListView, в котором будут храниться данные для списка
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        /* Наполняем List данным. В данном случае данные передаются Объектом,
         * в котором хранятся id, указывающие на флаги в ресурсах, а также
         * на Строки, в которых прописаны названия валют стран и аббревиатуры этих валют */
        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.za, R.string.africa, R.string.africaZAR));
        list.add(new DataFlags(R.drawable.sg, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.tr, R.string.turkish, R.string.turkishTRY));
        list.add(new DataFlags(R.drawable.kr, R.string.korea, R.string.koreaKRW));
        list.add(new DataFlags(R.drawable.cn, R.string.china, R.string.chinaCNY));
        list.add(new DataFlags(R.drawable.jp, R.string.japan, R.string.japanJPY));
        list.add(new DataFlags(R.drawable.kz, R.string.kazakhstan, R.string.kazakhstanKZT));

        /* Создаём адаптер, который будет передавать данные из List`а в
         * элемент ListView и подключаем его непосредственно к ListView`у
         */
        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }



}