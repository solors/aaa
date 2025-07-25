package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.C32726coi222o222;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.coi222o222 */
/* loaded from: classes8.dex */
public class C32179coi222o222 {
    private final float cicic;
    @NonNull
    private final Context coo2iico;
    @NonNull
    private final Rect coi222o222 = new Rect();
    @NonNull
    private final Rect c2oc2i = new Rect();
    @NonNull
    private final Rect cioccoiococ = new Rect();
    @NonNull
    private final Rect c2oc2o = new Rect();
    @NonNull
    private final Rect cco22 = new Rect();
    @NonNull
    private final Rect cii2c2 = new Rect();
    @NonNull
    private final Rect ciii2coi2 = new Rect();
    @NonNull
    private final Rect coiic = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C32179coi222o222(Context context, float f) {
        this.coo2iico = context.getApplicationContext();
        this.cicic = f;
    }

    private void coo2iico(Rect rect, Rect rect2) {
        rect2.set(C32726coi222o222.cco22(rect.left, this.coo2iico), C32726coi222o222.cco22(rect.top, this.coo2iico), C32726coi222o222.cco22(rect.right, this.coo2iico), C32726coi222o222.cco22(rect.bottom, this.coo2iico));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c2oc2i(int i, int i2, int i3, int i4) {
        this.cioccoiococ.set(i, i2, i3 + i, i4 + i2);
        coo2iico(this.cioccoiococ, this.c2oc2o);
    }

    public float c2oc2o() {
        return this.cicic;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Rect cco22() {
        return this.cioccoiococ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Rect cii2c2() {
        return this.c2oc2o;
    }

    @NonNull
    Rect ciii2coi2() {
        return this.coi222o222;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Rect cioccoiococ() {
        return this.coiic;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Rect coi222o222() {
        return this.cii2c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Rect coiic() {
        return this.c2oc2i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void coi222o222(int i, int i2, int i3, int i4) {
        this.ciii2coi2.set(i, i2, i3 + i, i4 + i2);
        coo2iico(this.ciii2coi2, this.coiic);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Rect c2oc2i() {
        return this.ciii2coi2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void coo2iico(int i, int i2) {
        this.coi222o222.set(0, 0, i, i2);
        coo2iico(this.coi222o222, this.c2oc2i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void coo2iico(int i, int i2, int i3, int i4) {
        this.cco22.set(i, i2, i3 + i, i4 + i2);
        coo2iico(this.cco22, this.cii2c2);
    }

    @NonNull
    Rect coo2iico() {
        return this.cco22;
    }
}
