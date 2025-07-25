package com.smaato.sdk.core.util;

/* loaded from: classes7.dex */
public interface LongConsumer {
    /* renamed from: a */
    static /* synthetic */ void m39356a(LongConsumer longConsumer, LongConsumer longConsumer2, long j) {
        longConsumer.lambda$andThen$0(longConsumer2, j);
    }

    /* synthetic */ default void lambda$andThen$0(LongConsumer longConsumer, long j) {
        accept(j);
        longConsumer.accept(j);
    }

    void accept(long j);

    default LongConsumer andThen(final LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new LongConsumer() { // from class: com.smaato.sdk.core.util.e
            @Override // com.smaato.sdk.core.util.LongConsumer
            public final void accept(long j) {
                LongConsumer.m39356a(LongConsumer.this, longConsumer, j);
            }
        };
    }
}
