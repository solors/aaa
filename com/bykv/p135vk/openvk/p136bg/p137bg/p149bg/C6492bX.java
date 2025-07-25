package com.bykv.p135vk.openvk.p136bg.p137bg.p149bg;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.bg.bg.bg.bX */
/* loaded from: classes3.dex */
public class C6492bX {

    /* renamed from: IL */
    private static Context f13542IL = null;

    /* renamed from: bX */
    private static String f13543bX = null;

    /* renamed from: bg */
    public static boolean f13544bg = false;
    private static boolean eqN = false;
    private static int ldr = 1;

    /* renamed from: zx */
    private static AbstractC7194VB f13545zx;

    /* renamed from: IL */
    public static String m91761IL() {
        if (TextUtils.isEmpty(f13543bX)) {
            try {
                File file = new File(m91759bg().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f13543bX = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return f13543bX;
    }

    /* renamed from: bX */
    public static boolean m91760bX() {
        return eqN;
    }

    /* renamed from: bg */
    public static Context m91759bg() {
        return f13542IL;
    }

    public static AbstractC7194VB eqN() {
        if (f13545zx == null) {
            AbstractC7194VB.C7195bg c7195bg = new AbstractC7194VB.C7195bg("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f13545zx = c7195bg.m89637bg(10000L, timeUnit).m89640IL(10000L, timeUnit).m89639bX(10000L, timeUnit).m89638bg();
        }
        return f13545zx;
    }

    public static int ldr() {
        return ldr;
    }

    /* renamed from: zx */
    public static boolean m91754zx() {
        return f13544bg;
    }

    /* renamed from: bg */
    public static void m91757bg(Context context, String str) {
        f13542IL = context;
        f13543bX = str;
    }

    /* renamed from: bg */
    public static void m91755bg(boolean z) {
        eqN = z;
    }

    /* renamed from: bg */
    public static void m91756bg(AbstractC7194VB abstractC7194VB) {
        f13545zx = abstractC7194VB;
    }

    /* renamed from: bg */
    public static void m91758bg(int i) {
        ldr = i;
    }
}
