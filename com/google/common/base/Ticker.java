package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class Ticker {

    /* renamed from: a */
    private static final Ticker f39486a = new Ticker() { // from class: com.google.common.base.Ticker.1
        @Override // com.google.common.base.Ticker
        public long read() {
            return Platform.m70043j();
        }
    };

    public static Ticker systemTicker() {
        return f39486a;
    }

    public abstract long read();
}
