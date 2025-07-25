package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfme extends zzfma {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfme(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzc() {
        long convert;
        super.zzc();
        if (this.zzb == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfmd(this), Math.max(4000 - convert, 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzi(zzfkt zzfktVar, zzfkr zzfkrVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfkrVar.zzi();
        Iterator it = zzi.keySet().iterator();
        if (!it.hasNext()) {
            zzj(zzfktVar, zzfkrVar, jSONObject);
        } else {
            zzfld zzfldVar = (zzfld) zzi.get((String) it.next());
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final void zzo() {
        WebView webView = new WebView(zzflp.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfmc(this));
        zzn(this.zza);
        zzflr.zzk(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfld zzfldVar = (zzfld) this.zzc.get((String) it.next());
        throw null;
    }
}
