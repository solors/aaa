package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.tw */
/* loaded from: classes8.dex */
public interface InterfaceC31531tw {

    /* renamed from: com.yandex.mobile.ads.impl.tw$a */
    /* loaded from: classes8.dex */
    public static final class C31532a implements InterfaceC31531tw {
        @NotNull

        /* renamed from: a */
        public static final C31532a f85974a = new C31532a();

        private C31532a() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$b */
    /* loaded from: classes8.dex */
    public static final class C31533b implements InterfaceC31531tw {
        @NotNull

        /* renamed from: a */
        public static final C31533b f85975a = new C31533b();

        private C31533b() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$c */
    /* loaded from: classes8.dex */
    public static final class C31534c implements InterfaceC31531tw {
        @NotNull

        /* renamed from: a */
        private final String f85976a;

        public C31534c(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f85976a = text;
        }

        @NotNull
        /* renamed from: a */
        public final String m28960a() {
            return this.f85976a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31534c) && Intrinsics.m17075f(this.f85976a, ((C31534c) obj).f85976a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f85976a.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f85976a;
            return "Message(text=" + str + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$d */
    /* loaded from: classes8.dex */
    public static final class C31535d implements InterfaceC31531tw {
        @NotNull

        /* renamed from: a */
        private final Uri f85977a;

        public C31535d(@NotNull Uri reportUri) {
            Intrinsics.checkNotNullParameter(reportUri, "reportUri");
            this.f85977a = reportUri;
        }

        @NotNull
        /* renamed from: a */
        public final Uri m28959a() {
            return this.f85977a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31535d) && Intrinsics.m17075f(this.f85977a, ((C31535d) obj).f85977a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f85977a.hashCode();
        }

        @NotNull
        public final String toString() {
            Uri uri = this.f85977a;
            return "ShareReport(reportUri=" + uri + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tw$e */
    /* loaded from: classes8.dex */
    public static final class C31536e implements InterfaceC31531tw {
        @NotNull

        /* renamed from: a */
        private final String f85978a;
        @NotNull

        /* renamed from: b */
        private final String f85979b;

        public C31536e(@NotNull String message) {
            Intrinsics.checkNotNullParameter(HttpHeaders.WARNING, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f85978a = HttpHeaders.WARNING;
            this.f85979b = message;
        }

        @NotNull
        /* renamed from: a */
        public final String m28958a() {
            return this.f85979b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31536e)) {
                return false;
            }
            C31536e c31536e = (C31536e) obj;
            if (Intrinsics.m17075f(this.f85978a, c31536e.f85978a) && Intrinsics.m17075f(this.f85979b, c31536e.f85979b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f85979b.hashCode() + (this.f85978a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f85978a;
            String str2 = this.f85979b;
            return "Warning(title=" + str + ", message=" + str2 + ")";
        }
    }
}
