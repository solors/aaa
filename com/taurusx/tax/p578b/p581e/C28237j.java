package com.taurusx.tax.p578b.p581e;

import android.view.InputDevice;
import android.view.MotionEvent;
import com.taurusx.tax.C28162a;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.b.e.j */
/* loaded from: classes7.dex */
public class C28237j {

    /* renamed from: a */
    public long f73355a;

    /* renamed from: b */
    public long f73356b;

    /* renamed from: c */
    public long f73357c;

    /* renamed from: d */
    public long f73358d;

    /* renamed from: e */
    public int f73359e = -1;

    /* renamed from: f */
    public String f73360f = "";

    /* renamed from: a */
    public void m38361a(MotionEvent motionEvent) {
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            this.f73359e = device.getId();
            this.f73360f = device.getName();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        sb2.append(stringFogImpl.m23824a(new byte[]{-90, 71, -121, 75, -102, 97, -100, 78, -99, 83, -106, 71, -123, 70, -90, 91, -49}, new byte[]{-14, 40}));
        sb2.append(this.f73355a);
        sb2.append(stringFogImpl.m23824a(new byte[]{-13, 103, -86, 55, -117, 52, -30}, new byte[]{-33, 71}));
        sb2.append(this.f73356b);
        sb2.append(stringFogImpl.m23824a(new byte[]{-6, -27, -78, -86, -95, -85, -126, -84, -69, -96, -21}, new byte[]{-42, -59}));
        sb2.append(this.f73357c);
        sb2.append(stringFogImpl.m23824a(new byte[]{107, -36, 50, -116, 19, -107, 42, -103, 122}, new byte[]{71, -4}));
        sb2.append(this.f73358d);
        sb2.append(stringFogImpl.m23824a(new byte[]{2, -107, 90, -38, 91, -42, 70, -15, 75, -61, 71, -42, 75, -4, 74, -120}, new byte[]{46, -75}));
        sb2.append(this.f73359e);
        sb2.append(stringFogImpl.m23824a(new byte[]{94, -62, 6, -115, 7, -127, 26, -90, 23, -108, 27, -127, 23, -84, 19, -113, 23, -33, 85}, new byte[]{114, -30}));
        sb2.append(this.f73360f);
        sb2.append('\'');
        sb2.append('}');
        return sb2.toString();
    }
}
