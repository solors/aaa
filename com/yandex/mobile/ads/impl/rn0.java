package com.yandex.mobile.ads.impl;

import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rn0 extends qd1 {
    @NotNull

    /* renamed from: d */
    private final Method f84829d;
    @NotNull

    /* renamed from: e */
    private final Method f84830e;
    @NotNull

    /* renamed from: f */
    private final Method f84831f;
    @NotNull

    /* renamed from: g */
    private final Class<?> f84832g;
    @NotNull

    /* renamed from: h */
    private final Class<?> f84833h;

    /* renamed from: com.yandex.mobile.ads.impl.rn0$a */
    /* loaded from: classes8.dex */
    private static final class C31301a implements InvocationHandler {
        @NotNull

        /* renamed from: a */
        private final List<String> f84834a;

        /* renamed from: b */
        private boolean f84835b;
        @Nullable

        /* renamed from: c */
        private String f84836c;

        public C31301a(@NotNull ArrayList protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.f84834a = protocols;
        }

        @Nullable
        /* renamed from: a */
        public final String m29979a() {
            return this.f84836c;
        }

        /* renamed from: b */
        public final boolean m29978b() {
            return this.f84835b;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(@NotNull Object proxy, @NotNull Method method, @Nullable Object[] objArr) throws Throwable {
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
                this.f84835b = true;
                return null;
            } else if (Intrinsics.m17075f(name, "protocols") && objArr.length == 0) {
                return this.f84834a;
            } else {
                if ((Intrinsics.m17075f(name, "selectProtocol") || Intrinsics.m17075f(name, "select")) && Intrinsics.m17075f(String.class, returnType) && objArr.length == 1) {
                    Object obj = objArr[0];
                    if (obj instanceof List) {
                        Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list = (List) obj;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj2 = list.get(i);
                                Intrinsics.m17073h(obj2, "null cannot be cast to non-null type kotlin.String");
                                String str = (String) obj2;
                                if (this.f84834a.contains(str)) {
                                    this.f84836c = str;
                                    return str;
                                } else if (i == size) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        String str2 = this.f84834a.get(0);
                        this.f84836c = str2;
                        return str2;
                    }
                }
                if ((Intrinsics.m17075f(name, "protocolSelected") || Intrinsics.m17075f(name, "selected")) && objArr.length == 1) {
                    Object obj3 = objArr[0];
                    Intrinsics.m17073h(obj3, "null cannot be cast to non-null type kotlin.String");
                    this.f84836c = (String) obj3;
                    return null;
                }
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rn0$b */
    /* loaded from: classes8.dex */
    public static final class C31302b {
        @Nullable
        /* renamed from: a */
        public static rn0 m29977a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.m17074g(property);
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod(KiwiConstants.f2714as, SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                Intrinsics.m17074g(method);
                Intrinsics.m17074g(method2);
                Intrinsics.m17074g(method3);
                Intrinsics.m17074g(cls3);
                Intrinsics.m17074g(cls4);
                return new rn0(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public rn0(@NotNull Method putMethod, @NotNull Method getMethod, @NotNull Method removeMethod, @NotNull Class<?> clientProviderClass, @NotNull Class<?> serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f84829d = putMethod;
        this.f84830e = getMethod;
        this.f84831f = removeMethod;
        this.f84832g = clientProviderClass;
        this.f84833h = serverProviderClass;
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    /* renamed from: a */
    public final void mo29980a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f84831f.invoke(null, sslSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    @Nullable
    /* renamed from: b */
    public final String mo27986b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f84830e.invoke(null, sslSocket));
            Intrinsics.m17073h(invocationHandler, "null cannot be cast to non-null type com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            C31301a c31301a = (C31301a) invocationHandler;
            if (!c31301a.m29978b() && c31301a.m29979a() == null) {
                qd1.m30403a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (c31301a.m29978b()) {
                return null;
            } else {
                return c31301a.m29979a();
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    /* renamed from: a */
    public final void mo27988a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends hi1> protocols) {
        int m17154x;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((hi1) obj) != hi1.f80077d) {
                arrayList.add(obj);
            }
        }
        m17154x = C37566w.m17154x(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m17154x);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((hi1) it.next()).toString());
        }
        try {
            this.f84829d.invoke(null, sslSocket, Proxy.newProxyInstance(qd1.class.getClassLoader(), new Class[]{this.f84832g, this.f84833h}, new C31301a(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }
}
