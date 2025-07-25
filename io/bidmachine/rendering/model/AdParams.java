package io.bidmachine.rendering.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.internal.AbstractC37034i;
import io.bidmachine.rendering.model.VisibilityParams;
import io.bidmachine.rendering.utils.Utils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes9.dex */
public class AdParams {

    /* renamed from: a */
    private final CacheType f97837a;

    /* renamed from: b */
    private final Queue f97838b;

    /* renamed from: c */
    private final VisibilityParams f97839c;

    /* renamed from: d */
    private final AdPhaseParams f97840d;

    /* renamed from: e */
    private final Orientation f97841e;

    /* renamed from: f */
    private final Map f97842f;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private final Queue f97843a = new LinkedList();

        /* renamed from: b */
        private final Map f97844b = new HashMap();

        /* renamed from: c */
        private CacheType f97845c;

        /* renamed from: d */
        private AdPhaseParams f97846d;

        /* renamed from: e */
        private VisibilityParams f97847e;

        /* renamed from: f */
        private Orientation f97848f;

        public Builder addAdPhaseParams(@NonNull AdPhaseParams adPhaseParams) {
            this.f97843a.add(adPhaseParams);
            return this;
        }

        public AdParams build() {
            CacheType cacheType = this.f97845c;
            if (cacheType == null) {
                cacheType = AbstractC37034i.f97741a;
            }
            CacheType cacheType2 = cacheType;
            Queue queue = this.f97843a;
            VisibilityParams visibilityParams = this.f97847e;
            if (visibilityParams == null) {
                visibilityParams = new VisibilityParams.Builder().build();
            }
            return new AdParams(cacheType2, queue, visibilityParams, this.f97846d, this.f97848f, this.f97844b);
        }

        public Builder setAdPhaseParamsQueue(@Nullable Queue<AdPhaseParams> queue) {
            Utils.set(this.f97843a, queue);
            return this;
        }

        public Builder setCacheType(@NonNull CacheType cacheType) {
            this.f97845c = cacheType;
            return this;
        }

        public Builder setCustomParams(@Nullable Map<String, String> map) {
            Utils.set(this.f97844b, map);
            return this;
        }

        public Builder setOrientation(@Nullable Orientation orientation) {
            this.f97848f = orientation;
            return this;
        }

        public Builder setPlaceholderParams(@Nullable AdPhaseParams adPhaseParams) {
            this.f97846d = adPhaseParams;
            return this;
        }

        public Builder setVisibilityParams(@Nullable VisibilityParams visibilityParams) {
            this.f97847e = visibilityParams;
            return this;
        }
    }

    public AdParams(@NonNull CacheType cacheType, @NonNull Queue<AdPhaseParams> queue, @NonNull VisibilityParams visibilityParams, @Nullable AdPhaseParams adPhaseParams, @Nullable Orientation orientation, @NonNull Map<String, String> map) {
        this.f97837a = cacheType;
        this.f97838b = queue;
        this.f97839c = visibilityParams;
        this.f97840d = adPhaseParams;
        this.f97841e = orientation;
        this.f97842f = map;
    }

    @NonNull
    public Queue<AdPhaseParams> getAdPhaseParamsQueue() {
        return this.f97838b;
    }

    @NonNull
    public CacheType getCacheType() {
        return this.f97837a;
    }

    @Nullable
    public String getCustomParam(@NonNull String str) {
        return (String) this.f97842f.get(str);
    }

    @NonNull
    public Map<String, String> getCustomParams() {
        return this.f97842f;
    }

    @Nullable
    public Orientation getOrientation() {
        return this.f97841e;
    }

    @Nullable
    public AdPhaseParams getPlaceholderParams() {
        return this.f97840d;
    }

    @NonNull
    public VisibilityParams getVisibilityParams() {
        return this.f97839c;
    }
}
