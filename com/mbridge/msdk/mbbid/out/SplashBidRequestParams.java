package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.SameDiTool;

/* loaded from: classes6.dex */
public class SplashBidRequestParams extends BannerBidRequestParams {

    /* renamed from: b */
    private static int f57395b = 1;

    /* renamed from: c */
    private static int f57396c;

    /* renamed from: d */
    private static int f57397d;

    /* renamed from: a */
    private boolean f57398a;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean m51355a() {
        return this.f57398a;
    }

    public int getOrientation() {
        return f57395b;
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f57395b, f57397d, f57396c);
    }

    public SplashBidRequestParams(String str, String str2, boolean z, int i, int i2, int i3) {
        this(str, str2, "", z, i, i3, i2);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        super(str, str2, str3, 0, 0);
        this.f57398a = false;
        f57395b = i;
        int m51882j = SameDiTool.m51882j(MBSDKContext.m52746m().m52792c());
        int m51886h = SameDiTool.m51886h(MBSDKContext.m52746m().m52792c());
        int i4 = f57395b;
        if (i4 == 1) {
            if (m51886h > i3 * 4) {
                setHeight(m51886h - i3);
                setWidth(m51882j);
            } else {
                setHeight(0);
                setWidth(0);
            }
        } else if (i4 == 2) {
            if (m51882j > i2 * 4) {
                setWidth(m51882j - i2);
                setHeight(m51886h);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
        this.f57398a = z;
    }
}
