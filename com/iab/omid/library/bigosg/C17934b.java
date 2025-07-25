package com.iab.omid.library.bigosg;

import android.content.Context;
import com.iab.omid.library.bigosg.p387b.C17936b;
import com.iab.omid.library.bigosg.p387b.C17940d;
import com.iab.omid.library.bigosg.p387b.C17943f;
import com.iab.omid.library.bigosg.p389d.C17951b;
import com.iab.omid.library.bigosg.p389d.C17955e;

/* renamed from: com.iab.omid.library.bigosg.b */
/* loaded from: classes6.dex */
public class C17934b {

    /* renamed from: a */
    private boolean f45189a;

    /* renamed from: b */
    private void m64660b(Context context) {
        C17955e.m64570a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m64665a() {
        return "1.3.0-Bigosg";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m64664a(Context context) {
        m64660b(context);
        if (m64661b()) {
            return;
        }
        m64662a(true);
        C17943f.m64617a().m64615a(context);
        C17936b.m64652a().m64651a(context);
        C17951b.m64590a(context);
        C17940d.m64637a().m64636a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m64661b() {
        return this.f45189a;
    }

    /* renamed from: a */
    void m64662a(boolean z) {
        this.f45189a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m64663a(String str) {
        return true;
    }
}
