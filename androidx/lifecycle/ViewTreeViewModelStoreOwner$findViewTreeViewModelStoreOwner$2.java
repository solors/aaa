package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.C2038R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeViewModelStoreOwner.kt */
@Metadata
/* loaded from: classes.dex */
final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends Lambda implements Function1<View, ViewModelStoreOwner> {
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 INSTANCE = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2();

    ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ViewModelStoreOwner invoke(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag = view.getTag(C2038R.C2039id.view_tree_view_model_store_owner);
        if (tag instanceof ViewModelStoreOwner) {
            return (ViewModelStoreOwner) tag;
        }
        return null;
    }
}
