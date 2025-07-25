package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.mediationsdk.C20410l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdvs extends com.google.android.gms.ads.internal.client.zzdt {
    @VisibleForTesting
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdvg zzd;
    private final zzgcs zze;
    private zzduv zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvs(Context context, WeakReference weakReference, zzdvg zzdvgVar, zzdvt zzdvtVar, zzgcs zzgcsVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdvgVar;
        this.zze = zzgcsVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        if (context == null) {
            return this.zzb;
        }
        return context;
    }

    private static AdRequest zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdy zzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else if (obj instanceof NativeAd) {
            responseInfo = ((NativeAd) obj).getResponseInfo();
        } else {
            return "";
        }
        if (responseInfo != null && (zzc = responseInfo.zzc()) != null) {
            try {
                return zzc.zzh();
            } catch (RemoteException unused) {
                return "";
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgch.zzr(this.zzf.zzb(str), new zzdvq(this, str2), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgch.zzr(this.zzf.zzb(str), new zzdvr(this, str2), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context != null && viewGroup != null) {
            Object obj = this.zza.get(str);
            if (obj != null) {
                this.zza.remove(str);
            }
            if (obj instanceof AdView) {
                zzdvt.zza(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                zzdvt.zzb(context, viewGroup, (NativeAd) obj);
            }
        }
    }

    public final void zzf(zzduv zzduvVar) {
        this.zzf = zzduvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        char c;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str2.equals(C20410l.f51629a)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                return;
                            }
                            RewardedInterstitialAd.load(zzj(), str, zzk(), new zzdvo(this, str, str3));
                            return;
                        }
                        RewardedAd.load(zzj(), str, zzk(), new zzdvn(this, str, str3));
                        return;
                    }
                    AdLoader.Builder builder = new AdLoader.Builder(zzj(), str);
                    builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdvh
                        {
                            zzdvs.this = this;
                        }

                        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                        public final void onNativeAdLoaded(NativeAd nativeAd) {
                            zzdvs.this.zzg(str, nativeAd, str3);
                        }
                    });
                    builder.withAdListener(new zzdvp(this, str3));
                    builder.build().loadAd(zzk());
                    return;
                }
                InterstitialAd.load(zzj(), str, zzk(), new zzdvm(this, str, str3));
                return;
            }
            AdView adView = new AdView(zzj());
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(str);
            adView.setAdListener(new zzdvl(this, str, adView, str3));
            adView.loadAd(zzk());
            return;
        }
        AppOpenAd.load(zzj(), str, zzk(), 1, new zzdvk(this, str, str3));
    }

    public final synchronized void zzi(String str, String str2) {
        Object obj;
        Activity zzg = this.zzd.zzg();
        if (zzg != null && (obj = this.zza.get(str)) != null) {
            zzbcc zzbccVar = zzbcl.zzjm;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                this.zza.remove(str);
            }
            zzn(zzl(obj), str2);
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(zzg);
            } else if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(zzg);
            } else if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvi
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
            } else if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvj
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context zzj = zzj();
                intent.setClassName(zzj, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra("adUnit", str);
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzT(zzj, intent);
            }
        }
    }
}
