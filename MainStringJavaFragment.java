package joshuuduan.laptrinh.java.ui.stringjava.;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import joshuuduan.laptrinh.java.ui.stringjava.R;

public class MainStringJavaFragment extends Fragment {

    private MainStringJavaViewModel mViewModel;

    public static MainStringJavaFragment newInstance() {
        return new MainStringJavaFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_string_java_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainStringJavaViewModel.class);
        // TODO: Use the ViewModel
    }

}