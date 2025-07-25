package com.fyber.inneractive.sdk.config.cellular;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.EnumC15433Y;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.fyber.inneractive.sdk.config.cellular.b */
/* loaded from: classes4.dex */
public final class C14337b extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a */
    public final ExecutorService f27151a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public InterfaceC14343h f27152b;

    /* renamed from: c */
    public final TelephonyManager f27153c;

    public C14337b(TelephonyManager telephonyManager, InterfaceC14343h interfaceC14343h) {
        this.f27153c = telephonyManager;
        this.f27152b = interfaceC14343h;
    }

    /* renamed from: a */
    public final void m77983a() {
        this.f27152b = null;
        TelephonyManager telephonyManager = this.f27153c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
        this.f27151a.shutdownNow();
    }

    /* renamed from: b */
    public final void m77982b() {
        TelephonyManager telephonyManager = this.f27153c;
        if (telephonyManager != null) {
            telephonyManager.registerTelephonyCallback(this.f27151a, this);
        }
    }

    /* renamed from: c */
    public final void m77981c() {
        TelephonyManager telephonyManager = this.f27153c;
        if (telephonyManager != null) {
            telephonyManager.unregisterTelephonyCallback(this);
        }
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int networkType;
        int overrideNetworkType;
        EnumC15433Y enumC15433Y;
        networkType = telephonyDisplayInfo.getNetworkType();
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType != 2 && overrideNetworkType != 3 && overrideNetworkType != 5) {
            if (networkType != 0) {
                if (networkType != 3) {
                    if (networkType != 18) {
                        if (networkType != 20) {
                            if (networkType != 5 && networkType != 6) {
                                switch (networkType) {
                                    default:
                                        switch (networkType) {
                                            case 12:
                                            case 14:
                                            case 15:
                                                break;
                                            case 13:
                                                enumC15433Y = EnumC15433Y.MOBILE_4G;
                                                break;
                                            default:
                                                enumC15433Y = EnumC15433Y.CELLULAR;
                                                break;
                                        }
                                    case 8:
                                    case 9:
                                    case 10:
                                        enumC15433Y = EnumC15433Y.MOBILE_3G;
                                        break;
                                }
                            }
                        } else {
                            enumC15433Y = EnumC15433Y.MOBILE_5G;
                        }
                    } else {
                        enumC15433Y = EnumC15433Y.WIFI;
                    }
                }
                enumC15433Y = EnumC15433Y.MOBILE_3G;
            } else {
                enumC15433Y = EnumC15433Y.UNKNOWN;
            }
        } else {
            enumC15433Y = EnumC15433Y.MOBILE_5G;
        }
        InterfaceC14343h interfaceC14343h = this.f27152b;
        if (interfaceC14343h != null) {
            interfaceC14343h.mo77973a(enumC15433Y);
        }
    }
}
