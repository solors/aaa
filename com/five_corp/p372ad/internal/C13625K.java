package com.five_corp.p372ad.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.five_corp.p372ad.internal.system.AbstractC14102i;
import com.five_corp.p372ad.internal.tracking_data.AbstractC14109c;
import com.five_corp.p372ad.internal.util.C14118f;

/* renamed from: com.five_corp.ad.internal.K */
/* loaded from: classes4.dex */
public final class C13625K {

    /* renamed from: a */
    public final Context f25165a;

    /* renamed from: b */
    public final String f25166b;

    public C13625K(Context context) {
        this.f25165a = context;
        this.f25166b = AbstractC14109c.m78096a(context);
    }

    /* renamed from: a */
    public final C14118f m78475a() {
        long longVersionCode;
        try {
            PackageInfo m78100a = AbstractC14102i.m78100a(this.f25165a, "com.google.android.gms");
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = m78100a.getLongVersionCode();
                return new C14118f(true, null, Integer.valueOf((int) (longVersionCode & 4294967295L)));
            }
            return new C14118f(true, null, Integer.valueOf(m78100a.versionCode));
        } catch (Exception e) {
            return new C14118f(false, new C14068s(EnumC14106t.f26375H, "Unknown error occurred when fetching Google Play Services version.", e, null), null);
        }
    }

    /* renamed from: b */
    public final Rect m78474b() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        if (Build.VERSION.SDK_INT > 30) {
            currentWindowMetrics = ((WindowManager) this.f25165a.getSystemService("window")).getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
        Display defaultDisplay = ((WindowManager) this.f25165a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Rect(0, 0, point.x, point.y);
    }
}
