package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.W4 */
/* loaded from: classes6.dex */
public final class C19147W4 {

    /* renamed from: a */
    public final JSONObject f47896a;

    /* renamed from: b */
    public final JSONArray f47897b;

    /* renamed from: c */
    public final C19071Q5 f47898c;

    public C19147W4(JSONObject vitals, JSONArray logs, C19071Q5 data) {
        Intrinsics.checkNotNullParameter(vitals, "vitals");
        Intrinsics.checkNotNullParameter(logs, "logs");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f47896a = vitals;
        this.f47897b = logs;
        this.f47898c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19147W4)) {
            return false;
        }
        C19147W4 c19147w4 = (C19147W4) obj;
        if (Intrinsics.m17075f(this.f47896a, c19147w4.f47896a) && Intrinsics.m17075f(this.f47897b, c19147w4.f47897b) && Intrinsics.m17075f(this.f47898c, c19147w4.f47898c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f47897b.hashCode();
        return this.f47898c.hashCode() + ((hashCode + (this.f47896a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f47896a + ", logs=" + this.f47897b + ", data=" + this.f47898c + ')';
    }
}
