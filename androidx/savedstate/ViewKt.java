package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: View.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ViewKt {
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
