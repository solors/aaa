package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.C2034R;
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
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 extends Lambda implements Function1<View, LifecycleOwner> {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2();

    ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final LifecycleOwner invoke(@NotNull View viewParent) {
        Intrinsics.checkNotNullParameter(viewParent, "viewParent");
        Object tag = viewParent.getTag(C2034R.C2035id.view_tree_lifecycle_owner);
        if (tag instanceof LifecycleOwner) {
            return (LifecycleOwner) tag;
        }
        return null;
    }
}
