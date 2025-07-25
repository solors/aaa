package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC14333a;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.p374dv.C14433h;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.response.b */
/* loaded from: classes4.dex */
public abstract class AbstractC15383b {

    /* renamed from: a */
    public AbstractC15386e f30435a;

    /* renamed from: b */
    public String f30436b;

    /* renamed from: c */
    public InterfaceC15391j f30437c;

    /* renamed from: d */
    public boolean f30438d = true;

    /* renamed from: a */
    public abstract AbstractC15386e mo76583a();

    /* renamed from: a */
    public final AbstractC15386e m76584a(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        this.f30438d = z;
        AbstractC15386e abstractC15386e = this.f30435a;
        abstractC15386e.getClass();
        abstractC15386e.f30459c = System.currentTimeMillis();
        this.f30437c.mo76572a(this);
        String mo76573a = this.f30437c.mo76573a();
        this.f30435a.f30464h = mo76573a;
        C14326T m77984a = AbstractC14333a.m77984a(this.f30436b);
        IAlog.m76529a("%sGot unit config for unitId: %s from config manager", IAlog.m76531a(this), this.f30436b);
        IAlog.m76529a("%s%s", IAlog.m76531a(this), m77984a);
        if (this.f30438d) {
            mo76580a(str, m77984a);
        } else if (!(this instanceof C14433h)) {
            C15389h c15389h = new C15389h(mo76573a);
            if (c15389h.f30490a) {
                String str2 = c15389h.f30491b;
                if (str2 != null && !TextUtils.isEmpty(str2.trim())) {
                    mo76580a(str2, m77984a);
                } else {
                    throw new Exception("empty ad content detected. failing fast.");
                }
            }
        } else {
            mo76580a(mo76573a, m77984a);
        }
        return this.f30435a;
    }

    /* renamed from: a */
    public abstract void mo76580a(String str, C14326T c14326t);
}
