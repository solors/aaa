package io.appmetrica.analytics.identifiers.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.identifiers.impl.C33734a;
import io.appmetrica.analytics.identifiers.impl.C33736c;
import io.appmetrica.analytics.identifiers.impl.C33737d;
import io.appmetrica.analytics.identifiers.impl.InterfaceC33735b;

@Keep
/* loaded from: classes9.dex */
public class AdvIdentifiersProvider {

    /* renamed from: a */
    public static final /* synthetic */ int f92540a = 0;
    private static final C33737d retriever = new C33737d();

    public static Bundle requestIdentifiers(@NonNull Context context, @NonNull Bundle bundle) {
        C33736c mo22788a;
        InterfaceC33735b interfaceC33735b = (InterfaceC33735b) retriever.f92523a.get(bundle.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
        if (interfaceC33735b != null && (mo22788a = interfaceC33735b.mo22788a(context)) != null) {
            Bundle bundle2 = new Bundle();
            C33734a c33734a = mo22788a.f92521b;
            if (c33734a != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", c33734a.f92517a);
                bundle3.putString("io.appmetrica.analytics.identifiers.extra.ID", c33734a.f92518b);
                Boolean bool = c33734a.f92519c;
                if (bool != null) {
                    bundle3.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", bool.booleanValue());
                }
                bundle2.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", bundle3);
            }
            bundle2.putString("io.appmetrica.analytics.identifiers.extra.STATUS", mo22788a.f92520a.getValue());
            bundle2.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", mo22788a.f92522c);
            return bundle2;
        }
        return null;
    }
}
