package com.five_corp.p372ad.internal.base_url;

import com.five_corp.p372ad.internal.cache.C13750w;
import com.five_corp.p372ad.internal.cache.InterfaceC13751x;
import com.five_corp.p372ad.internal.media_config.C13838a;
import com.five_corp.p372ad.internal.media_config.C13839b;

/* renamed from: com.five_corp.ad.internal.base_url.a */
/* loaded from: classes4.dex */
public final class C13703a implements InterfaceC13751x {

    /* renamed from: a */
    public String f25428a = "adchk.fivecdm.com";

    /* renamed from: b */
    public String f25429b = "bc2.fivecdm.com";

    /* renamed from: c */
    public String f25430c = "er.fivecdm.com";

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13751x
    /* renamed from: a */
    public final void mo78129a(C13750w c13750w) {
        C13838a c13838a = c13750w.f25563b;
        if (c13838a != null) {
            C13839b c13839b = c13838a.f25851j;
            String str = c13839b.f25852a;
            if (str == null) {
                str = "adchk.fivecdm.com";
            }
            this.f25428a = str;
            String str2 = c13839b.f25853b;
            if (str2 == null) {
                str2 = "bc2.fivecdm.com";
            }
            this.f25429b = str2;
            String str3 = c13839b.f25854c;
            if (str3 == null) {
                str3 = "er.fivecdm.com";
            }
            this.f25430c = str3;
        }
    }
}
