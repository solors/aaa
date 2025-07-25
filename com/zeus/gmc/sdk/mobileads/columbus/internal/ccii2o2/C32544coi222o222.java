package com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.InterfaceC0152Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coi222o222 */
/* loaded from: classes8.dex */
public final class C32544coi222o222 {
    static final int cco22 = 12544;
    static final InterfaceC32545c2oc2i ccoc2oic = new C32550coo2iico();
    static final boolean cicc2iiccc = false;
    static final String cicic = "Palette";
    static final int cii2c2 = 16;
    static final float ciii2coi2 = 3.0f;
    static final float coiic = 4.5f;
    private final List<C32542c2oc2i> coi222o222;
    private final List<C32546c2oc2o> coo2iico;
    private final SparseBooleanArray cioccoiococ = new SparseBooleanArray();
    private final Map<C32542c2oc2i, C32546c2oc2o> c2oc2i = new ArrayMap();
    @Nullable
    private final C32546c2oc2o c2oc2o = coo2iico();

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coi222o222$c2oc2i */
    /* loaded from: classes8.dex */
    public interface InterfaceC32545c2oc2i {
        boolean coo2iico(@ColorInt int i, @NonNull float[] fArr);
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coi222o222$cioccoiococ */
    /* loaded from: classes8.dex */
    public interface InterfaceC32547cioccoiococ {
        void coo2iico(@Nullable C32544coi222o222 c32544coi222o222);
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coi222o222$coi222o222 */
    /* loaded from: classes8.dex */
    public static final class C32548coi222o222 {
        private final List<C32542c2oc2i> c2oc2i;
        private int c2oc2o;
        private int cco22;
        private final List<InterfaceC32545c2oc2i> cii2c2;
        @Nullable
        private Rect ciii2coi2;
        private int cioccoiococ;
        @Nullable
        private final Bitmap coi222o222;
        @Nullable
        private final List<C32546c2oc2o> coo2iico;

        public C32548coi222o222(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.c2oc2i = arrayList;
            this.cioccoiococ = 16;
            this.c2oc2o = C32544coi222o222.cco22;
            this.cco22 = -1;
            ArrayList arrayList2 = new ArrayList();
            this.cii2c2 = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(C32544coi222o222.ccoc2oic);
                this.coi222o222 = bitmap;
                this.coo2iico = null;
                arrayList.add(C32542c2oc2i.cc2o22co2c);
                arrayList.add(C32542c2oc2i.coocii);
                arrayList.add(C32542c2oc2i.ccci2);
                arrayList.add(C32542c2oc2i.cioiic);
                arrayList.add(C32542c2oc2i.c2cic2);
                arrayList.add(C32542c2oc2i.c2ccci2iii);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        @NonNull
        @Deprecated
        public C32548coi222o222 c2oc2i(int i) {
            this.cco22 = i;
            this.c2oc2o = -1;
            return this;
        }

        @NonNull
        public C32544coi222o222 cioccoiococ() {
            List<C32546c2oc2o> list;
            InterfaceC32545c2oc2i[] interfaceC32545c2oc2iArr;
            Bitmap bitmap = this.coi222o222;
            if (bitmap != null) {
                Bitmap coi222o222 = coi222o222(bitmap);
                Rect rect = this.ciii2coi2;
                if (coi222o222 != this.coi222o222 && rect != null) {
                    double width = coi222o222.getWidth() / this.coi222o222.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), coi222o222.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), coi222o222.getHeight());
                }
                int[] coo2iico = coo2iico(coi222o222);
                int i = this.cioccoiococ;
                if (this.cii2c2.isEmpty()) {
                    interfaceC32545c2oc2iArr = null;
                } else {
                    List<InterfaceC32545c2oc2i> list2 = this.cii2c2;
                    interfaceC32545c2oc2iArr = (InterfaceC32545c2oc2i[]) list2.toArray(new InterfaceC32545c2oc2i[list2.size()]);
                }
                C32551coo2iico c32551coo2iico = new C32551coo2iico(coo2iico, i, interfaceC32545c2oc2iArr);
                if (coi222o222 != this.coi222o222) {
                    coi222o222.recycle();
                }
                list = c32551coo2iico.coo2iico();
            } else {
                list = this.coo2iico;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            C32544coi222o222 c32544coi222o222 = new C32544coi222o222(list, this.c2oc2i);
            c32544coi222o222.coi222o222();
            return c32544coi222o222;
        }

        @NonNull
        public C32548coi222o222 coi222o222(int i) {
            this.c2oc2o = i;
            this.cco22 = -1;
            return this;
        }

        @NonNull
        public C32548coi222o222 coo2iico(int i) {
            this.cioccoiococ = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coi222o222$coi222o222$coo2iico */
        /* loaded from: classes8.dex */
        public class AsyncTaskC32549coo2iico extends AsyncTask<Bitmap, Void, C32544coi222o222> {
            final /* synthetic */ InterfaceC32547cioccoiococ coo2iico;

            AsyncTaskC32549coo2iico(InterfaceC32547cioccoiococ interfaceC32547cioccoiococ) {
                this.coo2iico = interfaceC32547cioccoiococ;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            @Nullable
            /* renamed from: coo2iico */
            public C32544coi222o222 doInBackground(Bitmap... bitmapArr) {
                try {
                    return C32548coi222o222.this.cioccoiococ();
                } catch (Exception e) {
                    Log.e(C32544coi222o222.cicic, "Exception thrown during async generate", e);
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: coo2iico */
            public void onPostExecute(@Nullable C32544coi222o222 c32544coi222o222) {
                this.coo2iico.coo2iico(c32544coi222o222);
            }
        }

        @NonNull
        public C32548coi222o222 coo2iico() {
            this.cii2c2.clear();
            return this;
        }

        @NonNull
        public C32548coi222o222 c2oc2i() {
            List<C32542c2oc2i> list = this.c2oc2i;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @NonNull
        public C32548coi222o222 coi222o222() {
            this.ciii2coi2 = null;
            return this;
        }

        @NonNull
        public C32548coi222o222 coo2iico(InterfaceC32545c2oc2i interfaceC32545c2oc2i) {
            if (interfaceC32545c2oc2i != null) {
                this.cii2c2.add(interfaceC32545c2oc2i);
            }
            return this;
        }

        private Bitmap coi222o222(Bitmap bitmap) {
            int max;
            int i;
            double d;
            if (this.c2oc2o > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.c2oc2o;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
                d = -1.0d;
            } else {
                if (this.cco22 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.cco22)) {
                    d = i / max;
                }
                d = -1.0d;
            }
            return d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }

        @NonNull
        public C32548coi222o222 coo2iico(@InterfaceC0152Px int i, @InterfaceC0152Px int i2, @InterfaceC0152Px int i3, @InterfaceC0152Px int i4) {
            if (this.coi222o222 != null) {
                if (this.ciii2coi2 == null) {
                    this.ciii2coi2 = new Rect();
                }
                this.ciii2coi2.set(0, 0, this.coi222o222.getWidth(), this.coi222o222.getHeight());
                if (!this.ciii2coi2.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        @NonNull
        public C32548coi222o222 coo2iico(@NonNull C32542c2oc2i c32542c2oc2i) {
            if (!this.c2oc2i.contains(c32542c2oc2i)) {
                this.c2oc2i.add(c32542c2oc2i);
            }
            return this;
        }

        @NonNull
        public AsyncTask<Bitmap, Void, C32544coi222o222> coo2iico(@NonNull InterfaceC32547cioccoiococ interfaceC32547cioccoiococ) {
            if (interfaceC32547cioccoiococ != null) {
                return new AsyncTaskC32549coo2iico(interfaceC32547cioccoiococ).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.coi222o222);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        private int[] coo2iico(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.ciii2coi2;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.ciii2coi2.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.ciii2coi2;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        public C32548coi222o222(@NonNull List<C32546c2oc2o> list) {
            this.c2oc2i = new ArrayList();
            this.cioccoiococ = 16;
            this.c2oc2o = C32544coi222o222.cco22;
            this.cco22 = -1;
            ArrayList arrayList = new ArrayList();
            this.cii2c2 = arrayList;
            if (list != null && !list.isEmpty()) {
                arrayList.add(C32544coi222o222.ccoc2oic);
                this.coo2iico = list;
                this.coi222o222 = null;
                return;
            }
            throw new IllegalArgumentException("List of Swatches is not valid");
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coi222o222$coo2iico */
    /* loaded from: classes8.dex */
    class C32550coo2iico implements InterfaceC32545c2oc2i {
        private static final float coi222o222 = 0.95f;
        private static final float coo2iico = 0.05f;

        C32550coo2iico() {
        }

        private boolean c2oc2i(float[] fArr) {
            if (fArr[2] >= coi222o222) {
                return true;
            }
            return false;
        }

        private boolean coi222o222(float[] fArr) {
            float f = fArr[0];
            if (f < 10.0f || f > 37.0f || fArr[1] > 0.82f) {
                return false;
            }
            return true;
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.C32544coi222o222.InterfaceC32545c2oc2i
        public boolean coo2iico(int i, float[] fArr) {
            return (c2oc2i(fArr) || coo2iico(fArr) || coi222o222(fArr)) ? false : true;
        }

        private boolean coo2iico(float[] fArr) {
            return fArr[2] <= coo2iico;
        }
    }

    C32544coi222o222(List<C32546c2oc2o> list, List<C32542c2oc2i> list2) {
        this.coo2iico = list;
        this.coi222o222 = list2;
    }

    @Deprecated
    public static C32544coi222o222 coi222o222(Bitmap bitmap) {
        return coo2iico(bitmap).cioccoiococ();
    }

    @NonNull
    public static C32548coi222o222 coo2iico(@NonNull Bitmap bitmap) {
        return new C32548coi222o222(bitmap);
    }

    @Nullable
    public C32546c2oc2o c2oc2i() {
        return c2oc2i(C32542c2oc2i.c2ccci2iii);
    }

    @ColorInt
    public int c2oc2o(@ColorInt int i) {
        return coo2iico(C32542c2oc2i.cc2o22co2c, i);
    }

    @Nullable
    public C32546c2oc2o cco22() {
        return c2oc2i(C32542c2oc2i.cioiic);
    }

    @Nullable
    public C32546c2oc2o cicc2iiccc() {
        return c2oc2i(C32542c2oc2i.coocii);
    }

    @NonNull
    public List<C32542c2oc2i> cicic() {
        return Collections.unmodifiableList(this.coi222o222);
    }

    @Nullable
    public C32546c2oc2o cii2c2() {
        return c2oc2i(C32542c2oc2i.cc2o22co2c);
    }

    @Nullable
    public C32546c2oc2o ciii2coi2() {
        return c2oc2i(C32542c2oc2i.c2cic2);
    }

    @Nullable
    public C32546c2oc2o cioccoiococ() {
        return c2oc2i(C32542c2oc2i.ccci2);
    }

    @NonNull
    public List<C32546c2oc2o> coiic() {
        return Collections.unmodifiableList(this.coo2iico);
    }

    @NonNull
    public static C32544coi222o222 coo2iico(@NonNull List<C32546c2oc2o> list) {
        return new C32548coi222o222(list).cioccoiococ();
    }

    @Nullable
    public C32546c2oc2o c2oc2i(@NonNull C32542c2oc2i c32542c2oc2i) {
        return this.c2oc2i.get(c32542c2oc2i);
    }

    @Nullable
    public C32546c2oc2o c2oc2o() {
        return this.c2oc2o;
    }

    @ColorInt
    public int cco22(@ColorInt int i) {
        return coo2iico(C32542c2oc2i.c2cic2, i);
    }

    @ColorInt
    public int cii2c2(@ColorInt int i) {
        return coo2iico(C32542c2oc2i.coocii, i);
    }

    @ColorInt
    public int cioccoiococ(@ColorInt int i) {
        return coo2iico(C32542c2oc2i.cioiic, i);
    }

    @ColorInt
    public int coi222o222(@ColorInt int i) {
        return coo2iico(C32542c2oc2i.ccci2, i);
    }

    @Deprecated
    public static C32544coi222o222 coo2iico(Bitmap bitmap, int i) {
        return coo2iico(bitmap).coo2iico(i).cioccoiococ();
    }

    @ColorInt
    public int c2oc2i(@ColorInt int i) {
        C32546c2oc2o c32546c2oc2o = this.c2oc2o;
        return c32546c2oc2o != null ? c32546c2oc2o.c2oc2o() : i;
    }

    void coi222o222() {
        int size = this.coi222o222.size();
        for (int i = 0; i < size; i++) {
            C32542c2oc2i c32542c2oc2i = this.coi222o222.get(i);
            c32542c2oc2i.cicc2iiccc();
            this.c2oc2i.put(c32542c2oc2i, coo2iico(c32542c2oc2i));
        }
        this.cioccoiococ.clear();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, C32544coi222o222> coo2iico(Bitmap bitmap, InterfaceC32547cioccoiococ interfaceC32547cioccoiococ) {
        return coo2iico(bitmap).coo2iico(interfaceC32547cioccoiococ);
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, C32544coi222o222> coo2iico(Bitmap bitmap, int i, InterfaceC32547cioccoiococ interfaceC32547cioccoiococ) {
        return coo2iico(bitmap).coo2iico(i).coo2iico(interfaceC32547cioccoiococ);
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coi222o222$c2oc2o */
    /* loaded from: classes8.dex */
    public static final class C32546c2oc2o {
        private final int c2oc2i;
        private final int c2oc2o;
        private boolean cco22;
        private int cii2c2;
        private int ciii2coi2;
        private final int cioccoiococ;
        private final int coi222o222;
        @Nullable
        private float[] coiic;
        private final int coo2iico;

        public C32546c2oc2o(@ColorInt int i, int i2) {
            this.coo2iico = Color.red(i);
            this.coi222o222 = Color.green(i);
            this.c2oc2i = Color.blue(i);
            this.cioccoiococ = i;
            this.c2oc2o = i2;
        }

        private void coo2iico() {
            int alphaComponent;
            int alphaComponent2;
            if (!this.cco22) {
                int calculateMinimumAlpha = ColorUtils.calculateMinimumAlpha(-1, this.cioccoiococ, C32544coi222o222.coiic);
                int calculateMinimumAlpha2 = ColorUtils.calculateMinimumAlpha(-1, this.cioccoiococ, C32544coi222o222.ciii2coi2);
                if (calculateMinimumAlpha != -1 && calculateMinimumAlpha2 != -1) {
                    this.ciii2coi2 = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                    this.cii2c2 = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                    this.cco22 = true;
                    return;
                }
                int calculateMinimumAlpha3 = ColorUtils.calculateMinimumAlpha(ViewCompat.MEASURED_STATE_MASK, this.cioccoiococ, C32544coi222o222.coiic);
                int calculateMinimumAlpha4 = ColorUtils.calculateMinimumAlpha(ViewCompat.MEASURED_STATE_MASK, this.cioccoiococ, C32544coi222o222.ciii2coi2);
                if (calculateMinimumAlpha3 != -1 && calculateMinimumAlpha4 != -1) {
                    this.ciii2coi2 = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha3);
                    this.cii2c2 = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha4);
                    this.cco22 = true;
                    return;
                }
                if (calculateMinimumAlpha != -1) {
                    alphaComponent = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                } else {
                    alphaComponent = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha3);
                }
                this.ciii2coi2 = alphaComponent;
                if (calculateMinimumAlpha2 != -1) {
                    alphaComponent2 = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                } else {
                    alphaComponent2 = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha4);
                }
                this.cii2c2 = alphaComponent2;
                this.cco22 = true;
            }
        }

        @NonNull
        public float[] c2oc2i() {
            if (this.coiic == null) {
                this.coiic = new float[3];
            }
            ColorUtils.RGBToHSL(this.coo2iico, this.coi222o222, this.c2oc2i, this.coiic);
            return this.coiic;
        }

        @ColorInt
        public int c2oc2o() {
            return this.cioccoiococ;
        }

        @ColorInt
        public int cco22() {
            coo2iico();
            return this.cii2c2;
        }

        public int cioccoiococ() {
            return this.c2oc2o;
        }

        @ColorInt
        public int coi222o222() {
            coo2iico();
            return this.ciii2coi2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C32546c2oc2o.class != obj.getClass()) {
                return false;
            }
            C32546c2oc2o c32546c2oc2o = (C32546c2oc2o) obj;
            if (this.c2oc2o == c32546c2oc2o.c2oc2o && this.cioccoiococ == c32546c2oc2o.cioccoiococ) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.cioccoiococ * 31) + this.c2oc2o;
        }

        public String toString() {
            return C32546c2oc2o.class.getSimpleName() + " [RGB: #" + Integer.toHexString(c2oc2o()) + "] [HSL: " + Arrays.toString(c2oc2i()) + "] [Population: " + this.c2oc2o + "] [Title Text: #" + Integer.toHexString(cco22()) + "] [Body Text: #" + Integer.toHexString(coi222o222()) + ']';
        }

        C32546c2oc2o(int i, int i2, int i3, int i4) {
            this.coo2iico = i;
            this.coi222o222 = i2;
            this.c2oc2i = i3;
            this.cioccoiococ = Color.rgb(i, i2, i3);
            this.c2oc2o = i4;
        }

        C32546c2oc2o(float[] fArr, int i) {
            this(ColorUtils.HSLToColor(fArr), i);
            this.coiic = fArr;
        }
    }

    @ColorInt
    public int coo2iico(@ColorInt int i) {
        return coo2iico(C32542c2oc2i.c2ccci2iii, i);
    }

    @ColorInt
    public int coo2iico(@NonNull C32542c2oc2i c32542c2oc2i, @ColorInt int i) {
        C32546c2oc2o c2oc2i = c2oc2i(c32542c2oc2i);
        return c2oc2i != null ? c2oc2i.c2oc2o() : i;
    }

    @Nullable
    private C32546c2oc2o coi222o222(C32542c2oc2i c32542c2oc2i) {
        int size = this.coo2iico.size();
        float f = 0.0f;
        C32546c2oc2o c32546c2oc2o = null;
        for (int i = 0; i < size; i++) {
            C32546c2oc2o c32546c2oc2o2 = this.coo2iico.get(i);
            if (coi222o222(c32546c2oc2o2, c32542c2oc2i)) {
                float coo2iico = coo2iico(c32546c2oc2o2, c32542c2oc2i);
                if (c32546c2oc2o == null || coo2iico > f) {
                    c32546c2oc2o = c32546c2oc2o2;
                    f = coo2iico;
                }
            }
        }
        return c32546c2oc2o;
    }

    @Nullable
    private C32546c2oc2o coo2iico(C32542c2oc2i c32542c2oc2i) {
        C32546c2oc2o coi222o222 = coi222o222(c32542c2oc2i);
        if (coi222o222 != null && c32542c2oc2i.cicic()) {
            this.cioccoiococ.append(coi222o222.c2oc2o(), true);
        }
        return coi222o222;
    }

    private boolean coi222o222(C32546c2oc2o c32546c2oc2o, C32542c2oc2i c32542c2oc2i) {
        float[] c2oc2i = c32546c2oc2o.c2oc2i();
        return c2oc2i[1] >= c32542c2oc2i.c2oc2o() && c2oc2i[1] <= c32542c2oc2i.c2oc2i() && c2oc2i[2] >= c32542c2oc2i.cioccoiococ() && c2oc2i[2] <= c32542c2oc2i.coi222o222() && !this.cioccoiococ.get(c32546c2oc2o.c2oc2o());
    }

    private float coo2iico(C32546c2oc2o c32546c2oc2o, C32542c2oc2i c32542c2oc2i) {
        float[] c2oc2i = c32546c2oc2o.c2oc2i();
        C32546c2oc2o c32546c2oc2o2 = this.c2oc2o;
        int cioccoiococ = c32546c2oc2o2 != null ? c32546c2oc2o2.cioccoiococ() : 1;
        return (c32542c2oc2i.cii2c2() > 0.0f ? c32542c2oc2i.cii2c2() * (1.0f - Math.abs(c2oc2i[1] - c32542c2oc2i.coiic())) : 0.0f) + (c32542c2oc2i.coo2iico() > 0.0f ? c32542c2oc2i.coo2iico() * (1.0f - Math.abs(c2oc2i[2] - c32542c2oc2i.ciii2coi2())) : 0.0f) + (c32542c2oc2i.cco22() > 0.0f ? c32542c2oc2i.cco22() * (c32546c2oc2o.cioccoiococ() / cioccoiococ) : 0.0f);
    }

    @Nullable
    private C32546c2oc2o coo2iico() {
        int size = this.coo2iico.size();
        int i = Integer.MIN_VALUE;
        C32546c2oc2o c32546c2oc2o = null;
        for (int i2 = 0; i2 < size; i2++) {
            C32546c2oc2o c32546c2oc2o2 = this.coo2iico.get(i2);
            if (c32546c2oc2o2.cioccoiococ() > i) {
                i = c32546c2oc2o2.cioccoiococ();
                c32546c2oc2o = c32546c2oc2o2;
            }
        }
        return c32546c2oc2o;
    }
}
