package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresApi;
import com.moloco.sdk.internal.services.AbstractC24350f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.b */
/* loaded from: classes7.dex */
public final class C24251b implements InterfaceC24355g0 {
    @NotNull

    /* renamed from: a */
    public final Context f62805a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC24328d0 f62806b;

    public C24251b(@NotNull Context context, @NotNull InterfaceC24328d0 deviceInfoService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        this.f62805a = context;
        this.f62806b = deviceInfoService;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24355g0
    /* renamed from: a */
    public boolean mo46543a() {
        Object systemService = this.f62805a.getSystemService("connectivity");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return m46716d((ConnectivityManager) systemService);
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24355g0
    @Nullable
    /* renamed from: b */
    public Integer mo46542b() {
        Object systemService = this.f62805a.getSystemService("phone");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(networkOperator, "networkOperator");
        String substring = networkOperator.substring(3);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return Integer.valueOf(Integer.parseInt(substring));
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24355g0
    @NotNull
    /* renamed from: c */
    public AbstractC24350f0 mo46541c() {
        Object systemService = this.f62805a.getSystemService("connectivity");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return m46717b((ConnectivityManager) systemService);
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24355g0
    @Nullable
    /* renamed from: d */
    public Integer mo46540d() {
        Object systemService = this.f62805a.getSystemService("phone");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(networkOperator, "networkOperator");
        String substring = networkOperator.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return Integer.valueOf(Integer.parseInt(substring));
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24355g0
    @NotNull
    public AbstractC24350f0 invoke() {
        return mo46541c();
    }

    @RequiresApi(23)
    /* renamed from: b */
    public final AbstractC24350f0 m46717b(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        if (connectivityManager.getActiveNetwork() != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            return networkCapabilities.hasTransport(1) ? AbstractC24350f0.C24353c.f63049a : networkCapabilities.hasTransport(0) ? new AbstractC24350f0.C24351a(this.f62806b.invoke().m46611e()) : AbstractC24350f0.C24352b.f63048a;
        }
        return AbstractC24350f0.C24352b.f63048a;
    }

    @RequiresApi(24)
    /* renamed from: d */
    public final boolean m46716d(ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus() == 3;
    }
}
