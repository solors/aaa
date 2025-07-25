package com.zeus.gmc.sdk.mobileads.columbus.internal.coiic;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.coi222o222 */
/* loaded from: classes8.dex */
public abstract class AbstractAsyncTaskC32719coi222o222 extends AsyncTask<Object, Void, String> {
    protected final InterfaceC32720coi222o222 coi222o222;
    private InterfaceC32721coo2iico coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.coi222o222$coi222o222 */
    /* loaded from: classes8.dex */
    public interface InterfaceC32720coi222o222 {
        JSONObject coo2iico();

        void coo2iico(JSONObject jSONObject);
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.coi222o222$coo2iico */
    /* loaded from: classes8.dex */
    public interface InterfaceC32721coo2iico {
        void coo2iico(AbstractAsyncTaskC32719coi222o222 abstractAsyncTaskC32719coi222o222);
    }

    public AbstractAsyncTaskC32719coi222o222(InterfaceC32720coi222o222 interfaceC32720coi222o222) {
        this.coi222o222 = interfaceC32720coi222o222;
    }

    public void coo2iico(InterfaceC32721coo2iico interfaceC32721coo2iico) {
        this.coo2iico = interfaceC32721coo2iico;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: coo2iico */
    public void onPostExecute(String str) {
        InterfaceC32721coo2iico interfaceC32721coo2iico = this.coo2iico;
        if (interfaceC32721coo2iico != null) {
            interfaceC32721coo2iico.coo2iico(this);
        }
    }

    public void coo2iico(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
