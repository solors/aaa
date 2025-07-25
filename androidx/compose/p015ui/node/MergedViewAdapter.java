package androidx.compose.p015ui.node;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewInterop.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.MergedViewAdapter */
/* loaded from: classes.dex */
public final class MergedViewAdapter implements ViewAdapter {
    @NotNull
    private final List<ViewAdapter> adapters = new ArrayList();

    /* renamed from: id */
    private final int f496id;

    @Override // androidx.compose.p015ui.node.ViewAdapter
    public void didInsert(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didInsert(view, parent);
        }
    }

    @Override // androidx.compose.p015ui.node.ViewAdapter
    public void didUpdate(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didUpdate(view, parent);
        }
    }

    @NotNull
    public final <T extends ViewAdapter> T get(int i, @NotNull Functions<? extends T> factory) {
        T t;
        ViewAdapter viewAdapter;
        boolean z;
        Intrinsics.checkNotNullParameter(factory, "factory");
        List<ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i2 = 0;
        while (true) {
            t = null;
            if (i2 < size) {
                viewAdapter = adapters.get(i2);
                if (viewAdapter.getId() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            } else {
                viewAdapter = null;
                break;
            }
        }
        if (viewAdapter instanceof ViewAdapter) {
            t = (T) viewAdapter;
        }
        if (t != null) {
            return t;
        }
        T invoke = factory.invoke();
        getAdapters().add(invoke);
        return invoke;
    }

    @NotNull
    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    @Override // androidx.compose.p015ui.node.ViewAdapter
    public int getId() {
        return this.f496id;
    }

    @Override // androidx.compose.p015ui.node.ViewAdapter
    public void willInsert(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).willInsert(view, parent);
        }
    }
}
