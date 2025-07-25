package com.fyber.inneractive.sdk.web;

import android.widget.Toast;
import com.fyber.inneractive.sdk.util.AbstractC15459m;

/* renamed from: com.fyber.inneractive.sdk.web.v */
/* loaded from: classes4.dex */
public final class RunnableC15549v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f30828a;

    public RunnableC15549v(String str) {
        this.f30828a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(AbstractC15459m.f30607a, this.f30828a, 0).show();
    }
}
