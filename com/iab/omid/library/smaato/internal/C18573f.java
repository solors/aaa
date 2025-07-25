package com.iab.omid.library.smaato.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.smaato.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.smaato.internal.f */
/* loaded from: classes6.dex */
public class C18573f {

    /* renamed from: b */
    private static final Pattern f46502b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C18572e> f46503a = new ArrayList();

    /* renamed from: b */
    private C18572e m62218b(View view) {
        for (C18572e c18572e : this.f46503a) {
            if (c18572e.m62225c().get() == view) {
                return c18572e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C18572e> m62223a() {
        return this.f46503a;
    }

    /* renamed from: c */
    public void m62217c(View view) {
        m62222a(view);
        C18572e m62218b = m62218b(view);
        if (m62218b != null) {
            this.f46503a.remove(m62218b);
        }
    }

    /* renamed from: a */
    private void m62222a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m62219b() {
        this.f46503a.clear();
    }

    /* renamed from: a */
    public void m62221a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m62222a(view);
        m62220a(str);
        if (m62218b(view) == null) {
            this.f46503a.add(new C18572e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m62220a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f46502b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
