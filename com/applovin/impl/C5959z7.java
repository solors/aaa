package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.InterfaceC5044o2;
import java.io.IOException;

/* renamed from: com.applovin.impl.z7 */
/* loaded from: classes2.dex */
public final class C5959z7 extends C5011nh {

    /* renamed from: l */
    public static final InterfaceC5044o2.InterfaceC5045a f12509l = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.i90
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C5959z7.m92470c(bundle);
        }
    };

    /* renamed from: d */
    public final int f12510d;

    /* renamed from: f */
    public final String f12511f;

    /* renamed from: g */
    public final int f12512g;

    /* renamed from: h */
    public final C4310e9 f12513h;

    /* renamed from: i */
    public final int f12514i;

    /* renamed from: j */
    public final C5844xd f12515j;

    /* renamed from: k */
    final boolean f12516k;

    private C5959z7(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    /* renamed from: a */
    public static C5959z7 m92471a(Throwable th, String str, int i, C4310e9 c4310e9, int i2, boolean z, int i3) {
        return new C5959z7(1, th, null, i3, str, i, c4310e9, c4310e9 == null ? 4 : i2, z);
    }

    /* renamed from: c */
    public static /* synthetic */ C5959z7 m92470c(Bundle bundle) {
        return new C5959z7(bundle);
    }

    private C5959z7(int i, Throwable th, String str, int i2, String str2, int i3, C4310e9 c4310e9, int i4, boolean z) {
        this(m92476a(i, str, str2, i3, c4310e9, i4), th, i2, i, str2, i3, c4310e9, i4, null, SystemClock.elapsedRealtime(), z);
    }

    /* renamed from: a */
    public static C5959z7 m92473a(RuntimeException runtimeException) {
        return m92472a(runtimeException, 1000);
    }

    /* renamed from: a */
    private static String m92476a(int i, String str, String str2, int i2, C4310e9 c4310e9, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + c4310e9 + ", format_supported=" + AbstractC5538t2.m94553b(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    private C5959z7(Bundle bundle) {
        super(bundle);
        this.f12510d = bundle.getInt(C5011nh.m96967b(1001), 2);
        this.f12511f = bundle.getString(C5011nh.m96967b(1002));
        this.f12512g = bundle.getInt(C5011nh.m96967b(1003), -1);
        this.f12513h = (C4310e9) AbstractC5102p2.m96602a(C4310e9.f5794I, bundle.getBundle(C5011nh.m96967b(1004)));
        this.f12514i = bundle.getInt(C5011nh.m96967b(1005), 4);
        this.f12516k = bundle.getBoolean(C5011nh.m96967b(1006), false);
        this.f12515j = null;
    }

    /* renamed from: a */
    public static C5959z7 m92474a(IOException iOException, int i) {
        return new C5959z7(0, iOException, i);
    }

    /* renamed from: a */
    public static C5959z7 m92472a(RuntimeException runtimeException, int i) {
        return new C5959z7(2, runtimeException, i);
    }

    /* renamed from: a */
    public C5959z7 m92475a(C5844xd c5844xd) {
        return new C5959z7((String) AbstractC5863xp.m93017a((Object) getMessage()), getCause(), this.f8586a, this.f12510d, this.f12511f, this.f12512g, this.f12513h, this.f12514i, c5844xd, this.f8587b, this.f12516k);
    }

    private C5959z7(String str, Throwable th, int i, int i2, String str2, int i3, C4310e9 c4310e9, int i4, C5844xd c5844xd, long j, boolean z) {
        super(str, th, i, j);
        boolean z2 = false;
        AbstractC4100b1.m100580a(!z || i2 == 1);
        AbstractC4100b1.m100580a((th != null || i2 == 3) ? true : z2);
        this.f12510d = i2;
        this.f12511f = str2;
        this.f12512g = i3;
        this.f12513h = c4310e9;
        this.f12514i = i4;
        this.f12515j = c5844xd;
        this.f12516k = z;
    }
}
