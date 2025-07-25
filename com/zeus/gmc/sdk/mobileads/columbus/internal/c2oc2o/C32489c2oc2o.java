package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.xiaomi.adsession.FriendlyObstructionPurpose;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicic.C32588coo2iico;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.c2oc2o */
/* loaded from: classes8.dex */
public class C32489c2oc2o {
    private final FriendlyObstructionPurpose c2oc2i;
    private final String cioccoiococ;
    private final String coi222o222;
    private final C32588coo2iico coo2iico;

    public C32489c2oc2o(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.coo2iico = new C32588coo2iico(view);
        this.coi222o222 = view.getClass().getCanonicalName();
        this.c2oc2i = friendlyObstructionPurpose;
        this.cioccoiococ = str;
    }

    public C32588coo2iico c2oc2i() {
        return this.coo2iico;
    }

    public String cioccoiococ() {
        return this.coi222o222;
    }

    public FriendlyObstructionPurpose coi222o222() {
        return this.c2oc2i;
    }

    public String coo2iico() {
        return this.cioccoiococ;
    }
}
