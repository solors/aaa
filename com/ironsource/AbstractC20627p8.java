package com.ironsource;

import android.content.Context;
import com.ironsource.C21114v8;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.p8 */
/* loaded from: classes6.dex */
public abstract class AbstractC20627p8 implements InterfaceC21306zd {

    /* renamed from: a */
    private InterfaceC21263yd f52385a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC20627p8(JSONObject jSONObject, Context context) {
        this.f52385a = m55862a(jSONObject, context);
        String simpleName = AbstractC20627p8.class.getSimpleName();
        Logger.m54970i(simpleName, "created ConnectivityAdapter with strategy " + this.f52385a.getClass().getSimpleName());
    }

    /* renamed from: a */
    private InterfaceC21263yd m55862a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C21114v8.C21123i.f54144g0) != 1 && C21109v3.m54520c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new C19649bm(this);
        }
        return new BroadcastReceiverStrategy(this);
    }

    /* renamed from: b */
    public void m55861b() {
        this.f52385a.mo53988a();
    }

    /* renamed from: c */
    public void m55859c(Context context) {
        this.f52385a.mo53987a(context);
    }

    /* renamed from: a */
    public JSONObject m55863a(Context context) {
        return this.f52385a.mo53985c(context);
    }

    /* renamed from: b */
    public void m55860b(Context context) {
        this.f52385a.mo53986b(context);
    }

    @Override // com.ironsource.InterfaceC21306zd
    /* renamed from: a */
    public void mo53850a() {
    }

    @Override // com.ironsource.InterfaceC21306zd
    /* renamed from: b */
    public void mo53848b(String str, JSONObject jSONObject) {
    }

    @Override // com.ironsource.InterfaceC21306zd
    /* renamed from: a */
    public void mo53849a(String str, JSONObject jSONObject) {
    }
}
