package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;

/* loaded from: classes8.dex */
public class xd1 extends Exception implements InterfaceC30632jl {

    /* renamed from: b */
    public final int f87651b;

    /* renamed from: c */
    public final long f87652c;

    static {
        new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.r03
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return new xd1(bundle);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public xd1(Bundle bundle) {
        this(bundle.getString(m27559a(2)), m27558a(bundle), bundle.getInt(m27559a(0), 1000), bundle.getLong(m27559a(1), SystemClock.elapsedRealtime()));
    }

    @Nullable
    /* renamed from: a */
    private static Throwable m27558a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, xd1.class.getClassLoader());
            Throwable th = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th == null ? new RemoteException(string2) : th;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public xd1(@Nullable String str, @Nullable Throwable th, int i, long j) {
        super(str, th);
        this.f87651b = i;
        this.f87652c = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static String m27559a(int i) {
        return Integer.toString(i, 36);
    }
}
