package p747jf;

import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Protocol;

@Metadata
/* renamed from: jf.e */
/* loaded from: classes10.dex */
public final class Jdk8WithJettyBootPlatform extends C37357h {
    @NotNull

    /* renamed from: i */
    public static final C37354b f98602i = new C37354b(null);
    @NotNull

    /* renamed from: d */
    private final Method f98603d;
    @NotNull

    /* renamed from: e */
    private final Method f98604e;
    @NotNull

    /* renamed from: f */
    private final Method f98605f;
    @NotNull

    /* renamed from: g */
    private final Class<?> f98606g;
    @NotNull

    /* renamed from: h */
    private final Class<?> f98607h;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    @Metadata
    /* renamed from: jf.e$a */
    /* loaded from: classes10.dex */
    private static final class C37353a implements InvocationHandler {
        @NotNull

        /* renamed from: a */
        private final List<String> f98608a;

        /* renamed from: b */
        private boolean f98609b;
        @Nullable

        /* renamed from: c */
        private String f98610c;

        public C37353a(@NotNull List<String> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.f98608a = protocols;
        }

        @Nullable
        /* renamed from: a */
        public final String m18350a() {
            return this.f98610c;
        }

        /* renamed from: b */
        public final boolean m18349b() {
            return this.f98609b;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] objArr) throws Throwable {
            boolean z;
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.m17075f(name, "supports") && Intrinsics.m17075f(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.m17075f(name, "unsupported") && Intrinsics.m17075f(Void.TYPE, returnType)) {
                this.f98609b = true;
                return null;
            }
            if (Intrinsics.m17075f(name, "protocols")) {
                if (objArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return this.f98608a;
                }
            }
            if ((Intrinsics.m17075f(name, "selectProtocol") || Intrinsics.m17075f(name, "select")) && Intrinsics.m17075f(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj != null) {
                        List list = (List) obj;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                Object obj2 = list.get(i);
                                if (obj2 != null) {
                                    String str = (String) obj2;
                                    if (this.f98608a.contains(str)) {
                                        this.f98610c = str;
                                        return str;
                                    } else if (i == size) {
                                        break;
                                    } else {
                                        i = i2;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = this.f98608a.get(0);
                        this.f98610c = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((Intrinsics.m17075f(name, "protocolSelected") || Intrinsics.m17075f(name, "selected")) && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    this.f98610c = (String) obj3;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    @Metadata
    /* renamed from: jf.e$b */
    /* loaded from: classes10.dex */
    public static final class C37354b {
        private C37354b() {
        }

        public /* synthetic */ C37354b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final C37357h m18348a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(Intrinsics.m17064q("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> clientProviderClass = Class.forName(Intrinsics.m17064q("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> serverProviderClass = Class.forName(Intrinsics.m17064q("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod(KiwiConstants.f2714as, SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public Jdk8WithJettyBootPlatform(@NotNull Method putMethod, @NotNull Method getMethod, @NotNull Method removeMethod, @NotNull Class<?> clientProviderClass, @NotNull Class<?> serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f98603d = putMethod;
        this.f98604e = getMethod;
        this.f98605f = removeMethod;
        this.f98606g = clientProviderClass;
        this.f98607h = serverProviderClass;
    }

    @Override // p747jf.C37357h
    /* renamed from: b */
    public void mo18340b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f98605f.invoke(null, sslSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // p747jf.C37357h
    /* renamed from: e */
    public void mo18337e(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            this.f98603d.invoke(null, sslSocket, Proxy.newProxyInstance(C37357h.class.getClassLoader(), new Class[]{this.f98606g, this.f98607h}, new C37353a(C37357h.f98616a.m18323b(protocols))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // p747jf.C37357h
    @Nullable
    /* renamed from: i */
    public String mo18333i(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f98604e.invoke(null, sslSocket));
            if (invocationHandler != null) {
                C37353a c37353a = (C37353a) invocationHandler;
                if (!c37353a.m18349b() && c37353a.m18350a() == null) {
                    C37357h.m18329m(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (c37353a.m18349b()) {
                    return null;
                } else {
                    return c37353a.m18350a();
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
