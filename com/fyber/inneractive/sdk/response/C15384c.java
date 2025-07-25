package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC14392k;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.C15426Q;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.fyber.inneractive.sdk.response.c */
/* loaded from: classes4.dex */
public final class C15384c extends AbstractC15383b {
    @Override // com.fyber.inneractive.sdk.response.AbstractC15383b
    /* renamed from: a */
    public final void mo76580a(String str, C14326T c14326t) {
        C15387f c15387f = (C15387f) this.f30435a;
        if (str == null) {
            str = null;
        } else {
            C15426Q c15426q = C15426Q.f30566c;
            c15426q.getClass();
            int indexOf = str.indexOf(38);
            if (indexOf >= 0) {
                StringWriter stringWriter = new StringWriter((int) ((str.length() * 0.1d) + str.length()));
                try {
                    c15426q.m76517a(stringWriter, str, indexOf);
                } catch (IOException unused) {
                }
                str = stringWriter.toString();
            }
        }
        int i = AbstractC14392k.f27223a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String m76481b = AbstractC15459m.m76481b(property);
            if (!TextUtils.isEmpty(m76481b)) {
                str = m76481b;
            }
        }
        c15387f.f30483M = str;
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC15383b
    /* renamed from: a */
    public final AbstractC15386e mo76583a() {
        C15387f c15387f = new C15387f();
        this.f30435a = c15387f;
        return c15387f;
    }
}
