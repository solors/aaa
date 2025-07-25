package androidx.core.p017os;

import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(18)
@Metadata
/* renamed from: androidx.core.os.BundleApi18ImplKt */
/* loaded from: classes.dex */
final class Bundle {
    @NotNull
    public static final Bundle INSTANCE = new Bundle();

    private Bundle() {
    }

    @DoNotInline
    public static final void putBinder(@NotNull android.os.Bundle bundle, @NotNull String key, @Nullable IBinder iBinder) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
