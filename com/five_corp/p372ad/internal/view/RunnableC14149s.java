package com.five_corp.p372ad.internal.view;

import android.view.View;

/* renamed from: com.five_corp.ad.internal.view.s */
/* loaded from: classes4.dex */
public final class RunnableC14149s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f26809a;

    /* renamed from: b */
    public final /* synthetic */ C14123B f26810b;

    public RunnableC14149s(C14123B c14123b, View view) {
        this.f26810b = c14123b;
        this.f26809a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26810b.f26752c.addView(this.f26809a);
    }
}
