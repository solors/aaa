package sg.bigo.ads.common.p924l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C21114v8;
import sg.bigo.ads.common.C43584a;

/* renamed from: sg.bigo.ads.common.l.a */
/* loaded from: classes10.dex */
final class C43713a {
    @Nullable
    /* renamed from: a */
    public static C43584a m5147a(@NonNull Context context) {
        try {
            Object invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            Boolean bool = (Boolean) invoke.getClass().getMethod(C21114v8.C21123i.f54118M, new Class[0]).invoke(invoke, new Object[0]);
            String str = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            if (str != null && bool != null) {
                return new C43584a(str, bool.booleanValue());
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
