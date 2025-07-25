package p739j6;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import java.lang.reflect.Field;
import java.util.List;
import me.weishu.reflection.Reflection;

/* renamed from: j6.a */
/* loaded from: classes6.dex */
public class HookHandler {

    /* renamed from: a */
    private static boolean f98456a;

    /* compiled from: HookHandler.java */
    /* renamed from: j6.a$a */
    /* loaded from: classes6.dex */
    static class HandlerC37295a extends Handler {

        /* renamed from: a */
        final /* synthetic */ Handler f98457a;

        /* renamed from: b */
        final /* synthetic */ List f98458b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        HandlerC37295a(Looper looper, Handler handler, List list) {
            super(looper);
            this.f98457a = handler;
            this.f98458b = list;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                this.f98457a.dispatchMessage(message);
            } catch (Exception e) {
                for (IExceptionIntercept iExceptionIntercept : this.f98458b) {
                    if (iExceptionIntercept.mo18522a(e)) {
                        HookHandler.m18523c("hookChoreographerHandler crash intercept success");
                        e.printStackTrace();
                        return;
                    }
                }
                throw e;
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m18524b(Context context, List<IExceptionIntercept> list) {
        synchronized (HookHandler.class) {
            if (f98456a) {
                return;
            }
            f98456a = true;
            int i = Build.VERSION.SDK_INT;
            if (i >= 26 && i <= 30) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    try {
                        m18523c("hookChoreographerHandler begin");
                        Reflection.m15127b(context);
                        Field declaredField = Choreographer.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(Choreographer.getInstance());
                        int modifiers = declaredField.getModifiers();
                        Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                        declaredField2.setAccessible(true);
                        declaredField2.set(declaredField, Integer.valueOf(modifiers & (-17)));
                        Class<?> type = declaredField.getType();
                        m18523c("handler type:" + type.getName());
                        Field declaredField3 = Field.class.getDeclaredField("type");
                        declaredField3.setAccessible(true);
                        declaredField3.set(declaredField, Handler.class);
                        m18523c("new handler type:" + declaredField.getType().getName());
                        declaredField.set(Choreographer.getInstance(), new HandlerC37295a(handler.getLooper(), handler, list));
                        m18523c("hookChoreographerHandler success");
                    } catch (Exception e) {
                        m18523c("hookChoreographerHandler fail");
                        e.printStackTrace();
                    }
                    return;
                }
                throw new IllegalThreadStateException("hookChoreographerHandler 必须运行在主线程");
            }
            m18523c("目前只支持Android 8 到 Android 11");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m18523c(String str) {
        Log.d("HookHelper", str);
    }
}
