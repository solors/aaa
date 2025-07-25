package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class AdRequestError {

    /* renamed from: a */
    private final int f76555a;
    @NotNull

    /* renamed from: b */
    private final String f76556b;
    @Nullable

    /* renamed from: c */
    private final String f76557c;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;

        static {
            new Code();
        }

        private Code() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdRequestError(int i, @NotNull String description) {
        this(i, description, null, 4, null);
        Intrinsics.checkNotNullParameter(description, "description");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(AdRequestError.class, obj.getClass())) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f76555a != adRequestError.f76555a || !Intrinsics.m17075f(this.f76557c, adRequestError.f76557c)) {
            return false;
        }
        return Intrinsics.m17075f(this.f76556b, adRequestError.f76556b);
    }

    @Nullable
    public final String getAdUnitId() {
        return this.f76557c;
    }

    public final int getCode() {
        return this.f76555a;
    }

    @NotNull
    public final String getDescription() {
        return this.f76556b;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f76556b.hashCode() * 31) + this.f76555a) * 31;
        String str = this.f76557c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        int i = this.f76555a;
        String str = this.f76556b;
        String str2 = this.f76557c;
        if (str2 == null) {
            str2 = "";
        }
        return "AdRequestError (code: " + i + ", description: " + str + ", adUnitId: " + str2 + ")";
    }

    public AdRequestError(int i, @NotNull String description, @Nullable String str) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f76555a = i;
        this.f76556b = description;
        this.f76557c = str;
    }

    public /* synthetic */ AdRequestError(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
