package com.smaato.sdk.core.lifecycle;

import android.view.View;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public class ViewLifecycle extends Lifecycle implements View.OnAttachStateChangeListener {
    public ViewLifecycle(View view) {
        view.addOnAttachStateChangeListener(this);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39515a(ViewLifecycle viewLifecycle, Lifecycle.Observer observer) {
        viewLifecycle.lambda$onViewAttachedToWindow$0(observer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39514b(ViewLifecycle viewLifecycle, Lifecycle.Observer observer) {
        viewLifecycle.lambda$onViewDetachedFromWindow$1(observer);
    }

    public /* synthetic */ void lambda$onViewAttachedToWindow$0(Lifecycle.Observer observer) {
        observer.onResume(this);
    }

    public /* synthetic */ void lambda$onViewDetachedFromWindow$1(Lifecycle.Observer observer) {
        observer.onDestroy(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.y
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ViewLifecycle.m39515a(ViewLifecycle.this, (Lifecycle.Observer) obj);
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.x
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ViewLifecycle.m39514b(ViewLifecycle.this, (Lifecycle.Observer) obj);
            }
        });
    }
}
