package com.explorestack.iab.vast.processor;

import com.smaato.sdk.video.vast.model.Wrapper;
import p767l1.C37911t;

/* renamed from: com.explorestack.iab.vast.processor.e */
/* loaded from: classes3.dex */
class C10591e {

    /* renamed from: a */
    private boolean f24280a;

    /* renamed from: b */
    private boolean f24281b;

    /* renamed from: c */
    private boolean f24282c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10591e() {
        this(true, true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m78967a() {
        return this.f24281b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m78966b() {
        return this.f24282c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m78965c() {
        return this.f24280a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10591e(C37911t c37911t) {
        this(c37911t.m15753H(Wrapper.FOLLOW_ADDITIONAL_WRAPPERS, true), c37911t.m15753H(Wrapper.ALLOW_MULTIPLE_ADS, true), c37911t.m15753H(Wrapper.FALLBACK_ON_NO_AD, true));
    }

    private C10591e(boolean z, boolean z2, boolean z3) {
        this.f24280a = z;
        this.f24281b = z2;
        this.f24282c = z3;
    }
}
