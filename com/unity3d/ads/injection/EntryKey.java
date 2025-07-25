package com.unity3d.ads.injection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EntryKey.kt */
@Metadata
/* loaded from: classes7.dex */
public final class EntryKey {
    @NotNull
    private final KClass<?> instanceClass;
    @NotNull
    private final String named;

    public EntryKey(@NotNull String named, @NotNull KClass<?> instanceClass) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, KClass kClass, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryKey.named;
        }
        if ((i & 2) != 0) {
            kClass = entryKey.instanceClass;
        }
        return entryKey.copy(str, kClass);
    }

    @NotNull
    public final String component1() {
        return this.named;
    }

    @NotNull
    public final KClass<?> component2() {
        return this.instanceClass;
    }

    @NotNull
    public final EntryKey copy(@NotNull String named, @NotNull KClass<?> instanceClass) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instanceClass, "instanceClass");
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        if (Intrinsics.m17075f(this.named, entryKey.named) && Intrinsics.m17075f(this.instanceClass, entryKey.instanceClass)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final KClass<?> getInstanceClass() {
        return this.instanceClass;
    }

    @NotNull
    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    @NotNull
    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, KClass kClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, kClass);
    }
}
