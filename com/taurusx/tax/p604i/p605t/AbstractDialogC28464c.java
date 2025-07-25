package com.taurusx.tax.p604i.p605t;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.taurusx.tax.C28154R;
import com.taurusx.tax.p606j.C28519f;
import java.lang.ref.WeakReference;

/* renamed from: com.taurusx.tax.i.t.c */
/* loaded from: classes7.dex */
public abstract class AbstractDialogC28464c extends Dialog {

    /* renamed from: a */
    public WeakReference<Activity> f73896a;

    /* renamed from: b */
    public C28519f f73897b;

    /* renamed from: com.taurusx.tax.i.t.c$a */
    /* loaded from: classes7.dex */
    public class C28465a extends C28519f {
        public C28465a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Activity m38077c = AbstractDialogC28464c.this.m38077c();
            if (m38077c != null && m38077c == activity) {
                Log.d("BaseAlert", "host activity Destroyed: dismiss self");
                AbstractDialogC28464c.this.m38079a();
            }
        }
    }

    public AbstractDialogC28464c(@NonNull Activity activity) {
        super(activity, C28154R.C28160style.taurusx_dialogNoBg);
        this.f73896a = null;
        this.f73896a = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public void m38079a() {
        try {
            dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m38078b() {
        Activity activity;
        try {
            WeakReference<Activity> weakReference = this.f73896a;
            if (weakReference != null && (activity = weakReference.get()) != null) {
                if (!activity.isFinishing()) {
                    if (activity.isDestroyed()) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: c */
    public Activity m38077c() {
        WeakReference<Activity> weakReference = this.f73896a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context applicationContext = getContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            C28465a c28465a = new C28465a();
            this.f73897b = c28465a;
            ((Application) applicationContext).registerActivityLifecycleCallbacks(c28465a);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        DialogC28460a dialogC28460a = (DialogC28460a) this;
        View inflate = getLayoutInflater().inflate(C28154R.C28158layout.taurusx_dialog_adtune_layout, (ViewGroup) null);
        dialogC28460a.f73888c = inflate;
        dialogC28460a.f73889d = (FrameLayout) inflate.findViewById(C28154R.C28157id.adtune_webview_container);
        dialogC28460a.f73890e = dialogC28460a.f73888c.findViewById(C28154R.C28157id.adtune_close_btn);
        View view = dialogC28460a.f73888c;
        if (view != null) {
            setContentView(view);
        }
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        C28519f c28519f;
        super.onDetachedFromWindow();
        Context applicationContext = getContext().getApplicationContext();
        if ((applicationContext instanceof Application) && (c28519f = this.f73897b) != null) {
            try {
                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(c28519f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
