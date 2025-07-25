package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.Wg */
/* loaded from: classes9.dex */
public final class C34306Wg extends AbstractC34743n6 {

    /* renamed from: d */
    public final AbstractC34288Vm f93655d;

    public C34306Wg(@NonNull Context context, @NonNull AbstractC34288Vm abstractC34288Vm, @NonNull InterfaceC34716m6 interfaceC34716m6, @Nullable ICrashTransformer iCrashTransformer) {
        this(abstractC34288Vm, interfaceC34716m6, iCrashTransformer, new C34012K9(context));
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: c */
    public final AbstractC34288Vm m22128c() {
        return this.f93655d;
    }

    public C34306Wg(AbstractC34288Vm abstractC34288Vm, InterfaceC34716m6 interfaceC34716m6, ICrashTransformer iCrashTransformer, C34012K9 c34012k9) {
        super(interfaceC34716m6, iCrashTransformer, c34012k9);
        this.f93655d = abstractC34288Vm;
    }
}
