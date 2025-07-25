package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7680bX;
import com.bytedance.sdk.component.ldr.p261bg.p273iR.C7710bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX */
/* loaded from: classes3.dex */
public abstract class AbstractC7683bX {

    /* renamed from: bg */
    private final Context f16818bg;

    /* renamed from: IL */
    protected final List<InterfaceC7706bg> f16816IL = new ArrayList();

    /* renamed from: bX */
    private boolean f16817bX = false;
    private final Runnable eqN = new Runnable() { // from class: com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bX.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (AbstractC7683bX.this) {
                if (AbstractC7683bX.this.f16816IL.isEmpty()) {
                    AbstractC7683bX.this.f16817bX = false;
                    return;
                }
                ArrayList arrayList = new ArrayList(AbstractC7683bX.this.f16816IL);
                AbstractC7683bX.this.f16816IL.clear();
                AbstractC7683bX.this.f16817bX = false;
                AbstractC7683bX.this.eqN(arrayList);
            }
        }
    };

    public AbstractC7683bX(Context context) {
        this.f16818bg = context;
    }

    /* renamed from: IL */
    public abstract String mo88039IL();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bX */
    public void m88068bX(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                Iterator<InterfaceC7706bg> it = this.f16816IL.iterator();
                while (it.hasNext()) {
                    InterfaceC7706bg next = it.next();
                    if (next != null) {
                        String mo87989bX = next.mo87989bX();
                        if (!TextUtils.isEmpty(mo87989bX) && list.contains(mo87989bX)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                mo88039IL();
                th.getMessage();
            }
        }
    }

    public void eqN(List<InterfaceC7706bg> list) {
        C7680bX.m88072bg(m88064zx(), mo88039IL(), list);
    }

    /* renamed from: zx */
    public Context m88064zx() {
        return this.f16818bg;
    }

    /* renamed from: bg */
    private void m88067bg() {
        if (this.f16817bX) {
            return;
        }
        C7710bg.m87972bg().postDelayed(this.eqN, C7710bg.m87973IL());
        this.f16817bX = true;
    }

    /* renamed from: bg */
    public synchronized void m88065bg(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg.mo87978iR() != null && !TextUtils.isEmpty(interfaceC7706bg.mo87989bX())) {
            this.f16816IL.add(interfaceC7706bg);
            m88067bg();
        }
    }
}
