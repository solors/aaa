package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vx1 {
    @NotNull

    /* renamed from: a */
    public final hi1 f87017a;

    /* renamed from: b */
    public final int f87018b;
    @NotNull

    /* renamed from: c */
    public final String f87019c;

    /* renamed from: com.yandex.mobile.ads.impl.vx1$a */
    /* loaded from: classes8.dex */
    public static final class C31706a {
        @NotNull
        /* renamed from: a */
        public static vx1 m28126a(@NotNull String statusLine) throws IOException {
            boolean m16624M;
            boolean m16624M2;
            hi1 hi1Var;
            int i;
            String str;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            m16624M = StringsJVM.m16624M(statusLine, "HTTP/1.", false, 2, null);
            if (!m16624M) {
                m16624M2 = StringsJVM.m16624M(statusLine, "ICY ", false, 2, null);
                if (m16624M2) {
                    hi1Var = hi1.f80077d;
                    i = 4;
                } else {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            } else {
                i = 9;
                if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                    int charAt = statusLine.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            hi1Var = hi1.f80078e;
                        } else {
                            throw new ProtocolException("Unexpected status line: " + statusLine);
                        }
                    } else {
                        hi1Var = hi1.f80077d;
                    }
                } else {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            }
            int i2 = i + 3;
            if (statusLine.length() >= i2) {
                try {
                    String substring = statusLine.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    int parseInt = Integer.parseInt(substring);
                    if (statusLine.length() > i2) {
                        if (statusLine.charAt(i2) == ' ') {
                            str = statusLine.substring(i + 4);
                            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                        } else {
                            throw new ProtocolException("Unexpected status line: " + statusLine);
                        }
                    } else {
                        str = "";
                    }
                    return new vx1(hi1Var, parseInt, str);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            }
            throw new ProtocolException("Unexpected status line: " + statusLine);
        }
    }

    public vx1(@NotNull hi1 protocol, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f87017a = protocol;
        this.f87018b = i;
        this.f87019c = message;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f87017a == hi1.f80077d) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f87018b);
        sb2.append(' ');
        sb2.append(this.f87019c);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
