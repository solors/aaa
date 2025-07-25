package com.five_corp.p372ad.internal.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.five_corp.p372ad.internal.cache.C13733f;
import com.five_corp.p372ad.internal.p373ad.C13691u;

/* renamed from: com.five_corp.ad.internal.view.B */
/* loaded from: classes4.dex */
public final class C14123B {

    /* renamed from: a */
    public final InterfaceC14122A f26750a;

    /* renamed from: b */
    public final ViewGroup f26751b;

    /* renamed from: c */
    public final ViewGroup f26752c;

    /* renamed from: d */
    public final TextureView f26753d;

    /* renamed from: e */
    public final Handler f26754e;

    /* renamed from: f */
    public final C14145o f26755f;

    /* renamed from: g */
    public final ImageView f26756g;

    public C14123B(Context context, InterfaceC14122A interfaceC14122A, ViewGroup viewGroup, ViewGroup viewGroup2, C13733f c13733f, C13691u c13691u, TextureView textureView) {
        System.identityHashCode(this);
        this.f26750a = interfaceC14122A;
        this.f26751b = viewGroup;
        this.f26752c = viewGroup2;
        this.f26753d = textureView;
        this.f26754e = new Handler(Looper.getMainLooper());
        ImageView imageView = new ImageView(context);
        this.f26756g = imageView;
        imageView.setVisibility(8);
        C14145o c14145o = new C14145o(context);
        this.f26755f = c14145o;
        c14145o.setVisibility(8);
        if (c13691u != null) {
            m78081a(c13733f.m78419a(context, c13691u));
        }
        m78081a(textureView);
        m78081a(imageView);
        m78081a(c14145o);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m78080a(com.five_corp.p372ad.internal.view.C14123B r5) {
        /*
            r5.getClass()
            r0 = 0
            r1 = 0
            android.view.TextureView r2 = r5.f26753d     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L41
            int r2 = r2.getWidth()     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L41
            android.view.TextureView r3 = r5.f26753d     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L41
            int r3 = r3.getHeight()     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L41
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L41
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L41
            android.view.TextureView r3 = r5.f26753d     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L41
            android.graphics.Bitmap r2 = r3.getBitmap(r2)     // Catch: java.lang.Exception -> L33 java.lang.OutOfMemoryError -> L41
            if (r2 != 0) goto L2c
            com.five_corp.ad.internal.s r2 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r3 = com.five_corp.p372ad.internal.EnumC14106t.f26339C3
            r2.<init>(r3, r1, r1, r1)
            com.five_corp.ad.internal.util.f r3 = new com.five_corp.ad.internal.util.f
            r3.<init>(r0, r2, r1)
            goto L4f
        L2c:
            com.five_corp.ad.internal.util.f r3 = new com.five_corp.ad.internal.util.f
            r4 = 1
            r3.<init>(r4, r1, r2)
            goto L4f
        L33:
            r2 = move-exception
            com.five_corp.ad.internal.s r3 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r4 = com.five_corp.p372ad.internal.EnumC14106t.f26355E3
            r3.<init>(r4, r1, r2, r1)
            com.five_corp.ad.internal.util.f r2 = new com.five_corp.ad.internal.util.f
            r2.<init>(r0, r3, r1)
            goto L4e
        L41:
            r2 = move-exception
            com.five_corp.ad.internal.s r3 = new com.five_corp.ad.internal.s
            com.five_corp.ad.internal.t r4 = com.five_corp.p372ad.internal.EnumC14106t.f26347D3
            r3.<init>(r4, r1, r2, r1)
            com.five_corp.ad.internal.util.f r2 = new com.five_corp.ad.internal.util.f
            r2.<init>(r0, r3, r1)
        L4e:
            r3 = r2
        L4f:
            boolean r1 = r3.f26746a
            if (r1 != 0) goto L5d
            com.five_corp.ad.internal.view.A r5 = r5.f26750a
            com.five_corp.ad.internal.s r0 = r3.f26747b
            com.five_corp.ad.internal.view.E r5 = (com.five_corp.p372ad.internal.view.C14126E) r5
            r5.m78076a(r0)
            goto L6b
        L5d:
            android.widget.ImageView r1 = r5.f26756g
            java.lang.Object r2 = r3.f26748c
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1.setImageBitmap(r2)
            android.widget.ImageView r5 = r5.f26756g
            r5.setVisibility(r0)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.view.C14123B.m78080a(com.five_corp.ad.internal.view.B):void");
    }

    /* renamed from: a */
    public final void m78081a(View view) {
        this.f26754e.post(new RunnableC14149s(this, view));
    }

    /* renamed from: a */
    public final void m78082a() {
        this.f26754e.post(new RunnableC14150t(this));
    }
}
