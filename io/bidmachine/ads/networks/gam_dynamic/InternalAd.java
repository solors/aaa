package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsFormat;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public abstract class InternalAd implements InternalAdData, ExpirationHandler.Listener {
    @NonNull
    private final Waterfall.Configuration.AdUnit adUnit;
    @NonNull
    private final AdsFormat adsFormat;
    @NonNull
    private final ExpirationHandler expirationHandler;
    @NonNull
    private final InternalAdListener internalAdListener;
    @Nullable
    private InternalAdLoadData internalAdLoadData;
    @NonNull
    private final Tag tag;
    @NonNull
    private final TaskExecutor taskExecutor;
    @Nullable
    private WeakReference<InternalAdPresentListener> weakAdPresentListener;
    @Nullable
    private volatile EnumC35353a status = EnumC35353a.Idle;
    @NonNull
    private final Map<String, Object> customParamsMap = new ConcurrentHashMap();

    /* renamed from: io.bidmachine.ads.networks.gam_dynamic.InternalAd$a */
    /* loaded from: classes9.dex */
    public enum EnumC35353a {
        Idle,
        Loading,
        Loaded,
        Showing,
        Shown,
        Expired
    }

    public InternalAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        this.tag = new Tag(networkParams.getNetworkName() + "Ad");
        this.taskExecutor = taskExecutor;
        this.adsFormat = adsFormat;
        this.adUnit = adUnit;
        this.internalAdListener = internalAdListener;
        this.expirationHandler = new ExpirationHandler(adUnit.getExpirationTime(), this);
    }

    public /* synthetic */ String lambda$destroy$4() {
        return String.format("destroy (%s)", GAMUtils.toString(this.adUnit));
    }

    public /* synthetic */ String lambda$load$5() {
        return String.format("load (%s)", GAMUtils.toString(this.adUnit));
    }

    public /* synthetic */ void lambda$load$6(Context context, InternalLoadListener internalLoadListener) {
        try {
            setStatus(EnumC35353a.Loading);
            loadAd(context, internalLoadListener);
        } catch (Throwable th) {
            Logger.m20086w(th);
            internalLoadListener.onAdLoadFailed(this, BMError.throwable("Exception loading InternalAd object", th));
        }
    }

    public /* synthetic */ String lambda$onAdLoaded$1(Waterfall.Result.EstimatedPrice estimatedPrice) {
        return String.format("onAdLoaded (%s, %s)", GAMUtils.toString(this.adUnit), GAMUtils.toString(estimatedPrice));
    }

    public /* synthetic */ String lambda$onAdShown$2() {
        return String.format("onAdShown (%s)", GAMUtils.toString(this.adUnit));
    }

    public /* synthetic */ String lambda$onExpired$0() {
        return String.format("onExpired (%s)", GAMUtils.toString(this.adUnit));
    }

    public /* synthetic */ String lambda$onPaidEvent$3(Waterfall.Result.EstimatedPrice estimatedPrice) {
        return String.format("onPaidEvent (%s, %s)", GAMUtils.toString(this.adUnit), GAMUtils.toString(estimatedPrice));
    }

    public /* synthetic */ void lambda$release$7() {
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
    public InternalAdPresentListener getAdPresentListener() {
        WeakReference<InternalAdPresentListener> weakReference = this.weakAdPresentListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NonNull
    public Waterfall.Configuration.AdUnit getAdUnit() {
        return this.adUnit;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    @NonNull
    public String getAdUnitId() {
        return getAdUnit().getAdUnitId();
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    @NonNull
    public Map<String, Object> getCustomParamsMap() {
        return this.customParamsMap;
    }

    @Nullable
    public InternalAdLoadData getInternalAdLoadData() {
        return this.internalAdLoadData;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdData
    public double getPrice() {
        return getAdUnit().getPrice();
    }

    public boolean isExpired() {
        if (this.status == EnumC35353a.Expired) {
            return true;
        }
        return false;
    }

    public boolean isLoaded() {
        if (this.status == EnumC35353a.Loaded) {
            return true;
        }
        return false;
    }

    boolean isShown() {
        EnumC35353a enumC35353a = this.status;
        if (enumC35353a != null && enumC35353a.ordinal() >= EnumC35353a.Shown.ordinal()) {
            return true;
        }
        return false;
    }

    public final void load(@NonNull Context context, @NonNull final InternalLoadListener internalLoadListener) {
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.w
            {
                InternalAd.this = this;
            }

            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$load$5;
                lambda$load$5 = InternalAd.this.lambda$load$5();
                return lambda$load$5;
            }
        });
        final Context applicationContext = context.getApplicationContext();
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.x
            {
                InternalAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InternalAd.this.lambda$load$6(applicationContext, internalLoadListener);
            }
        });
    }

    @UiThread
    protected abstract void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) throws Throwable;

    public void onAdLoaded(@Nullable InternalAdLoadData internalAdLoadData) {
        final Waterfall.Result.EstimatedPrice estimatedPrice;
        this.internalAdLoadData = internalAdLoadData;
        if (internalAdLoadData != null) {
            estimatedPrice = internalAdLoadData.getPrice();
        } else {
            estimatedPrice = null;
        }
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.b0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onAdLoaded$1;
                lambda$onAdLoaded$1 = InternalAd.this.lambda$onAdLoaded$1(estimatedPrice);
                return lambda$onAdLoaded$1;
            }
        });
        String encodeToString = ProtoUtils.encodeToString(estimatedPrice);
        if (encodeToString != null) {
            setCustomParam("gam_estimated_price", encodeToString);
        }
        setStatus(EnumC35353a.Loaded);
        this.expirationHandler.start();
    }

    public void onAdShown() {
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.a0
            {
                InternalAd.this = this;
            }

            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onAdShown$2;
                lambda$onAdShown$2 = InternalAd.this.lambda$onAdShown$2();
                return lambda$onAdShown$2;
            }
        });
        this.internalAdListener.onAdShown(this);
        setStatus(EnumC35353a.Shown);
        this.expirationHandler.stop();
    }

    public void onBackground(@NonNull Runnable runnable) {
        this.taskExecutor.execute(runnable);
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        if (isShown()) {
            return;
        }
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.z
            {
                InternalAd.this = this;
            }

            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onExpired$0;
                lambda$onExpired$0 = InternalAd.this.lambda$onExpired$0();
                return lambda$onExpired$0;
            }
        });
        this.internalAdListener.onAdExpired(this);
        setStatus(EnumC35353a.Expired);
        InternalAdPresentListener adPresentListener = getAdPresentListener();
        if (adPresentListener != null) {
            adPresentListener.onAdExpired();
        }
        destroy(true);
    }

    public void onPaidEvent(@NonNull final Waterfall.Result.EstimatedPrice estimatedPrice) {
        Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.v
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$onPaidEvent$3;
                lambda$onPaidEvent$3 = InternalAd.this.lambda$onPaidEvent$3(estimatedPrice);
                return lambda$onPaidEvent$3;
            }
        });
        String encodeToString = ProtoUtils.encodeToString(estimatedPrice);
        if (encodeToString != null) {
            setCustomParam("gam_estimated_price", encodeToString);
        }
        this.internalAdListener.onPaidEvent(this);
    }

    @VisibleForTesting
    void release() {
        this.expirationHandler.stop();
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.y
            {
                InternalAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InternalAd.this.lambda$release$7();
            }
        });
    }

    public void setAdPresentListener(@Nullable InternalAdPresentListener internalAdPresentListener) {
        this.weakAdPresentListener = new WeakReference<>(internalAdPresentListener);
    }

    public void setCustomParam(@NonNull String str, @NonNull Object obj) {
        this.customParamsMap.put(str, obj);
    }

    public void setStatus(@NonNull EnumC35353a enumC35353a) {
        this.status = enumC35353a;
    }

    @NonNull
    public String toString() {
        return this.tag + ", " + GAMUtils.toString(this.adUnit);
    }

    @VisibleForTesting
    void destroy(boolean z) {
        try {
            Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam_dynamic.c0
                {
                    InternalAd.this = this;
                }

                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$destroy$4;
                    lambda$destroy$4 = InternalAd.this.lambda$destroy$4();
                    return lambda$destroy$4;
                }
            });
            WeakReference<InternalAdPresentListener> weakReference = this.weakAdPresentListener;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.weakAdPresentListener = null;
            if (z) {
                release();
            }
            this.internalAdListener.onAdDestroyed(this, z);
        } catch (Throwable th) {
            Logger.m20086w(th);
        }
    }
}
