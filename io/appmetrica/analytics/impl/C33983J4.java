package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.J4 */
/* loaded from: classes9.dex */
public final class C33983J4 implements InterfaceC34926u4 {

    /* renamed from: a */
    public final Context f93051a;

    /* renamed from: b */
    public final C34055M4 f93052b;

    /* renamed from: c */
    public final ResultReceiver f93053c;

    public C33983J4(@NonNull Context context, @NonNull C34055M4 c34055m4, @NonNull C33860E4 c33860e4) {
        this.f93051a = context;
        this.f93052b = c34055m4;
        this.f93053c = c33860e4.f92768c;
        c34055m4.m22451a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34926u4
    /* renamed from: a */
    public final void mo20716a(@NonNull C34247U5 c34247u5, @NonNull C33860E4 c33860e4) {
        this.f93052b.mo21634a(c33860e4.f92767b);
        this.f93052b.m22450a(c34247u5, this);
    }

    @NonNull
    /* renamed from: b */
    public final C34055M4 m22526b() {
        return this.f93052b;
    }

    @NonNull
    /* renamed from: c */
    public final Context m22525c() {
        return this.f93051a;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: d */
    public final ResultReceiver m22524d() {
        return this.f93053c;
    }

    /* renamed from: a */
    public final void m22527a(@NonNull C34606i4 c34606i4) {
        ResultReceiverC33812C6.m22739a(this.f93053c, c34606i4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34926u4
    /* renamed from: a */
    public final void mo20717a() {
        this.f93052b.m22448b(this);
    }
}
