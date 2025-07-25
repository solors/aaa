package com.smaato.sdk.video.p577fi;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p577fi.NonNullConsumer;
import com.smaato.sdk.video.p577fi.NonNullConsumerUtils;

/* renamed from: com.smaato.sdk.video.fi.NonNullConsumerUtils */
/* loaded from: classes7.dex */
public final class NonNullConsumerUtils {
    private NonNullConsumerUtils() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m38944a(NonNullConsumer nonNullConsumer, NonNullConsumer nonNullConsumer2, Object obj) {
        lambda$andThen$0(nonNullConsumer, nonNullConsumer2, obj);
    }

    @NonNull
    public static <T> NonNullConsumer<T> andThen(@NonNull final NonNullConsumer<? super T> nonNullConsumer, @NonNull final NonNullConsumer<? super T> nonNullConsumer2) {
        Objects.requireNonNull(nonNullConsumer2);
        return new NonNullConsumer() { // from class: a8.d
            @Override // com.smaato.sdk.video.p577fi.NonNullConsumer
            public final void accept(Object obj) {
                NonNullConsumerUtils.m38944a(NonNullConsumer.this, nonNullConsumer2, obj);
            }
        };
    }

    public static /* synthetic */ void lambda$andThen$0(NonNullConsumer nonNullConsumer, NonNullConsumer nonNullConsumer2, Object obj) {
        nonNullConsumer.accept(obj);
        nonNullConsumer2.accept(obj);
    }
}
