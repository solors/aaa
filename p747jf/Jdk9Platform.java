package p747jf;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Protocol;

@Metadata
/* renamed from: jf.f */
/* loaded from: classes10.dex */
public class Jdk9Platform extends C37357h {
    @NotNull

    /* renamed from: d */
    public static final C37355a f98611d = new C37355a(null);

    /* renamed from: e */
    private static final boolean f98612e;

    /* compiled from: Jdk9Platform.kt */
    @Metadata
    /* renamed from: jf.f$a */
    /* loaded from: classes10.dex */
    public static final class C37355a {
        private C37355a() {
        }

        public /* synthetic */ C37355a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final Jdk9Platform m18346a() {
            if (m18345b()) {
                return new Jdk9Platform();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m18345b() {
            return Jdk9Platform.f98612e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r1.intValue() >= 9) goto L9;
     */
    static {
        /*
            jf.f$a r0 = new jf.f$a
            r1 = 0
            r0.<init>(r1)
            p747jf.Jdk9Platform.f98611d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L11
            goto L15
        L11:
            java.lang.Integer r1 = kotlin.text.C37686h.m16673m(r0)
        L15:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L24
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L22
            goto L2d
        L22:
            r0 = r2
            goto L2d
        L24:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L22
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L22
        L2d:
            p747jf.Jdk9Platform.f98612e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p747jf.Jdk9Platform.<clinit>():void");
    }

    @Override // p747jf.C37357h
    /* renamed from: e */
    public void mo18337e(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Object[] array = C37357h.f98616a.m18323b(protocols).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // p747jf.C37357h
    @Nullable
    /* renamed from: i */
    public String mo18333i(@NotNull SSLSocket sslSocket) {
        String applicationProtocol;
        boolean m17075f;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                m17075f = true;
            } else {
                m17075f = Intrinsics.m17075f(applicationProtocol, "");
            }
            if (m17075f) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
