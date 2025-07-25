package com.five_corp.p372ad.internal.viewability;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.util.C14120h;
import com.five_corp.p372ad.internal.view.AbstractC14129H;
import com.five_corp.p372ad.internal.view.C14137g;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.HashSet;

/* renamed from: com.five_corp.ad.internal.viewability.a */
/* loaded from: classes4.dex */
public final class C14157a {

    /* renamed from: a */
    public final Context f26818a;

    /* renamed from: b */
    public final int f26819b;

    /* renamed from: c */
    public final double f26820c;

    /* renamed from: d */
    public final boolean f26821d;

    /* renamed from: e */
    public final View f26822e;

    /* renamed from: g */
    public final Object f26824g = new Object();

    /* renamed from: h */
    public boolean f26825h = true;

    /* renamed from: i */
    public final C14120h f26826i = new C14120h();

    /* renamed from: f */
    public View f26823f = null;

    static {
        C14157a.class.toString();
    }

    public C14157a(Context context, C13760i c13760i, AbstractC14129H abstractC14129H) {
        this.f26818a = context;
        this.f26819b = c13760i.f25595f.f25341d;
        this.f26820c = c13760i.f25594e.f25860f;
        this.f26821d = c13760i.f25593d.f25848g;
        this.f26822e = abstractC14129H;
    }

    /* renamed from: a */
    public final double m78051a(HashSet hashSet, View view) {
        HashSet hashSet2 = hashSet;
        Context context = this.f26818a;
        double d = 0.0d;
        if (view.isShown() && ((PowerManager) context.getSystemService("power")).isScreenOn() && !((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode() && view.getWindowVisibility() == 0) {
            Object obj = view;
            while (obj != null && (obj instanceof View)) {
                View view2 = (View) obj;
                if (view2.getAlpha() > 0.0f) {
                    obj = view2.getParent();
                }
            }
            boolean z = this.f26821d;
            int height = view.getHeight() * view.getWidth();
            Rect rect = new Rect();
            View view3 = view;
            if (view3.getGlobalVisibleRect(rect)) {
                if (z) {
                    d = ((rect.right - rect.left) * (rect.bottom - rect.top)) / height;
                } else {
                    double d2 = 1.0d;
                    while (view3 != null) {
                        ViewParent parent = view3.getParent();
                        if (parent != null && (parent instanceof ViewGroup) && !hashSet2.contains(parent)) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            int i = 1;
                            int i2 = 0;
                            int i3 = 0;
                            while (i3 < viewGroup.getChildCount()) {
                                View childAt = viewGroup.getChildAt(i3);
                                if (childAt == view3) {
                                    i = i2;
                                } else if (childAt.isShown() && childAt.getAlpha() > d && ((!(childAt instanceof ViewGroup) || ((ViewGroup) childAt).getChildCount() != 0) && view3.getZ() <= childAt.getZ() && ((view3.getZ() != childAt.getZ() || i == 0) && !hashSet2.contains(childAt)))) {
                                    Rect rect2 = new Rect();
                                    if (childAt.getGlobalVisibleRect(rect2) && rect.right > rect2.left && rect.bottom > rect2.top && rect2.right > rect.left && rect2.bottom > rect.top) {
                                        Rect rect3 = new Rect(i2, i2, i2, i2);
                                        if (rect.left < rect2.left) {
                                            rect3 = new Rect(rect.left, rect.top, rect2.left, rect.bottom);
                                        }
                                        if (rect2.right < rect.right) {
                                            Rect rect4 = new Rect(rect2.right, rect.top, rect.right, rect.bottom);
                                            if ((rect3.right - rect3.left) * (rect3.bottom - rect3.top) < (rect4.right - rect4.left) * (rect4.bottom - rect4.top)) {
                                                rect3 = rect4;
                                            }
                                        }
                                        if (rect2.bottom < rect.bottom) {
                                            Rect rect5 = new Rect(rect.left, rect2.bottom, rect.right, rect.bottom);
                                            if ((rect3.right - rect3.left) * (rect3.bottom - rect3.top) < (rect5.right - rect5.left) * (rect5.bottom - rect5.top)) {
                                                rect3 = rect5;
                                            }
                                        }
                                        if (rect.top < rect2.top) {
                                            Rect rect6 = new Rect(rect.left, rect.top, rect.right, rect2.top);
                                            if ((rect3.right - rect3.left) * (rect3.bottom - rect3.top) < (rect6.right - rect6.left) * (rect6.bottom - rect6.top)) {
                                                rect = rect6;
                                            }
                                        }
                                        rect = rect3;
                                    }
                                }
                                i3++;
                                hashSet2 = hashSet;
                                d = 0.0d;
                                i2 = 0;
                            }
                        }
                        d2 *= view3.getScaleY() * view3.getScaleX();
                        ViewParent parent2 = view3.getParent();
                        if (!(parent2 instanceof View)) {
                            break;
                        }
                        view3 = (View) parent2;
                        hashSet2 = hashSet;
                        d = 0.0d;
                    }
                    double d3 = height * d2;
                    d = 0.0d;
                    if (d3 > 0.0d) {
                        d = ((rect.right - rect.left) * (rect.bottom - rect.top)) / d3;
                    }
                }
            }
            if (this.f26820c + d >= 1.0d) {
                return 1.0d;
            }
            return d;
        }
        return 0.0d;
    }

    /* renamed from: a */
    public final void m78053a(View view, int i) {
        synchronized (this.f26824g) {
            C14120h c14120h = this.f26826i;
            c14120h.getClass();
            HashSet hashSet = new HashSet();
            c14120h.m78083a((AbstractCollection) hashSet);
            if (hashSet.contains(view)) {
                return;
            }
            if (this.f26819b == 2 && i == 0) {
                return;
            }
            this.f26826i.f26749a.add(new WeakReference(view));
        }
    }

    /* renamed from: a */
    public final void m78052a(C14137g c14137g) {
        this.f26823f = c14137g;
    }
}
