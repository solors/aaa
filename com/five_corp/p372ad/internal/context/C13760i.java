package com.five_corp.p372ad.internal.context;

import android.os.Looper;
import com.five_corp.p372ad.internal.beacon.EnumC13708e;
import com.five_corp.p372ad.internal.cache.C13733f;
import com.five_corp.p372ad.internal.cache.C13743p;
import com.five_corp.p372ad.internal.media_config.C13838a;
import com.five_corp.p372ad.internal.media_config.C13840c;
import com.five_corp.p372ad.internal.p373ad.C13627a;
import com.five_corp.p372ad.internal.p373ad.format_config.C13658a;

/* renamed from: com.five_corp.ad.internal.context.i */
/* loaded from: classes4.dex */
public final class C13760i {

    /* renamed from: a */
    public final C13758g f25590a;

    /* renamed from: b */
    public final C13627a f25591b;

    /* renamed from: c */
    public final String f25592c;

    /* renamed from: d */
    public final C13838a f25593d;

    /* renamed from: e */
    public final C13840c f25594e;

    /* renamed from: f */
    public final C13658a f25595f;

    /* renamed from: g */
    public final C13757f f25596g;

    /* renamed from: h */
    public final EnumC13756e f25597h;

    /* renamed from: i */
    public final C13743p f25598i;

    /* renamed from: j */
    public final C13733f f25599j;

    /* renamed from: k */
    public final EnumC13708e f25600k;

    /* renamed from: l */
    public final Looper f25601l;

    /* renamed from: m */
    public long f25602m = 0;

    public C13760i(C13758g c13758g, String str, C13838a c13838a, C13840c c13840c, C13658a c13658a, C13757f c13757f, EnumC13756e enumC13756e, C13743p c13743p, EnumC13708e enumC13708e, Looper looper) {
        this.f25590a = c13758g;
        this.f25591b = c13758g.f25587a;
        this.f25592c = str;
        this.f25593d = c13838a;
        this.f25594e = c13840c;
        this.f25595f = c13658a;
        this.f25596g = c13757f;
        this.f25597h = enumC13756e;
        this.f25598i = c13743p;
        this.f25599j = new C13733f(c13743p);
        this.f25600k = enumC13708e;
        this.f25601l = looper;
    }

    /* renamed from: a */
    public final synchronized long m78395a() {
        return this.f25602m;
    }
}
