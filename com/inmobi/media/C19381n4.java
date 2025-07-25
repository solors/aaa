package com.inmobi.media;

import android.app.Activity;
import android.view.OrientationEventListener;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: com.inmobi.media.n4 */
/* loaded from: classes6.dex */
public final class C19381n4 extends OrientationEventListener {

    /* renamed from: d */
    public static final /* synthetic */ KProperty[] f48535d = {Reflection.m17039e(new MutablePropertyReference1Impl(C19381n4.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};

    /* renamed from: a */
    public final Activity f48536a;

    /* renamed from: b */
    public final HashSet f48537b;

    /* renamed from: c */
    public final C19367m4 f48538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19381n4(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f48536a = activity;
        this.f48537b = new HashSet();
        Delegates delegates = Delegates.f99341a;
        this.f48538c = new C19367m4(AbstractC19246d9.m60379a(AbstractC19338k3.m60124g()), this);
    }

    /* renamed from: a */
    public final void m60004a(C19260e9 orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        try {
            if (!orientationProperties.f48177a) {
                String str = orientationProperties.f48178b;
                if (Intrinsics.m17075f(str, "landscape")) {
                    this.f48536a.setRequestedOrientation(6);
                } else if (Intrinsics.m17075f(str, "portrait")) {
                    this.f48536a.setRequestedOrientation(7);
                } else {
                    this.f48536a.setRequestedOrientation(13);
                }
            } else {
                this.f48536a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: b */
    public final void m60003b() {
        int i = this.f48536a.getResources().getConfiguration().orientation;
        byte m60124g = AbstractC19338k3.m60124g();
        int i2 = 1;
        if (m60124g != 1 && m60124g != 2 && (m60124g == 3 || m60124g == 4)) {
            i2 = 2;
        }
        if (i == i2) {
            this.f48538c.setValue(this, f48535d[0], AbstractC19246d9.m60379a(AbstractC19338k3.m60124g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        m60003b();
    }

    /* renamed from: a */
    public final void m60005a() {
        if (this.f48537b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
