package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.PlatformVersion;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzazj extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzaza zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzazj() {
        zzaza zzazaVar = new zzaza();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazaVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbec.zzd.zze()).intValue();
        this.zzg = ((Long) zzbec.zza.zze()).intValue();
        this.zzh = ((Long) zzbec.zze.zze()).intValue();
        this.zzi = ((Long) zzbec.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzae)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaf)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzag)).intValue();
        this.zze = ((Long) zzbec.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzai);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaj)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzak)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzal)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r3.importance != 100) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2.inKeyguardRestrictedInputMode() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r0.isScreenOn() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        r0 = com.google.android.gms.ads.internal.zzv.zzb().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r0.getWindow() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r0.getWindow().getDecorView() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        r1 = r0.getWindow().getDecorView().findViewById(16908290);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.ads.internal.util.client.zzo.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:65:0x00dc->B:70:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
        L0:
            com.google.android.gms.internal.ads.zzaze r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> La8
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La8
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> La8
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            int r5 = r3.pid     // Catch: java.lang.Throwable -> La8
            if (r4 != r5) goto L2a
            int r1 = r3.importance     // Catch: java.lang.Throwable -> La8
            r3 = 100
            if (r1 != r3) goto Lb2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzaze r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            android.app.Activity r0 = r0.zza()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.zze()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        L6d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L8e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L8e
            goto L9d
        L8e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.zzw(r0, r3)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        L9d:
            if (r1 == 0) goto Lba
            com.google.android.gms.internal.ads.zzazf r0 = new com.google.android.gms.internal.ads.zzazf     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r1.post(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        La8:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbzm r1 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.zzw(r0, r2)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lb2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.zze()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lba:
            int r0 = r6.zze     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Ld9
        Lc3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
            java.lang.String r1 = "ContentFetchTask.run"
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r1)
            goto Ld9
        Ld3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
        Ld9:
            java.lang.Object r0 = r6.zzc
            monitor-enter(r0)
        Ldc:
            boolean r1 = r6.zzb     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto Leb
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.ads.internal.util.client.zzo.zze(r1)     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            java.lang.Object r1 = r6.zzc     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            r1.wait()     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            goto Ldc
        Leb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            goto L0
        Lee:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazj.run():void");
    }

    @VisibleForTesting
    final zzazi zza(@Nullable View view, zzayz zzayzVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzayzVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazi(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcex)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    zzayzVar.zzf();
                    webView.post(new zzazh(this, zzayzVar, webView, globalVisibleRect));
                    return new zzazi(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzazi zza = zza(viewGroup.getChildAt(i3), zzayzVar);
                    i += zza.zza;
                    i2 += zza.zzb;
                }
                return new zzazi(this, i, i2);
            }
        }
        return new zzazi(this, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r11 == 0) goto L22;
     */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzayz r9 = new com.google.android.gms.internal.ads.zzayz     // Catch: java.lang.Exception -> L7e
            int r1 = r10.zzf     // Catch: java.lang.Exception -> L7e
            int r2 = r10.zzg     // Catch: java.lang.Exception -> L7e
            int r3 = r10.zzh     // Catch: java.lang.Exception -> L7e
            int r4 = r10.zzi     // Catch: java.lang.Exception -> L7e
            int r5 = r10.zzj     // Catch: java.lang.Exception -> L7e
            int r6 = r10.zzk     // Catch: java.lang.Exception -> L7e
            int r7 = r10.zzl     // Catch: java.lang.Exception -> L7e
            boolean r8 = r10.zzo     // Catch: java.lang.Exception -> L7e
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzaze r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch: java.lang.Exception -> L7e
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L52
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L7e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L7e
            if (r1 != 0) goto L52
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzah     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L7e
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L7e
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L7e
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L52
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L7e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7e
            if (r0 != 0) goto L77
        L52:
            com.google.android.gms.internal.ads.zzazi r11 = r10.zza(r11, r9)     // Catch: java.lang.Exception -> L7e
            r9.zzj()     // Catch: java.lang.Exception -> L7e
            int r0 = r11.zza     // Catch: java.lang.Exception -> L7e
            if (r0 != 0) goto L61
            int r0 = r11.zzb     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L77
        L61:
            int r11 = r11.zzb     // Catch: java.lang.Exception -> L7e
            if (r11 != 0) goto L6c
            int r11 = r9.zzb()     // Catch: java.lang.Exception -> L7e
            if (r11 == 0) goto L77
            goto L6e
        L6c:
            if (r11 != 0) goto L78
        L6e:
            com.google.android.gms.internal.ads.zzaza r11 = r10.zzd     // Catch: java.lang.Exception -> L7e
            boolean r11 = r11.zzc(r9)     // Catch: java.lang.Exception -> L7e
            if (r11 != 0) goto L77
            goto L78
        L77:
            return
        L78:
            com.google.android.gms.internal.ads.zzaza r11 = r10.zzd     // Catch: java.lang.Exception -> L7e
            r11.zza(r9)     // Catch: java.lang.Exception -> L7e
            return
        L7e:
            r11 = move-exception
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r11)
            java.lang.String r0 = "ContentFetchTask.fetchContent"
            com.google.android.gms.internal.ads.zzbzm r1 = com.google.android.gms.ads.internal.zzv.zzp()
            r1.zzw(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazj.zzb(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzc(zzayz zzayzVar, WebView webView, String str, boolean z) {
        zzayzVar.zze();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.zzn && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    zzayzVar.zzi(title + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzayzVar.zzi(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzayzVar.zzl()) {
                this.zzd.zzb(zzayzVar);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Json string may be malformed.");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            if (this.zza) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Content hash thread already started, quitting...");
                return;
            }
            this.zza = true;
            start();
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: paused, pause = true");
        }
    }
}
