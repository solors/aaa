package com.monetization.ads.mediation.base;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedAdRequestError {

    /* renamed from: a */
    private final int f66478a;
    @NotNull

    /* renamed from: b */
    private final String f66479b;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Code {
        @NotNull
        public static final Code INSTANCE = new Code();
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;

        private Code() {
        }
    }

    public MediatedAdRequestError(int i, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f66478a = i;
        this.f66479b = description;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(MediatedAdRequestError.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.monetization.ads.mediation.base.MediatedAdRequestError");
        MediatedAdRequestError mediatedAdRequestError = (MediatedAdRequestError) obj;
        if (this.f66478a != mediatedAdRequestError.f66478a) {
            return false;
        }
        return Intrinsics.m17075f(this.f66479b, mediatedAdRequestError.f66479b);
    }

    public final int getCode() {
        return this.f66478a;
    }

    @NotNull
    public final String getDescription() {
        return this.f66479b;
    }

    public int hashCode() {
        return this.f66479b.hashCode() + (this.f66478a * 31);
    }

    @NotNull
    public String toString() {
        int i = this.f66478a;
        String str = this.f66479b;
        return "AdRequestError (code: " + i + ", description: " + str + ")";
    }
}
