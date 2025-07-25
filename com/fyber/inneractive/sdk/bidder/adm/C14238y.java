package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.factories.AbstractC14468d;
import com.fyber.inneractive.sdk.factories.InterfaceC14469e;
import com.fyber.inneractive.sdk.flow.C14475B;
import com.fyber.inneractive.sdk.network.C14703f0;
import com.fyber.inneractive.sdk.response.AbstractC15383b;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.response.EnumC15382a;
import com.fyber.inneractive.sdk.response.InterfaceC15391j;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.y */
/* loaded from: classes4.dex */
public final class C14238y implements InterfaceC15391j {

    /* renamed from: a */
    public AdmParametersOuterClass$AdmParameters f26909a;

    /* renamed from: b */
    public final String f26910b;

    /* renamed from: c */
    public String f26911c;

    /* renamed from: d */
    public final String f26912d;

    public C14238y(String str, String str2) {
        this.f26910b = str;
        this.f26912d = str2;
    }

    /* renamed from: a */
    public final void m78028a(C14475B c14475b, C14388r c14388r) {
        try {
            AdmParametersOuterClass$AdmParameters parseFrom = AdmParametersOuterClass$AdmParameters.parseFrom(Base64.decode(this.f26910b, 0));
            this.f26909a = parseFrom;
            if (parseFrom != null) {
                c14475b.m77876a();
            }
            m78027b(c14475b, c14388r);
        } catch (Exception e) {
            IAlog.m76524f("failed to parse ad markup payload %s", e.getMessage());
            AbstractC15465p.f30612b.post(new RunnableC14234u(c14475b, e));
        }
    }

    /* renamed from: b */
    public final void m78027b(C14475B c14475b, C14388r c14388r) {
        String str;
        int mo76885a;
        AbstractC15383b abstractC15383b;
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f26909a;
        AbstractC15386e abstractC15386e = null;
        if (admParametersOuterClass$AdmParameters != null && admParametersOuterClass$AdmParameters.hasMarkupUrl()) {
            str = this.f26909a.getMarkupUrl();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f26909a;
                if (admParametersOuterClass$AdmParameters2 != null) {
                    mo76885a = admParametersOuterClass$AdmParameters2.getAdType().mo76885a();
                } else {
                    mo76885a = EnumC14216c.OTHER.mo76885a();
                }
                EnumC15382a m76585a = EnumC15382a.m76585a(mo76885a);
                if (m76585a == null) {
                    m76585a = EnumC15382a.RETURNED_ADTYPE_MRAID;
                }
                InterfaceC14469e interfaceC14469e = (InterfaceC14469e) AbstractC14468d.f27380a.f27381a.get(m76585a);
                if (interfaceC14469e != null) {
                    abstractC15383b = interfaceC14469e.mo76441b();
                } else {
                    abstractC15383b = null;
                }
                if (abstractC15383b != null) {
                    abstractC15383b.f30435a = abstractC15383b.mo76583a();
                    mo76572a(abstractC15383b);
                    abstractC15386e = abstractC15383b.f30435a;
                } else {
                    IAlog.m76529a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(mo76885a));
                }
            } catch (Exception e) {
                IAlog.m76530a("failed parse adm network request with no input stream", e, new Object[0]);
            }
            AbstractC15386e abstractC15386e2 = abstractC15386e;
            C14703f0 c14703f0 = new C14703f0(new C14235v(this, c14475b, abstractC15386e2), str, this, c14388r, abstractC15386e2);
            c14703f0.f27827d = new C14236w(this);
            IAConfigManager.f27060O.f27095s.m77724b(c14703f0);
            return;
        }
        AbstractC15465p.f30612b.post(new RunnableC14237x(c14475b));
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.response.InterfaceC15391j
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo76572a(com.fyber.inneractive.sdk.response.AbstractC15383b r29) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.adm.C14238y.mo76572a(com.fyber.inneractive.sdk.response.b):void");
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC15391j
    /* renamed from: a */
    public final String mo76573a() {
        return this.f26911c;
    }
}
