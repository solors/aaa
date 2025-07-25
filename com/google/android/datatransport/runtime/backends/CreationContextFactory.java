package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;

/* loaded from: classes4.dex */
class CreationContextFactory {

    /* renamed from: a */
    private final Context f31086a;

    /* renamed from: b */
    private final Clock f31087b;

    /* renamed from: c */
    private final Clock f31088c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CreationContextFactory(Context context, @WallTime Clock clock, @Monotonic Clock clock2) {
        this.f31086a = context;
        this.f31087b = clock;
        this.f31088c = clock2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public CreationContext m76304a(String str) {
        return CreationContext.create(this.f31086a, this.f31087b, this.f31088c, str);
    }
}
