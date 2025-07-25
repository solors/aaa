package com.facebook.internal.gatekeeper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GateKeeper.kt */
@Metadata
/* loaded from: classes4.dex */
public final class GateKeeper {
    @NotNull
    private final String name;
    private final boolean value;

    public GateKeeper(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = z;
    }

    public static /* synthetic */ GateKeeper copy$default(GateKeeper gateKeeper, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gateKeeper.name;
        }
        if ((i & 2) != 0) {
            z = gateKeeper.value;
        }
        return gateKeeper.copy(str, z);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.value;
    }

    @NotNull
    public final GateKeeper copy(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new GateKeeper(name, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GateKeeper)) {
            return false;
        }
        GateKeeper gateKeeper = (GateKeeper) obj;
        if (Intrinsics.m17075f(this.name, gateKeeper.name) && this.value == gateKeeper.value) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        boolean z = this.value;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "GateKeeper(name=" + this.name + ", value=" + this.value + ')';
    }
}
