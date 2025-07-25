package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zc0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ad0 {
    @NotNull

    /* renamed from: a */
    private final BufferedSource f76764a;

    /* renamed from: b */
    private long f76765b;

    public ad0(@NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f76764a = source;
        this.f76765b = 262144L;
    }

    @NotNull
    /* renamed from: a */
    public final zc0 m35918a() {
        int m16568d0;
        zc0.C31971a c31971a = new zc0.C31971a();
        while (true) {
            String line = m35917b();
            if (line.length() == 0) {
                return c31971a.m26274a();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            m16568d0 = C37690r.m16568d0(line, ':', 1, false, 4, null);
            if (m16568d0 != -1) {
                String substring = line.substring(0, m16568d0);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String substring2 = line.substring(m16568d0 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                c31971a.m26272a(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                c31971a.m26272a("", substring3);
            } else {
                c31971a.m26272a("", line);
            }
        }
    }

    @NotNull
    /* renamed from: b */
    public final String m35917b() {
        String readUtf8LineStrict = this.f76764a.readUtf8LineStrict(this.f76765b);
        this.f76765b -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }
}
