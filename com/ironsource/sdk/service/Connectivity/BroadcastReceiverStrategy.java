package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C20086i9;
import com.ironsource.C20793s8;
import com.ironsource.InterfaceC21263yd;
import com.ironsource.InterfaceC21306zd;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class BroadcastReceiverStrategy implements InterfaceC21263yd {

    /* renamed from: a */
    private final InterfaceC21306zd f53457a;

    /* renamed from: b */
    private BroadcastReceiver f53458b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String m55379b = C20793s8.m55379b(context);
            if (m55379b.equals("none")) {
                BroadcastReceiverStrategy.this.f53457a.mo53850a();
            } else {
                BroadcastReceiverStrategy.this.f53457a.mo53849a(m55379b, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC21306zd interfaceC21306zd) {
        this.f53457a = interfaceC21306zd;
    }

    @Override // com.ironsource.InterfaceC21263yd
    /* renamed from: b */
    public void mo53986b(Context context) {
        try {
            context.registerReceiver(this.f53458b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC21263yd
    /* renamed from: c */
    public JSONObject mo53985c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.InterfaceC21263yd
    /* renamed from: a */
    public void mo53988a() {
        this.f53458b = null;
    }

    @Override // com.ironsource.InterfaceC21263yd
    /* renamed from: a */
    public void mo53987a(Context context) {
        try {
            context.unregisterReceiver(this.f53458b);
        } catch (IllegalArgumentException e) {
            C20086i9.m57997d().m58003a(e);
        } catch (Exception e2) {
            C20086i9.m57997d().m58003a(e2);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e2);
        }
    }
}
