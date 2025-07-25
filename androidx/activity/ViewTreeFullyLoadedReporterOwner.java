package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner */
/* loaded from: classes.dex */
public final class ViewTreeFullyLoadedReporterOwner {
    @Nullable
    public static final FullyDrawnReporterOwner get(@NotNull View view) {
        Sequence m16836h;
        Sequence m16831A;
        Object m16811s;
        Intrinsics.checkNotNullParameter(view, "<this>");
        m16836h = C37653n.m16836h(view, C0124x54146ae.INSTANCE);
        m16831A = _Sequences.m16831A(m16836h, C0125x54146af.INSTANCE);
        m16811s = _Sequences.m16811s(m16831A);
        return (FullyDrawnReporterOwner) m16811s;
    }

    public static final void set(@NotNull View view, @NotNull FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(C0122R.C0123id.report_drawn, fullyDrawnReporterOwner);
    }
}
