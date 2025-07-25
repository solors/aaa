package com.pubmatic.sdk.common.cache;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.p565ui.POBFullScreenActivityBackPressListener;
import com.pubmatic.sdk.common.p565ui.POBFullScreenActivityListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBAdViewCacheService {
    @NonNull

    /* renamed from: a */
    private Map<Integer, AdViewConfig> f70072a = Collections.synchronizedMap(new HashMap());

    /* loaded from: classes7.dex */
    public static class AdViewConfig {
        @NonNull

        /* renamed from: a */
        private View f70073a;
        @NonNull

        /* renamed from: b */
        private POBFullScreenActivityListener f70074b;
        @Nullable

        /* renamed from: c */
        private POBFullScreenActivityBackPressListener f70075c;

        public AdViewConfig(@NonNull View view, @NonNull POBFullScreenActivityListener pOBFullScreenActivityListener) {
            this.f70073a = view;
            this.f70074b = pOBFullScreenActivityListener;
        }

        @NonNull
        public View getAdView() {
            return this.f70073a;
        }

        @Nullable
        public POBFullScreenActivityBackPressListener getBackPressListener() {
            return this.f70075c;
        }

        @NonNull
        public POBFullScreenActivityListener getEventListener() {
            return this.f70074b;
        }

        public void setBackPressListener(@Nullable POBFullScreenActivityBackPressListener pOBFullScreenActivityBackPressListener) {
            this.f70075c = pOBFullScreenActivityBackPressListener;
        }
    }

    @Nullable
    public AdViewConfig getStoredAdView(@NonNull Integer num) {
        return this.f70072a.get(num);
    }

    @Nullable
    public AdViewConfig popStoredAdView(@NonNull Integer num) {
        return this.f70072a.remove(num);
    }

    public void storeAdView(@NonNull Integer num, @NonNull AdViewConfig adViewConfig) {
        this.f70072a.put(num, adViewConfig);
    }
}
