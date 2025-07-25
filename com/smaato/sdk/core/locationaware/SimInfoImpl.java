package com.smaato.sdk.core.locationaware;

import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes7.dex */
public class SimInfoImpl implements SimInfo {

    /* renamed from: tm */
    private final TelephonyManager f71633tm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SimInfoImpl(Context context) {
        this.f71633tm = (TelephonyManager) context.getSystemService("phone");
    }

    @Override // com.smaato.sdk.core.locationaware.SimInfo
    public String getNetworkCountryIso() {
        return this.f71633tm.getNetworkCountryIso();
    }

    @Override // com.smaato.sdk.core.locationaware.SimInfo
    public String getSimCountryIso() {
        return this.f71633tm.getSimCountryIso();
    }
}
