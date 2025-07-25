package com.amazon.p047a.p048a.p062j;

import com.amazon.p047a.p048a.p066n.p067a.KiwiCommand;

/* renamed from: com.amazon.a.a.j.a */
/* loaded from: classes2.dex */
public abstract class AbstractKiwiRequest {

    /* renamed from: c */
    private static final String f2483c = "a";

    /* renamed from: a */
    protected KiwiRequestContext f2484a = new KiwiRequestContext();

    /* renamed from: b */
    protected KiwiCommand f2485b = null;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo102461a(KiwiCommand kiwiCommand) {
        this.f2485b = kiwiCommand;
    }

    /* renamed from: b */
    public abstract void mo102345b();

    /* renamed from: c */
    public abstract void mo102344c();

    /* renamed from: a */
    public KiwiRequestContext mo102462a() {
        return this.f2484a;
    }
}
