package com.five_corp.p372ad.internal.movie.exoplayer;

import androidx.media3.datasource.DataSource;
import com.five_corp.p372ad.internal.cache.C13750w;
import com.five_corp.p372ad.internal.cache.InterfaceC13751x;
import com.five_corp.p372ad.internal.media_config.C13838a;

/* renamed from: com.five_corp.ad.internal.movie.exoplayer.c */
/* loaded from: classes4.dex */
public final class C13861c implements DataSource.Factory, InterfaceC13751x {

    /* renamed from: a */
    public int f25900a;

    public C13861c() {
        this(0);
    }

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13751x
    /* renamed from: a */
    public final void mo78129a(C13750w c13750w) {
        C13838a c13838a = c13750w.f25563b;
        if (c13838a != null) {
            this.f25900a = c13838a.f25846e;
        }
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public final DataSource createDataSource() {
        return new C13863e(this.f25900a);
    }

    public C13861c(int i) {
        this.f25900a = 250000;
    }
}
