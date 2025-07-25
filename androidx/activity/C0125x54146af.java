package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
@Metadata
/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2 */
/* loaded from: classes.dex */
final class C0125x54146af extends Lambda implements Function1<View, FullyDrawnReporterOwner> {
    public static final C0125x54146af INSTANCE = new C0125x54146af();

    C0125x54146af() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final FullyDrawnReporterOwner invoke(@NotNull View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object tag = it.getTag(C0122R.C0123id.report_drawn);
        if (tag instanceof FullyDrawnReporterOwner) {
            return (FullyDrawnReporterOwner) tag;
        }
        return null;
    }
}
