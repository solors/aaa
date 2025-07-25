package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.ab */
/* loaded from: classes6.dex */
public final class C19206ab extends Lambda implements Functions {

    /* renamed from: a */
    public static final C19206ab f48071a = new C19206ab();

    public C19206ab() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
