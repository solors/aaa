package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o;

import android.content.Context;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32496cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32609cco22;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;
import java.util.Date;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.coo2iico */
/* loaded from: classes8.dex */
public class C32500coo2iico implements C32496cioccoiococ.InterfaceC32497coo2iico {
    private static C32500coo2iico cco22 = new C32500coo2iico(new C32496cioccoiococ());
    private boolean c2oc2i;
    private boolean c2oc2o;
    private C32496cioccoiococ cioccoiococ;
    private Date coi222o222;
    protected C32609cco22 coo2iico = new C32609cco22();

    private C32500coo2iico(C32496cioccoiococ c32496cioccoiococ) {
        this.cioccoiococ = c32496cioccoiococ;
    }

    private void c2oc2i() {
        if (this.c2oc2i && this.coi222o222 != null) {
            for (C32707coiic c32707coiic : C32488c2oc2i.c2oc2i().coo2iico()) {
                c32707coiic.c2oc2i().coo2iico(coi222o222());
            }
        }
    }

    public static C32500coo2iico coo2iico() {
        return cco22;
    }

    public void cioccoiococ() {
        Date coo2iico = this.coo2iico.coo2iico();
        Date date = this.coi222o222;
        if (date == null || coo2iico.after(date)) {
            this.coi222o222 = coo2iico;
            c2oc2i();
        }
    }

    public Date coi222o222() {
        Date date = this.coi222o222;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void coo2iico(@NonNull Context context) {
        if (this.c2oc2i) {
            return;
        }
        this.cioccoiococ.coo2iico(context);
        this.cioccoiococ.coo2iico(this);
        this.cioccoiococ.c2oc2o();
        this.c2oc2o = this.cioccoiococ.c2oc2i();
        this.c2oc2i = true;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32496cioccoiococ.InterfaceC32497coo2iico
    public void coo2iico(boolean z) {
        if (!this.c2oc2o && z) {
            cioccoiococ();
        }
        this.c2oc2o = z;
    }
}
