package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OpaqueKey.kt */
@Metadata
/* loaded from: classes.dex */
public final class OpaqueKey {
    @NotNull
    private final String key;

    public OpaqueKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    public static /* synthetic */ OpaqueKey copy$default(OpaqueKey opaqueKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = opaqueKey.key;
        }
        return opaqueKey.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @NotNull
    public final OpaqueKey copy(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new OpaqueKey(key);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OpaqueKey) && Intrinsics.m17075f(this.key, ((OpaqueKey) obj).key)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    @NotNull
    public String toString() {
        return "OpaqueKey(key=" + this.key + ')';
    }
}
