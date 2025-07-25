package io.bidmachine.ads.networks.gam;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes9.dex */
public class GAMLoader {
    static final int DEFAULT_BOTTOM_BORDER_LOADED_AD = 2;
    private static final int DEFAULT_REST_AD_LOAD_MS = 500;
    @NonNull
    private final Context applicationContext;
    private final long expirationTimeMs;
    @NonNull
    private final String networkName;
    @Nullable
    private final String requestAgent;
    @NonNull
    private final Tag tag;
    @NonNull
    private final VersionWrapper versionWrapper;
    @NonNull
    private final Map<AdsFormat, GAMTypeConfig> gamTypeConfigMap = new HashMap();
    @NonNull
    private final C35250b gamTaskLoader = new C35250b();
    @NonNull
    @VisibleForTesting
    final List<InternalGAMAd> gamAdList = new ArrayList();
    @NonNull
    @VisibleForTesting
    final Map<NetworkAdUnit, InternalGAMAd> reservedGamAdMap = new WeakHashMap();
    @NonNull
    private final Object gamAdListLock = new Object();
    @NonNull
    private final Object reservedGamAdMapLock = new Object();

    /* renamed from: io.bidmachine.ads.networks.gam.GAMLoader$b */
    /* loaded from: classes9.dex */
    public static class C35250b {
        private static final int CORE_POOL_SIZE;
        private static final int CPU_COUNT;
        @NonNull
        private final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(CORE_POOL_SIZE);
        @NonNull
        private final Map<AdsFormat, Map<String, Future<?>>> submittedFutureMap = new EnumMap(AdsFormat.class);
        @NonNull
        private final Object submittedFutureMapLocker = new Object();

        static {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            CPU_COUNT = availableProcessors;
            CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
        }

        public /* synthetic */ void lambda$loadTask$0(RunnableC35251c runnableC35251c, AdsFormat adsFormat) {
            runnableC35251c.run();
            removeTask(adsFormat, runnableC35251c.f95992id);
        }

        public void loadTask(@NonNull final AdsFormat adsFormat, @NonNull final RunnableC35251c runnableC35251c) {
            try {
                synchronized (this.submittedFutureMapLocker) {
                    Map<String, Future<?>> map = this.submittedFutureMap.get(adsFormat);
                    if (map != null && !map.isEmpty()) {
                        return;
                    }
                    Future<?> submit = this.executorService.submit(new Runnable() { // from class: io.bidmachine.ads.networks.gam.j
                        {
                            GAMLoader.C35250b.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            GAMLoader.C35250b.this.lambda$loadTask$0(runnableC35251c, adsFormat);
                        }
                    });
                    if (map == null) {
                        map = new HashMap<>();
                        this.submittedFutureMap.put(adsFormat, map);
                    }
                    map.put(runnableC35251c.f95992id, submit);
                }
            } catch (Throwable unused) {
            }
        }

        private void removeTask(@NonNull AdsFormat adsFormat, @NonNull String str) {
            synchronized (this.submittedFutureMapLocker) {
                Map<String, Future<?>> map = this.submittedFutureMap.get(adsFormat);
                if (map != null) {
                    map.remove(str);
                }
            }
        }
    }

    /* renamed from: io.bidmachine.ads.networks.gam.GAMLoader$c */
    /* loaded from: classes9.dex */
    public static class RunnableC35251c implements Runnable {
        @NonNull
        private final GAMLoader gamLoader;
        @NonNull
        private final GAMTypeConfig gamTypeConfig;
        @NonNull

        /* renamed from: id */
        private final String f95992id;
        private final int restAdLoadMs;

        /* renamed from: io.bidmachine.ads.networks.gam.GAMLoader$c$a */
        /* loaded from: classes9.dex */
        public static class C35252a implements InternalLoadListener {
            @NonNull
            private final CountDownLatch countDownLatch;

            @Override // io.bidmachine.ads.networks.gam.InternalLoadListener
            public void onAdLoadFailed(@NonNull InternalGAMAd internalGAMAd, @NonNull BMError bMError) {
                this.countDownLatch.countDown();
            }

            @Override // io.bidmachine.ads.networks.gam.InternalLoadListener
            public void onAdLoaded(@NonNull InternalGAMAd internalGAMAd) {
                this.countDownLatch.countDown();
            }

            private C35252a(@NonNull CountDownLatch countDownLatch) {
                this.countDownLatch = countDownLatch;
            }
        }

        private boolean loadGAMAdSync(@NonNull InternalGAMAd internalGAMAd) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                internalGAMAd.load(this.gamLoader.applicationContext, new C35252a(countDownLatch));
                countDownLatch.await();
            } catch (Throwable unused) {
                countDownLatch.countDown();
            }
            if (!internalGAMAd.isLoaded()) {
                this.gamLoader.destroyGAMAd(internalGAMAd);
                return false;
            }
            this.gamLoader.storeGAMAd(internalGAMAd);
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (GAMUnitData gAMUnitData : new ArrayList(this.gamTypeConfig.getGAMUnitDataList())) {
                    InternalGAMAd createAd = this.gamLoader.versionWrapper.createAd(this.gamLoader, this.gamTypeConfig.getAdsFormat(), gAMUnitData);
                    if (createAd != null) {
                        if (!loadGAMAdSync(createAd)) {
                            Thread.sleep(this.restAdLoadMs);
                        } else {
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        private RunnableC35251c(@NonNull GAMLoader gAMLoader, @NonNull GAMTypeConfig gAMTypeConfig, int i) {
            this.f95992id = UUID.randomUUID().toString();
            this.gamLoader = gAMLoader;
            this.gamTypeConfig = gAMTypeConfig;
            this.restAdLoadMs = i;
        }
    }

    public GAMLoader(@NonNull Context context, @NonNull VersionWrapper versionWrapper, @NonNull String str, @NonNull Map<AdsFormat, GAMTypeConfig> map, @Nullable String str2, long j) {
        this.tag = new Tag(str + "Loader");
        this.applicationContext = context;
        this.versionWrapper = versionWrapper;
        this.networkName = str;
        this.requestAgent = str2;
        this.expirationTimeMs = j;
        for (AdsFormat adsFormat : AdsFormat.values()) {
            GAMTypeConfig gAMTypeConfig = map.get(adsFormat);
            if (gAMTypeConfig != null && !gAMTypeConfig.getGAMUnitDataList().isEmpty()) {
                sortDescByScore(gAMTypeConfig.getGAMUnitDataList());
                this.gamTypeConfigMap.put(gAMTypeConfig.getAdsFormat(), gAMTypeConfig);
            }
        }
    }

    public void destroyGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        try {
            internalGAMAd.destroy();
        } catch (Throwable unused) {
        }
        removeFromCaches(internalGAMAd);
    }

    public static /* synthetic */ String lambda$removeFromCaches$4(InternalGAMAd internalGAMAd) {
        return String.format("removeFromCaches (%s)", internalGAMAd);
    }

    public static /* synthetic */ String lambda$reserveGAMAd$0(NetworkAdUnit networkAdUnit, InternalGAMAd internalGAMAd) {
        return String.format("reserveGAMAd (networkAdUnitId - %s, %s)", networkAdUnit.getId(), internalGAMAd);
    }

    public static /* synthetic */ int lambda$sortDescByScore$2(GAMUnitData gAMUnitData, GAMUnitData gAMUnitData2) {
        return -Float.compare(gAMUnitData.getScore(), gAMUnitData2.getScore());
    }

    public static /* synthetic */ int lambda$storeGAMAd$3(InternalGAMAd internalGAMAd, InternalGAMAd internalGAMAd2) {
        return -Float.compare(internalGAMAd.getScope(), internalGAMAd2.getScope());
    }

    public static /* synthetic */ String lambda$unReserveGAMAd$1(NetworkAdUnit networkAdUnit) {
        return String.format("unReserveGAMAd (networkAdUnitId - %s)", networkAdUnit.getId());
    }

    private int loadedGAMAdCount(@NonNull GAMTypeConfig gAMTypeConfig) {
        int i;
        synchronized (this.gamAdListLock) {
            i = 0;
            for (InternalGAMAd internalGAMAd : this.gamAdList) {
                if (internalGAMAd.getAdsFormat() == gAMTypeConfig.getAdsFormat()) {
                    i++;
                }
            }
        }
        return i;
    }

    private void removeFromCaches(@NonNull final InternalGAMAd internalGAMAd) {
        synchronized (this.gamAdListLock) {
            if (this.gamAdList.remove(internalGAMAd)) {
                Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam.f
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String lambda$removeFromCaches$4;
                        lambda$removeFromCaches$4 = GAMLoader.lambda$removeFromCaches$4(InternalGAMAd.this);
                        return lambda$removeFromCaches$4;
                    }
                });
            }
            unReserveGAMAd(internalGAMAd);
        }
    }

    private void sortDescByScore(@NonNull List<GAMUnitData> list) {
        Collections.sort(list, new Comparator() { // from class: io.bidmachine.ads.networks.gam.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortDescByScore$2;
                lambda$sortDescByScore$2 = GAMLoader.lambda$sortDescByScore$2((GAMUnitData) obj, (GAMUnitData) obj2);
                return lambda$sortDescByScore$2;
            }
        });
    }

    @VisibleForTesting
    void clear() {
        this.gamTypeConfigMap.clear();
        this.gamAdList.clear();
        this.reservedGamAdMap.clear();
    }

    @Nullable
    @VisibleForTesting
    InternalGAMAd findMostExpensiveIdleGAMAd(@NonNull String str) {
        synchronized (this.gamAdListLock) {
            for (InternalGAMAd internalGAMAd : this.gamAdList) {
                if (internalGAMAd.getAdUnitId().equals(str) && !isReserved(internalGAMAd)) {
                    return internalGAMAd;
                }
            }
            return null;
        }
    }

    public long getExpirationTimeMs() {
        return this.expirationTimeMs;
    }

    @NonNull
    public String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public String getRequestAgent() {
        return this.requestAgent;
    }

    @Nullable
    public InternalGAMAd getReservedGAMAd(@NonNull NetworkAdUnit networkAdUnit) {
        InternalGAMAd internalGAMAd;
        synchronized (this.reservedGamAdMapLock) {
            internalGAMAd = this.reservedGamAdMap.get(networkAdUnit);
        }
        return internalGAMAd;
    }

    @NonNull
    public VersionWrapper getVersionWrapper() {
        return this.versionWrapper;
    }

    @VisibleForTesting
    boolean isReserved(@NonNull InternalGAMAd internalGAMAd) {
        boolean containsValue;
        synchronized (this.reservedGamAdMapLock) {
            containsValue = this.reservedGamAdMap.containsValue(internalGAMAd);
        }
        return containsValue;
    }

    public void load() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            load(adsFormat);
        }
    }

    public void onGAMAdDestroy(@NonNull InternalGAMAd internalGAMAd, boolean z) {
        if (z) {
            internalGAMAd.release();
            removeFromCaches(internalGAMAd);
            return;
        }
        unReserveGAMAd(internalGAMAd);
    }

    public void onGAMAdShown(@NonNull InternalGAMAd internalGAMAd) {
        removeFromCaches(internalGAMAd);
    }

    void reserveGAMAd(@NonNull final NetworkAdUnit networkAdUnit, @NonNull final InternalGAMAd internalGAMAd) {
        synchronized (this.reservedGamAdMapLock) {
            Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam.i
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$reserveGAMAd$0;
                    lambda$reserveGAMAd$0 = GAMLoader.lambda$reserveGAMAd$0(NetworkAdUnit.this, internalGAMAd);
                    return lambda$reserveGAMAd$0;
                }
            });
            this.reservedGamAdMap.put(networkAdUnit, internalGAMAd);
        }
    }

    @Nullable
    public GAMUnitData reserveMostExpensiveGAMAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull String str) {
        synchronized (this.gamAdListLock) {
            InternalGAMAd findMostExpensiveIdleGAMAd = findMostExpensiveIdleGAMAd(str);
            if (findMostExpensiveIdleGAMAd != null) {
                reserveGAMAd(networkAdUnit, findMostExpensiveIdleGAMAd);
                return findMostExpensiveIdleGAMAd.getGamUnitData();
            }
            return null;
        }
    }

    @VisibleForTesting
    void storeGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        synchronized (this.gamAdListLock) {
            if (this.gamAdList.contains(internalGAMAd)) {
                return;
            }
            this.gamAdList.add(internalGAMAd);
            Collections.sort(this.gamAdList, new Comparator() { // from class: io.bidmachine.ads.networks.gam.h
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$storeGAMAd$3;
                    lambda$storeGAMAd$3 = GAMLoader.lambda$storeGAMAd$3((InternalGAMAd) obj, (InternalGAMAd) obj2);
                    return lambda$storeGAMAd$3;
                }
            });
        }
    }

    public void unReserveGAMAd(@NonNull final NetworkAdUnit networkAdUnit) {
        synchronized (this.reservedGamAdMapLock) {
            Logger.m20095d(this.tag, new LazyValue() { // from class: io.bidmachine.ads.networks.gam.e
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String lambda$unReserveGAMAd$1;
                    lambda$unReserveGAMAd$1 = GAMLoader.lambda$unReserveGAMAd$1(networkAdUnit);
                    return lambda$unReserveGAMAd$1;
                }
            });
            this.reservedGamAdMap.remove(networkAdUnit);
        }
    }

    public boolean load(@NonNull AdsFormat adsFormat) {
        GAMTypeConfig gAMTypeConfig = this.gamTypeConfigMap.get(adsFormat);
        if (gAMTypeConfig != null && loadedGAMAdCount(gAMTypeConfig) < gAMTypeConfig.getCacheSize()) {
            this.gamTaskLoader.loadTask(adsFormat, new RunnableC35251c(gAMTypeConfig, 500));
            return true;
        }
        return false;
    }

    @VisibleForTesting
    void unReserveGAMAd(@NonNull InternalGAMAd internalGAMAd) {
        synchronized (this.reservedGamAdMapLock) {
            ArrayList<NetworkAdUnit> arrayList = new ArrayList();
            for (Map.Entry<NetworkAdUnit, InternalGAMAd> entry : this.reservedGamAdMap.entrySet()) {
                if (entry.getValue().equals(internalGAMAd)) {
                    arrayList.add(entry.getKey());
                }
            }
            for (NetworkAdUnit networkAdUnit : arrayList) {
                unReserveGAMAd(networkAdUnit);
            }
        }
    }
}
