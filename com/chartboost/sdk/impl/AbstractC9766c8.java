package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.chartboost.sdk.impl.c8 */
/* loaded from: classes3.dex */
public abstract class AbstractC9766c8 {

    /* renamed from: com.chartboost.sdk.impl.c8$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9767a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21805a;

        static {
            int[] iArr = new int[EnumC9734b8.values().length];
            try {
                iArr[EnumC9734b8.f21690b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9734b8.f21695g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9734b8.f21692d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9734b8.f21694f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC9734b8.f21691c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC9734b8.f21696h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC9734b8.f21693e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC9734b8.f21697i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f21805a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r6.m81927b() < r6.m81928a()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r5 != false) goto L17;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.chartboost.sdk.impl.EnumC9734b8 m81908a(android.content.Context r5, com.chartboost.sdk.impl.C9728b4 r6) {
        /*
            if (r5 != 0) goto L5
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21690b
            return r5
        L5:
            com.chartboost.sdk.impl.c4 r6 = r6.m82027a()     // Catch: java.lang.Exception -> L6b
            int r0 = m81909a(r5)     // Catch: java.lang.Exception -> L6b
            int r1 = r6.m81927b()     // Catch: java.lang.Exception -> L6b
            int r2 = r6.m81928a()     // Catch: java.lang.Exception -> L6b
            r3 = 1
            r4 = 2
            if (r1 != r2) goto L26
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Exception -> L6b
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch: java.lang.Exception -> L6b
            int r5 = r5.orientation     // Catch: java.lang.Exception -> L6b
            if (r5 == r4) goto L32
            goto L30
        L26:
            int r5 = r6.m81927b()     // Catch: java.lang.Exception -> L6b
            int r6 = r6.m81928a()     // Catch: java.lang.Exception -> L6b
            if (r5 >= r6) goto L32
        L30:
            r5 = r3
            goto L33
        L32:
            r5 = 0
        L33:
            r6 = 3
            if (r0 == 0) goto L3b
            if (r0 == r4) goto L3b
            if (r5 != 0) goto L54
            goto L3d
        L3b:
            if (r5 == 0) goto L54
        L3d:
            if (r0 == 0) goto L51
            if (r0 == r3) goto L4e
            if (r0 == r4) goto L4b
            if (r0 == r6) goto L48
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21690b     // Catch: java.lang.Exception -> L6b
            goto L6a
        L48:
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21697i     // Catch: java.lang.Exception -> L6b
            goto L6a
        L4b:
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21692d     // Catch: java.lang.Exception -> L6b
            goto L6a
        L4e:
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21696h     // Catch: java.lang.Exception -> L6b
            goto L6a
        L51:
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21690b     // Catch: java.lang.Exception -> L6b
            goto L6a
        L54:
            if (r0 == 0) goto L68
            if (r0 == r3) goto L65
            if (r0 == r4) goto L62
            if (r0 == r6) goto L5f
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21691c     // Catch: java.lang.Exception -> L6b
            goto L6a
        L5f:
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21695g     // Catch: java.lang.Exception -> L6b
            goto L6a
        L62:
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21693e     // Catch: java.lang.Exception -> L6b
            goto L6a
        L65:
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21694f     // Catch: java.lang.Exception -> L6b
            goto L6a
        L68:
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21691c     // Catch: java.lang.Exception -> L6b
        L6a:
            return r5
        L6b:
            r5 = move-exception
            java.lang.String r6 = "Cannot getOrientation"
            com.chartboost.sdk.impl.C9763c7.m81920b(r6, r5)
            com.chartboost.sdk.impl.b8 r5 = com.chartboost.sdk.impl.EnumC9734b8.f21691c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.AbstractC9766c8.m81908a(android.content.Context, com.chartboost.sdk.impl.b4):com.chartboost.sdk.impl.b8");
    }

    /* renamed from: b */
    public static final String m81907b(Context context, C9728b4 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        switch (C9767a.f21805a[m81908a(context, displayMeasurement).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "portrait";
            case 5:
            case 6:
            case 7:
            case 8:
                return "landscape";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public static final boolean m81906c(Context context, C9728b4 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        EnumC9734b8 m81908a = m81908a(context, displayMeasurement);
        if (m81908a != EnumC9734b8.f21690b && m81908a != EnumC9734b8.f21692d && m81908a != EnumC9734b8.f21694f && m81908a != EnumC9734b8.f21695g) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m81909a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    /* renamed from: a */
    public static final void m81910a(Activity activity, C10127p9 c10127p9, C9728b4 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        if (activity == null || m81912a(activity) || c10127p9 == null) {
            return;
        }
        int i = 1;
        if (c10127p9.m80814h() && c10127p9.m80812j()) {
            switch (C9767a.f21805a[m81908a(activity, displayMeasurement).ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                    i = 9;
                    break;
                case 5:
                case 6:
                    i = 0;
                    break;
                default:
                    i = 8;
                    break;
            }
            activity.setRequestedOrientation(i);
        }
    }

    /* renamed from: a */
    public static final boolean m81912a(Activity activity) {
        Window window;
        View decorView;
        Drawable background;
        return activity == null || (Build.VERSION.SDK_INT == 26 && activity.getApplicationInfo().targetSdkVersion > 26 && ((window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (background = decorView.getBackground()) == null || background.getAlpha() != 255));
    }

    /* renamed from: a */
    public static final void m81911a(Activity activity, C10127p9 c10127p9) {
        if (activity == null || m81912a(activity) || c10127p9 == null || !c10127p9.m80814h() || !c10127p9.m80812j()) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }
}
