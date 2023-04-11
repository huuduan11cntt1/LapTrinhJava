package joshuuduan.laptrinh.java.ui.stringjava;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import joshuuduan.laptrinh.java.R;
import joshuuduan.laptrinh.java.databinding.FragmentSlideshowBinding;
import joshuuduan.laptrinh.java.ui.MainFileIOHTML;
import joshuuduan.laptrinh.java.ui.MainStringHtml;

public class StringJavaFragment extends Fragment {
    ListView lv;
    ArrayAdapter<String> adapter;
    private StringJavaViewModel mViewModel;
    private FragmentSlideshowBinding binding;
    public static StringJavaFragment newInstance() {
        return new StringJavaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentSlideshowBinding.inflate(inflater, container, false);

        String[] storyNames =getActivity().getResources().getStringArray(R.array.stories_string);
        View view=inflater.inflate(R.layout.string_java_fragment,container,false);
        lv=(ListView) view.findViewById(R.id.idLVStringJava);
        adapter=new ArrayAdapter<>(getActivity(),R.layout.item,R.id.row_txt,storyNames);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =new Intent(getActivity(), MainStringHtml.class);
                intent.putExtra("StringJava",i);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(StringJavaViewModel.class);
        // TODO: Use the ViewModel
    }

}