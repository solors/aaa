package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Je */
/* loaded from: classes9.dex */
public final class C33993Je implements ProtobufConverter {

    /* renamed from: a */
    public final C33945He f93070a = new C33945He();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C33845De fromModel(@NonNull C33969Ie c33969Ie) {
        C33845De c33845De = new C33845De();
        if (!TextUtils.isEmpty(c33969Ie.f93024a)) {
            c33845De.f92708a = c33969Ie.f93024a;
        }
        c33845De.f92709b = c33969Ie.f93025b.toString();
        c33845De.f92710c = c33969Ie.f93026c;
        c33845De.f92711d = c33969Ie.f93027d;
        c33845De.f92712e = this.f93070a.fromModel(c33969Ie.f93028e).intValue();
        return c33845De;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C33969Ie toModel(@NonNull C33845De c33845De) {
        JSONObject jSONObject;
        String str = c33845De.f92708a;
        String str2 = c33845De.f92709b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C33969Ie(str, jSONObject, c33845De.f92710c, c33845De.f92711d, this.f93070a.toModel(Integer.valueOf(c33845De.f92712e)));
        }
        jSONObject = new JSONObject();
        return new C33969Ie(str, jSONObject, c33845De.f92710c, c33845De.f92711d, this.f93070a.toModel(Integer.valueOf(c33845De.f92712e)));
    }
}
