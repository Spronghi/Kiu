package kiu.sei.informatica.br.uniba.it.kiu.fragment;


import android.support.v4.app.Fragment;

public class FragmentFactory {
    public static Fragment getInstance(int key){
        return FragmentRegister.getFragment(key);
    }
}
