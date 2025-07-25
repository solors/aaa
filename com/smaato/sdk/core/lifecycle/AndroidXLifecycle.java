package com.smaato.sdk.core.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public class AndroidXLifecycle extends Lifecycle implements LifecycleEventObserver {

    /* renamed from: com.smaato.sdk.core.lifecycle.AndroidXLifecycle$a */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C27125a {

        /* renamed from: a */
        static final /* synthetic */ int[] f71597a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f71597a = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71597a[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71597a[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71597a[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71597a[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71597a[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71597a[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public AndroidXLifecycle(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public /* synthetic */ void lambda$onStateChanged$0(Lifecycle.Observer observer) {
        observer.onCreate(this);
    }

    public /* synthetic */ void lambda$onStateChanged$1(Lifecycle.Observer observer) {
        observer.onStart(this);
    }

    public /* synthetic */ void lambda$onStateChanged$2(Lifecycle.Observer observer) {
        observer.onResume(this);
    }

    public /* synthetic */ void lambda$onStateChanged$3(Lifecycle.Observer observer) {
        observer.onPause(this);
    }

    public /* synthetic */ void lambda$onStateChanged$4(Lifecycle.Observer observer) {
        observer.onStop(this);
    }

    public /* synthetic */ void lambda$onStateChanged$5(Lifecycle.Observer observer) {
        observer.onDestroy(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        switch (C27125a.f71597a[event.ordinal()]) {
            case 1:
                notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.l
                    {
                        AndroidXLifecycle.this = this;
                    }

                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$0((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 2:
                notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.k
                    {
                        AndroidXLifecycle.this = this;
                    }

                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$1((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 3:
                notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.j
                    {
                        AndroidXLifecycle.this = this;
                    }

                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$2((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 4:
                notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.i
                    {
                        AndroidXLifecycle.this = this;
                    }

                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$3((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 5:
                notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.h
                    {
                        AndroidXLifecycle.this = this;
                    }

                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$4((Lifecycle.Observer) obj);
                    }
                });
                return;
            case 6:
                notifyObservers(new Consumer() { // from class: com.smaato.sdk.core.lifecycle.g
                    {
                        AndroidXLifecycle.this = this;
                    }

                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        AndroidXLifecycle.this.lambda$onStateChanged$5((Lifecycle.Observer) obj);
                    }
                });
                return;
            default:
                return;
        }
    }
}
