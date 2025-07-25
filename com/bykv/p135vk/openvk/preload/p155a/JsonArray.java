package com.bykv.p135vk.openvk.preload.p155a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.a.f */
/* loaded from: classes3.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {

    /* renamed from: a */
    private final List<JsonElement> f13888a = new ArrayList();

    /* renamed from: a */
    public final void m91492a(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.f13889a;
        }
        this.f13888a.add(jsonElement);
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: b */
    public final String mo91486b() {
        if (this.f13888a.size() == 1) {
            return this.f13888a.get(0).mo91486b();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: c */
    public final double mo91485c() {
        if (this.f13888a.size() == 1) {
            return this.f13888a.get(0).mo91485c();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: d */
    public final long mo91484d() {
        if (this.f13888a.size() == 1) {
            return this.f13888a.get(0).mo91484d();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: e */
    public final int mo91483e() {
        if (this.f13888a.size() == 1) {
            return this.f13888a.get(0).mo91483e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof JsonArray) || !((JsonArray) obj).f13888a.equals(this.f13888a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: f */
    public final boolean mo91482f() {
        if (this.f13888a.size() == 1) {
            return this.f13888a.get(0).mo91482f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.f13888a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonElement> iterator() {
        return this.f13888a.iterator();
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: a */
    public final Number mo91488a() {
        if (this.f13888a.size() == 1) {
            return this.f13888a.get(0).mo91488a();
        }
        throw new IllegalStateException();
    }
}
