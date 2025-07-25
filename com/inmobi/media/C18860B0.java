package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.B0 */
/* loaded from: classes6.dex */
public final class C18860B0 implements InterfaceC19056P3 {

    /* renamed from: a */
    public final AnimatedImageDrawable f47107a;

    public C18860B0(String filePath) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        createSource = ImageDecoder.createSource(new File(filePath));
        decodeDrawable = ImageDecoder.decodeDrawable(createSource);
        Intrinsics.m17073h(decodeDrawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedImageDrawable");
        this.f47107a = (AnimatedImageDrawable) decodeDrawable;
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: a */
    public final void mo60797a(InterfaceC19043O3 interfaceC19043O3) {
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: c */
    public final boolean mo60793c() {
        boolean isRunning;
        isRunning = this.f47107a.isRunning();
        return isRunning;
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: d */
    public final int mo60792d() {
        int intrinsicWidth;
        intrinsicWidth = this.f47107a.getIntrinsicWidth();
        return intrinsicWidth;
    }

    /* renamed from: e */
    public final void m61261e() {
        this.f47107a.start();
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    public final void start() {
        this.f47107a.registerAnimationCallback(new C18846A0(this));
        this.f47107a.start();
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: a */
    public final void mo60795a(boolean z) {
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: a */
    public final int mo60799a() {
        int intrinsicHeight;
        intrinsicHeight = this.f47107a.getIntrinsicHeight();
        return intrinsicHeight;
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: a */
    public final void mo60798a(Canvas canvas, float f, float f2) {
        Intrinsics.m17074g(canvas);
        canvas.translate(f, f2);
        this.f47107a.draw(canvas);
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: b */
    public final void mo60794b() {
    }
}
