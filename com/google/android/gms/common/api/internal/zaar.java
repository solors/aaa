package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes4.dex */
final class zaar extends com.google.android.gms.signin.internal.zac {
    private final WeakReference zaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaar(zaaw zaawVar) {
        this.zaa = new WeakReference(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        zabi zabiVar;
        zaaw zaawVar = (zaaw) this.zaa.get();
        if (zaawVar != null) {
            zabiVar = zaawVar.zaa;
            zabiVar.zal(new zaaq(this, zaawVar, zaawVar, zakVar));
        }
    }
}
