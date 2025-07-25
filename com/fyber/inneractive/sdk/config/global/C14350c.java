package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.c */
/* loaded from: classes4.dex */
public final class C14350c implements InterfaceC14351d {

    /* renamed from: a */
    public final HashSet f27189a = new HashSet();

    /* renamed from: b */
    public final boolean f27190b;

    public C14350c(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f27189a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f27190b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14351d
    /* renamed from: a */
    public final boolean mo77943a(C14352e c14352e) {
        if (!this.f27189a.isEmpty() && c14352e.f27191a != null) {
            Iterator it = this.f27189a.iterator();
            while (it.hasNext()) {
                if (((Long) it.next()).equals(c14352e.f27191a)) {
                    return !this.f27190b;
                }
            }
            return this.f27190b;
        }
        return false;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "demand", this.f27189a, Boolean.valueOf(this.f27190b));
    }
}
