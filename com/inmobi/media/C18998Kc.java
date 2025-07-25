package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.ironsource.C20747r8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;

/* renamed from: com.inmobi.media.Kc */
/* loaded from: classes6.dex */
public final class C18998Kc extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        boolean z;
        boolean m16616x;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context context2 = C19012Lc.f47447b;
        if (context2 != null) {
            obj = context2.getSystemService(C20747r8.f52730b);
        } else {
            obj = null;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        C19012Lc.f47446a.m60920a();
        List<ScanResult> scanResults = ((WifiManager) obj).getScanResults();
        if ((C19037Na.m60852a().getWifiFlag() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        ArrayList arrayList = new ArrayList();
        if (scanResults != null) {
            for (ScanResult scanResult : scanResults) {
                String str = scanResult.SSID;
                if (z2 && str != null) {
                    m16616x = StringsJVM.m16616x(str, "_nomap", false, 2, null);
                    if (m16616x) {
                    }
                }
                C18970Ic c18970Ic = new C18970Ic();
                String BSSID = scanResult.BSSID;
                Intrinsics.checkNotNullExpressionValue(BSSID, "BSSID");
                c18970Ic.f47351a = AbstractC18984Jc.m60987a(BSSID);
                arrayList.add(c18970Ic);
            }
        }
        C19012Lc.f47451f = arrayList;
    }
}
