package androidx.lifecycle;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: androidx.lifecycle.ViewTreeViewModelKt */
/* loaded from: classes.dex */
public final class ViewTreeViewModel {
    public static final /* synthetic */ ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
