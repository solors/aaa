package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
@Metadata
/* renamed from: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1 */
/* loaded from: classes.dex */
final class C0124x54146ae extends Lambda implements Function1<View, View> {
    public static final C0124x54146ae INSTANCE = new C0124x54146ae();

    C0124x54146ae() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final View invoke(@NotNull View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ViewParent parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
