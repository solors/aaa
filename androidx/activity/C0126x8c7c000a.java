package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
@Metadata
/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1 */
/* loaded from: classes.dex */
final class C0126x8c7c000a extends Lambda implements Function1<View, View> {
    public static final C0126x8c7c000a INSTANCE = new C0126x8c7c000a();

    C0126x8c7c000a() {
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
