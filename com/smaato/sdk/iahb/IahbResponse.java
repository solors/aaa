package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.iahb.AutoValue_IahbResponse;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class IahbResponse {

    /* JADX INFO: Access modifiers changed from: package-private */
    @AutoValue.Builder
    /* renamed from: com.smaato.sdk.iahb.IahbResponse$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC27340a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC27340a mo39272a(IahbBid iahbBid);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC27340a mo39271b(String str);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract IahbResponse mo39270c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static AbstractC27340a builder() {
        return new AutoValue_IahbResponse.C27353b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract IahbBid bid();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract String bidId();
}
