package androidx.compose.p015ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewInterop.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.ViewInterop_androidKt */
/* loaded from: classes.dex */
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <T extends ViewAdapter> T getOrAddAdapter(@NotNull View view, int i, @NotNull Functions<? extends T> factory) {
        T t;
        ViewAdapter viewAdapter;
        boolean z;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(factory, "factory");
        MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter2.getAdapters();
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
        if (t == null) {
            T invoke = factory.invoke();
            viewAdapter2.getAdapters().add(invoke);
            return invoke;
        }
        return t;
    }

    @NotNull
    public static final MergedViewAdapter getViewAdapter(@NotNull View view) {
        MergedViewAdapter mergedViewAdapter;
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i = viewAdaptersKey;
        Object tag = view.getTag(i);
        if (tag instanceof MergedViewAdapter) {
            mergedViewAdapter = (MergedViewAdapter) tag;
        } else {
            mergedViewAdapter = null;
        }
        if (mergedViewAdapter == null) {
            MergedViewAdapter mergedViewAdapter2 = new MergedViewAdapter();
            view.setTag(i, mergedViewAdapter2);
            return mergedViewAdapter2;
        }
        return mergedViewAdapter;
    }

    @Nullable
    public static final MergedViewAdapter getViewAdapterIfExists(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(viewAdaptersKey);
        if (tag instanceof MergedViewAdapter) {
            return (MergedViewAdapter) tag;
        }
        return null;
    }

    public static final int tagKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key.hashCode() | 50331648;
    }
}
