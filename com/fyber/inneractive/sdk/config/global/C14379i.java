package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.i */
/* loaded from: classes4.dex */
public final class C14379i implements InterfaceC14351d {

    /* renamed from: a */
    public final HashSet f27206a = new HashSet();

    /* renamed from: b */
    public final boolean f27207b;

    public C14379i(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                long optLong = jSONArray.optLong(i);
                if (optLong != 0) {
                    this.f27206a.add(Long.valueOf(optLong));
                }
            }
        }
        this.f27207b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14351d
    /* renamed from: a */
    public final boolean mo77943a(C14352e c14352e) {
        if (!this.f27206a.isEmpty() && c14352e.f27192b != null) {
            Iterator it = this.f27206a.iterator();
            while (it.hasNext()) {
                if (((Long) it.next()).equals(c14352e.f27192b)) {
                    return !this.f27207b;
                }
            }
            return this.f27207b;
        }
        return false;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.f27206a, Boolean.valueOf(this.f27207b));
    }
}
