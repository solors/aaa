package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.fyber.inneractive.sdk.util.L */
/* loaded from: classes4.dex */
public final class C15421L {

    /* renamed from: b */
    public final WeakHashMap f30559b = new WeakHashMap();

    /* renamed from: a */
    public final WeakHashMap f30558a = new WeakHashMap();

    /* renamed from: c */
    public final C15451i f30560c = new C15451i(16, new C15416G());

    /* renamed from: d */
    public final C15451i f30561d = new C15451i(16, new C15417H());

    /* renamed from: a */
    public final void m76522a(Context context, View view, InterfaceC15420K interfaceC15420K) {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        IAlog.m76529a("%strackView called with context: %s view: %s", "IAVisibilityTracker: ", context, view);
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            WeakHashMap weakHashMap = (WeakHashMap) this.f30559b.get(applicationContext);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                this.f30559b.put(applicationContext, weakHashMap);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getWindow() != null) {
                        rootView = activity.getWindow().getDecorView();
                        viewTreeObserver = rootView.getViewTreeObserver();
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            ViewTreeObserver$OnPreDrawListenerC15418I viewTreeObserver$OnPreDrawListenerC15418I = new ViewTreeObserver$OnPreDrawListenerC15418I(this, applicationContext);
                            viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC15418I);
                            this.f30558a.put(applicationContext, new Pair(viewTreeObserver, viewTreeObserver$OnPreDrawListenerC15418I));
                        }
                    }
                }
                rootView = view.getRootView();
                viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    ViewTreeObserver$OnPreDrawListenerC15418I viewTreeObserver$OnPreDrawListenerC15418I2 = new ViewTreeObserver$OnPreDrawListenerC15418I(this, applicationContext);
                    viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC15418I2);
                    this.f30558a.put(applicationContext, new Pair(viewTreeObserver, viewTreeObserver$OnPreDrawListenerC15418I2));
                }
            }
            weakHashMap.put(view, interfaceC15420K);
            m76519b();
            return;
        }
        throw new IllegalStateException("View must be attached to an Activity context");
    }

    /* renamed from: b */
    public final void m76519b() {
        for (Context context : this.f30559b.keySet()) {
            IAlog.m76529a("%stracking context: %s", "IAVisibilityTracker: ", context);
            WeakHashMap weakHashMap = (WeakHashMap) this.f30559b.get(context);
            if (weakHashMap != null) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.m76529a("%stracking view: %s", "IAVisibilityTracker: ", (View) it.next());
                }
            }
        }
    }

    /* renamed from: a */
    public final void m76520a(View view) {
        IAlog.m76529a("%sunTrackView called with view", "IAVisibilityTracker: ");
        if (view == null) {
            IAlog.m76529a("%sunTrackView called with a null view!", "IAVisibilityTracker: ");
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.m76529a("%sview.getContext() returned null!", "IAVisibilityTracker: ");
            return;
        }
        Map map = (Map) this.f30559b.get(context);
        if (map != null) {
            m76521a(context, map, view);
        } else {
            Iterator it = new HashSet(this.f30559b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap weakHashMap = (WeakHashMap) this.f30559b.get(context2);
                if (weakHashMap != null) {
                    m76521a(context2, weakHashMap, view);
                }
            }
        }
        m76519b();
    }

    /* renamed from: a */
    public final void m76521a(Context context, Map map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.f30554a <= 2) {
                IAlog.m76525e("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.f30559b.remove(context);
                Pair pair = (Pair) this.f30558a.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.f30558a.remove(context);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m76523a() {
        this.f30559b.clear();
        for (Context context : this.f30558a.keySet()) {
            Pair pair = (Pair) this.f30558a.get(context);
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        this.f30558a.clear();
    }
}
