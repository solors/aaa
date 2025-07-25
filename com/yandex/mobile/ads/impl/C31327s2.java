package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C37566w;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s2 */
/* loaded from: classes8.dex */
public final class C31327s2 {
    @NotNull

    /* renamed from: a */
    private final wj0 f84987a;
    @NotNull

    /* renamed from: b */
    private final cf1 f84988b;
    @Nullable

    /* renamed from: c */
    private C31253r2 f84989c;

    public /* synthetic */ C31327s2(wj0 wj0Var) {
        this(wj0Var, new cf1());
    }

    @NotNull
    /* renamed from: a */
    public final C31253r2 m29880a() {
        List m17177c;
        int m17154x;
        List m17179a;
        C31253r2 c31253r2 = this.f84989c;
        if (c31253r2 == null) {
            uj0 playlist = this.f84987a.m27881a();
            this.f84988b.getClass();
            Intrinsics.checkNotNullParameter(playlist, "playlist");
            m17177c = CollectionsJVM.m17177c();
            C31920yr m28753c = playlist.m28753c();
            if (m28753c != null) {
                m17177c.add(m28753c);
            }
            List<df1> m28755a = playlist.m28755a();
            m17154x = C37566w.m17154x(m28755a, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (df1 df1Var : m28755a) {
                arrayList.add(df1Var.m34949a());
            }
            m17177c.addAll(arrayList);
            C31920yr m28754b = playlist.m28754b();
            if (m28754b != null) {
                m17177c.add(m28754b);
            }
            m17179a = CollectionsJVM.m17179a(m17177c);
            C31253r2 c31253r22 = new C31253r2(m17179a);
            this.f84989c = c31253r22;
            return c31253r22;
        }
        return c31253r2;
    }

    public C31327s2(@NotNull wj0 instreamAdPlaylistHolder, @NotNull cf1 playlistAdBreaksProvider) {
        Intrinsics.checkNotNullParameter(instreamAdPlaylistHolder, "instreamAdPlaylistHolder");
        Intrinsics.checkNotNullParameter(playlistAdBreaksProvider, "playlistAdBreaksProvider");
        this.f84987a = instreamAdPlaylistHolder;
        this.f84988b = playlistAdBreaksProvider;
    }
}
