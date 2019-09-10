package com.wolfie.cyphertext;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
 public class tabadapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public tabadapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }

     @Override
     public Fragment getItem(int i) {
       switch (i){
         case 0 : encrypt en = new encrypt();
         return  en;
           case 1: decrypt de = new decrypt();
           return  de;
           default:return null;
     }
    }
 }
