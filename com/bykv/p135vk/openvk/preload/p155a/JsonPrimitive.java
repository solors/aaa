package com.bykv.p135vk.openvk.preload.p155a;

import com.bykv.p135vk.openvk.preload.falconx.p166a.WebResourceUtils;
import com.bykv.p135vk.openvk.preload.p155a.p157b.LazilyParsedNumber;
import java.math.BigInteger;

/* renamed from: com.bykv.vk.openvk.preload.a.m */
/* loaded from: classes3.dex */
public final class JsonPrimitive extends JsonElement {

    /* renamed from: a */
    private final Object f13891a;

    public JsonPrimitive(Boolean bool) {
        this.f13891a = WebResourceUtils.m91432a(bool);
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: a */
    public final Number mo91488a() {
        Object obj = this.f13891a;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: b */
    public final String mo91486b() {
        Object obj = this.f13891a;
        if (obj instanceof Number) {
            return mo91488a().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: c */
    public final double mo91485c() {
        if (this.f13891a instanceof Number) {
            return mo91488a().doubleValue();
        }
        return Double.parseDouble(mo91486b());
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: d */
    public final long mo91484d() {
        if (this.f13891a instanceof Number) {
            return mo91488a().longValue();
        }
        return Long.parseLong(mo91486b());
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: e */
    public final int mo91483e() {
        if (this.f13891a instanceof Number) {
            return mo91488a().intValue();
        }
        return Integer.parseInt(mo91486b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.f13891a == null) {
            if (jsonPrimitive.f13891a == null) {
                return true;
            }
            return false;
        } else if (m91487a(this) && m91487a(jsonPrimitive)) {
            if (mo91488a().longValue() == jsonPrimitive.mo91488a().longValue()) {
                return true;
            }
            return false;
        } else {
            Object obj2 = this.f13891a;
            if ((obj2 instanceof Number) && (jsonPrimitive.f13891a instanceof Number)) {
                double doubleValue = mo91488a().doubleValue();
                double doubleValue2 = jsonPrimitive.mo91488a().doubleValue();
                if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                    return true;
                }
                return false;
            }
            return obj2.equals(jsonPrimitive.f13891a);
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.JsonElement
    /* renamed from: f */
    public final boolean mo91482f() {
        Object obj = this.f13891a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(mo91486b());
    }

    /* renamed from: g */
    public final boolean m91481g() {
        return this.f13891a instanceof Boolean;
    }

    /* renamed from: h */
    public final boolean m91480h() {
        return this.f13891a instanceof Number;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f13891a == null) {
            return 31;
        }
        if (m91487a(this)) {
            doubleToLongBits = mo91488a().longValue();
        } else {
            Object obj = this.f13891a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(mo91488a().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: i */
    public final boolean m91479i() {
        return this.f13891a instanceof String;
    }

    /* renamed from: a */
    private static boolean m91487a(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.f13891a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    public JsonPrimitive(Number number) {
        this.f13891a = WebResourceUtils.m91432a(number);
    }

    public JsonPrimitive(String str) {
        this.f13891a = WebResourceUtils.m91432a(str);
    }
}
