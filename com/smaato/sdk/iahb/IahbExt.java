package com.smaato.sdk.iahb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.iahb.AutoValue_IahbExt;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class IahbExt {

    /* JADX INFO: Access modifiers changed from: package-private */
    @AutoValue.Builder
    /* renamed from: com.smaato.sdk.iahb.IahbExt$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC27339a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC27339a mo39277a(String str);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC27339a mo39276b(String str);

        /* renamed from: c */
        abstract IahbExt mo39275c();

        /* JADX INFO: Access modifiers changed from: package-private */
        @Nullable
        /* renamed from: d */
        public IahbExt m39287d() {
            try {
                return mo39275c();
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract AbstractC27339a mo39274e(long j);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract AbstractC27339a mo39273f(ImpressionCountingType impressionCountingType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static AbstractC27339a builder() {
        return new AutoValue_IahbExt.C27351b().mo39273f(ImpressionCountingType.STANDARD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract String adspaceid();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract String adtype();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long expiresAt();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract ImpressionCountingType impressionMeasurement();
}
