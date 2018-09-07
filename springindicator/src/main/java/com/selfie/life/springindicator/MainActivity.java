package com.selfie.life.springindicator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.common.collect.Lists;
import com.selfie.life.springindicator.Library.SpringIndicator;
import com.selfie.life.springindicator.Library.multiplemodel.ModelPagerAdapter;
import com.selfie.life.springindicator.Library.multiplemodel.PagerModelManager;
import com.selfie.life.springindicator.Library.viewpager.ScrollerViewPager;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ScrollerViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ScrollerViewPager) findViewById(R.id.view_pager);
        SpringIndicator springIndicator = (SpringIndicator) findViewById(R.id.indicator);

        PagerModelManager manager = new PagerModelManager();
        manager.addCommonFragment(GuideFragment.class, getBgRes(), getTitles());
        ModelPagerAdapter adapter = new ModelPagerAdapter(getSupportFragmentManager(), manager);
        viewPager.setAdapter(adapter);
        viewPager.fixScrollSpeed();

        // just set viewPager
        springIndicator.setViewPager(viewPager);

    }

    private List<String> getTitles(){
        return Lists.newArrayList("1", "2", "3", "4");
    }

    private List<Integer> getBgRes(){
        return Lists.newArrayList(R.drawable.bg1, R.drawable.bg2, R.drawable.bg3, R.drawable.bg4);
    }

}
