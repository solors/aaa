package com.ironsource.mediationsdk;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class ISContainerParams {

    /* renamed from: a */
    private final int f51241a;

    /* renamed from: b */
    private final int f51242b;

    public ISContainerParams(int i, int i2) {
        this.f51241a = i;
        this.f51242b = i2;
    }

    public static /* synthetic */ ISContainerParams copy$default(ISContainerParams iSContainerParams, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = iSContainerParams.f51241a;
        }
        if ((i3 & 2) != 0) {
            i2 = iSContainerParams.f51242b;
        }
        return iSContainerParams.copy(i, i2);
    }

    public final int component1() {
        return this.f51241a;
    }

    public final int component2() {
        return this.f51242b;
    }

    @NotNull
    public final ISContainerParams copy(int i, int i2) {
        return new ISContainerParams(i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ISContainerParams)) {
            return false;
        }
        ISContainerParams iSContainerParams = (ISContainerParams) obj;
        if (this.f51241a == iSContainerParams.f51241a && this.f51242b == iSContainerParams.f51242b) {
            return true;
        }
        return false;
    }

    public final int getHeight() {
        return this.f51242b;
    }

    public final int getWidth() {
        return this.f51241a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f51241a) * 31) + Integer.hashCode(this.f51242b);
    }

    @NotNull
    public String toString() {
        return "ISContainerParams(width=" + this.f51241a + ", height=" + this.f51242b + ')';
    }
}
