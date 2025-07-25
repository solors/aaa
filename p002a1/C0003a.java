package p002a1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;
import p1033x0.InterfaceC44663b;
import p1049y0.C44996b;
import p838q0.C39324d;
import p870s0.C39573h;
import p989u0.C44417b;
import p989u0.EnumC44419d;

/* renamed from: a1.a */
/* loaded from: classes3.dex */
public final class C0003a extends BroadcastReceiver {

    /* renamed from: a */
    public InterfaceC44663b f40a;

    /* renamed from: b */
    public boolean f41b = false;

    public C0003a(InterfaceC44663b interfaceC44663b) {
        this.f40a = interfaceC44663b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        InterfaceC44663b interfaceC44663b;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            C44996b.m1101a("%s : broadcast received", "PropertyChangeReceiver");
            String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra != null && (interfaceC44663b = this.f40a) != null) {
                C39324d c39324d = (C39324d) interfaceC44663b;
                try {
                    JSONArray jSONArray = new JSONArray(stringExtra);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        if ("DTID".equalsIgnoreCase(jSONArray.getString(i))) {
                            C44996b.m1101a("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                            if (c39324d.f103402c.mo12223c()) {
                                C44996b.m1101a("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                                C39573h c39573h = c39324d.f103403d;
                                if (c39573h != null) {
                                    C44996b.m1101a("%s : one dt refresh required", "OneDTAuthenticator");
                                    c39573h.f104003m.set(true);
                                }
                                c39324d.f103402c.mo12217l();
                                return;
                            }
                            C39573h c39573h2 = c39324d.f103403d;
                            if (c39573h2 != null) {
                                c39573h2.m12229m();
                                return;
                            }
                            return;
                        }
                    }
                } catch (JSONException e) {
                    C44417b.m3083a(EnumC44419d.ONE_DT_BROADCAST_ERROR, e);
                }
            }
        }
    }
}
