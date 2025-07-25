package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.InterfaceC14671E;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.click.m */
/* loaded from: classes4.dex */
public final class C14302m implements InterfaceC14671E {

    /* renamed from: a */
    public final /* synthetic */ String f27027a;

    /* renamed from: b */
    public final /* synthetic */ String f27028b;

    /* renamed from: c */
    public final /* synthetic */ C14307r f27029c;

    public C14302m(C14307r c14307r, String str, String str2) {
        this.f27029c = c14307r;
        this.f27027a = str;
        this.f27028b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC14671E
    /* renamed from: a */
    public final void mo76358a(Object obj, Exception exc, boolean z) {
        C14292c c14292c = (C14292c) obj;
        if (!this.f27029c.f27036e) {
            if (exc != null) {
                C14307r.m78000a(this.f27029c, null, this.f27027a, this.f27028b, exc);
            } else if (c14292c != null) {
                String str = this.f27027a;
                if (c14292c.f27005a.size() > 1) {
                    ArrayList arrayList = c14292c.f27005a;
                    str = (String) arrayList.get(arrayList.size() - 1);
                }
                C14291b m77999a = this.f27029c.m77999a(str);
                if ((m77999a == null || m77999a.f26999a == EnumC14306q.FAILED) && !TextUtils.isEmpty(c14292c.f27006b)) {
                    C14307r c14307r = this.f27029c;
                    c14307r.getClass();
                    Iterator it = c14292c.f27005a.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (!TextUtils.equals(str2, str)) {
                            c14307r.f27037f.add(new C14299j(str2, true, EnumC14306q.INTERNAL_REDIRECT, null));
                        }
                    }
                    C14307r.m78000a(this.f27029c, c14292c.f27006b, str, this.f27028b, null);
                    return;
                }
                C14307r c14307r2 = this.f27029c;
                c14307r2.getClass();
                Iterator it2 = c14292c.f27005a.iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    if (!TextUtils.equals(str3, str)) {
                        c14307r2.f27037f.add(new C14299j(str3, false, EnumC14306q.INTERNAL_REDIRECT, null));
                    }
                }
                if (this.f27029c.f27037f.size() == 0) {
                    this.f27029c.f27037f.add(new C14299j(str, false, EnumC14306q.INTERNAL_REDIRECT, null));
                }
                this.f27029c.m78001a(C14307r.m77998a(str, "followRedirects", "Invalid response"));
            }
        }
    }
}
