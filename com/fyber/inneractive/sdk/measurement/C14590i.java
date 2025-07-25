package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.EnumC14630w;
import com.fyber.inneractive.sdk.response.InterfaceC15390i;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.measurement.i */
/* loaded from: classes4.dex */
public final class C14590i implements InterfaceC15390i {

    /* renamed from: a */
    public URL f27637a;

    /* renamed from: b */
    public String f27638b;

    /* renamed from: d */
    public String f27640d;

    /* renamed from: e */
    public String f27641e;

    /* renamed from: f */
    public String f27642f;

    /* renamed from: c */
    public final HashMap f27639c = new HashMap();

    /* renamed from: g */
    public boolean f27643g = false;

    /* renamed from: a */
    public final void m77781a(EnumC14630w enumC14630w, String str) {
        List list = (List) this.f27639c.get(enumC14630w);
        if (list == null) {
            list = new ArrayList();
            this.f27639c.put(enumC14630w, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }

    /* renamed from: b */
    public final boolean m77780b() {
        String str;
        if (this.f27643g && this.f27637a != null && ((str = this.f27638b) == null || (!TextUtils.isEmpty(str) && this.f27638b.equalsIgnoreCase(CampaignEx.KEY_OMID)))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Verification{mJavaScriptResource=" + this.f27637a + ", mTrackingEvents=" + this.f27639c + ", mVerificationParameters='" + this.f27640d + "', mVendor='" + this.f27641e + "'}";
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC15390i
    /* renamed from: a */
    public final List mo76574a(EnumC14630w enumC14630w) {
        HashMap hashMap;
        if (enumC14630w == null || (hashMap = this.f27639c) == null) {
            return null;
        }
        return (List) hashMap.get(enumC14630w);
    }

    /* renamed from: a */
    public final String m77782a() {
        if (this.f27643g) {
            if (TextUtils.isEmpty(this.f27638b)) {
                return "apiFramework = ";
            }
            if (!this.f27638b.equalsIgnoreCase(CampaignEx.KEY_OMID)) {
                String str = this.f27638b;
                return "apiFramework = " + str;
            }
            String str2 = TextUtils.isEmpty(this.f27642f) ? "" : this.f27642f;
            return "JavaScriptResource_url = " + str2;
        }
        return "JavaScriptResource = ";
    }
}
