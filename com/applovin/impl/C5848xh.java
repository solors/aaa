package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.AbstractC3987a4;
import com.applovin.impl.C4176cc;

/* renamed from: com.applovin.impl.xh */
/* loaded from: classes2.dex */
public class C5848xh extends C4176cc {

    /* renamed from: n */
    private final AbstractC3987a4.C3988a f12105n;

    /* renamed from: o */
    private final Context f12106o;

    /* renamed from: p */
    private final boolean f12107p;

    public C5848xh(AbstractC3987a4.C3988a c3988a, boolean z, Context context) {
        super(C4176cc.EnumC4179c.RIGHT_DETAIL);
        this.f12105n = c3988a;
        this.f12106o = context;
        this.f5234c = new SpannedString(c3988a.m101058a());
        this.f12107p = z;
    }

    @Override // com.applovin.impl.C4176cc
    /* renamed from: f */
    public SpannedString mo93106f() {
        return new SpannedString(this.f12105n.m101057a(this.f12106o));
    }

    @Override // com.applovin.impl.C4176cc
    /* renamed from: o */
    public boolean mo92899o() {
        return false;
    }

    @Override // com.applovin.impl.C4176cc
    /* renamed from: p */
    public boolean mo93105p() {
        Boolean m101055b = this.f12105n.m101055b(this.f12106o);
        if (m101055b != null) {
            return m101055b.equals(Boolean.valueOf(this.f12107p));
        }
        return false;
    }
}
