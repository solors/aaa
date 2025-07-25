package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
abstract class PickerFragment<S> extends Fragment {

    /* renamed from: b */
    protected final LinkedHashSet<OnSelectionChangedListener<S>> f37417b = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean addOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.f37417b.add(onSelectionChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m71520w() {
        this.f37417b.clear();
    }
}
