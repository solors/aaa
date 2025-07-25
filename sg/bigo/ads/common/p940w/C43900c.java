package sg.bigo.ads.common.p940w;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequiresApi(api = 19)
/* renamed from: sg.bigo.ads.common.w.c */
/* loaded from: classes10.dex */
public final class C43900c {

    /* renamed from: b */
    static final InterfaceC43903b f114955b = new InterfaceC43903b() { // from class: sg.bigo.ads.common.w.c.1
        @Override // sg.bigo.ads.common.p940w.C43900c.InterfaceC43903b
        /* renamed from: a */
        public final boolean mo4661a(float[] fArr) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            float f = fArr[2];
            if (f >= 0.95f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (f <= 0.05f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    float f2 = fArr[1];
                    if ((f2 <= 0.1f && f >= 0.55f) || ((f2 <= 0.5f && f >= 0.75f) || (f2 <= 0.2f && f >= 0.7f))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        float f3 = fArr[0];
                        if (f3 >= 10.0f && f3 <= 37.0f && f2 <= 0.82f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: c */
    private final List<C43904c> f114957c;

    /* renamed from: d */
    private final List<C43905d> f114958d;

    /* renamed from: f */
    private final SparseBooleanArray f114960f = new SparseBooleanArray();

    /* renamed from: e */
    private final Map<C43905d, C43904c> f114959e = new ArrayMap();
    @Nullable

    /* renamed from: a */
    final C43904c f114956a = m4662b();

    /* renamed from: sg.bigo.ads.common.w.c$a */
    /* loaded from: classes10.dex */
    public static final class C43902a {
        @Nullable

        /* renamed from: a */
        final Bitmap f114961a;

        /* renamed from: b */
        final List<C43905d> f114962b;

        /* renamed from: c */
        int f114963c;

        /* renamed from: d */
        int f114964d;

        /* renamed from: e */
        int f114965e;

        /* renamed from: f */
        final List<InterfaceC43903b> f114966f;

        public C43902a(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f114962b = arrayList;
            this.f114963c = 16;
            this.f114964d = 12544;
            this.f114965e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f114966f = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(C43900c.f114955b);
                this.f114961a = bitmap;
                arrayList.add(C43905d.f114973a);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.w.c$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC43903b {
        /* renamed from: a */
        boolean mo4661a(@NonNull float[] fArr);
    }

    /* renamed from: sg.bigo.ads.common.w.c$c */
    /* loaded from: classes10.dex */
    public static final class C43904c {

        /* renamed from: a */
        final int f114967a;

        /* renamed from: b */
        final int f114968b;

        /* renamed from: c */
        private final int f114969c;

        /* renamed from: d */
        private final int f114970d;

        /* renamed from: e */
        private final int f114971e;
        @Nullable

        /* renamed from: f */
        private float[] f114972f;

        public C43904c(@ColorInt int i, int i2) {
            this.f114969c = Color.red(i);
            this.f114970d = Color.green(i);
            this.f114971e = Color.blue(i);
            this.f114967a = i;
            this.f114968b = i2;
        }

        @NonNull
        /* renamed from: a */
        public final float[] m4660a() {
            if (this.f114972f == null) {
                this.f114972f = new float[3];
            }
            C43887b.m4683a(this.f114969c, this.f114970d, this.f114971e, this.f114972f);
            return this.f114972f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C43900c(List<C43904c> list, List<C43905d> list2) {
        this.f114957c = list;
        this.f114958d = list2;
    }

    @NonNull
    /* renamed from: a */
    public static C43902a m4663a(@NonNull Bitmap bitmap) {
        return new C43902a(bitmap);
    }

    @Nullable
    /* renamed from: b */
    private C43904c m4662b() {
        int size = this.f114957c.size();
        int i = Integer.MIN_VALUE;
        C43904c c43904c = null;
        for (int i2 = 0; i2 < size; i2++) {
            C43904c c43904c2 = this.f114957c.get(i2);
            int i3 = c43904c2.f114968b;
            if (i3 > i) {
                c43904c = c43904c2;
                i = i3;
            }
        }
        return c43904c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4664a() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.p940w.C43900c.m4664a():void");
    }
}
