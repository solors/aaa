package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@Metadata
/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 */
/* loaded from: classes2.dex */
public final class C3022x10fac0e3 extends Lambda implements Function1<View, SavedStateRegistryOwner> {
    public static final C3022x10fac0e3 INSTANCE = new C3022x10fac0e3();

    C3022x10fac0e3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final SavedStateRegistryOwner invoke(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag = view.getTag(C3019R.C3020id.view_tree_saved_state_registry_owner);
        if (tag instanceof SavedStateRegistryOwner) {
            return (SavedStateRegistryOwner) tag;
        }
        return null;
    }
}
