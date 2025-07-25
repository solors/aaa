package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
@Metadata
/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    @Nullable
    public static final OnBackPressedDispatcherOwner get(@NotNull View view) {
        Sequence m16836h;
        Sequence m16831A;
        Object m16811s;
        Intrinsics.checkNotNullParameter(view, "<this>");
        m16836h = C37653n.m16836h(view, C0126x8c7c000a.INSTANCE);
        m16831A = _Sequences.m16831A(m16836h, C0127x8c7c000b.INSTANCE);
        m16811s = _Sequences.m16811s(m16831A);
        return (OnBackPressedDispatcherOwner) m16811s;
    }

    public static final void set(@NotNull View view, @NotNull OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(C0122R.C0123id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
