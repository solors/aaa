package com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32449c2oicci2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.ConstantsUtil;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.coo2iico */
/* loaded from: classes8.dex */
public class C32571coo2iico {
    private static final String c2oc2i = "AdSwitchUtils";
    private static final String coi222o222 = "adPrivacyStatus";
    private static final String coo2iico = "adSwitchOff";
    public static final long cioccoiococ = TimeUtils.ONE_HOUR_IN_MS;
    private static boolean c2oc2o = false;
    private static long cco22 = 0;
    private static C32449c2oicci2 cii2c2 = new C32449c2oicci2(C32449c2oicci2.coi222o222);
    private static int ciii2coi2 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    public class RunnableC32572coo2iico implements Runnable {
        final /* synthetic */ Context coo2iico;

        RunnableC32572coo2iico(Context context) {
            this.coo2iico = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            long unused = C32571coo2iico.cco22 = System.currentTimeMillis();
            Cursor cursor = null;
            try {
                try {
                    cursor = this.coo2iico.getContentResolver().query(Uri.parse(ConstantsUtil.AD_SWITCH_URL), null, this.coo2iico.getPackageName(), null, null);
                    if (cursor != null && cursor.getExtras() != null) {
                        boolean z = cursor.getExtras().getBoolean(C32571coo2iico.coo2iico, false);
                        int unused2 = C32571coo2iico.ciii2coi2 = cursor.getExtras().getInt(C32571coo2iico.coi222o222, 0);
                        MLog.m25887i(C32571coo2iico.c2oc2i, "AdSwitchOFF is: " + z + ", sPrivacyStatus: " + C32571coo2iico.ciii2coi2);
                        boolean unused3 = C32571coo2iico.c2oc2o = z;
                        C32571coo2iico.cii2c2.coi222o222(C32571coo2iico.coo2iico, C32571coo2iico.c2oc2o);
                        C32571coo2iico.cii2c2.coi222o222(C32571coo2iico.coi222o222, C32571coo2iico.ciii2coi2);
                    }
                    if (cursor == null) {
                        return;
                    }
                } catch (Exception unused4) {
                    MLog.m25889e(C32571coo2iico.c2oc2i, "IsAdSwitchOFF exception");
                    if (cursor == null) {
                        return;
                    }
                }
                cursor.close();
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    private C32571coo2iico() {
    }

    public static int c2oc2o() {
        return ciii2coi2;
    }

    private static boolean cioccoiococ() {
        if (Math.abs(System.currentTimeMillis() - cco22) > cioccoiococ) {
            return true;
        }
        return false;
    }

    private static void coi222o222(Context context) {
        C32465cioc2.cioccoiococ.execute(new RunnableC32572coo2iico(context));
    }

    public static boolean coo2iico(Context context) {
        if (cioccoiococ()) {
            MLog.m25892d(c2oc2i, "AdSwitch expired: new query from remote");
            coi222o222(context);
        }
        C32449c2oicci2 c32449c2oicci2 = cii2c2;
        if (c32449c2oicci2 != null) {
            c2oc2o = c32449c2oicci2.coo2iico(coo2iico, false);
        }
        return c2oc2o;
    }
}
