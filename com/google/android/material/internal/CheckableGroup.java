package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
/* loaded from: classes5.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {

    /* renamed from: a */
    private final Map<Integer, T> f37660a = new HashMap();

    /* renamed from: b */
    private final Set<Integer> f37661b = new HashSet();

    /* renamed from: c */
    private OnCheckedStateChangeListener f37662c;

    /* renamed from: d */
    private boolean f37663d;

    /* renamed from: e */
    private boolean f37664e;

    /* loaded from: classes5.dex */
    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m71354e(@NonNull MaterialCheckable<T> materialCheckable) {
        int id2 = materialCheckable.getId();
        if (this.f37661b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t = this.f37660a.get(Integer.valueOf(getSingleCheckedId()));
        if (t != null) {
            m71352g(t, false);
        }
        boolean add = this.f37661b.add(Integer.valueOf(id2));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m71353f() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.f37662c;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m71352g(@NonNull MaterialCheckable<T> materialCheckable, boolean z) {
        int id2 = materialCheckable.getId();
        if (!this.f37661b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z && this.f37661b.size() == 1 && this.f37661b.contains(Integer.valueOf(id2))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean remove = this.f37661b.remove(Integer.valueOf(id2));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t) {
        this.f37660a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            m71354e(t);
        }
        t.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public /* bridge */ /* synthetic */ void onCheckedChanged(Object obj, boolean z) {
                onCheckedChanged((C164401) ((MaterialCheckable) obj), z);
            }

            public void onCheckedChanged(T t2, boolean z) {
                if (z) {
                    if (!CheckableGroup.this.m71354e(t2)) {
                        return;
                    }
                } else {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!checkableGroup.m71352g(t2, checkableGroup.f37664e)) {
                        return;
                    }
                }
                CheckableGroup.this.m71353f();
            }
        });
    }

    public void check(@IdRes int i) {
        T t = this.f37660a.get(Integer.valueOf(i));
        if (t != null && m71354e(t)) {
            m71353f();
        }
    }

    public void clearCheck() {
        boolean z = !this.f37661b.isEmpty();
        for (T t : this.f37660a.values()) {
            m71352g(t, false);
        }
        if (z) {
            m71353f();
        }
    }

    @NonNull
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.f37661b);
    }

    @NonNull
    public List<Integer> getCheckedIdsSortedByChildOrder(@NonNull ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public int getSingleCheckedId() {
        if (this.f37663d && !this.f37661b.isEmpty()) {
            return this.f37661b.iterator().next().intValue();
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.f37664e;
    }

    public boolean isSingleSelection() {
        return this.f37663d;
    }

    public void removeCheckable(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.f37660a.remove(Integer.valueOf(t.getId()));
        this.f37661b.remove(Integer.valueOf(t.getId()));
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.f37662c = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f37664e = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f37663d != z) {
            this.f37663d = z;
            clearCheck();
        }
    }

    public void uncheck(@IdRes int i) {
        T t = this.f37660a.get(Integer.valueOf(i));
        if (t != null && m71352g(t, this.f37664e)) {
            m71353f();
        }
    }
}
