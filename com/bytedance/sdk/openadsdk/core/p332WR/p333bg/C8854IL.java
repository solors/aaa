package com.bytedance.sdk.openadsdk.core.p332WR.p333bg;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import com.ironsource.C21114v8;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.WR.bg.IL */
/* loaded from: classes3.dex */
public class C8854IL {

    /* renamed from: bg */
    private static volatile C8854IL f19550bg;

    /* renamed from: IL */
    private final ArrayList<String> f19551IL = new ArrayList<>();

    /* renamed from: bX */
    private final AtomicBoolean f19555bX = new AtomicBoolean(false);
    private long eqN = System.currentTimeMillis();

    /* renamed from: zx */
    private long f19558zx = 0;
    private long ldr = 0;

    /* renamed from: iR */
    private String f19557iR = "";

    /* renamed from: Kg */
    private String f19552Kg = "";

    /* renamed from: WR */
    private String f19554WR = "";

    /* renamed from: eo */
    private boolean f19556eo = false;

    /* renamed from: VB */
    private boolean f19553VB = false;

    /* renamed from: bg */
    public static C8854IL m84653bg(Application application) {
        if (f19550bg == null) {
            synchronized (C8854IL.class) {
                if (f19550bg == null) {
                    C8854IL c8854il = new C8854IL();
                    f19550bg = c8854il;
                    c8854il.f19556eo = m84652bg((Context) application);
                    f19550bg.f19553VB = m84651bg(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    f19550bg.m84655bg();
                }
            }
        }
        return f19550bg;
    }

    /* renamed from: IL */
    public void m84656IL(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f19551IL.contains(localClassName)) {
            this.f19551IL.remove(localClassName);
        }
        if (this.f19551IL.size() == 0) {
            this.eqN = System.currentTimeMillis();
            this.f19555bX.set(true);
            this.f19552Kg = localClassName;
        }
    }

    /* renamed from: bg */
    private static int m84651bg(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: bg */
    private static boolean m84652bg(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    /* renamed from: bg */
    public void m84654bg(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f19551IL.size() == 0) {
            this.f19557iR = localClassName;
            this.f19558zx = System.currentTimeMillis();
            this.ldr = System.currentTimeMillis() - this.eqN;
            this.f19555bX.set(false);
        }
        if (!this.f19551IL.contains(localClassName)) {
            this.f19551IL.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.f19554WR = localClassName;
    }

    /* renamed from: bg */
    private void m84655bg() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField(C21114v8.C21122h.f54068h0);
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object valueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(valueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(valueAt)).getLocalClassName();
                        if (!this.f19551IL.contains(localClassName)) {
                            this.f19551IL.add(localClassName);
                        }
                    }
                }
                this.f19555bX.set(this.f19551IL.size() <= 0);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public String m84650bg(String str, long j, int i) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.f19558zx;
        long j3 = currentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.f19555bX.get() && this.f19553VB) {
            i2 |= 2;
        }
        if (!this.f19555bX.get() && this.ldr >= 5000 && j2 < 1000) {
            i2 = this.f19552Kg.equals(this.f19554WR) ? i2 | 4 : i2 | 8;
        }
        try {
            str2 = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.ldr).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.f19555bX).put("alert", this.f19553VB).put(NotificationCompat.CATEGORY_SYSTEM, this.f19556eo).put("actsize", this.f19551IL.size()).put("mutiproc", C9307IL.m83088bX()).toString();
        } catch (JSONException unused) {
            str2 = "";
        }
        this.f19557iR = "";
        this.ldr = 0L;
        this.f19558zx = 0L;
        this.eqN = System.currentTimeMillis();
        return str2;
    }
}
