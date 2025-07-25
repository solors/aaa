package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class i10 extends Lambda implements Function2<JSONObject, d10, Unit> {

    /* renamed from: b */
    final /* synthetic */ j10 f80289b;

    /* renamed from: c */
    final /* synthetic */ List<c10> f80290c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i10(j10 j10Var, ArrayList arrayList) {
        super(2);
        this.f80289b = j10Var;
        this.f80290c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public final Unit mo105910invoke(JSONObject jSONObject, d10 d10Var) {
        Object obj;
        JSONObject node = jSONObject;
        d10 type = d10Var;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f80289b.getClass();
        String str = null;
        if (node.has("view_name")) {
            Intrinsics.checkNotNullParameter(node, "<this>");
            Intrinsics.checkNotNullParameter("view_name", "key");
            try {
                obj = node.get("view_name");
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        if (str != null) {
            this.f80290c.add(new c10(type, str));
        }
        return Unit.f99208a;
    }
}
