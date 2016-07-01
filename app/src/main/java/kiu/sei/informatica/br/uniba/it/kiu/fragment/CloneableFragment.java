package kiu.sei.informatica.br.uniba.it.kiu.fragment;

import android.support.v4.app.Fragment;


public class CloneableFragment extends Fragment implements Cloneable {
    @Override
    public CloneableFragment clone() throws CloneNotSupportedException {
        return (CloneableFragment) super.clone();
    }
}
