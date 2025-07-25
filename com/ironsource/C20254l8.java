package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.l8 */
/* loaded from: classes6.dex */
public class C20254l8 {

    /* renamed from: a */
    private boolean f50966a = true;

    /* renamed from: b */
    private IronSourceError f50967b = null;

    /* renamed from: a */
    public IronSourceError m57527a() {
        return this.f50967b;
    }

    /* renamed from: b */
    public boolean m57525b() {
        return this.f50966a;
    }

    /* renamed from: c */
    public void m57524c() {
        this.f50966a = true;
        this.f50967b = null;
    }

    public String toString() {
        StringBuilder sb2;
        if (m57525b()) {
            sb2 = new StringBuilder();
            sb2.append("valid:");
            sb2.append(this.f50966a);
        } else {
            sb2 = new StringBuilder();
            sb2.append("valid:");
            sb2.append(this.f50966a);
            sb2.append(", IronSourceError:");
            sb2.append(this.f50967b);
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public void m57526a(IronSourceError ironSourceError) {
        this.f50966a = false;
        this.f50967b = ironSourceError;
    }
}
