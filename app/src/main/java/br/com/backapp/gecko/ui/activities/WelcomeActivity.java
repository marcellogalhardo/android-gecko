package br.com.backapp.gecko.ui.activities;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import br.com.backapp.gecko.R;
import br.com.backapp.gecko.ui.adapters.WelcomeSlidePagerAdapter;
import butterknife.ButterKnife;
import butterknife.InjectView;
import me.relex.circleindicator.CircleIndicator;

public class WelcomeActivity extends ActionBarActivity {

    @InjectView(R.id.viewpager_welcome_slider) ViewPager mViewPager;
    @InjectView(R.id.circle_indicator) CircleIndicator mCircleIndicator;

    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.inject(this);
        if (savedInstanceState == null) {
            // TODO: Recuperar estado.
        }
        configureUi();
    }

    private void configureUi() {
        mPagerAdapter = new WelcomeSlidePagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
        mCircleIndicator.setViewPager(mViewPager);
    }

    @Override
    public void onBackPressed() {
        if (mViewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1);
        }
    }



}
