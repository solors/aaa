package com.mobilefuse.sdk.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExternalUsageHelpers.kt */
@Metadata
/* loaded from: classes7.dex */
public final class UsageInfo {
    @NotNull
    private final String name;
    @NotNull
    private final UsageInfoType type;
    @NotNull
    private final String version;

    public UsageInfo(@NotNull UsageInfoType type, @NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        this.type = type;
        this.name = name;
        this.version = version;
    }

    public static /* synthetic */ UsageInfo copy$default(UsageInfo usageInfo, UsageInfoType usageInfoType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            usageInfoType = usageInfo.type;
        }
        if ((i & 2) != 0) {
            str = usageInfo.name;
        }
        if ((i & 4) != 0) {
            str2 = usageInfo.version;
        }
        return usageInfo.copy(usageInfoType, str, str2);
    }

    @NotNull
    public final UsageInfoType component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.version;
    }

    @NotNull
    public final UsageInfo copy(@NotNull UsageInfoType type, @NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        return new UsageInfo(type, name, version);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof UsageInfo) {
                UsageInfo usageInfo = (UsageInfo) obj;
                if (!Intrinsics.m17075f(this.type, usageInfo.type) || !Intrinsics.m17075f(this.name, usageInfo.name) || !Intrinsics.m17075f(this.version, usageInfo.version)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final UsageInfoType getType() {
        return this.type;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i;
        int i2;
        UsageInfoType usageInfoType = this.type;
        int i3 = 0;
        if (usageInfoType != null) {
            i = usageInfoType.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str = this.name;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.version;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    @NotNull
    public String toString() {
        return "UsageInfo(type=" + this.type + ", name=" + this.name + ", version=" + this.version + ")";
    }
}
