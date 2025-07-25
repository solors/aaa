package io.appmetrica.analytics.impl;

import java.lang.reflect.Field;
import kotlin.text.Charsets;
import org.json.JSONObject;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.Dd */
/* loaded from: classes9.dex */
public final class C33844Dd {
    /* renamed from: a */
    public static final C35035y9 m22716a(C33844Dd c33844Dd, EnumC33940H9 enumC33940H9, Object obj) {
        int i;
        Field[] fields;
        c33844Dd.getClass();
        C35035y9 c35035y9 = new C35035y9();
        switch (enumC33940H9.ordinal()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c35035y9.f95653a = i;
        C33869Ed.f92787b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        c35035y9.f95654b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return c35035y9;
    }
}
