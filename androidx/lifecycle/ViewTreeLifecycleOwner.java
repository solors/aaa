package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.C2034R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeLifecycleOwner.kt */
@Metadata
/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner {
    @Nullable
    public static final LifecycleOwner get(@NotNull View view) {
        Sequence m16836h;
        Sequence m16831A;
        Object m16811s;
        Intrinsics.checkNotNullParameter(view, "<this>");
        m16836h = C37653n.m16836h(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE);
        m16831A = _Sequences.m16831A(m16836h, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE);
        m16811s = _Sequences.m16811s(m16831A);
        return (LifecycleOwner) m16811s;
    }

    public static final void set(@NotNull View view, @Nullable LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C2034R.C2035id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
