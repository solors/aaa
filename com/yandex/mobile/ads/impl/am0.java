package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fl0;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class am0 {
    @NotNull

    /* renamed from: a */
    private final z72 f76830a;
    @NotNull

    /* renamed from: b */
    private final C31920yr f76831b;
    @NotNull

    /* renamed from: c */
    private final m62<kl0> f76832c;
    @NotNull

    /* renamed from: d */
    private final fl0 f76833d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am0(z72 z72Var, C31920yr c31920yr, m62 m62Var) {
        this(z72Var, c31920yr, m62Var, fl0.C30322a.m34123a());
        int i = fl0.f79105f;
    }

    /* renamed from: a */
    public final boolean m35829a() {
        y72 y72Var;
        i72 m32504b = this.f76832c.m32085d().m32504b();
        if (this.f76833d.m34127c() && m32504b.m33355a() > 1) {
            y72Var = y72.f88092e;
        } else {
            String m26630e = this.f76831b.m26630e();
            int hashCode = m26630e.hashCode();
            if (hashCode == -1183812830 ? !m26630e.equals(InstreamAdBreakType.INROLL) : !(hashCode == 830323571 ? m26630e.equals(InstreamAdBreakType.PAUSEROLL) : hashCode == 1055572677 && m26630e.equals(InstreamAdBreakType.MIDROLL))) {
                y72Var = y72.f88090c;
            } else if (m32504b.m33355a() == 1) {
                y72Var = y72.f88092e;
            } else {
                y72Var = y72.f88090c;
            }
        }
        return this.f76830a.m26323a(y72Var);
    }

    public am0(@NotNull z72 statusController, @NotNull C31920yr adBreak, @NotNull m62<kl0> videoAdInfo, @NotNull fl0 instreamSettings) {
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(instreamSettings, "instreamSettings");
        this.f76830a = statusController;
        this.f76831b = adBreak;
        this.f76832c = videoAdInfo;
        this.f76833d = instreamSettings;
    }
}
