package com.yandex.mobile.ads.common;

import android.app.Activity;
import android.content.res.Configuration;
import com.yandex.mobile.ads.impl.C31863y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class AdActivity extends Activity {
    @Nullable

    /* renamed from: a */
    private C31863y0 f76517a;

    @Override // android.app.Activity
    public final void onBackPressed() {
        C31863y0 c31863y0 = this.f76517a;
        if (c31863y0 == null || c31863y0.m27128c()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        super.onConfigurationChanged(config);
        C31863y0 c31863y0 = this.f76517a;
        if (c31863y0 != null) {
            c31863y0.m27130a(config);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r11 == (-1)) goto L33;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r14) {
        /*
            r13 = this;
            java.lang.String r0 = "data_identifier"
            super.onCreate(r14)
            java.lang.String r14 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r14)
            com.yandex.mobile.ads.impl.b1 r14 = new com.yandex.mobile.ads.impl.b1
            r14.<init>(r13)
            android.widget.RelativeLayout r9 = new android.widget.RelativeLayout
            r9.<init>(r13)
            android.content.Intent r6 = r13.getIntent()
            r10 = 0
            if (r6 != 0) goto L1d
            r4 = r10
            goto L73
        L1d:
            android.view.Window r7 = r13.getWindow()
            int r1 = com.yandex.mobile.ads.impl.C29912a1.f76655d
            com.yandex.mobile.ads.impl.a1 r1 = com.yandex.mobile.ads.impl.C29912a1.C29913a.m36014a()
            r2 = 0
            boolean r3 = r6.hasExtra(r0)     // Catch: java.lang.Exception -> L3d
            if (r3 == 0) goto L42
            r3 = -1
            long r11 = r6.getLongExtra(r0, r3)     // Catch: java.lang.Exception -> L3d
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Exception -> L3d
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 != 0) goto L43
            goto L42
        L3d:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.yandex.mobile.ads.impl.um0.m28727b(r0)
        L42:
            r0 = r10
        L43:
            if (r0 == 0) goto L4f
            long r3 = r0.longValue()
            com.yandex.mobile.ads.impl.z0 r0 = r1.m36018a(r3)
            r8 = r0
            goto L50
        L4f:
            r8 = r10
        L50:
            if (r8 == 0) goto L5c
            com.yandex.mobile.ads.impl.i8 r0 = r8.m26507c()     // Catch: java.lang.Exception -> L57
            goto L5d
        L57:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.yandex.mobile.ads.impl.um0.m28727b(r0)
        L5c:
            r0 = r10
        L5d:
            com.yandex.mobile.ads.impl.o1 r4 = new com.yandex.mobile.ads.impl.o1
            r4.<init>(r13, r0)
            com.yandex.mobile.ads.impl.l1$a r0 = com.yandex.mobile.ads.impl.C30763l1.f81656b
            com.yandex.mobile.ads.impl.l1 r1 = r0.m32376a()
            kotlin.jvm.internal.Intrinsics.m17074g(r7)
            r2 = r13
            r3 = r9
            r5 = r14
            com.yandex.mobile.ads.impl.j1 r0 = r1.m32379a(r2, r3, r4, r5, r6, r7, r8)
            r4 = r0
        L73:
            if (r4 == 0) goto L84
            com.yandex.mobile.ads.impl.y0 r0 = new com.yandex.mobile.ads.impl.y0
            com.yandex.mobile.ads.impl.ac2 r6 = new com.yandex.mobile.ads.impl.ac2
            r6.<init>()
            r1 = r0
            r2 = r13
            r3 = r9
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            goto L85
        L84:
            r0 = r10
        L85:
            r13.f76517a = r0
            if (r0 == 0) goto L8e
            r0.m27129b()
            kotlin.Unit r10 = kotlin.Unit.f99208a
        L8e:
            if (r10 != 0) goto L93
            r13.finish()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.common.AdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C31863y0 c31863y0 = this.f76517a;
        if (c31863y0 != null) {
            c31863y0.m27131a();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        C31863y0 c31863y0 = this.f76517a;
        if (c31863y0 != null) {
            c31863y0.m27127d();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        C31863y0 c31863y0 = this.f76517a;
        if (c31863y0 != null) {
            c31863y0.m27126e();
        }
    }
}
