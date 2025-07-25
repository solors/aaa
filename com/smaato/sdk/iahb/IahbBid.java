package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.iahb.AutoValue_IahbBid;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class IahbBid {

    /* JADX INFO: Access modifiers changed from: package-private */
    @AutoValue.Builder
    /* renamed from: com.smaato.sdk.iahb.IahbBid$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC27338a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC27338a mo39281a(@Nullable String str);

        /* renamed from: b */
        abstract IahbBid mo39280b();

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        /* renamed from: c */
        public IahbBid m39288c(Logger logger) {
            try {
                return mo39280b();
            } catch (IllegalStateException e) {
                if (e.getMessage() != null) {
                    logger.error(LogDomain.INAPP_BIDDING, e.getMessage(), new Object[0]);
                    return null;
                }
                logger.error(LogDomain.INAPP_BIDDING, "Error building IahbBid", new Object[0]);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract AbstractC27338a mo39279d(@Nullable String str);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract AbstractC27338a mo39278e(@Nullable IahbExt iahbExt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static AbstractC27338a builder() {
        return new AutoValue_IahbBid.C27349b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract String adm();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public abstract String bundleId();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract IahbExt ext();
}
