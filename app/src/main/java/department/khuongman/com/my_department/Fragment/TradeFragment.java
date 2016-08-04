package department.khuongman.com.my_department.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import department.khuongman.com.my_department.R;

/**
 * Created by khuong.man on 8/4/2016.
 */

public class TradeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_trade, container, false);
        return view;
    }
}