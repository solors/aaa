package com.smaato.sdk.core.util;

/* loaded from: classes7.dex */
public interface IntConsumer {
    /* renamed from: a */
    static /* synthetic */ void m39358a(IntConsumer intConsumer, IntConsumer intConsumer2, int i) {
        intConsumer.lambda$andThen$0(intConsumer2, i);
    }

    /* synthetic */ default void lambda$andThen$0(IntConsumer intConsumer, int i) {
        accept(i);
        intConsumer.accept(i);
    }

    void accept(int i);

    default IntConsumer andThen(final IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new IntConsumer() { // from class: com.smaato.sdk.core.util.c
            @Override // com.smaato.sdk.core.util.IntConsumer
            public final void accept(int i) {
                IntConsumer.m39358a(IntConsumer.this, intConsumer, i);
            }
        };
    }
}
