package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class l92 {
    @NotNull

    /* renamed from: a */
    private final m62<?> f81749a;
    @NotNull

    /* renamed from: b */
    private final ya2 f81750b;

    public l92(@NotNull m62<?> videoAdInfo, @NotNull ya2 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f81749a = videoAdInfo;
        this.f81750b = videoViewProvider;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, Object> m32300a() {
        Integer num;
        Integer num2;
        Integer num3;
        Map<String, Object> m17291g;
        gl1 gl1Var = new gl1(new LinkedHashMap(), 2);
        View view = this.f81750b.getView();
        Integer num4 = null;
        if (view != null) {
            num = Integer.valueOf(view.getHeight());
        } else {
            num = null;
        }
        if (view != null) {
            num2 = Integer.valueOf(view.getWidth());
        } else {
            num2 = null;
        }
        et0 m32086c = this.f81749a.m32086c();
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        gl1Var.m33814b(num, "view_container_height");
        if (num2 == null || num2.intValue() <= 0) {
            num2 = null;
        }
        gl1Var.m33814b(num2, "view_container_width");
        if (m32086c.m34447d() > 0) {
            num3 = Integer.valueOf(m32086c.m34447d());
        } else {
            num3 = null;
        }
        gl1Var.m33814b(num3, "video_height");
        if (m32086c.m34443h() > 0) {
            num4 = Integer.valueOf(m32086c.m34443h());
        }
        gl1Var.m33814b(num4, "video_width");
        gl1Var.m33814b(m32086c.m34448c(), "video_codec");
        gl1Var.m33814b(m32086c.m34446e(), "video_mime_type");
        gl1Var.m33814b(m32086c.m34444g(), "video_vmaf");
        m17291g = MapsJVM.m17291g(C38513v.m14532a("video_playback_info", gl1Var.m33815b()));
        return m17291g;
    }
}
