package com.fyber.inneractive.sdk.p377ui;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.network.InterfaceC14671E;

/* renamed from: com.fyber.inneractive.sdk.ui.b */
/* loaded from: classes4.dex */
public final class C15401b implements InterfaceC14671E {

    /* renamed from: a */
    public final /* synthetic */ FyberAdIdentifierLocal f30540a;

    public C15401b(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f30540a = fyberAdIdentifierLocal;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC14671E
    /* renamed from: a */
    public final void mo76358a(Object obj, Exception exc, boolean z) {
        Bitmap bitmap = (Bitmap) obj;
        if (exc == null && bitmap != null) {
            this.f30540a.f30520r = bitmap;
        }
    }
}
