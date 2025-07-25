package p763kf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Protocol;
import p747jf.C37347b;
import p747jf.C37357h;
import p763kf.DeferredSocketAdapter;

@Metadata
/* renamed from: kf.f */
/* loaded from: classes10.dex */
public class AndroidSocketAdapter implements SocketAdapter {
    @NotNull

    /* renamed from: f */
    public static final C37518a f99185f;
    @NotNull

    /* renamed from: g */
    private static final DeferredSocketAdapter.InterfaceC37525a f99186g;
    @NotNull

    /* renamed from: a */
    private final Class<? super SSLSocket> f99187a;
    @NotNull

    /* renamed from: b */
    private final Method f99188b;

    /* renamed from: c */
    private final Method f99189c;

    /* renamed from: d */
    private final Method f99190d;

    /* renamed from: e */
    private final Method f99191e;

    /* compiled from: AndroidSocketAdapter.kt */
    @Metadata
    /* renamed from: kf.f$a */
    /* loaded from: classes10.dex */
    public static final class C37518a {

        /* compiled from: AndroidSocketAdapter.kt */
        @Metadata
        /* renamed from: kf.f$a$a */
        /* loaded from: classes10.dex */
        public static final class C37519a implements DeferredSocketAdapter.InterfaceC37525a {

            /* renamed from: a */
            final /* synthetic */ String f99192a;

            C37519a(String str) {
                this.f99192a = str;
            }

            @Override // p763kf.DeferredSocketAdapter.InterfaceC37525a
            /* renamed from: a */
            public boolean mo17639a(@NotNull SSLSocket sslSocket) {
                boolean m16624M;
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                m16624M = StringsJVM.m16624M(name, Intrinsics.m17064q(this.f99192a, "."), false, 2, null);
                return m16624M;
            }

            @Override // p763kf.DeferredSocketAdapter.InterfaceC37525a
            @NotNull
            /* renamed from: b */
            public SocketAdapter mo17638b(@NotNull SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return AndroidSocketAdapter.f99185f.m17650b(sslSocket.getClass());
            }
        }

        private C37518a() {
        }

        public /* synthetic */ C37518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final AndroidSocketAdapter m17650b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && !Intrinsics.m17075f(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError(Intrinsics.m17064q("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            Intrinsics.m17074g(cls2);
            return new AndroidSocketAdapter(cls2);
        }

        @NotNull
        /* renamed from: c */
        public final DeferredSocketAdapter.InterfaceC37525a m17649c(@NotNull String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C37519a(packageName);
        }

        @NotNull
        /* renamed from: d */
        public final DeferredSocketAdapter.InterfaceC37525a m17648d() {
            return AndroidSocketAdapter.f99186g;
        }
    }

    static {
        C37518a c37518a = new C37518a(null);
        f99185f = c37518a;
        f99186g = c37518a.m17649c("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(@NotNull Class<? super SSLSocket> sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f99187a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f99188b = declaredMethod;
        this.f99189c = sslSocketClass.getMethod("setHostname", String.class);
        this.f99190d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f99191e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p763kf.SocketAdapter
    /* renamed from: a */
    public boolean mo17637a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f99187a.isInstance(sslSocket);
    }

    @Override // p763kf.SocketAdapter
    @Nullable
    /* renamed from: b */
    public String mo17636b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!mo17637a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f99190d.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, Charsets.UTF_8);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.m17075f(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // p763kf.SocketAdapter
    /* renamed from: c */
    public void mo17635c(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo17637a(sslSocket)) {
            try {
                this.f99188b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f99189c.invoke(sslSocket, str);
                }
                this.f99191e.invoke(sslSocket, C37357h.f98616a.m18322c(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // p763kf.SocketAdapter
    public boolean isSupported() {
        return C37347b.f98589f.m18358b();
    }
}
