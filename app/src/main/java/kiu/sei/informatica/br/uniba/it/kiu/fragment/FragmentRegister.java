package kiu.sei.informatica.br.uniba.it.kiu.fragment;

import android.support.v4.app.Fragment;

import java.util.Map;

import kiu.sei.informatica.br.uniba.it.kiu.R;

class FragmentRegister {
    static private Map<Integer, CloneableFragment> container;
    static {
        try {
            container.put(R.id.nav_view_profile, new ViewProfileFragment().clone());
            container.put(R.id.nav_edit_profile,new EditProfileFragment().clone());
            container.put(R.id.nav_post_announcement,new PostAdFragment().clone());
            container.put(R.id.nav_edit_post,new EditAdFragment().clone());
            //container.put(R.id.nav_cancel_post,new SecondFragment().clone());
            container.put(R.id.nav_view_mex,new ListMexFragment().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    static public Fragment getFragment(int key){
        return container.get(key);
    }
}
