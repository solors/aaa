package com.zeus.gmc.sdk.mobileads.columbus.internal.coiic;

import com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.coo2iico */
/* loaded from: classes8.dex */
public abstract class AbstractAsyncTaskC32722coo2iico extends AbstractAsyncTaskC32719coi222o222 {
    protected final HashSet<String> c2oc2i;
    protected final long c2oc2o;
    protected final JSONObject cioccoiococ;

    public AbstractAsyncTaskC32722coo2iico(AbstractAsyncTaskC32719coi222o222.InterfaceC32720coi222o222 interfaceC32720coi222o222, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC32720coi222o222);
        this.c2oc2i = new HashSet<>(hashSet);
        this.cioccoiococ = jSONObject;
        this.c2oc2o = j;
    }
}
