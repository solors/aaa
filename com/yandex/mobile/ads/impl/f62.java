package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class f62 {
    @NotNull

    /* renamed from: a */
    private final String f78995a;

    /* renamed from: com.yandex.mobile.ads.impl.f62$a */
    /* loaded from: classes8.dex */
    public static final class C30297a {
        @NotNull
        /* renamed from: a */
        public static f62 m34208a(@Nullable String str) {
            if (str == null) {
                str = "Ad request failed with network error";
            }
            return new f62(2, str);
        }

        @NotNull
        /* renamed from: b */
        public static f62 m34206b(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            return new f62(1, description);
        }

        @NotNull
        /* renamed from: a */
        public static f62 m34209a(@NotNull x20 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            String message = error.getMessage();
            if (message == null) {
                message = "Ad request completed successfully, but there are no ads available.";
            }
            return new f62(3, message);
        }

        @NotNull
        /* renamed from: b */
        public static f62 m34207b() {
            Intrinsics.checkNotNullParameter("Server temporarily unavailable. Please, try again later.", "message");
            return new f62(4, "Server temporarily unavailable. Please, try again later.");
        }

        @NotNull
        /* renamed from: a */
        public static f62 m34210a() {
            return new f62(1, "Internal error. Failed to parse response");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f62(int i, @NotNull String errorDescription) {
        this(errorDescription);
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
    }

    @NotNull
    /* renamed from: a */
    public final String m34211a() {
        return this.f78995a;
    }

    private f62(String str) {
        this.f78995a = str;
    }
}
