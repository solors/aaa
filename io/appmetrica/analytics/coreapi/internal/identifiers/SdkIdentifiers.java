package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class SdkIdentifiers {

    /* renamed from: a */
    private final String f92354a;

    /* renamed from: b */
    private final String f92355b;

    /* renamed from: c */
    private final String f92356c;

    public SdkIdentifiers(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f92354a = str;
        this.f92355b = str2;
        this.f92356c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkIdentifiers.f92354a;
        }
        if ((i & 2) != 0) {
            str2 = sdkIdentifiers.f92355b;
        }
        if ((i & 4) != 0) {
            str3 = sdkIdentifiers.f92356c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f92354a;
    }

    @Nullable
    public final String component2() {
        return this.f92355b;
    }

    @Nullable
    public final String component3() {
        return this.f92356c;
    }

    @NotNull
    public final SdkIdentifiers copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        if (Intrinsics.m17075f(this.f92354a, sdkIdentifiers.f92354a) && Intrinsics.m17075f(this.f92355b, sdkIdentifiers.f92355b) && Intrinsics.m17075f(this.f92356c, sdkIdentifiers.f92356c)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getDeviceId() {
        return this.f92355b;
    }

    @Nullable
    public final String getDeviceIdHash() {
        return this.f92356c;
    }

    @Nullable
    public final String getUuid() {
        return this.f92354a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f92354a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f92355b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f92356c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public String toString() {
        return "SdkIdentifiers(uuid=" + this.f92354a + ", deviceId=" + this.f92355b + ", deviceIdHash=" + this.f92356c + ')';
    }
}
