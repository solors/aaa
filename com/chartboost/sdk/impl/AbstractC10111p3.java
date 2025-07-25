package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.chartboost.sdk.impl.p3 */
/* loaded from: classes3.dex */
public abstract class AbstractC10111p3 {
    /* renamed from: a */
    public static final NetworkInfo m80859a(Context context) {
        ConnectivityManager m80856b;
        Object m14549b;
        if (context == null || (m80856b = m80856b(context)) == null) {
            return null;
        }
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(m80856b.getActiveNetworkInfo());
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        Throwable m14546e = Result.m14546e(m14549b);
        if (m14546e != null) {
            C9763c7.m81923a("Cannot retrieve active network info", m14546e);
        }
        return Result.m14544g(m14549b) ? null : m14549b;
    }

    /* renamed from: b */
    public static final ConnectivityManager m80856b(Context context) {
        Object m14549b;
        ConnectivityManager connectivityManager = null;
        if (context == null) {
            return null;
        }
        try {
            Result.C38506a c38506a = Result.f101870c;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            m14549b = Result.m14549b((ConnectivityManager) systemService);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        Throwable m14546e = Result.m14546e(m14549b);
        if (m14546e != null) {
            C9763c7.m81923a("Cannot retrieve connectivity manager", m14546e);
        }
        if (!Result.m14544g(m14549b)) {
            connectivityManager = m14549b;
        }
        return connectivityManager;
    }

    /* renamed from: c */
    public static final boolean m80855c(Context context) {
        NetworkInfo m80859a = m80859a(context);
        if (m80859a != null && m80859a.isConnected() && m80859a.getType() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m80854d(Context context) {
        NetworkInfo m80859a = m80859a(context);
        NetworkCapabilities m80857a = m80857a(context, null, 1, null);
        if (m80857a != null) {
            return m80857a.hasCapability(16);
        }
        if (m80859a != null && m80859a.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m80853e(Context context) {
        NetworkInfo m80859a = m80859a(context);
        if (m80859a != null && m80859a.isConnected() && m80859a.getType() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final int m80852f(Context context) {
        NetworkInfo m80859a = m80859a(context);
        if (m80859a != null && m80859a.isConnected()) {
            return m80859a.getSubtype();
        }
        return 0;
    }

    /* renamed from: g */
    public static final EnumC10065n7 m80851g(Context context) {
        EnumC10065n7 enumC10065n7;
        NetworkInfo m80859a = m80859a(context);
        if (m80859a != null) {
            if (m80859a.isConnected()) {
                enumC10065n7 = m80860a(m80859a.getType(), m80859a.getSubtype());
            } else {
                enumC10065n7 = EnumC10065n7.f22647d;
            }
            if (enumC10065n7 != null) {
                return enumC10065n7;
            }
        }
        return EnumC10065n7.f22647d;
    }

    /* renamed from: a */
    public static final NetworkCapabilities m80858a(Context context, Network network) {
        ConnectivityManager m80856b;
        Object m14549b;
        if (context == null || (m80856b = m80856b(context)) == null) {
            return null;
        }
        try {
            Result.C38506a c38506a = Result.f101870c;
            if (network == null) {
                network = m80856b.getActiveNetwork();
            }
            m14549b = Result.m14549b(m80856b.getNetworkCapabilities(network));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        Throwable m14546e = Result.m14546e(m14549b);
        if (m14546e != null) {
            C9763c7.m81923a("Cannot retrieve network capabilities", m14546e);
        }
        return Result.m14544g(m14549b) ? null : m14549b;
    }

    /* renamed from: a */
    public static /* synthetic */ NetworkCapabilities m80857a(Context context, Network network, int i, Object obj) {
        if ((i & 1) != 0) {
            network = null;
        }
        return m80858a(context, network);
    }

    /* renamed from: a */
    public static final EnumC10065n7 m80860a(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                return EnumC10065n7.f22647d;
            }
            return EnumC10065n7.f22649f;
        } else if (i2 != 20) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return EnumC10065n7.f22651h;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return EnumC10065n7.f22652i;
                case 13:
                    return EnumC10065n7.f22653j;
                default:
                    return EnumC10065n7.f22650g;
            }
        } else {
            return EnumC10065n7.f22654k;
        }
    }
}
