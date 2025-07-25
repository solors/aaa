package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import android.view.TextureView;
import be.MathJVM;
import com.yandex.mobile.ads.impl.ge1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ca2 implements ge1.InterfaceC30382b {
    @Nullable

    /* renamed from: a */
    private pu1 f77568a;
    @Nullable

    /* renamed from: b */
    private pu1 f77569b;
    @Nullable

    /* renamed from: c */
    private TextureView f77570c;
    @Nullable

    /* renamed from: d */
    private ea2 f77571d;

    @Override // com.yandex.mobile.ads.impl.ge1.InterfaceC30382b
    /* renamed from: a */
    public final void mo29479a(@NotNull ia2 videoSize) {
        Matrix m34979a;
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        int i = videoSize.f80394b;
        float f = videoSize.f80397e;
        if (f > 0.0f) {
            i = MathJVM.m103791d(i * f);
        }
        pu1 pu1Var = new pu1(i, videoSize.f80395c);
        this.f77568a = pu1Var;
        pu1 pu1Var2 = this.f77569b;
        ea2 ea2Var = this.f77571d;
        TextureView textureView = this.f77570c;
        if (pu1Var2 == null || ea2Var == null || textureView == null || (m34979a = new da2(pu1Var2, pu1Var).m34979a(ea2Var)) == null) {
            return;
        }
        textureView.setTransform(m34979a);
    }

    @Override // com.yandex.mobile.ads.impl.ge1.InterfaceC30382b
    public final void onSurfaceSizeChanged(int i, int i2) {
        Matrix m34979a;
        pu1 pu1Var = new pu1(i, i2);
        this.f77569b = pu1Var;
        ea2 ea2Var = this.f77571d;
        pu1 pu1Var2 = this.f77568a;
        TextureView textureView = this.f77570c;
        if (pu1Var2 != null && ea2Var != null && textureView != null && (m34979a = new da2(pu1Var, pu1Var2).m34979a(ea2Var)) != null) {
            textureView.setTransform(m34979a);
        }
    }

    /* renamed from: a */
    public final void m35322a(@Nullable ea2 ea2Var) {
        this.f77571d = ea2Var;
        TextureView textureView = this.f77570c;
        if (ea2Var == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }

    /* renamed from: a */
    public final void m35323a(@Nullable TextureView textureView) {
        this.f77570c = textureView;
        if (this.f77571d == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }
}
