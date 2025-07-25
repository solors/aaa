package io.bidmachine.ads.networks.gam;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public abstract class InternalGAMAd implements ExpirationHandler.Listener {
    @NonNull
    private final AdsFormat adsFormat;
    @NonNull
    private final ExpirationHandler expirationHandler;
    @NonNull
    private final GAMLoader gamLoader;
    @NonNull
    private final GAMUnitData gamUnitData;
    @Nullable
    private volatile EnumC35253a status = EnumC35253a.Idle;
    @NonNull
    private final Tag tag;
    @Nullable
    private WeakReference<InternalGAMAdPresentListener> weakAdPresentListener;

    /* renamed from: io.bidmachine.ads.networks.gam.InternalGAMAd$a */
    /* loaded from: classes9.dex */
    public enum EnumC35253a {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown,
        Expired
    }

    public InternalGAMAd(@NonNull GAMLoader gAMLoader, @NonNull AdsFormat adsFormat, @NonNull GAMUnitData gAMUnitData) {
        this.tag = new Tag(gAMLoader.getNetworkName() + "Ad");
        this.gamLoader = gAMLoader;
        this.adsFormat = adsFormat;
        this.gamUnitData = gAMUnitData;
        this.expirationHandler = new ExpirationHandler(gAMLoader.getExpirationTimeMs(), this);
    }

    /* renamed from: a */
    public static /* synthetic */ String m20588a(InternalGAMAd internalGAMAd) {
        return internalGAMAd.lambda$onExpired$2();
    }

    /* renamed from: c */
    public static /* synthetic */ void m20586c(InternalGAMAd internalGAMAd) {
        internalGAMAd.lambda$release$6();
    }

    /* renamed from: d */
    public static /* synthetic */ String m20585d(InternalGAMAd internalGAMAd) {
        return internalGAMAd.lambda$onAdLoaded$0();
    }

    /* renamed from: e */
    public static /* synthetic */ String m20584e(InternalGAMAd internalGAMAd) {
        return internalGAMAd.lambda$load$4();
    }

    /* renamed from: f */
    public static /* synthetic */ String m20583f(InternalGAMAd internalGAMAd) {
        return internalGAMAd.lambda$onAdShown$1();
    }

    /* renamed from: g */
    public static /* synthetic */ String m20582g(InternalGAMAd internalGAMAd) {
        return internalGAMAd.lambda$destroy$3();
    }

    public /* synthetic */ String lambda$destroy$3() {
        return String.format("destroy (%s)", this.gamUnitData);
    }

    public /* synthetic */ String lambda$load$4() {
        return String.format("load (%s)", this.gamUnitData);
    }

    public /* synthetic */ void lambda$load$5(Context context, InternalLoadListener internalLoadListener) {
        try {
            setStatus(EnumC35253a.Loading);
            loadAd(context, internalLoadListener);
        } catch (Throwable th) {
            Logger.m20086w(th);
            internalLoadListener.onAdLoadFailed(this, BMError.throwable("Exception loading InternalGAM object", th));
        }
    }

    public /* synthetic */ String lambda$onAdLoaded$0() {
        return String.format("onAdLoaded (%s)", this.gamUnitData);
    }

    public /* synthetic */ String lambda$onAdShown$1() {
        return String.format("onAdShown (%s)", this.gamUnitData);
    }

    public /* synthetic */ String lambda$onExpired$2() {
        return String.format("onExpired (%s)", this.gamUnitData);
    }

    public /* synthetic */ void lambda$release$6() {
        try {
            destroyAd();
        } catch (Throwable th) {
            Logger.m20086w(th);
        }
    }

    public void destroy() {
        destroy(isShown());
    }

    @UiThread
    protected abstract void destroyAd() throws Throwable;

    @Nullable
    public InternalGAMAdPresentListener getAdPresentListener() {
        WeakReference<InternalGAMAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NonNull
    public String getAdUnitId() {
        return getGamUnitData().getAdUnitId();
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @NonNull
    public GAMLoader getGamLoader() {
        return this.gamLoader;
    }

    @NonNull
    public GAMUnitData getGamUnitData() {
        return this.gamUnitData;
    }

    public float getScope() {
        return getGamUnitData().getScore();
    }

    public boolean isExpired() {
        if (this.status == EnumC35253a.Expired) {
            return true;
        }
        return false;
    }

    public boolean isLoaded() {
        if (this.status == EnumC35253a.Loaded) {
            return true;
        }
        return false;
    }

    boolean isShown() {
        EnumC35253a enumC35253a = this.status;
        if (enumC35253a != null && enumC35253a.ordinal() >= EnumC35253a.Shown.ordinal()) {
            return true;
        }
        return false;
    }

    public final void load(@NonNull Context context, @NonNull final InternalLoadListener internalLoadListener) {
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam.t
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return InternalGAMAd.m20584e(InternalGAMAd.this);
            }
        });
        final Context applicationContext = context.getApplicationContext();
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam.u
            @Override // java.lang.Runnable
            public final void run() {
                InternalGAMAd.this.lambda$load$5(applicationContext, internalLoadListener);
            }
        });
    }

    @UiThread
    protected abstract void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) throws Throwable;

    public void onAdLoaded() {
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam.x
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return InternalGAMAd.m20585d(InternalGAMAd.this);
            }
        });
        setStatus(EnumC35253a.Loaded);
        this.expirationHandler.start();
    }

    public void onAdShown() {
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam.w
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return InternalGAMAd.m20583f(InternalGAMAd.this);
            }
        });
        this.gamLoader.onGAMAdShown(this);
        setStatus(EnumC35253a.Shown);
        this.expirationHandler.stop();
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (isShown()) {
            return;
        }
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam.s
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return InternalGAMAd.m20588a(InternalGAMAd.this);
            }
        });
        setStatus(EnumC35253a.Expired);
        InternalGAMAdPresentListener adPresentListener = getAdPresentListener();
        if (adPresentListener != null) {
            adPresentListener.onAdExpired();
        }
        destroy(true);
        this.gamLoader.load(this.adsFormat);
    }

    public final void release() {
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam.v
            @Override // java.lang.Runnable
            public final void run() {
                InternalGAMAd.m20586c(InternalGAMAd.this);
            }
        });
    }

    public void setAdPresentListener(@Nullable InternalGAMAdPresentListener internalGAMAdPresentListener) {
        this.weakAdPresentListener = new WeakReference<>(internalGAMAdPresentListener);
    }

    public void setStatus(@NonNull EnumC35253a enumC35253a) {
        this.status = enumC35253a;
    }

    @NonNull
    public String toString() {
        return this.tag + ", " + getGamUnitData();
    }

    private void destroy(boolean z) {
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam.q
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return InternalGAMAd.m20582g(InternalGAMAd.this);
            }
        });
        WeakReference<InternalGAMAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            weakReference.clear();
            this.weakAdPresentListener = null;
        }
        this.expirationHandler.stop();
        this.gamLoader.onGAMAdDestroy(this, z);
    }
}
