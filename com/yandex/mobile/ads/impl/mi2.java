package com.yandex.mobile.ads.impl;

import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.ni2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class mi2 implements ni2.InterfaceC30950b {

    /* renamed from: a */
    private JSONObject f82225a;

    /* renamed from: b */
    private final ri2 f82226b;

    public mi2(ri2 ri2Var) {
        this.f82226b = ri2Var;
    }

    /* renamed from: a */
    public final void m31984a() {
        this.f82226b.m30041a(new vi2(this));
    }

    @VisibleForTesting
    /* renamed from: b */
    public final JSONObject m31981b() {
        return this.f82225a;
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void m31983a(JSONObject jSONObject) {
        this.f82225a = jSONObject;
    }

    /* renamed from: b */
    public final void m31980b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f82226b.m30041a(new aj2(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public final void m31982a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f82226b.m30041a(new dj2(this, hashSet, jSONObject, j));
    }
}
