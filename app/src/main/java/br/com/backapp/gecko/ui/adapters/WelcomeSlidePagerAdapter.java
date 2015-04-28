package br.com.backapp.gecko.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import br.com.backapp.gecko.ui.fragments.WelcomeChatFragment;
import br.com.backapp.gecko.ui.fragments.WelcomeCommentsFragment;
import br.com.backapp.gecko.ui.fragments.WelcomeTradeFragment;

/**
 * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
 * sequence.
 */
public class WelcomeSlidePagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> mFragments = new ArrayList<>();;

    public WelcomeSlidePagerAdapter(FragmentManager manager) {
        super(manager);
        mFragments.add(new WelcomeTradeFragment());
        mFragments.add(new WelcomeCommentsFragment());
        mFragments.add(new WelcomeChatFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}