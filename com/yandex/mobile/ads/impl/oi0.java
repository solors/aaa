package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public interface oi0 {

    /* renamed from: com.yandex.mobile.ads.impl.oi0$a */
    /* loaded from: classes8.dex */
    public static final class C31044a implements oi0 {
        @NotNull

        /* renamed from: a */
        private final String f83529a;

        public C31044a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f83529a = message;
        }

        @NotNull
        /* renamed from: a */
        public final String m30998a() {
            return this.f83529a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31044a) && Intrinsics.m17075f(this.f83529a, ((C31044a) obj).f83529a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f83529a.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f83529a;
            return "Failure(message=" + str + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.oi0$b */
    /* loaded from: classes8.dex */
    public static final class C31045b implements oi0 {
        @NotNull

        /* renamed from: a */
        public static final C31045b f83530a = new C31045b();

        private C31045b() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.oi0$c */
    /* loaded from: classes8.dex */
    public static final class C31046c implements oi0 {
        @NotNull

        /* renamed from: a */
        private final Uri f83531a;

        public C31046c(@NotNull Uri reportUri) {
            Intrinsics.checkNotNullParameter(reportUri, "reportUri");
            this.f83531a = reportUri;
        }

        @NotNull
        /* renamed from: a */
        public final Uri m30997a() {
            return this.f83531a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31046c) && Intrinsics.m17075f(this.f83531a, ((C31046c) obj).f83531a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f83531a.hashCode();
        }

        @NotNull
        public final String toString() {
            Uri uri = this.f83531a;
            return "Success(reportUri=" + uri + ")";
        }
    }
}
