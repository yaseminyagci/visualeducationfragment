package com.tatlicilar.visualeducation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Asus on 15.08.2017.
 */

/*public class navigationDrawerFragment extends Fragment{
private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       // View v=inflater.inflate(R.layout.fragment_navigation_drawer_layout,container,false);
        setUpRecyclerView(v);
       return v;  }

    private void setUpRecyclerView(View v) {
        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.drawerList);
       myAdapter adapter=new myAdapter(getActivity(),NavigationDrawerItem.getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    public  void setUpNavigationDrawer(DrawerLayout drawerLayout, Toolbar toolbar)

    {
        mDrawerLayout=drawerLayout;
        mDrawerToggle= new ActionBarDrawerToggle(getActivity(),mDrawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
       /* mDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {//drawer ın açık kapalı oluşp olmadığını dinlemek için
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

        }

            @Override
            public void onDrawerOpened(View drawerView) {

            }

            @Override
            public void onDrawerClosed(View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {

            /*   ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
              ((AppCompatActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
                mDrawerToggle.syncState();// Butonu otomatikleştiriyoruz

            }
        });
    }
}*/
