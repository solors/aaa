package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ViewTreeSavedStateRegistryOwner {
    @Nullable
    public static final SavedStateRegistryOwner get(@NotNull View view) {
        Sequence m16836h;
        Sequence m16831A;
        Object m16811s;
        Intrinsics.checkNotNullParameter(view, "<this>");
        m16836h = C37653n.m16836h(view, C3021x10fac0e2.INSTANCE);
        m16831A = _Sequences.m16831A(m16836h, C3022x10fac0e3.INSTANCE);
        m16811s = _Sequences.m16811s(m16831A);
        return (SavedStateRegistryOwner) m16811s;
    }

    public static final void set(@NotNull View view, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C3019R.C3020id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
