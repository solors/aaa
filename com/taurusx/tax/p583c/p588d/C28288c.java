package com.taurusx.tax.p583c.p588d;

import com.taurusx.tax.C28162a;
import com.taurusx.tax.p583c.p586b.C28276a;
import com.taurusx.tax.p583c.p586b.C28280b;
import com.taurusx.tax.p583c.p588d.C28285b;
import com.taurusx.tax.p583c.p588d.C28289d;
import com.taurusx.tax.p583c.p590f.C28293b;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.taurusx.tax.c.d.c */
/* loaded from: classes7.dex */
public class C28288c implements C28285b.InterfaceC28286a {

    /* renamed from: a */
    public final /* synthetic */ C28285b.InterfaceC28286a.EnumC28287a f73470a;

    /* renamed from: b */
    public final /* synthetic */ String f73471b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f73472c;

    /* renamed from: d */
    public final /* synthetic */ Map f73473d;

    /* renamed from: e */
    public final /* synthetic */ int f73474e;

    /* renamed from: f */
    public final /* synthetic */ C28289d.InterfaceC28290a f73475f;

    public C28288c(C28285b.InterfaceC28286a.EnumC28287a enumC28287a, String str, byte[] bArr, Map map, int i, C28289d.InterfaceC28290a interfaceC28290a) {
        this.f73470a = enumC28287a;
        this.f73471b = str;
        this.f73472c = bArr;
        this.f73473d = map;
        this.f73474e = i;
        this.f73475f = interfaceC28290a;
    }

    /* renamed from: a */
    public void m38317a(HttpURLConnection httpURLConnection, boolean z) {
        int i = -1;
        if (httpURLConnection != null) {
            try {
                i = httpURLConnection.getResponseCode();
                if (i == 200) {
                    C28293b.m38286a(C28285b.m38320a(httpURLConnection), Charset.forName(C28162a.f73047a.m23824a(new byte[]{76, -123, 95, -36, 1}, new byte[]{57, -15})));
                    C28289d.InterfaceC28290a interfaceC28290a = this.f73475f;
                    if (interfaceC28290a != null) {
                        ((C28276a.C28278b) ((C28280b) interfaceC28290a).f73463a).m38327a(true);
                        return;
                    }
                    return;
                }
            } catch (Error | Exception e) {
                e.printStackTrace();
            }
        }
        C28289d.InterfaceC28290a interfaceC28290a2 = this.f73475f;
        if (interfaceC28290a2 != null) {
            C28280b c28280b = (C28280b) interfaceC28290a2;
            if (i == 204) {
                ((C28276a.C28278b) c28280b.f73463a).m38327a(true);
                return;
            }
            C28276a c28276a = c28280b.f73464b;
            C28276a.m38329a(c28276a, C28162a.f73047a.m23824a(new byte[]{101, 55, 85, 42, 96, 59, 106, 120, 101, 57, 117, 57, 33, 30, 96, 49, 109, 120, 82, 44, 96, 44, 116, 43, 66, 55, 101, 61, 59, 120}, new byte[]{1, 88}) + i);
            ((C28276a.C28278b) c28280b.f73463a).m38327a(false);
        }
    }
}
