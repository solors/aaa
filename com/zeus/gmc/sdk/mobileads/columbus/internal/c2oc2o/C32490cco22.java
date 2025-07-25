package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.xiaomi.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.cco22 */
/* loaded from: classes8.dex */
public class C32490cco22 {
    private static final Pattern coi222o222 = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List<C32489c2oc2o> coo2iico = new ArrayList();

    private C32489c2oc2o coi222o222(View view) {
        for (C32489c2oc2o c32489c2oc2o : this.coo2iico) {
            if (c32489c2oc2o.c2oc2i().get() == view) {
                return c32489c2oc2o;
            }
        }
        return null;
    }

    public void c2oc2i(View view) {
        coo2iico(view);
        C32489c2oc2o coi222o2222 = coi222o222(view);
        if (coi222o2222 != null) {
            this.coo2iico.remove(coi222o2222);
        }
    }

    public List<C32489c2oc2o> coo2iico() {
        return this.coo2iico;
    }

    private void coo2iico(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    public void coi222o222() {
        this.coo2iico.clear();
    }

    public void coo2iico(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        coo2iico(view);
        coo2iico(str);
        if (coi222o222(view) == null) {
            this.coo2iico.add(new C32489c2oc2o(view, friendlyObstructionPurpose, str));
        }
    }

    private void coo2iico(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!coi222o222.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
