package com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.xiaomi.adsession.ErrorType;
import com.iab.omid.library.xiaomi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.xiaomi.publisher.AdSessionStatePublisher;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32610cii2c2;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.coi222o222 */
/* loaded from: classes8.dex */
public abstract class AbstractC32706coi222o222 {
    public static AbstractC32706coi222o222 coo2iico(C32697c2oc2i c32697c2oc2i, C32705cioccoiococ c32705cioccoiococ) {
        C32610cii2c2.coo2iico();
        C32610cii2c2.coo2iico(c32697c2oc2i, "AdSessionConfiguration is null");
        C32610cii2c2.coo2iico(c32705cioccoiococ, "AdSessionContext is null");
        return new C32707coiic(c32697c2oc2i, c32705cioccoiococ);
    }

    public abstract AdSessionStatePublisher c2oc2i();

    public abstract void c2oc2o();

    public abstract void cioccoiococ();

    public abstract String coi222o222();

    public abstract void coi222o222(View view);

    public abstract void coo2iico();

    public abstract void coo2iico(View view);

    public abstract void coo2iico(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str);

    public abstract void coo2iico(ErrorType errorType, String str);

    public abstract void coo2iico(InterfaceC32703cii2c2 interfaceC32703cii2c2);
}
