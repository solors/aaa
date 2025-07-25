package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.a2 */
/* loaded from: classes6.dex */
public final class C19565a2 implements InterfaceC21191wr<JSONObject>, InterfaceC21094ur<C21247y1> {
    @NotNull

    /* renamed from: a */
    private final Map<String, C20478mm> f49005a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC20580od
    @NotNull
    /* renamed from: b */
    public JSONObject mo54546a(@NotNull EnumC21149vr mode) {
        String m16591R0;
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C20478mm> entry : this.f49005a.entrySet()) {
            String key = entry.getKey();
            JSONObject mo54546a = entry.getValue().mo54546a(mode);
            if (mo54546a.length() > 0) {
                m16591R0 = C37690r.m16591R0(key, "_", null, 2, null);
                jSONObject.put(m16591R0, mo54546a);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC21094ur
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo54545a(@NotNull C21247y1 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String m54053d = record.m54053d();
        Map<String, C20478mm> map = this.f49005a;
        C20478mm c20478mm = map.get(m54053d);
        if (c20478mm == null) {
            c20478mm = new C20478mm();
            map.put(m54053d, c20478mm);
        }
        c20478mm.mo54545a(record.m54056a(new C21290z1()));
    }
}
