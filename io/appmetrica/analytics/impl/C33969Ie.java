package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Ie */
/* loaded from: classes9.dex */
public final class C33969Ie implements InterfaceC34177R7 {
    @Nullable

    /* renamed from: a */
    public final String f93024a;
    @NonNull

    /* renamed from: b */
    public final JSONObject f93025b;

    /* renamed from: c */
    public final boolean f93026c;

    /* renamed from: d */
    public final boolean f93027d;
    @NonNull

    /* renamed from: e */
    public final EnumC34154Q7 f93028e;

    public C33969Ie(@Nullable String str, @NonNull JSONObject jSONObject, boolean z, boolean z2, @NonNull EnumC34154Q7 enumC34154Q7) {
        this.f93024a = str;
        this.f93025b = jSONObject;
        this.f93026c = z;
        this.f93027d = z2;
        this.f93028e = enumC34154Q7;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34177R7
    @NonNull
    /* renamed from: a */
    public final EnumC34154Q7 mo22320a() {
        return this.f93028e;
    }

    @Nullable
    /* renamed from: b */
    public final JSONObject m22543b() {
        if (this.f93026c) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("trackingId", this.f93024a);
                if (this.f93025b.length() > 0) {
                    jSONObject.put("additionalParams", this.f93025b);
                    return jSONObject;
                }
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: c */
    public final JSONObject m22542c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f93024a);
            jSONObject.put("additionalParams", this.f93025b);
            jSONObject.put("wasSet", this.f93026c);
            jSONObject.put("autoTracking", this.f93027d);
            jSONObject.put("source", this.f93028e.f93394a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f93024a + "', additionalParameters=" + this.f93025b + ", wasSet=" + this.f93026c + ", autoTrackingEnabled=" + this.f93027d + ", source=" + this.f93028e + '}';
    }

    @NonNull
    /* renamed from: a */
    public static C33969Ie m22544a(@Nullable JSONObject jSONObject) {
        EnumC34154Q7 enumC34154Q7;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        EnumC34154Q7[] values = EnumC34154Q7.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                enumC34154Q7 = null;
                break;
            }
            enumC34154Q7 = values[i];
            if (Intrinsics.m17075f(enumC34154Q7.f93394a, optStringOrNull2)) {
                break;
            }
            i++;
        }
        return new C33969Ie(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, enumC34154Q7 == null ? EnumC34154Q7.f93389b : enumC34154Q7);
    }
}
