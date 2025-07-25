package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.coiic */
/* loaded from: classes8.dex */
public final class C32469coiic {
    private static final String c2oc2i = "gu";
    private static final String coo2iico = "GuUtils";
    private static final String coi222o222 = "gu_sp";
    private static C32445c22o22co22i cioccoiococ = new C32445c22o22co22i(coi222o222);

    public static void coi222o222() {
        synchronized (C32469coiic.class) {
            if (TextUtils.isEmpty(cioccoiococ.coo2iico(c2oc2i, ""))) {
                cioccoiococ.coi222o222(c2oc2i, UUID.randomUUID().toString());
            }
        }
    }

    public static String coo2iico() {
        String uuid;
        String coo2iico2 = cioccoiococ.coo2iico(c2oc2i, "");
        if (TextUtils.isEmpty(coo2iico2)) {
            synchronized (C32469coiic.class) {
                uuid = UUID.randomUUID().toString();
                cioccoiococ.coi222o222(c2oc2i, uuid);
            }
            return uuid;
        }
        return coo2iico2;
    }
}
