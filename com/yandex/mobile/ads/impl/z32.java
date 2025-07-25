package com.yandex.mobile.ads.impl;

import com.google.common.net.HttpHeaders;
import com.ironsource.C21114v8;
import com.yandex.mobile.ads.impl.m30;
import com.yandex.mobile.ads.impl.nf0;
import com.yandex.mobile.ads.impl.ql1;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.zc0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.C37598c;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Regex;
import kotlin.text.StringsJVM;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C39200e;
import okio.C39208h;
import okio.Options;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38497f;

/* loaded from: classes8.dex */
public final class z32 {
    @NotNull

    /* renamed from: a */
    public static final byte[] f88697a;
    @NotNull

    /* renamed from: b */
    public static final zc0 f88698b = zc0.C31972b.m26267a(new String[0]);
    @NotNull

    /* renamed from: c */
    public static final pm1 f88699c;
    @NotNull

    /* renamed from: d */
    public static final TimeZone f88700d;
    @NotNull

    /* renamed from: e */
    private static final Regex f88701e;

    /* renamed from: f */
    public static final boolean f88702f;
    @NotNull

    /* renamed from: g */
    public static final String f88703g;

    static {
        String m16547v0;
        String m16546w0;
        byte[] bArr = new byte[0];
        f88697a = bArr;
        f88699c = qm1.C31222a.m30261a(bArr);
        ql1.C31220a.m30274a(bArr);
        Options.C39220a c39220a = Options.f102982d;
        C39208h.C39209a c39209a = C39208h.f102952f;
        c39220a.m13473d(c39209a.m13549b("efbbbf"), c39209a.m13549b("feff"), c39209a.m13549b("fffe"), c39209a.m13549b("0000ffff"), c39209a.m13549b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.m17074g(timeZone);
        f88700d = timeZone;
        f88701e = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f88702f = false;
        String name = ja1.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        m16547v0 = C37690r.m16547v0(name, "com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttplib.");
        m16546w0 = C37690r.m16546w0(m16547v0, "Client");
        f88703g = m16546w0;
    }

    /* renamed from: a */
    public static final int m26430a(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public static final int m26429a(char c) {
        if ('0' > c || c >= ':') {
            if ('a' > c || c >= 'g') {
                if ('A' > c || c >= 'G') {
                    return -1;
                }
                return c - '7';
            }
            return c - 'W';
        }
        return c - '0';
    }

    /* renamed from: c */
    public static final boolean m26395c(@NotNull String name) {
        boolean m16615y;
        boolean m16615y2;
        boolean m16615y3;
        boolean m16615y4;
        Intrinsics.checkNotNullParameter(name, "name");
        m16615y = StringsJVM.m16615y(name, "Authorization", true);
        if (m16615y) {
            return true;
        }
        m16615y2 = StringsJVM.m16615y(name, "Cookie", true);
        if (m16615y2) {
            return true;
        }
        m16615y3 = StringsJVM.m16615y(name, HttpHeaders.PROXY_AUTHORIZATION, true);
        if (m16615y3) {
            return true;
        }
        m16615y4 = StringsJVM.m16615y(name, "Set-Cookie", true);
        return m16615y4;
    }

    /* renamed from: a */
    public static final int m26403a(short s) {
        return s & 65535;
    }

    /* renamed from: b */
    public static final int m26400b(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static final long m26428a(int i) {
        return i & 2147483647L;
    }

    /* renamed from: a */
    public static final void m26409a(@NotNull ArrayList arrayList, Object obj) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.contains(obj)) {
            return;
        }
        arrayList.add(obj);
    }

    @NotNull
    /* renamed from: b */
    public static final String[] m26396b(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    /* renamed from: a */
    public static final m30.InterfaceC30828b m26423a(@NotNull final m30.C30827a c30827a) {
        Intrinsics.checkNotNullParameter(c30827a, "<this>");
        return new m30.InterfaceC30828b() { // from class: com.yandex.mobile.ads.impl.p13
            @Override // com.yandex.mobile.ads.impl.m30.InterfaceC30828b
            /* renamed from: a */
            public final m30 mo30854a(InterfaceC30865mm interfaceC30865mm) {
                m30 m26422a;
                m26422a = z32.m26422a(c30827a, interfaceC30865mm);
                return m26422a;
            }
        };
    }

    /* renamed from: a */
    public static final m30 m26422a(m30 this_asFactory, InterfaceC30865mm it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    /* renamed from: a */
    public static final boolean m26417a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f88701e.m16766e(str);
    }

    /* renamed from: a */
    public static final int m26424a(long j, @Nullable TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter("timeout", "name");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalStateException(("timeout < 0").toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(("timeout too large.").toString());
            } else if (millis != 0 || i <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(("timeout too small.").toString());
            }
        } else {
            throw new IllegalStateException("unit == null".toString());
        }
    }

    @NotNull
    /* renamed from: b */
    public static final <T> List<T> m26397b(@NotNull List<? extends T> list) {
        List m17550c1;
        Intrinsics.checkNotNullParameter(list, "<this>");
        m17550c1 = _Collections.m17550c1(list);
        List<T> unmodifiableList = Collections.unmodifiableList(m17550c1);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    /* renamed from: a */
    public static final void m26419a(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m26411a(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!Intrinsics.m17075f(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final int m26426a(int i, int i2, @NotNull String str, @NotNull String delimiters) {
        boolean m16594Q;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i2) {
            m16594Q = C37690r.m16594Q(delimiters, str.charAt(i), false, 2, null);
            if (m16594Q) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static final int m26416a(@NotNull String str, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    @NotNull
    /* renamed from: a */
    public static final String m26412a(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        C37612s0 c37612s0 = C37612s0.f99333a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    /* renamed from: a */
    public static final boolean m26401a(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator m17055a = C37598c.m17055a(strArr2);
                while (m17055a.hasNext()) {
                    if (comparator.compare(str, (String) m17055a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final long m26421a(@NotNull mm1 mm1Var) {
        Intrinsics.checkNotNullParameter(mm1Var, "<this>");
        String m26279a = mm1Var.m31923g().m26279a("Content-Length");
        if (m26279a != null) {
            Intrinsics.checkNotNullParameter(m26279a, "<this>");
            try {
                return Long.parseLong(m26279a);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    @SafeVarargs
    @NotNull
    /* renamed from: a */
    public static final <T> List<T> m26402a(@NotNull T... elements) {
        List m17163p;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        m17163p = C37563v.m17163p(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(m17163p);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    /* renamed from: a */
    public static final int m26427a(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static final boolean m26410a(@NotNull Socket socket, @NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !source.exhausted();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: a */
    public static final int m26404a(@NotNull BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* renamed from: a */
    public static final int m26406a(@NotNull C39200e c39200e) {
        Intrinsics.checkNotNullParameter(c39200e, "<this>");
        int i = 0;
        while (!c39200e.exhausted() && c39200e.m13590m(0L) == 61) {
            i++;
            c39200e.readByte();
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x006d, code lost:
        if (r5 != Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x006f, code lost:
        r11.timeout().clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0077, code lost:
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x007f, code lost:
        return r13;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m26407a(@org.jetbrains.annotations.NotNull okio.Source r11, int r12, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            long r0 = java.lang.System.nanoTime()
            okio.c1 r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            okio.c1 r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            okio.c1 r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.e r12 = new okio.e     // Catch: java.lang.Throwable -> L54 java.io.InterruptedIOException -> L6a
            r12.<init>()     // Catch: java.lang.Throwable -> L54 java.io.InterruptedIOException -> L6a
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L54 java.io.InterruptedIOException -> L6a
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.m13597b()     // Catch: java.lang.Throwable -> L54 java.io.InterruptedIOException -> L6a
            goto L3e
        L4e:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r13 = 1
            if (r12 != 0) goto L77
            goto L6f
        L54:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L61
            okio.c1 r11 = r11.timeout()
            r11.clearDeadline()
            goto L69
        L61:
            okio.c1 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L69:
            throw r12
        L6a:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r13 = 0
            if (r12 != 0) goto L77
        L6f:
            okio.c1 r11 = r11.timeout()
            r11.clearDeadline()
            goto L7f
        L77:
            okio.c1 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L7f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.z32.m26407a(okio.b1, int, java.util.concurrent.TimeUnit):boolean");
    }

    @NotNull
    /* renamed from: a */
    public static final ThreadFactory m26414a(@NotNull final String name, final boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: com.yandex.mobile.ads.impl.o13
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m26413a;
                m26413a = z32.m26413a(name, z, runnable);
                return m26413a;
            }
        };
    }

    /* renamed from: a */
    public static final Thread m26413a(String name, boolean z, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z);
        return thread;
    }

    @NotNull
    /* renamed from: a */
    public static final zc0 m26408a(@NotNull List<uc0> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        zc0.C31971a c31971a = new zc0.C31971a();
        for (uc0 uc0Var : list) {
            c31971a.m26272a(uc0Var.f86205a.m13566H(), uc0Var.f86206b.m13566H());
        }
        return c31971a.m26274a();
    }

    @NotNull
    /* renamed from: a */
    public static final String m26420a(@NotNull nf0 nf0Var, boolean z) {
        boolean m16592R;
        String m31559g;
        Intrinsics.checkNotNullParameter(nf0Var, "<this>");
        m16592R = C37690r.m16592R(nf0Var.m31559g(), ":", false, 2, null);
        if (m16592R) {
            m31559g = C21114v8.C21123i.f54137d + nf0Var.m31559g() + C21114v8.C21123i.f54139e;
        } else {
            m31559g = nf0Var.m31559g();
        }
        if (z || nf0Var.m31557i() != nf0.C30940b.m31532a(nf0Var.m31555k())) {
            return m31559g + ":" + nf0Var.m31557i();
        }
        return m31559g;
    }

    /* renamed from: a */
    public static final int m26425a(int i, @Nullable String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    @NotNull
    /* renamed from: a */
    public static final Exception m26418a(@NotNull IOException iOException, @NotNull List suppressed) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.getClass();
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            C38497f.m14566a(iOException, (Exception) it.next());
        }
        return iOException;
    }

    /* renamed from: a */
    public static final void m26405a(@NotNull BufferedSink bufferedSink, int i) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }
}
