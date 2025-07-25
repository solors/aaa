package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.global.h */
/* loaded from: classes4.dex */
public final class C14378h implements InterfaceC14351d {

    /* renamed from: a */
    public final HashSet f27204a = new HashSet();

    /* renamed from: b */
    public final boolean f27205b;

    public C14378h(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f27204a.add(optString);
                }
            }
        }
        this.f27205b = z;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC14351d
    /* renamed from: a */
    public final boolean mo77943a(C14352e c14352e) {
        if (!this.f27204a.isEmpty() && c14352e.f27193c != null) {
            Iterator it = this.f27204a.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(c14352e.f27193c.value())) {
                    return !this.f27205b;
                }
            }
            return this.f27205b;
        }
        return false;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.f27204a, Boolean.valueOf(this.f27205b));
    }
}
