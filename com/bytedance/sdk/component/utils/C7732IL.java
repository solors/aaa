package com.bytedance.sdk.component.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.utils.IL */
/* loaded from: classes3.dex */
public class C7732IL {

    /* renamed from: bg */
    private static InterfaceC7735bg f16908bg;

    /* renamed from: com.bytedance.sdk.component.utils.IL$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC7734IL {
        /* renamed from: bg */
        void mo86059bg();

        /* renamed from: bg */
        void mo86058bg(Throwable th);
    }

    /* renamed from: com.bytedance.sdk.component.utils.IL$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7735bg {
        ExecutorService getAsyncStartActivityThreadPool();

        boolean isEnableAsyncStartActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public static boolean m87909bX(Context context, Intent intent, InterfaceC7734IL interfaceC7734IL) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC7734IL != null) {
                    interfaceC7734IL.mo86059bg();
                    return true;
                }
                return true;
            } catch (Throwable th) {
                if (interfaceC7734IL != null) {
                    interfaceC7734IL.mo86058bg(th);
                }
            }
        }
        return false;
    }

    /* renamed from: bg */
    public static void m87905bg(InterfaceC7735bg interfaceC7735bg) {
        f16908bg = interfaceC7735bg;
    }

    /* renamed from: bg */
    public static boolean m87908bg(Context context, Intent intent, InterfaceC7734IL interfaceC7734IL) {
        return m87907bg(context, intent, interfaceC7734IL, false);
    }

    /* renamed from: bg */
    public static boolean m87907bg(final Context context, final Intent intent, final InterfaceC7734IL interfaceC7734IL, boolean z) {
        InterfaceC7735bg interfaceC7735bg;
        ExecutorService asyncStartActivityThreadPool;
        if (z && (interfaceC7735bg = f16908bg) != null && interfaceC7735bg.isEnableAsyncStartActivity() && (asyncStartActivityThreadPool = f16908bg.getAsyncStartActivityThreadPool()) != null) {
            asyncStartActivityThreadPool.execute(new AbstractRunnableC7227Kg("startAct") { // from class: com.bytedance.sdk.component.utils.IL.1
                @Override // java.lang.Runnable
                public void run() {
                    C7732IL.m87909bX(context, intent, interfaceC7734IL);
                }
            });
            return true;
        }
        return m87909bX(context, intent, interfaceC7734IL);
    }

    /* renamed from: bg */
    public static Activity m87906bg(View view) {
        View findViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (findViewById = rootView.findViewById(16908290)) == null || (context = findViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }
}
