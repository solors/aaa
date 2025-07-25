package com.inmobi.unifiedId;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiUserDataTypes {

    /* renamed from: a */
    public final String f48980a;

    /* renamed from: b */
    public final String f48981b;

    /* renamed from: c */
    public final String f48982c;

    @Metadata
    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f48983a;

        /* renamed from: b */
        public String f48984b;

        /* renamed from: c */
        public String f48985c;

        @NotNull
        public final InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f48983a, this.f48984b, this.f48985c);
        }

        @NotNull
        public final Builder md5(@Nullable String str) {
            this.f48983a = str;
            return this;
        }

        @NotNull
        public final Builder sha1(@Nullable String str) {
            this.f48984b = str;
            return this;
        }

        @NotNull
        public final Builder sha256(@Nullable String str) {
            this.f48985c = str;
            return this;
        }
    }

    public InMobiUserDataTypes(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f48980a = str;
        this.f48981b = str2;
        this.f48982c = str3;
    }

    public static /* synthetic */ InMobiUserDataTypes copy$default(InMobiUserDataTypes inMobiUserDataTypes, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inMobiUserDataTypes.f48980a;
        }
        if ((i & 2) != 0) {
            str2 = inMobiUserDataTypes.f48981b;
        }
        if ((i & 4) != 0) {
            str3 = inMobiUserDataTypes.f48982c;
        }
        return inMobiUserDataTypes.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f48980a;
    }

    @Nullable
    public final String component2() {
        return this.f48981b;
    }

    @Nullable
    public final String component3() {
        return this.f48982c;
    }

    @NotNull
    public final InMobiUserDataTypes copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new InMobiUserDataTypes(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataTypes)) {
            return false;
        }
        InMobiUserDataTypes inMobiUserDataTypes = (InMobiUserDataTypes) obj;
        if (Intrinsics.m17075f(this.f48980a, inMobiUserDataTypes.f48980a) && Intrinsics.m17075f(this.f48981b, inMobiUserDataTypes.f48981b) && Intrinsics.m17075f(this.f48982c, inMobiUserDataTypes.f48982c)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getMd5() {
        return this.f48980a;
    }

    @Nullable
    public final String getSha1() {
        return this.f48981b;
    }

    @Nullable
    public final String getSha256() {
        return this.f48982c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f48980a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f48981b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f48982c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public String toString() {
        return "InMobiUserDataTypes(md5=" + this.f48980a + ", sha1=" + this.f48981b + ", sha256=" + this.f48982c + ')';
    }
}
