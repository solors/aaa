package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdjb extends zzbfz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkd {
    public static final zzfxn zza = zzfxn.zzq("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgcs zzf;
    private View zzg;
    private zzdia zzi;
    private zzayl zzj;
    private zzbft zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 244410000;

    public zzdjb(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzv.zzy();
        zzcaj.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzcaj.zzb(frameLayout, this);
        this.zzf = zzbzw.zzf;
        this.zzj = new zzayl(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        View frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdja
            {
                zzdjb.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdjb.this.zzs();
            }
        });
    }

    private final synchronized void zzv() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzls)).booleanValue() && this.zzi.zza() != 0) {
            this.zzo = new GestureDetector(this.zzd.getContext(), new zzdjj(this.zzi, this));
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null && zzdiaVar.zzV()) {
            this.zzi.zzv();
            this.zzi.zzD(view, this.zzd, zzl(), zzm(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdiaVar.zzB(frameLayout, zzl(), zzm(), zzdia.zzY(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdiaVar.zzB(frameLayout, zzl(), zzm(), zzdia.zzY(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            zzdiaVar.zzL(view, motionEvent, this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzls)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized IObjectWrapper zzb(String str) {
        return ObjectWrapper.wrap(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            zzdiaVar.zzT(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzd(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdt(String str, IObjectWrapper iObjectWrapper) {
        zzq(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdu(IObjectWrapper iObjectWrapper) {
        this.zzi.zzN((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdv(zzbft zzbftVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbftVar;
            zzdia zzdiaVar = this.zzi;
            if (zzdiaVar != null) {
                zzdiaVar.zzc().zzb(zzbftVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdw(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zzdx(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdia)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            zzdiaVar.zzT(this);
        }
        zzu();
        zzdia zzdiaVar2 = (zzdia) unwrap;
        this.zzi = zzdiaVar2;
        zzdiaVar2.zzS(this);
        this.zzi.zzK(this.zzd);
        this.zzi.zzu(this.zze);
        if (this.zzm) {
            this.zzi.zzc().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdY)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
            zzt(this.zzi.zzg());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final zzayl zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final synchronized JSONObject zzo() {
        zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            return zzdiaVar.zzi(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final synchronized JSONObject zzp() {
        zzdia zzdiaVar = this.zzi;
        if (zzdiaVar != null) {
            return zzdiaVar.zzj(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized void zzq(String str, View view, boolean z) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbv.zzi(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
