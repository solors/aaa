package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.ViewCoveredUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbnative.controller.c */
/* loaded from: classes6.dex */
public final class ImpressionTracker {

    /* renamed from: a */
    private WeakReference<ViewTreeObserver> f57526a;

    /* renamed from: b */
    private List<View> f57527b;

    /* renamed from: c */
    private ViewTreeObserver.OnPreDrawListener f57528c;

    /* renamed from: d */
    private InterfaceC22181a f57529d;

    /* renamed from: e */
    private Handler f57530e;

    /* renamed from: f */
    private boolean f57531f;

    /* renamed from: g */
    private int f57532g;

    /* compiled from: ImpressionTracker.java */
    /* renamed from: com.mbridge.msdk.mbnative.controller.c$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22181a {
        /* renamed from: a */
        void mo51258a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public ImpressionTracker(List<View> list, InterfaceC22181a interfaceC22181a, Handler handler, int i) {
        ArrayList arrayList = new ArrayList();
        this.f57527b = arrayList;
        this.f57528c = null;
        this.f57529d = interfaceC22181a;
        this.f57530e = handler;
        this.f57532g = i;
        if (list != null) {
            this.f57527b = list;
        } else {
            arrayList.clear();
        }
        try {
            m51263b();
        } catch (Throwable th) {
            SameLogTool.m51823b("ImpressionTracker", th.getMessage(), th);
        }
        try {
            this.f57528c = new ViewTreeObserver.OnPreDrawListener() { // from class: com.mbridge.msdk.mbnative.controller.c.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    ImpressionTracker.this.m51263b();
                    return true;
                }
            };
        } catch (Throwable th2) {
            SameLogTool.m51823b("ImpressionTracker", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m51263b() {
        if (this.f57531f) {
            return;
        }
        Handler handler = this.f57530e;
        if (handler != null) {
            if (this.f57532g == 1) {
                m51260c();
            } else {
                handler.postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImpressionTracker.this.m51260c();
                    }
                }, 100L);
            }
        }
        this.f57531f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m51260c() {
        try {
            this.f57531f = false;
            List<View> list = this.f57527b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i = 0; i < this.f57527b.size(); i++) {
                View view = this.f57527b.get(i);
                if (m51262b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            InterfaceC22181a interfaceC22181a = this.f57529d;
            if (interfaceC22181a != null) {
                interfaceC22181a.mo51258a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                m51267a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void m51266a(View view) {
        final View view2;
        View view3;
        if (view != null) {
            view2 = Views.m51212a(view.getContext(), view);
            this.f57527b.add(view);
        } else {
            List<View> list = this.f57527b;
            view2 = null;
            if (list != null && list.size() > 0) {
                for (int i = 0; i < this.f57527b.size() && ((view3 = this.f57527b.get(i)) == null || (view2 = Views.m51212a(view3.getContext(), view3)) == null); i++) {
                }
            }
        }
        if (view2 == null) {
            return;
        }
        view2.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.c.3
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (viewTreeObserver != null && !viewTreeObserver.isAlive()) {
                    return;
                }
                ImpressionTracker.this.f57526a = new WeakReference(viewTreeObserver);
                if (ImpressionTracker.this.f57528c != null) {
                    viewTreeObserver.addOnPreDrawListener(ImpressionTracker.this.f57528c);
                }
            }
        });
    }

    /* renamed from: b */
    private boolean m51262b(View view) {
        return !ViewCoveredUtils.m51676a(view, this.f57532g);
    }

    /* renamed from: a */
    public final void m51267a() {
        try {
            this.f57531f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f57526a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f57526a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f57528c);
                }
                this.f57526a.clear();
            }
            this.f57529d = null;
            this.f57528c = null;
            List<View> list = this.f57527b;
            if (list != null) {
                list.clear();
            }
            this.f57527b = null;
        } catch (Throwable unused) {
        }
    }
}
