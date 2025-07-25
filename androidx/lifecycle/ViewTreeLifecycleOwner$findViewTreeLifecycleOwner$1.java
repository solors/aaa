package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewTreeLifecycleOwner.kt */
@Metadata
/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 extends Lambda implements Function1<View, View> {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1();

    ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final View invoke(@NotNull View currentView) {
        Intrinsics.checkNotNullParameter(currentView, "currentView");
        ViewParent parent = currentView.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
