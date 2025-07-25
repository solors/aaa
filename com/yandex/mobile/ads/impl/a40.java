package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import com.yandex.mobile.ads.impl.vt0;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class a40 extends xd1 {

    /* renamed from: d */
    public final int f76703d;
    @Nullable

    /* renamed from: e */
    public final String f76704e;

    /* renamed from: f */
    public final int f76705f;
    @Nullable

    /* renamed from: g */
    public final v90 f76706g;

    /* renamed from: h */
    public final int f76707h;
    @Nullable

    /* renamed from: i */
    public final rt0 f76708i;

    /* renamed from: j */
    final boolean f76709j;

    static {
        new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.mj2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return a40.m35968b(bundle);
            }
        };
    }

    private a40(int i, Throwable th, @Nullable int i2, int i3) {
        this(m35974a(i, null, null, -1, null, 4), th, i2, i, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    /* renamed from: a */
    public static a40 m35975a() {
        return new a40(m35974a(3, "Video load error occurred", null, -1, null, 4), null, 1001, 3, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    /* renamed from: b */
    public static /* synthetic */ a40 m35968b(Bundle bundle) {
        return new a40(bundle);
    }

    private a40(Bundle bundle) {
        super(bundle);
        this.f76703d = bundle.getInt(xd1.m27559a(1001), 2);
        this.f76704e = bundle.getString(xd1.m27559a(1002));
        this.f76705f = bundle.getInt(xd1.m27559a(1003), -1);
        Bundle bundle2 = bundle.getBundle(xd1.m27559a(1004));
        this.f76706g = bundle2 == null ? null : v90.f86604I.fromBundle(bundle2);
        this.f76707h = bundle.getInt(xd1.m27559a(1005), 4);
        this.f76709j = bundle.getBoolean(xd1.m27559a(1006), false);
        this.f76708i = null;
    }

    /* renamed from: a */
    public static a40 m35971a(Exception exc, String str, int i, @Nullable v90 v90Var, int i2, boolean z, int i3) {
        int i4 = v90Var == null ? 4 : i2;
        return new a40(m35974a(1, null, str, i, v90Var, i4), exc, i3, 1, str, i, v90Var, i4, null, SystemClock.elapsedRealtime(), z);
    }

    @Deprecated
    /* renamed from: a */
    public static a40 m35970a(IllegalStateException illegalStateException) {
        return new a40(2, illegalStateException, 1000, 0);
    }

    /* renamed from: a */
    private static String m35974a(int i, @Nullable String str, @Nullable String str2, int i2, @Nullable v90 v90Var, int i3) {
        String str3;
        String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i2);
            sb2.append(", format=");
            sb2.append(v90Var);
            sb2.append(", format_supported=");
            int i4 = y32.f88010a;
            if (i3 == 0) {
                str4 = "NO";
            } else if (i3 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i3 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i3 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i3 != 4) {
                throw new IllegalStateException();
            } else {
                str4 = "YES";
            }
            sb2.append(str4);
            str3 = sb2.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    private a40(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable v90 v90Var, int i4, @Nullable vt0.C31682b c31682b, long j, boolean z) {
        super(str, th, i, j);
        boolean z2 = false;
        C30937nf.m31567a(!z || i2 == 1);
        C30937nf.m31567a((th != null || i2 == 3) ? true : z2);
        this.f76703d = i2;
        this.f76704e = str2;
        this.f76705f = i3;
        this.f76706g = v90Var;
        this.f76707h = i4;
        this.f76708i = c31682b;
        this.f76709j = z;
    }

    /* renamed from: a */
    public static a40 m35972a(IOException iOException, int i) {
        return new a40(0, iOException, i, 0);
    }

    /* renamed from: a */
    public static a40 m35969a(RuntimeException runtimeException, int i) {
        return new a40(2, runtimeException, i, 0);
    }

    @CheckResult
    /* renamed from: a */
    public final a40 m35973a(@Nullable vt0.C31682b c31682b) {
        String message = getMessage();
        int i = y32.f88010a;
        return new a40(message, getCause(), this.f87651b, this.f76703d, this.f76704e, this.f76705f, this.f76706g, this.f76707h, c31682b, this.f87652c, this.f76709j);
    }
}
