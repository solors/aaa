package com.smaato.sdk.core.lifecycle;

import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public class LifecycleAdapter extends Lifecycle {
    private final Object owner;

    public LifecycleAdapter(Object obj) {
        this.owner = obj;
    }

    /* renamed from: a */
    public static /* synthetic */ void m39526a(LifecycleAdapter lifecycleAdapter, Lifecycle.Observer observer) {
        lifecycleAdapter.lambda$onStop$4(observer);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39525b(LifecycleAdapter lifecycleAdapter, Lifecycle.Observer observer) {
        lifecycleAdapter.lambda$onResume$2(observer);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39524c(LifecycleAdapter lifecycleAdapter, Lifecycle.Observer observer) {
        lifecycleAdapter.lambda$onDestroy$5(observer);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39523d(LifecycleAdapter lifecycleAdapter, Lifecycle.Observer observer) {
        lifecycleAdapter.lambda$onCreate$0(observer);
    }

    /* renamed from: e */
    public static /* synthetic */ void m39522e(LifecycleAdapter lifecycleAdapter, Lifecycle.Observer observer) {
        lifecycleAdapter.lambda$onPause$3(observer);
    }

    /* renamed from: f */
    public static /* synthetic */ void m39521f(LifecycleAdapter lifecycleAdapter, Lifecycle.Observer observer) {
        lifecycleAdapter.lambda$onStart$1(observer);
    }

    public /* synthetic */ void lambda$onCreate$0(Lifecycle.Observer observer) {
        observer.onCreate(this);
    }

    public /* synthetic */ void lambda$onDestroy$5(Lifecycle.Observer observer) {
        observer.onDestroy(this);
    }

    public /* synthetic */ void lambda$onPause$3(Lifecycle.Observer observer) {
        observer.onPause(this);
    }

    public /* synthetic */ void lambda$onResume$2(Lifecycle.Observer observer) {
        observer.onResume(this);
    }

    public /* synthetic */ void lambda$onStart$1(Lifecycle.Observer observer) {
        observer.onStart(this);
    }

    public /* synthetic */ void lambda$onStop$4(Lifecycle.Observer observer) {
        observer.onStop(this);
    }

    public void onCreate() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.r
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.m39523d(LifecycleAdapter.this, (Lifecycle.Observer) obj);
            }
        });
    }

    public void onDestroy() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.n
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.m39524c(LifecycleAdapter.this, (Lifecycle.Observer) obj);
            }
        });
    }

    public void onPause() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.q
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.m39522e(LifecycleAdapter.this, (Lifecycle.Observer) obj);
            }
        });
    }

    public void onResume() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.m
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.m39525b(LifecycleAdapter.this, (Lifecycle.Observer) obj);
            }
        });
    }

    public void onStart() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.p
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.m39521f(LifecycleAdapter.this, (Lifecycle.Observer) obj);
            }
        });
    }

    public void onStop() {
        notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.o
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                LifecycleAdapter.m39526a(LifecycleAdapter.this, (Lifecycle.Observer) obj);
            }
        });
    }
}
