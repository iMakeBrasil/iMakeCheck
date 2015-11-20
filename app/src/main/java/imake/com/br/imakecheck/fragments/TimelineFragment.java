package imake.com.br.imakecheck.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import imake.com.br.imakecheck.R;

/**
 * Created by Tiago Ferezin on 20/11/2015.
 */
public class TimelineFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_timeline, container, false);

        return view;
    }
}
