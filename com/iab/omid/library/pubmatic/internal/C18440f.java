package com.iab.omid.library.pubmatic.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.pubmatic.internal.f */
/* loaded from: classes6.dex */
public class C18440f {

    /* renamed from: b */
    private static final Pattern f46232b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C18439e> f46233a = new ArrayList();

    /* renamed from: b */
    private C18439e m62724b(View view) {
        for (C18439e c18439e : this.f46233a) {
            if (c18439e.m62731c().get() == view) {
                return c18439e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C18439e> m62729a() {
        return this.f46233a;
    }

    /* renamed from: c */
    public void m62723c(View view) {
        m62728a(view);
        C18439e m62724b = m62724b(view);
        if (m62724b != null) {
            this.f46233a.remove(m62724b);
        }
    }

    /* renamed from: a */
    private void m62728a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m62725b() {
        this.f46233a.clear();
    }

    /* renamed from: a */
    public void m62727a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m62728a(view);
        m62726a(str);
        if (m62724b(view) == null) {
            this.f46233a.add(new C18439e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m62726a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f46232b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
