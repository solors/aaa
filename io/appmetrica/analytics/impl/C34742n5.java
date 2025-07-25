package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.n5 */
/* loaded from: classes9.dex */
public final class C34742n5 {

    /* renamed from: a */
    public final HashMap f94972a = new HashMap();

    /* renamed from: b */
    public final HashMap f94973b = new HashMap();

    /* renamed from: c */
    public final Context f94974c;

    public C34742n5(Context context) {
        this.f94974c = context.getApplicationContext();
    }

    /* renamed from: a */
    public final InterfaceC33866Ea m21313a(C34391a5 c34391a5, C33860E4 c33860e4, InterfaceC34058M7 interfaceC34058M7, HashMap hashMap) {
        InterfaceC33866Ea interfaceC33866Ea = (InterfaceC33866Ea) hashMap.get(c34391a5.toString());
        if (interfaceC33866Ea == null) {
            InterfaceC33866Ea mo22170a = interfaceC34058M7.mo22170a(this.f94974c, c34391a5, c33860e4);
            hashMap.put(c34391a5.toString(), mo22170a);
            return mo22170a;
        }
        interfaceC33866Ea.mo22228a(c33860e4);
        return interfaceC33866Ea;
    }
}
