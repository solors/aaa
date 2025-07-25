package androidx.core.p017os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PersistableBundle.kt */
@RequiresApi(22)
@Metadata
/* renamed from: androidx.core.os.PersistableBundleApi22ImplKt */
/* loaded from: classes.dex */
final class PersistableBundleApi22ImplKt {
    @NotNull
    public static final PersistableBundleApi22ImplKt INSTANCE = new PersistableBundleApi22ImplKt();

    private PersistableBundleApi22ImplKt() {
    }

    @DoNotInline
    public static final void putBoolean(@NotNull PersistableBundle persistableBundle, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z);
    }

    @DoNotInline
    public static final void putBooleanArray(@NotNull PersistableBundle persistableBundle, @Nullable String str, @NotNull boolean[] value) {
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        Intrinsics.checkNotNullParameter(value, "value");
        persistableBundle.putBooleanArray(str, value);
    }
}
