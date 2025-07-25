package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.p551my.target.C25974o2;
import com.p551my.target.common.menu.MenuFactory;
import com.p551my.target.common.models.ImageData;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.d */
/* loaded from: classes7.dex */
public class C25697d {

    /* renamed from: a */
    public final C25669c f66723a;

    /* renamed from: b */
    public final C25741f f66724b;

    /* renamed from: c */
    public final C25974o2.InterfaceC25976b f66725c;

    /* renamed from: d */
    public final String f66726d;

    /* renamed from: e */
    public final View.OnClickListener f66727e;

    /* renamed from: f */
    public WeakReference f66728f;

    /* renamed from: com.my.target.d$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25698a {
        /* renamed from: a */
        void mo42225a(Context context);
    }

    public C25697d(C25669c c25669c, MenuFactory menuFactory, C25974o2.InterfaceC25976b interfaceC25976b) {
        this.f66723a = c25669c;
        this.f66725c = interfaceC25976b;
        if (c25669c == null) {
            this.f66724b = null;
            this.f66727e = null;
            this.f66726d = null;
            return;
        }
        List m44134a = c25669c.m44134a();
        if (m44134a != null && !m44134a.isEmpty()) {
            this.f66724b = C25741f.m43946a(m44134a, menuFactory == null ? new C25790h1() : menuFactory);
        } else {
            this.f66724b = null;
        }
        this.f66726d = c25669c.m44131b();
        this.f66727e = new View.OnClickListener() { // from class: com.my.target.ob
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25697d.this.m44051a(view);
            }
        };
    }

    /* renamed from: a */
    public void m44048a(C25809i c25809i) {
        c25809i.setImageBitmap(null);
        c25809i.setImageDrawable(null);
        c25809i.setVisibility(8);
        c25809i.setOnClickListener(null);
    }

    /* renamed from: a */
    public void m44052a(Context context) {
        C25741f c25741f = this.f66724b;
        if (c25741f != null) {
            if (c25741f.m43945b()) {
                return;
            }
            this.f66724b.m43948a(context);
            return;
        }
        String str = this.f66726d;
        if (str != null) {
            AbstractC25883l3.m43561a(str, context);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m44051a(View view) {
        m44052a(view.getContext());
    }

    /* renamed from: a */
    public static C25697d m44050a(C25669c c25669c) {
        return m44049a(c25669c, null, null);
    }

    /* renamed from: a */
    public static C25697d m44049a(C25669c c25669c, MenuFactory menuFactory, C25974o2.InterfaceC25976b interfaceC25976b) {
        return new C25697d(c25669c, menuFactory, interfaceC25976b);
    }

    /* renamed from: a */
    public void m44047a(C25809i c25809i, InterfaceC25698a interfaceC25698a) {
        if (this.f66723a == null) {
            m44048a(c25809i);
            return;
        }
        C25741f c25741f = this.f66724b;
        if (c25741f != null) {
            c25741f.m43947a(interfaceC25698a);
        }
        this.f66728f = new WeakReference(c25809i);
        c25809i.setVisibility(0);
        c25809i.setOnClickListener(this.f66727e);
        if (c25809i.hasImage()) {
            return;
        }
        ImageData m44130c = this.f66723a.m44130c();
        Bitmap bitmap = m44130c.getBitmap();
        if (bitmap != null) {
            c25809i.setImageBitmap(bitmap);
        } else {
            C25974o2.m43279a(m44130c, c25809i, this.f66725c);
        }
    }

    /* renamed from: a */
    public void m44053a() {
        C25741f c25741f = this.f66724b;
        if (c25741f != null) {
            c25741f.m43947a((InterfaceC25698a) null);
        }
        WeakReference weakReference = this.f66728f;
        C25809i c25809i = weakReference != null ? (C25809i) weakReference.get() : null;
        if (c25809i == null) {
            return;
        }
        C25669c c25669c = this.f66723a;
        if (c25669c != null) {
            C25974o2.m43280a(c25669c.m44130c(), c25809i);
        }
        m44048a(c25809i);
        this.f66728f.clear();
        this.f66728f = null;
    }
}
