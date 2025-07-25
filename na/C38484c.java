package na;

import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Url.kt */
@Metadata
/* renamed from: na.c */
/* loaded from: classes8.dex */
public final class C38484c {
    @NotNull

    /* renamed from: b */
    public static final C38485a f101833b = new C38485a(null);
    @NotNull

    /* renamed from: a */
    private final String f101834a;

    /* compiled from: Url.kt */
    @Metadata
    /* renamed from: na.c$a */
    /* loaded from: classes8.dex */
    public static final class C38485a {
        private C38485a() {
        }

        public /* synthetic */ C38485a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final boolean m14625b(String str) {
            try {
                new URL(str);
                return true;
            } catch (MalformedURLException unused) {
                return false;
            }
        }

        @NotNull
        /* renamed from: a */
        public final String m14626a(@NotNull String urlString) throws IllegalArgumentException {
            Intrinsics.checkNotNullParameter(urlString, "urlString");
            if (m14625b(urlString)) {
                return C38484c.m14632b(urlString);
            }
            throw new IllegalArgumentException("Invalid url " + urlString);
        }
    }

    private /* synthetic */ C38484c(String str) {
        this.f101834a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C38484c m14633a(String str) {
        return new C38484c(str);
    }

    @NotNull
    /* renamed from: b */
    public static String m14632b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: c */
    public static boolean m14631c(String str, Object obj) {
        if (!(obj instanceof C38484c) || !Intrinsics.m17075f(str, ((C38484c) obj).m14627g())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m14630d(String str, String str2) {
        return Intrinsics.m17075f(str, str2);
    }

    /* renamed from: e */
    public static int m14629e(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return m14631c(this.f101834a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ String m14627g() {
        return this.f101834a;
    }

    public int hashCode() {
        return m14629e(this.f101834a);
    }

    @NotNull
    public String toString() {
        return m14628f(this.f101834a);
    }

    @NotNull
    /* renamed from: f */
    public static String m14628f(String str) {
        return str;
    }
}
