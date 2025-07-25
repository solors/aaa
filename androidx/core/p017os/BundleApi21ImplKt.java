package androidx.core.p017os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Bundle.kt */
@RequiresApi(21)
@Metadata
/* renamed from: androidx.core.os.BundleApi21ImplKt */
/* loaded from: classes.dex */
final class BundleApi21ImplKt {
    @NotNull
    public static final BundleApi21ImplKt INSTANCE = new BundleApi21ImplKt();

    private BundleApi21ImplKt() {
    }

    @DoNotInline
    public static final void putSize(@NotNull Bundle bundle, @NotNull String key, @Nullable Size size) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSize(key, size);
    }

    @DoNotInline
    public static final void putSizeF(@NotNull Bundle bundle, @NotNull String key, @Nullable SizeF sizeF) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
