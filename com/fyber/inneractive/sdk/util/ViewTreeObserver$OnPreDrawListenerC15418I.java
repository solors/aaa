package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.fyber.inneractive.sdk.util.I */
/* loaded from: classes4.dex */
public final class ViewTreeObserver$OnPreDrawListenerC15418I implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ Context f30552a;

    /* renamed from: b */
    public final /* synthetic */ C15421L f30553b;

    public ViewTreeObserver$OnPreDrawListenerC15418I(C15421L c15421l, Context context) {
        this.f30553b = c15421l;
        this.f30552a = context;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float f;
        C15421L c15421l = this.f30553b;
        Context context = this.f30552a;
        if (context != null) {
            WeakHashMap weakHashMap = (WeakHashMap) c15421l.f30559b.get(context);
            if (weakHashMap != null) {
                C15451i c15451i = c15421l.f30561d;
                Object poll = c15451i.f30600a.poll();
                if (poll == null) {
                    poll = c15451i.f30601b.mo76503a();
                }
                HashSet hashSet = (HashSet) poll;
                hashSet.addAll(weakHashMap.keySet());
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    View view = (View) it.next();
                    InterfaceC15420K interfaceC15420K = (InterfaceC15420K) weakHashMap.get(view);
                    if (interfaceC15420K != null) {
                        C15451i c15451i2 = c15421l.f30560c;
                        Object poll2 = c15451i2.f30600a.poll();
                        if (poll2 == null) {
                            poll2 = c15451i2.f30601b.mo76503a();
                        }
                        Rect rect = (Rect) poll2;
                        if (view != null && view.getParent() != null && view.isShown() && view.getGlobalVisibleRect(rect)) {
                            f = (rect.width() * rect.height()) / (view.getWidth() * view.getHeight());
                        } else {
                            f = 0.0f;
                        }
                        interfaceC15420K.mo76396a(f, rect);
                        c15421l.f30560c.f30600a.offer(rect);
                    }
                }
                hashSet.clear();
                c15421l.f30561d.f30600a.offer(hashSet);
                return true;
            }
            return true;
        }
        c15421l.getClass();
        return true;
    }
}
