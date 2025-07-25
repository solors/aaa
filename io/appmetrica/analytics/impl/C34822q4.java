package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.q4 */
/* loaded from: classes9.dex */
public final class C34822q4 {

    /* renamed from: a */
    public final Object f95202a;

    /* renamed from: b */
    public final C34742n5 f95203b;

    /* renamed from: c */
    public final HashMap f95204c;

    /* renamed from: d */
    public final C34747na f95205d;

    /* renamed from: e */
    public final Context f95206e;

    /* renamed from: f */
    public final C35004x4 f95207f;

    public C34822q4(Context context, C34742n5 c34742n5) {
        this(context, c34742n5, new C35004x4());
    }

    /* renamed from: a */
    public final InterfaceC34926u4 m21099a(C34525f4 c34525f4, C33860E4 c33860e4) {
        InterfaceC34926u4 interfaceC34926u4;
        synchronized (this.f95202a) {
            interfaceC34926u4 = (InterfaceC34926u4) this.f95204c.get(c34525f4);
            if (interfaceC34926u4 == null) {
                this.f95207f.getClass();
                interfaceC34926u4 = C35004x4.m20791a(c34525f4).mo20889a(this.f95206e, this.f95203b, c34525f4, c33860e4);
                this.f95204c.put(c34525f4, interfaceC34926u4);
                this.f95205d.m21305a(new C34795p4(c34525f4.f94307b, c34525f4.f94308c, c34525f4.f94309d), c34525f4);
            }
        }
        return interfaceC34926u4;
    }

    public C34822q4(Context context, C34742n5 c34742n5, C35004x4 c35004x4) {
        this.f95202a = new Object();
        this.f95204c = new HashMap();
        this.f95205d = new C34747na();
        this.f95206e = context.getApplicationContext();
        this.f95203b = c34742n5;
        this.f95207f = c35004x4;
    }

    /* renamed from: a */
    public final void m21100a(int i, String str, String str2) {
        Integer valueOf = Integer.valueOf(i);
        synchronized (this.f95202a) {
            C34747na c34747na = this.f95205d;
            Collection<C34525f4> collection = (Collection) c34747na.f94995a.remove(new C34795p4(str, valueOf, str2));
            if (!AbstractC34679kn.m21470a(collection)) {
                collection.size();
                ArrayList arrayList = new ArrayList(collection.size());
                for (C34525f4 c34525f4 : collection) {
                    arrayList.add((InterfaceC34926u4) this.f95204c.remove(c34525f4));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC34926u4) it.next()).mo20717a();
                }
            }
        }
    }
}
