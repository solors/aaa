package com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.xiaomi.adsession.AdSessionContextType;
import com.iab.omid.library.xiaomi.adsession.ErrorType;
import com.iab.omid.library.xiaomi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.xiaomi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.xiaomi.publisher.C18798coi222o222;
import com.iab.omid.library.xiaomi.publisher.C18801coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32488c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32489c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32490cco22;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32499coiic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32500coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicic.C32588coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32610cii2c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.coiic */
/* loaded from: classes8.dex */
public class C32707coiic extends AbstractC32706coi222o222 {
    private final C32490cco22 c2oc2i;
    private AdSessionStatePublisher c2oc2o;
    private boolean cco22;
    private InterfaceC32703cii2c2 cicc2iiccc;
    private boolean cicic;
    private boolean cii2c2;
    private final String ciii2coi2;
    private C32588coo2iico cioccoiococ;
    private final C32697c2oc2i coi222o222;
    private boolean coiic;
    private final C32705cioccoiococ coo2iico;

    public C32707coiic(C32697c2oc2i c32697c2oc2i, C32705cioccoiococ c32705cioccoiococ) {
        this(c32697c2oc2i, c32705cioccoiococ, UUID.randomUUID().toString());
    }

    private void cco22() {
        if (!this.coiic) {
            return;
        }
        throw new IllegalStateException("Impression event can only be sent once");
    }

    private void cii2c2() {
        if (!this.cicic) {
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    public void c222o2o2c2o() {
        cco22();
        c2oc2i().cii2c2();
        this.coiic = true;
    }

    public boolean c22o22co22i() {
        return this.cco22;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public AdSessionStatePublisher c2oc2i() {
        return this.c2oc2o;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public void c2oc2o() {
        if (this.cco22) {
            return;
        }
        this.cco22 = true;
        C32488c2oc2i.c2oc2i().c2oc2i(this);
        this.c2oc2o.coo2iico(C32499coiic.c2oc2i().coi222o222());
        this.c2oc2o.coo2iico(C32500coo2iico.coo2iico().coi222o222());
        this.c2oc2o.coo2iico(this, this.coo2iico);
    }

    public boolean c2oicci2() {
        return this.coi222o222.coi222o222();
    }

    public boolean ccoc2oic() {
        return this.cii2c2;
    }

    public boolean cicc2iiccc() {
        if (this.cco22 && !this.cii2c2) {
            return true;
        }
        return false;
    }

    public void cici2o2oo() {
        cii2c2();
        c2oc2i().coiic();
        this.cicic = true;
    }

    public boolean cicic() {
        if (this.cicc2iiccc != null) {
            return true;
        }
        return false;
    }

    public View ciii2coi2() {
        return this.cioccoiococ.get();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public void cioccoiococ() {
        if (this.cii2c2) {
            return;
        }
        this.c2oc2i.coi222o222();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public String coi222o222() {
        return this.ciii2coi2;
    }

    public List<C32489c2oc2o> coiic() {
        return this.c2oc2i.coo2iico();
    }

    public boolean coiio2() {
        return this.coi222o222.coo2iico();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public void coo2iico() {
        if (this.cii2c2) {
            return;
        }
        this.cioccoiococ.clear();
        cioccoiococ();
        this.cii2c2 = true;
        c2oc2i().cco22();
        C32488c2oc2i.c2oc2i().coi222o222(this);
        c2oc2i().coi222o222();
        this.c2oc2o = null;
        this.cicc2iiccc = null;
    }

    public C32707coiic(C32697c2oc2i c32697c2oc2i, C32705cioccoiococ c32705cioccoiococ, String str) {
        this.c2oc2i = new C32490cco22();
        this.cco22 = false;
        this.cii2c2 = false;
        this.coi222o222 = c32697c2oc2i;
        this.coo2iico = c32705cioccoiococ;
        this.ciii2coi2 = str;
        cioccoiococ(null);
        this.c2oc2o = (c32705cioccoiococ.coo2iico() == AdSessionContextType.HTML || c32705cioccoiococ.coo2iico() == AdSessionContextType.JAVASCRIPT) ? new C18801coo2iico(str, c32705cioccoiococ.ciii2coi2()) : new C18798coi222o222(str, c32705cioccoiococ.cioccoiococ(), c32705cioccoiococ.c2oc2o());
        this.c2oc2o.cicic();
        C32488c2oc2i.c2oc2i().coo2iico(this);
        this.c2oc2o.coo2iico(c32697c2oc2i);
    }

    private void c2oc2i(View view) {
        Collection<C32707coiic> coi222o222 = C32488c2oc2i.c2oc2i().coi222o222();
        if (coi222o222 == null || coi222o222.isEmpty()) {
            return;
        }
        for (C32707coiic c32707coiic : coi222o222) {
            if (c32707coiic != this && c32707coiic.ciii2coi2() == view) {
                c32707coiic.cioccoiococ.clear();
            }
        }
    }

    private void cioccoiococ(View view) {
        this.cioccoiococ = new C32588coo2iico(view);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public void coi222o222(View view) {
        if (this.cii2c2) {
            return;
        }
        this.c2oc2i.c2oc2i(view);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public void coo2iico(View view) {
        if (this.cii2c2) {
            return;
        }
        C32610cii2c2.coo2iico(view, "AdView is null");
        if (ciii2coi2() == view) {
            return;
        }
        cioccoiococ(view);
        c2oc2i().coo2iico();
        c2oc2i(view);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public void coo2iico(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.cii2c2) {
            return;
        }
        this.c2oc2i.coo2iico(view, friendlyObstructionPurpose, str);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public void coo2iico(ErrorType errorType, String str) {
        if (this.cii2c2) {
            throw new IllegalStateException("AdSession is finished");
        }
        C32610cii2c2.coo2iico(errorType, "Error type is null");
        C32610cii2c2.coo2iico(str, "Message is null");
        c2oc2i().coo2iico(errorType, str);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.AbstractC32706coi222o222
    public void coo2iico(InterfaceC32703cii2c2 interfaceC32703cii2c2) {
        this.cicc2iiccc = interfaceC32703cii2c2;
    }

    public void coo2iico(List<C32588coo2iico> list) {
        if (cicic()) {
            ArrayList arrayList = new ArrayList();
            for (C32588coo2iico c32588coo2iico : list) {
                View view = c32588coo2iico.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.cicc2iiccc.coo2iico(this.ciii2coi2, arrayList);
        }
    }

    public void coo2iico(@NonNull JSONObject jSONObject) {
        cii2c2();
        c2oc2i().coo2iico(jSONObject);
        this.cicic = true;
    }
}
