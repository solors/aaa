package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C19528xb;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xb */
/* loaded from: classes6.dex */
public final class C19528xb {

    /* renamed from: a */
    public final InterfaceC19500vb f48906a;

    /* renamed from: b */
    public final HashMap f48907b;

    public C19528xb(InterfaceC19500vb timeOutInformer) {
        Intrinsics.checkNotNullParameter(timeOutInformer, "timeOutInformer");
        this.f48906a = timeOutInformer;
        this.f48907b = new HashMap();
    }

    /* renamed from: a */
    public final void m59567a(final byte b) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o3.f7
            @Override // java.lang.Runnable
            public final void run() {
                C19528xb.m59566a(C19528xb.this, b);
            }
        });
    }

    /* renamed from: a */
    public static final void m59566a(C19528xb this$0, byte b) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f48906a.mo59791a(b);
    }
}
