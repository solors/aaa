package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.se */
/* loaded from: classes9.dex */
public final class C34884se implements ProtobufConverter {

    /* renamed from: a */
    public final C33945He f95330a;

    public C34884se() {
        this(new C33945He());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C33870Ee fromModel(@NonNull C34936ue c34936ue) {
        C33870Ee c33870Ee = new C33870Ee();
        if (!TextUtils.isEmpty(c34936ue.f95463a)) {
            c33870Ee.f92789a = c34936ue.f95463a;
        }
        c33870Ee.f92790b = c34936ue.f95464b.toString();
        c33870Ee.f92791c = this.f95330a.fromModel(c34936ue.f95465c).intValue();
        return c33870Ee;
    }

    public C34884se(C33945He c33945He) {
        this.f95330a = c33945He;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34936ue toModel(@NonNull C33870Ee c33870Ee) {
        JSONObject jSONObject;
        String str = c33870Ee.f92789a;
        String str2 = c33870Ee.f92790b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C34936ue(str, jSONObject, this.f95330a.toModel(Integer.valueOf(c33870Ee.f92791c)));
        }
        jSONObject = new JSONObject();
        return new C34936ue(str, jSONObject, this.f95330a.toModel(Integer.valueOf(c33870Ee.f92791c)));
    }
}
