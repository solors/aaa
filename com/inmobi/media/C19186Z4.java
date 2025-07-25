package com.inmobi.media;

import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.Z4 */
/* loaded from: classes6.dex */
public final class C19186Z4 extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ C19200a5 f48033a;

    /* renamed from: b */
    public final /* synthetic */ String f48034b = "IncompleteLogFinalizer";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19186Z4(C19200a5 c19200a5) {
        super(0);
        this.f48033a = c19200a5;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        C19147W4 c19147w4 = this.f48033a.f48066a;
        JSONObject jSONObject = c19147w4.f47896a;
        JSONArray jSONArray = c19147w4.f47897b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        AbstractC19257e6.m60373a(this.f48034b, jSONObject3, this.f48033a.f48066a.f47898c.f47638a);
        String str = this.f48033a.f48066a.f47898c.f47638a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C19071Q5 c19071q5 = this.f48033a.f48066a.f47898c;
        AbstractC19541ya.m59535d().m60744b(new C19071Q5(str, timeInMillis, 0, c19071q5.f47641d, true, c19071q5.f47643f));
        return Unit.f99208a;
    }
}
