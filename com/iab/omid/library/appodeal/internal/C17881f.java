package com.iab.omid.library.appodeal.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.appodeal.internal.f */
/* loaded from: classes6.dex */
public class C17881f {

    /* renamed from: b */
    private static final Pattern f45074b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C17880e> f45075a = new ArrayList();

    /* renamed from: b */
    private C17880e m64876b(View view) {
        for (C17880e c17880e : this.f45075a) {
            if (c17880e.m64883c().get() == view) {
                return c17880e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C17880e> m64881a() {
        return this.f45075a;
    }

    /* renamed from: c */
    public void m64875c(View view) {
        m64880a(view);
        C17880e m64876b = m64876b(view);
        if (m64876b != null) {
            this.f45075a.remove(m64876b);
        }
    }

    /* renamed from: a */
    private void m64880a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m64877b() {
        this.f45075a.clear();
    }

    /* renamed from: a */
    public void m64879a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m64880a(view);
        m64878a(str);
        if (m64876b(view) == null) {
            this.f45075a.add(new C17880e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m64878a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f45074b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
