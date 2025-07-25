package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionEvent.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ProcessDetails {
    @NotNull

    /* renamed from: a */
    private final String f43706a;

    /* renamed from: b */
    private final int f43707b;

    /* renamed from: c */
    private final int f43708c;

    /* renamed from: d */
    private final boolean f43709d;

    public ProcessDetails(@NotNull String processName, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f43706a = processName;
        this.f43707b = i;
        this.f43708c = i2;
        this.f43709d = z;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = processDetails.f43706a;
        }
        if ((i3 & 2) != 0) {
            i = processDetails.f43707b;
        }
        if ((i3 & 4) != 0) {
            i2 = processDetails.f43708c;
        }
        if ((i3 & 8) != 0) {
            z = processDetails.f43709d;
        }
        return processDetails.copy(str, i, i2, z);
    }

    @NotNull
    public final String component1() {
        return this.f43706a;
    }

    public final int component2() {
        return this.f43707b;
    }

    public final int component3() {
        return this.f43708c;
    }

    public final boolean component4() {
        return this.f43709d;
    }

    @NotNull
    public final ProcessDetails copy(@NotNull String processName, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return new ProcessDetails(processName, i, i2, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        if (Intrinsics.m17075f(this.f43706a, processDetails.f43706a) && this.f43707b == processDetails.f43707b && this.f43708c == processDetails.f43708c && this.f43709d == processDetails.f43709d) {
            return true;
        }
        return false;
    }

    public final int getImportance() {
        return this.f43708c;
    }

    public final int getPid() {
        return this.f43707b;
    }

    @NotNull
    public final String getProcessName() {
        return this.f43706a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f43706a.hashCode() * 31) + Integer.hashCode(this.f43707b)) * 31) + Integer.hashCode(this.f43708c)) * 31;
        boolean z = this.f43709d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isDefaultProcess() {
        return this.f43709d;
    }

    @NotNull
    public String toString() {
        return "ProcessDetails(processName=" + this.f43706a + ", pid=" + this.f43707b + ", importance=" + this.f43708c + ", isDefaultProcess=" + this.f43709d + ')';
    }
}
