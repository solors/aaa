package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.applovin.internal.f */
/* loaded from: classes6.dex */
public class C17813f {

    /* renamed from: b */
    private static final Pattern f44945b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C17812e> f44946a = new ArrayList();

    /* renamed from: b */
    private C17812e m65117b(View view) {
        for (C17812e c17812e : this.f44946a) {
            if (c17812e.m65124c().get() == view) {
                return c17812e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C17812e> m65122a() {
        return this.f44946a;
    }

    /* renamed from: c */
    public void m65116c(View view) {
        m65121a(view);
        C17812e m65117b = m65117b(view);
        if (m65117b != null) {
            this.f44946a.remove(m65117b);
        }
    }

    /* renamed from: a */
    private void m65121a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m65118b() {
        this.f44946a.clear();
    }

    /* renamed from: a */
    public void m65120a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m65121a(view);
        m65119a(str);
        if (m65117b(view) == null) {
            this.f44946a.add(new C17812e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m65119a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f44945b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
