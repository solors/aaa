package com.unity3d.player;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes7.dex */
public class OrientationLockListener implements InterfaceC28701D {

    /* renamed from: a */
    private C28703F f74582a;

    /* renamed from: b */
    private Context f74583b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OrientationLockListener(Context context) {
        this.f74583b = context;
        this.f74582a = new C28703F(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        this.f74582a.m37751a(this, "accelerometer_rotation");
    }

    /* renamed from: a */
    public void m37716a() {
        this.f74582a.m37752a();
        this.f74582a = null;
    }

    public final native void nativeUpdateOrientationLockState(int i);

    /* renamed from: a */
    public void m37715a(boolean z) {
        nativeUpdateOrientationLockState(Settings.System.getInt(this.f74583b.getContentResolver(), "accelerometer_rotation", 0));
    }
}
