package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Ai */
/* loaded from: classes9.dex */
public abstract class AbstractC33774Ai implements InterfaceC34952v4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC34952v4
    @NonNull
    /* renamed from: a */
    public abstract /* synthetic */ InterfaceC34926u4 mo20889a(@NonNull Context context, @NonNull C34742n5 c34742n5, @NonNull C34525f4 c34525f4, @NonNull C33860E4 c33860e4);

    @NonNull
    /* renamed from: a */
    public final InterfaceC34926u4 m22770a(@NonNull C34391a5 c34391a5, @NonNull C34742n5 c34742n5) {
        C34233Tf c34233Tf;
        synchronized (c34742n5) {
            c34233Tf = (C34233Tf) c34742n5.f94972a.get(c34391a5.toString());
        }
        return new C35070zi(c34233Tf);
    }
}
