package com.iab.omid.library.amazon.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.amazon.adsession.C17738a;
import com.iab.omid.library.amazon.devicevolume.C17742b;
import com.iab.omid.library.amazon.devicevolume.C17744d;
import com.iab.omid.library.amazon.devicevolume.C17745e;
import com.iab.omid.library.amazon.devicevolume.InterfaceC17743c;
import com.iab.omid.library.amazon.internal.C17749d;
import com.iab.omid.library.amazon.walking.TreeWalker;

/* renamed from: com.iab.omid.library.amazon.internal.i */
/* loaded from: classes6.dex */
public class C17756i implements C17749d.InterfaceC17750a, InterfaceC17743c {

    /* renamed from: f */
    private static C17756i f44824f;

    /* renamed from: a */
    private float f44825a = 0.0f;

    /* renamed from: b */
    private final C17745e f44826b;

    /* renamed from: c */
    private final C17742b f44827c;

    /* renamed from: d */
    private C17744d f44828d;

    /* renamed from: e */
    private C17748c f44829e;

    public C17756i(C17745e c17745e, C17742b c17742b) {
        this.f44826b = c17745e;
        this.f44827c = c17742b;
    }

    /* renamed from: a */
    private C17748c m65336a() {
        if (this.f44829e == null) {
            this.f44829e = C17748c.m65380c();
        }
        return this.f44829e;
    }

    /* renamed from: c */
    public static C17756i m65331c() {
        if (f44824f == null) {
            f44824f = new C17756i(new C17745e(), new C17742b());
        }
        return f44824f;
    }

    /* renamed from: b */
    public float m65332b() {
        return this.f44825a;
    }

    /* renamed from: d */
    public void m65330d() {
        C17747b.m65385g().m65375a(this);
        C17747b.m65385g().m65369e();
        TreeWalker.getInstance().m65225h();
        this.f44828d.m65393c();
    }

    /* renamed from: e */
    public void m65329e() {
        TreeWalker.getInstance().m65223j();
        C17747b.m65385g().m65368f();
        this.f44828d.m65392d();
    }

    @Override // com.iab.omid.library.amazon.devicevolume.InterfaceC17743c
    /* renamed from: a */
    public void mo65335a(float f) {
        this.f44825a = f;
        for (C17738a c17738a : m65336a().m65384a()) {
            c17738a.getAdSessionStatePublisher().m65320a(f);
        }
    }

    /* renamed from: a */
    public void m65334a(Context context) {
        this.f44828d = this.f44826b.m65391a(new Handler(), context, this.f44827c.m65397a(), this);
    }

    @Override // com.iab.omid.library.amazon.internal.C17749d.InterfaceC17750a
    /* renamed from: a */
    public void mo65333a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m65225h();
        } else {
            TreeWalker.getInstance().m65226g();
        }
    }
}
