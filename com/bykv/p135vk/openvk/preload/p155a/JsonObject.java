package com.bykv.p135vk.openvk.preload.p155a;

import com.bykv.p135vk.openvk.preload.p155a.p157b.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.preload.a.k */
/* loaded from: classes3.dex */
public final class JsonObject extends JsonElement {

    /* renamed from: a */
    private final LinkedTreeMap<String, JsonElement> f13890a = new LinkedTreeMap<>();

    /* renamed from: a */
    public final void m91490a(String str, JsonElement jsonElement) {
        LinkedTreeMap<String, JsonElement> linkedTreeMap = this.f13890a;
        if (jsonElement == null) {
            jsonElement = JsonNull.f13889a;
        }
        linkedTreeMap.put(str, jsonElement);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof JsonObject) || !((JsonObject) obj).f13890a.equals(this.f13890a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: g */
    public final Set<Map.Entry<String, JsonElement>> m91489g() {
        return this.f13890a.entrySet();
    }

    public final int hashCode() {
        return this.f13890a.hashCode();
    }
}
