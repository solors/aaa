package com.zeus.gmc.sdk.mobileads.columbus.internal.ciii2coi2;

import androidx.annotation.VisibleForTesting;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AsyncTaskC32716c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AsyncTaskC32717cco22;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AsyncTaskC32718cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.C32715c2oc2i;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciii2coi2.c2oc2i */
/* loaded from: classes8.dex */
public class C32616c2oc2i implements AbstractAsyncTaskC32719coi222o222.InterfaceC32720coi222o222 {
    private final C32715c2oc2i coi222o222;
    private JSONObject coo2iico;

    public C32616c2oc2i(C32715c2oc2i c32715c2oc2i) {
        this.coi222o222 = c32715c2oc2i;
    }

    public void coi222o222() {
        this.coi222o222.coi222o222(new AsyncTaskC32718cioccoiococ(this));
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222.InterfaceC32720coi222o222
    @VisibleForTesting
    public JSONObject coo2iico() {
        return this.coo2iico;
    }

    public void coi222o222(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.coi222o222.coi222o222(new AsyncTaskC32717cco22(this, hashSet, jSONObject, j));
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222.InterfaceC32720coi222o222
    @VisibleForTesting
    public void coo2iico(JSONObject jSONObject) {
        this.coo2iico = jSONObject;
    }

    public void coo2iico(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.coi222o222.coi222o222(new AsyncTaskC32716c2oc2o(this, hashSet, jSONObject, j));
    }
}
