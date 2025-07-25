package com.iab.omid.library.vungle.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.vungle.internal.f */
/* loaded from: classes6.dex */
public class C18751f {

    /* renamed from: b */
    private static final Pattern f46893b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C18750e> f46894a = new ArrayList();

    /* renamed from: b */
    private C18750e m61496b(View view) {
        for (C18750e c18750e : this.f46894a) {
            if (c18750e.m61503c().get() == view) {
                return c18750e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C18750e> m61501a() {
        return this.f46894a;
    }

    /* renamed from: c */
    public void m61495c(View view) {
        m61500a(view);
        C18750e m61496b = m61496b(view);
        if (m61496b != null) {
            this.f46894a.remove(m61496b);
        }
    }

    /* renamed from: a */
    private void m61500a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m61497b() {
        this.f46894a.clear();
    }

    /* renamed from: a */
    public void m61499a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m61500a(view);
        m61498a(str);
        if (m61496b(view) == null) {
            this.f46894a.add(new C18750e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m61498a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f46893b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
