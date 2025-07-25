package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qd1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fd */
/* loaded from: classes8.dex */
public class C30306fd implements tw1 {
    @NotNull

    /* renamed from: f */
    private static final C30230ed f79044f;

    /* renamed from: g */
    public static final /* synthetic */ int f79045g = 0;
    @NotNull

    /* renamed from: a */
    private final Class<? super SSLSocket> f79046a;
    @NotNull

    /* renamed from: b */
    private final Method f79047b;

    /* renamed from: c */
    private final Method f79048c;

    /* renamed from: d */
    private final Method f79049d;

    /* renamed from: e */
    private final Method f79050e;

    /* renamed from: com.yandex.mobile.ads.impl.fd$a */
    /* loaded from: classes8.dex */
    public static final class C30307a {
        private C30307a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static C30306fd m34173b(Class cls) {
            Class cls2 = cls;
            while (!Intrinsics.m17075f(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.m17074g(cls2);
            return new C30306fd(cls2);
        }

        public /* synthetic */ C30307a(int i) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public static C30230ed m34175a() {
            return C30306fd.f79044f;
        }
    }

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f79044f = new C30230ed();
    }

    public C30306fd(@NotNull Class<? super SSLSocket> sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f79046a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.f79047b = declaredMethod;
        this.f79048c = sslSocketClass.getMethod("setHostname", String.class);
        this.f79049d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f79050e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    /* renamed from: a */
    public final void mo27582a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends hi1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f79046a.isInstance(sslSocket)) {
            try {
                this.f79047b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f79048c.invoke(sslSocket, str);
                }
                Method method = this.f79050e;
                int i = qd1.f84303c;
                method.invoke(sslSocket, qd1.C31196a.m30393b(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    @Nullable
    /* renamed from: b */
    public final String mo27581b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f79046a.isInstance(sslSocket)) {
            try {
                byte[] bArr = (byte[]) this.f79049d.invoke(sslSocket, new Object[0]);
                if (bArr != null) {
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    return new String(bArr, UTF_8);
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (NullPointerException e2) {
                if (Intrinsics.m17075f(e2.getMessage(), "ssl == null")) {
                    return null;
                }
                throw e2;
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    /* renamed from: a */
    public final boolean mo27583a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f79046a.isInstance(sslSocket);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    /* renamed from: a */
    public final boolean mo27584a() {
        boolean z;
        z = C30012bd.f77265f;
        return z;
    }
}
