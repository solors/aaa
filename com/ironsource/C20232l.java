package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.l */
/* loaded from: classes6.dex */
public class C20232l implements InterfaceC20064hu {

    /* renamed from: a */
    private WeakReference<Activity> f50914a;

    public C20232l(Activity activity) {
        this.f50914a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.InterfaceC20064hu
    /* renamed from: a */
    public void mo57334a() {
        WindowInsetsController windowInsetsController;
        int statusBars;
        Activity activity = this.f50914a.get();
        if (activity == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Window window = activity.getWindow();
        if (i >= 30) {
            windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                statusBars = WindowInsets.Type.statusBars();
                windowInsetsController.hide(statusBars);
                return;
            }
            return;
        }
        window.setFlags(1024, 1024);
    }
}
