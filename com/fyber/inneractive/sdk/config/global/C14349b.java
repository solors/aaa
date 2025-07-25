package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.b */
/* loaded from: classes4.dex */
public final class C14349b {

    /* renamed from: a */
    public String f27185a;

    /* renamed from: b */
    public int f27186b;

    /* renamed from: c */
    public final ArrayList f27187c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f27188d = new ArrayList();

    /* renamed from: a */
    public static void m77957a(C14349b c14349b, JSONObject jSONObject, boolean z) {
        InterfaceC14351d c14350c;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                next.getClass();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1335432629:
                        if (next.equals("demand")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -977436259:
                        if (next.equals("pub_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -212583340:
                        if (next.equals("placement_type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3556:
                        if (next.equals("os")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 113722:
                        if (next.equals("sdk")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c14350c = new C14350c(jSONObject.getJSONArray(next), z);
                        break;
                    case 1:
                        c14350c = new C14379i(jSONObject.getJSONArray(next), z);
                        break;
                    case 2:
                        c14350c = new C14378h(jSONObject.getJSONArray(next), z);
                        break;
                    case 3:
                        c14350c = new C14353f(z, jSONObject.getString(next));
                        break;
                    case 4:
                        c14350c = new C14380j(z, jSONObject.getString(next));
                        break;
                    default:
                        c14350c = null;
                        break;
                }
                if (c14350c != null) {
                    c14349b.f27188d.add(c14350c);
                } else {
                    IAlog.m76529a("b: Unsupported filter type: " + next, new Object[0]);
                }
            }
        }
    }

    public final String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", this.f27185a, this.f27187c, this.f27188d);
    }
}
