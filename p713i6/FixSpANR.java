package p713i6;

import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: i6.a */
/* loaded from: classes6.dex */
public class FixSpANR {
    /* renamed from: a */
    public static void m23105a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mH");
            declaredField.setAccessible(true);
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            declaredField2.set((Handler) declaredField.get(invoke), new HookHandlerCallback());
            Log.d("FixSpANR", "hook success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
