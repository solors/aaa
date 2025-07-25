package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.j6 */
/* loaded from: classes6.dex */
public final class C19327j6 implements InterfaceC19313i6 {

    /* renamed from: a */
    public final InterfaceC19313i6 f48389a;

    /* renamed from: b */
    public final AtomicBoolean f48390b;

    public C19327j6(InterfaceC19313i6 mediaChangeReceiver) {
        Intrinsics.checkNotNullParameter(mediaChangeReceiver, "mediaChangeReceiver");
        this.f48389a = mediaChangeReceiver;
        this.f48390b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC19313i6
    /* renamed from: a */
    public final void mo59615a() {
        if (this.f48390b.getAndSet(false)) {
            this.f48389a.mo59615a();
        }
    }

    @Override // com.inmobi.media.InterfaceC19313i6
    /* renamed from: b */
    public final void mo59613b() {
        if (!this.f48390b.getAndSet(true)) {
            this.f48389a.mo59613b();
        }
    }
}
