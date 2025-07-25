package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Preference.kt */
@Entity
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class Preference {
    @PrimaryKey
    @ColumnInfo(name = "key")
    @NotNull
    private final String key;
    @ColumnInfo(name = "long_value")
    @Nullable
    private final Long value;

    public Preference(@NotNull String key, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.value = l;
    }

    public static /* synthetic */ Preference copy$default(Preference preference, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preference.key;
        }
        if ((i & 2) != 0) {
            l = preference.value;
        }
        return preference.copy(str, l);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @Nullable
    public final Long component2() {
        return this.value;
    }

    @NotNull
    public final Preference copy(@NotNull String key, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new Preference(key, l);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (Intrinsics.m17075f(this.key, preference.key) && Intrinsics.m17075f(this.value, preference.value)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.key.hashCode() * 31;
        Long l = this.value;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(@NotNull String key, boolean z) {
        this(key, Long.valueOf(z ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
