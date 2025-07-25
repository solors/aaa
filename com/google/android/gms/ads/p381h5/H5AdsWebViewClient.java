package com.google.android.gms.ads.p381h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@RequiresApi(api = 21)
/* renamed from: com.google.android.gms.ads.h5.H5AdsWebViewClient */
/* loaded from: classes4.dex */
public final class H5AdsWebViewClient extends zzbkk {
    private final zzbkx zza;

    public H5AdsWebViewClient(@NonNull Context context, @NonNull WebView webView) {
        this.zza = new zzbkx(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    @NonNull
    protected WebViewClient getDelegate() {
        return this.zza;
    }

    @Nullable
    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(@Nullable WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
