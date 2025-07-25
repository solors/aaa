package com.five_corp.p372ad.internal.system;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.five_corp.p372ad.C13611f;
import com.five_corp.p372ad.internal.C14064o;
import com.five_corp.p372ad.internal.util.C14120h;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.five_corp.ad.internal.system.b */
/* loaded from: classes4.dex */
public final class C14095b implements DefaultLifecycleObserver {

    /* renamed from: b */
    public boolean f26303b = false;

    /* renamed from: a */
    public final C14120h f26302a = new C14120h();

    /* renamed from: a */
    public final void m78104a(C14064o c14064o) {
        this.f26302a.f26749a.add(new WeakReference(c14064o));
        boolean z = true;
        if (this.f26303b) {
            if (c14064o.f26236c) {
                return;
            }
            c14064o.f26236c = true;
            if (c14064o.f26235b) {
                ((C13611f) c14064o.f26234a).m78536l();
                return;
            }
            return;
        }
        if (!c14064o.f26235b || !c14064o.f26236c) {
            z = false;
        }
        if (c14064o.f26236c) {
            c14064o.f26236c = false;
            if (z) {
                ((C13611f) c14064o.f26234a).m78535m();
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        boolean z;
        this.f26303b = false;
        C14120h c14120h = this.f26302a;
        c14120h.getClass();
        ArrayList arrayList = new ArrayList();
        c14120h.m78083a((AbstractCollection) arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14064o c14064o = (C14064o) it.next();
            if (c14064o.f26235b && c14064o.f26236c) {
                z = true;
            } else {
                z = false;
            }
            if (c14064o.f26236c) {
                c14064o.f26236c = false;
                if (z) {
                    ((C13611f) c14064o.f26234a).m78535m();
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        this.f26303b = true;
        C14120h c14120h = this.f26302a;
        c14120h.getClass();
        ArrayList arrayList = new ArrayList();
        c14120h.m78083a((AbstractCollection) arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14064o c14064o = (C14064o) it.next();
            if (!c14064o.f26236c) {
                c14064o.f26236c = true;
                if (c14064o.f26235b) {
                    ((C13611f) c14064o.f26234a).m78536l();
                }
            }
        }
    }

    /* renamed from: a */
    public static C14095b m78105a() {
        C14095b c14095b = new C14095b();
        new Handler(Looper.getMainLooper()).post(new RunnableC14094a(c14095b));
        return c14095b;
    }
}
