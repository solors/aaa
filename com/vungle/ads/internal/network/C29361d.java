package com.vungle.ads.internal.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.C45292c0;
import p1077ze.C45327u;
import p1077ze.ResponseBody;

/* compiled from: Response.kt */
@Metadata
/* renamed from: com.vungle.ads.internal.network.d */
/* loaded from: classes7.dex */
public final class C29361d<T> {
    @NotNull
    public static final C29362a Companion = new C29362a(null);
    @Nullable
    private final T body;
    @Nullable
    private final ResponseBody errorBody;
    @NotNull
    private final C45292c0 rawResponse;

    /* compiled from: Response.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.network.d$a */
    /* loaded from: classes7.dex */
    public static final class C29362a {
        private C29362a() {
        }

        public /* synthetic */ C29362a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> C29361d<T> error(@Nullable ResponseBody responseBody, @NotNull C45292c0 rawResponse) {
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (!rawResponse.isSuccessful()) {
                return new C29361d<>(rawResponse, null, responseBody, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response".toString());
        }

        @NotNull
        public final <T> C29361d<T> success(@Nullable T t, @NotNull C45292c0 rawResponse) {
            Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
            if (rawResponse.isSuccessful()) {
                return new C29361d<>(rawResponse, t, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response".toString());
        }
    }

    public /* synthetic */ C29361d(C45292c0 c45292c0, Object obj, ResponseBody responseBody, DefaultConstructorMarker defaultConstructorMarker) {
        this(c45292c0, obj, responseBody);
    }

    @Nullable
    public final T body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.m415h();
    }

    @Nullable
    public final ResponseBody errorBody() {
        return this.errorBody;
    }

    @NotNull
    public final C45327u headers() {
        return this.rawResponse.m409r();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    @NotNull
    public final String message() {
        return this.rawResponse.m407t();
    }

    @NotNull
    public final C45292c0 raw() {
        return this.rawResponse;
    }

    @NotNull
    public String toString() {
        return this.rawResponse.toString();
    }

    private C29361d(C45292c0 c45292c0, T t, ResponseBody responseBody) {
        this.rawResponse = c45292c0;
        this.body = t;
        this.errorBody = responseBody;
    }
}
