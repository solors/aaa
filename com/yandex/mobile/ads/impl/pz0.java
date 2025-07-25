package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class pz0 extends ac1 {
    @NotNull

    /* renamed from: j */
    private final gz0 f84125j;
    @Nullable

    /* renamed from: k */
    private InterfaceC31163a f84126k;
    @NotNull

    /* renamed from: l */
    private final tz0 f84127l;
    @NotNull

    /* renamed from: m */
    private tr0 f84128m;

    /* renamed from: n */
    private boolean f84129n;

    /* renamed from: com.yandex.mobile.ads.impl.pz0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31163a {
        /* renamed from: a */
        void mo28099a();

        /* renamed from: b */
        void mo28098b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        gz0 gz0Var = new gz0();
        this.f84125j = gz0Var;
        this.f84127l = new tz0(this, gz0Var);
        this.f84128m = new bu1();
    }

    @Override // com.yandex.mobile.ads.impl.ac1, com.yandex.mobile.ads.impl.je0
    /* renamed from: a */
    public final void mo30550a() {
        super.mo30550a();
        InterfaceC31163a interfaceC31163a = this.f84126k;
        if (interfaceC31163a != null) {
            this.f84129n = true;
            interfaceC31163a.mo28098b();
            this.f84126k = null;
        }
    }

    /* renamed from: c */
    public final void m30548c(@NotNull String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        if (!this.f84129n) {
            this.f84127l.m28924b(htmlResponse);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ac1
    /* renamed from: h */
    public final void mo28770h() {
        this.f84127l.m28930a();
    }

    @NotNull
    /* renamed from: j */
    public final gz0 m30547j() {
        return this.f84125j;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        tr0.C31476a mo27438a = this.f84128m.mo27438a(i, i2);
        super.onMeasure(mo27438a.f85812a, mo27438a.f85813b);
    }

    public final void setAspectRatio(float f) {
        this.f84128m = new gi1(f);
    }

    public final void setClickListener(@NotNull InterfaceC31596un clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f84127l.m28927a(clickListener);
    }

    public final void setPreloadListener(@Nullable InterfaceC31163a interfaceC31163a) {
        this.f84126k = interfaceC31163a;
    }

    @Override // com.yandex.mobile.ads.impl.ac1, com.yandex.mobile.ads.impl.je0
    /* renamed from: a */
    public final void mo30549a(int i) {
        super.mo30549a(i);
        if (this.f84126k != null) {
            stopLoading();
            InterfaceC31163a interfaceC31163a = this.f84126k;
            if (interfaceC31163a != null) {
                interfaceC31163a.mo28099a();
            }
            this.f84126k = null;
        }
    }
}
