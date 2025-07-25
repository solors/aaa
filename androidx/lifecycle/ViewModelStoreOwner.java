package androidx.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewModelStoreOwner.kt */
@Metadata
/* loaded from: classes.dex */
public interface ViewModelStoreOwner {
    @NotNull
    ViewModelStore getViewModelStore();
}
