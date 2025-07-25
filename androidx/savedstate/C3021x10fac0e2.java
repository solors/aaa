package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@Metadata
/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 */
/* loaded from: classes2.dex */
public final class C3021x10fac0e2 extends Lambda implements Function1<View, View> {
    public static final C3021x10fac0e2 INSTANCE = new C3021x10fac0e2();

    C3021x10fac0e2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final View invoke(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
