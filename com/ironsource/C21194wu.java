package com.ironsource;

import android.content.Context;
import com.ironsource.C20688qf;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.wu */
/* loaded from: classes6.dex */
public class C21194wu {

    /* renamed from: a */
    private final String f54354a;

    /* renamed from: b */
    private Context f54355b;

    /* renamed from: c */
    private C21257y8 f54356c;

    /* renamed from: d */
    private C20091ia f54357d;

    /* renamed from: e */
    private int f54358e;

    /* renamed from: f */
    private C20750ra f54359f;

    /* renamed from: g */
    private int f54360g;

    /* renamed from: h */
    private int f54361h;

    /* renamed from: i */
    private final String f54362i = C21194wu.class.getSimpleName();

    /* renamed from: j */
    private EnumC21195a f54363j;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.ironsource.wu$a */
    /* loaded from: classes6.dex */
    public enum EnumC21195a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public C21194wu(Context context, C21257y8 c21257y8, C20091ia c20091ia, int i, C20750ra c20750ra, String str) {
        EnumC21195a m54278h = m54278h();
        this.f54363j = m54278h;
        if (m54278h != EnumC21195a.NOT_ALLOWED) {
            this.f54355b = context;
            this.f54356c = c21257y8;
            this.f54357d = c20091ia;
            this.f54358e = i;
            this.f54359f = c20750ra;
            this.f54360g = 0;
        }
        this.f54354a = str;
    }

    /* renamed from: h */
    private EnumC21195a m54278h() {
        this.f54361h = FeaturesManager.getInstance().getInitRecoverTrials();
        String str = this.f54362i;
        Logger.m54970i(str, "getInitialState mMaxAllowedTrials: " + this.f54361h);
        if (this.f54361h <= 0) {
            Logger.m54970i(this.f54362i, "recovery is not allowed by config");
            return EnumC21195a.NOT_ALLOWED;
        }
        return EnumC21195a.NOT_RECOVERED;
    }

    /* renamed from: j */
    private void m54276j() {
        if (this.f54360g == this.f54361h) {
            Logger.m54970i(this.f54362i, "handleRecoveringEndedFailed | Reached max trials");
            this.f54363j = EnumC21195a.NOT_ALLOWED;
            m54287a();
            return;
        }
        this.f54363j = EnumC21195a.NOT_RECOVERED;
    }

    /* renamed from: k */
    private void m54275k() {
        m54287a();
        this.f54363j = EnumC21195a.RECOVERED;
    }

    /* renamed from: a */
    public void m54287a() {
        this.f54355b = null;
        this.f54356c = null;
        this.f54357d = null;
        this.f54359f = null;
    }

    /* renamed from: b */
    public Context m54284b() {
        return this.f54355b;
    }

    /* renamed from: c */
    public String m54283c() {
        return this.f54354a;
    }

    /* renamed from: d */
    public C21257y8 m54282d() {
        return this.f54356c;
    }

    /* renamed from: e */
    public int m54281e() {
        return this.f54358e;
    }

    /* renamed from: f */
    public C20091ia m54280f() {
        return this.f54357d;
    }

    /* renamed from: g */
    public C20750ra m54279g() {
        return this.f54359f;
    }

    /* renamed from: i */
    public JSONObject m54277i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C21114v8.C21122h.f54017A0, m54273m());
            jSONObject.put(C21114v8.C21122h.f54019B0, this.f54360g);
            jSONObject.put(C21114v8.C21122h.f54021C0, this.f54361h);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    /* renamed from: l */
    public boolean m54274l() {
        if (this.f54363j == EnumC21195a.IN_RECOVERING) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m54273m() {
        if (this.f54363j == EnumC21195a.RECOVERED) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public void m54272n() {
        EnumC21195a enumC21195a = this.f54363j;
        EnumC21195a enumC21195a2 = EnumC21195a.IN_RECOVERING;
        if (enumC21195a != enumC21195a2) {
            this.f54360g++;
            Logger.m54970i(this.f54362i, "recoveringStarted - trial number " + this.f54360g);
            this.f54363j = enumC21195a2;
        }
    }

    /* renamed from: a */
    public void m54285a(boolean z) {
        if (this.f54363j != EnumC21195a.IN_RECOVERING) {
            return;
        }
        if (z) {
            m54275k();
        } else {
            m54276j();
        }
    }

    /* renamed from: a */
    public boolean m54286a(C20688qf.EnumC20691c enumC20691c, C20688qf.EnumC20690b enumC20690b) {
        Logger.m54970i(this.f54362i, "shouldRecoverWebController: ");
        EnumC21195a enumC21195a = this.f54363j;
        if (enumC21195a == EnumC21195a.NOT_ALLOWED) {
            Logger.m54970i(this.f54362i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        } else if (enumC20691c != C20688qf.EnumC20691c.Native) {
            String str = this.f54362i;
            Logger.m54970i(str, "shouldRecoverWebController: false | current controller type is: " + enumC20691c);
            return false;
        } else if (enumC20690b == C20688qf.EnumC20690b.Loading || enumC20690b == C20688qf.EnumC20690b.None) {
            Logger.m54970i(this.f54362i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        } else if (enumC21195a == EnumC21195a.RECOVERED) {
            Logger.m54970i(this.f54362i, "shouldRecoverWebController: false | already recovered");
            return false;
        } else if (enumC21195a == EnumC21195a.IN_RECOVERING) {
            Logger.m54970i(this.f54362i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        } else if (this.f54355b == null || this.f54356c == null || this.f54357d == null) {
            Logger.m54970i(this.f54362i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        } else {
            Logger.m54970i(this.f54362i, "shouldRecoverWebController: true | allow recovering ");
            return true;
        }
    }
}
