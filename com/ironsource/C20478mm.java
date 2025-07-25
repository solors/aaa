package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.mm */
/* loaded from: classes6.dex */
public final class C20478mm implements InterfaceC21191wr<JSONObject>, InterfaceC21094ur<C20213km> {
    @NotNull

    /* renamed from: a */
    private final Map<String, C19566a3> f52072a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC20580od
    @NotNull
    /* renamed from: b */
    public JSONObject mo54546a(@NotNull EnumC21149vr mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C19566a3> entry : this.f52072a.entrySet()) {
            String key = entry.getKey();
            JSONArray mo54546a = entry.getValue().mo54546a(mode);
            if (mo54546a.length() > 0) {
                jSONObject.put(key, mo54546a);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC21094ur
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo54545a(@NotNull C20213km record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String m57627c = record.m57627c();
        Map<String, C19566a3> map = this.f52072a;
        C19566a3 c19566a3 = map.get(m57627c);
        if (c19566a3 == null) {
            c19566a3 = new C19566a3();
            map.put(m57627c, c19566a3);
        }
        c19566a3.m59489a(record.m57629a(new C20281lm()));
    }
}
