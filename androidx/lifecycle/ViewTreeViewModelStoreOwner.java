package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.C2038R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeViewModelStoreOwner.kt */
@Metadata
/* loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner {
    @Nullable
    public static final ViewModelStoreOwner get(@NotNull View view) {
        Sequence m16836h;
        Sequence m16831A;
        Object m16811s;
        Intrinsics.checkNotNullParameter(view, "<this>");
        m16836h = C37653n.m16836h(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE);
        m16831A = _Sequences.m16831A(m16836h, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE);
        m16811s = _Sequences.m16811s(m16831A);
        return (ViewModelStoreOwner) m16811s;
    }

    public static final void set(@NotNull View view, @Nullable ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C2038R.C2039id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
