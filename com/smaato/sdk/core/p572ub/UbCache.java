package com.smaato.sdk.core.p572ub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.p574fi.Predicate;

/* renamed from: com.smaato.sdk.core.ub.UbCache */
/* loaded from: classes7.dex */
public final class UbCache {
    @NonNull
    private final AdCache<AdMarkup> adCache;
    @NonNull
    private final Logger logger;

    public UbCache(@NonNull AdCache<AdMarkup> adCache, @NonNull Logger logger) {
        this.adCache = adCache;
        this.logger = logger;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m39370a(AdMarkup adMarkup) {
        return lambda$put$0(adMarkup);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m39369b(UbId ubId, AdMarkup adMarkup) {
        return lambda$get$1(ubId, adMarkup);
    }

    public static /* synthetic */ boolean lambda$get$1(UbId ubId, AdMarkup adMarkup) {
        return adMarkup.sessionId().equals(ubId.sessionId());
    }

    public static /* synthetic */ boolean lambda$put$0(AdMarkup adMarkup) {
        return true;
    }

    @Nullable
    public AdMarkup get(@NonNull final UbId ubId) {
        AdMarkup andRemove = this.adCache.getAndRemove(ubId.adSpaceId(), new Predicate() { // from class: com.smaato.sdk.core.ub.c
            @Override // com.smaato.sdk.core.util.p574fi.Predicate
            public final boolean test(Object obj) {
                return UbCache.m39369b(UbId.this, (AdMarkup) obj);
            }
        });
        this.logger.info(LogDomain.UNIFIED_BIDDING, "Found %s for uuId %s", andRemove, ubId);
        return andRemove;
    }

    @NonNull
    public UbId put(@NonNull AdMarkup adMarkup) {
        this.logger.debug(LogDomain.UNIFIED_BIDDING, "Saving an ad: adFormat = \"%1$s\", adSpaceId = \"%2$s\", sessionId = \"%3$s\"", adMarkup.adFormat(), adMarkup.adSpaceId(), adMarkup.sessionId());
        while (!this.adCache.put(adMarkup.adSpaceId(), adMarkup)) {
            AdMarkup andRemove = this.adCache.getAndRemove(adMarkup.adSpaceId(), new Predicate() { // from class: com.smaato.sdk.core.ub.d
                @Override // com.smaato.sdk.core.util.p574fi.Predicate
                public final boolean test(Object obj) {
                    return UbCache.m39370a((AdMarkup) obj);
                }
            });
            if (andRemove != null) {
                this.logger.info(LogDomain.UNIFIED_BIDDING, "Removed an ad: adFormat = \"%1$s\", adSpaceId = \"%2$s\", sessionId = \"%3$s\"", andRemove.adFormat(), andRemove.adSpaceId(), andRemove.sessionId());
            }
        }
        this.logger.info(LogDomain.UNIFIED_BIDDING, "Successfully saved an ad: adFormat = \"%1$s\", adSpaceId = \"%2$s\", sessionId = \"%3$s\"", adMarkup.adFormat(), adMarkup.adSpaceId(), adMarkup.sessionId());
        return UbId.builder().sessionId(adMarkup.sessionId()).adSpaceId(adMarkup.adSpaceId()).build();
    }
}
