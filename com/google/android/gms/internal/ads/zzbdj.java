package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbdj extends CustomTabsCallback {
    final /* synthetic */ zzbdk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdj(zzbdk zzbdkVar) {
        this.zza = zzbdkVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, @Nullable Bundle bundle) {
        this.zza.zze(i);
    }
}
