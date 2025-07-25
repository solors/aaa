package com.iab.omid.library.inmobi.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.inmobi.internal.f */
/* loaded from: classes6.dex */
public class C18183f {

    /* renamed from: b */
    private static final Pattern f45708b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C18182e> f45709a = new ArrayList();

    /* renamed from: b */
    private C18182e m63706b(View view) {
        for (C18182e c18182e : this.f45709a) {
            if (c18182e.m63713c().get() == view) {
                return c18182e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C18182e> m63711a() {
        return this.f45709a;
    }

    /* renamed from: c */
    public void m63705c(View view) {
        m63710a(view);
        C18182e m63706b = m63706b(view);
        if (m63706b != null) {
            this.f45709a.remove(m63706b);
        }
    }

    /* renamed from: a */
    private void m63710a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m63707b() {
        this.f45709a.clear();
    }

    /* renamed from: a */
    public void m63709a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m63710a(view);
        m63708a(str);
        if (m63706b(view) == null) {
            this.f45709a.add(new C18182e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m63708a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f45708b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
