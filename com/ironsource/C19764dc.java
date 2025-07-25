package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;

@Metadata
/* renamed from: com.ironsource.dc */
/* loaded from: classes6.dex */
public final class C19764dc implements InterfaceC20148je {
    @Override // com.ironsource.InterfaceC20148je
    /* renamed from: a */
    public boolean mo57847a() {
        try {
            ProcessLifecycleOwner.Companion.get();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
