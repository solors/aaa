package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C30363g5;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.g5 */
/* loaded from: classes8.dex */
public final class C30363g5 implements InterfaceC30632jl {

    /* renamed from: h */
    public static final C30363g5 f79498h = new C30363g5(null, new C30364a[0], 0, -9223372036854775807L, 0);

    /* renamed from: i */
    private static final C30364a f79499i = new C30364a(0, -1, new int[0], new Uri[0], new long[0], 0, false).m33924a();

    /* renamed from: j */
    public static final InterfaceC30632jl.InterfaceC30633a<C30363g5> f79500j = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.yo2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            return C30363g5.m33925b(bundle);
        }
    };
    @Nullable

    /* renamed from: b */
    public final Object f79501b;

    /* renamed from: c */
    public final int f79502c;

    /* renamed from: d */
    public final long f79503d;

    /* renamed from: e */
    public final long f79504e;

    /* renamed from: f */
    public final int f79505f;

    /* renamed from: g */
    private final C30364a[] f79506g;

    /* renamed from: com.yandex.mobile.ads.impl.g5$a */
    /* loaded from: classes8.dex */
    public static final class C30364a implements InterfaceC30632jl {

        /* renamed from: i */
        public static final InterfaceC30632jl.InterfaceC30633a<C30364a> f79507i = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.zo2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return C30363g5.C30364a.m33921b(bundle);
            }
        };

        /* renamed from: b */
        public final long f79508b;

        /* renamed from: c */
        public final int f79509c;

        /* renamed from: d */
        public final Uri[] f79510d;

        /* renamed from: e */
        public final int[] f79511e;

        /* renamed from: f */
        public final long[] f79512f;

        /* renamed from: g */
        public final long f79513g;

        /* renamed from: h */
        public final boolean f79514h;

        /* renamed from: a */
        public static C30364a m33922a(Bundle bundle) {
            long j = bundle.getLong(Integer.toString(0, 36));
            int i = bundle.getInt(Integer.toString(1, 36), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
            int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
            long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
            return new C30364a(j, i, intArray == null ? new int[0] : intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
        }

        /* renamed from: b */
        public static /* synthetic */ C30364a m33921b(Bundle bundle) {
            return m33922a(bundle);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C30364a.class != obj.getClass()) {
                return false;
            }
            C30364a c30364a = (C30364a) obj;
            if (this.f79508b == c30364a.f79508b && this.f79509c == c30364a.f79509c && Arrays.equals(this.f79510d, c30364a.f79510d) && Arrays.equals(this.f79511e, c30364a.f79511e) && Arrays.equals(this.f79512f, c30364a.f79512f) && this.f79513g == c30364a.f79513g && this.f79514h == c30364a.f79514h) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            long j = this.f79508b;
            int hashCode = Arrays.hashCode(this.f79511e);
            int hashCode2 = Arrays.hashCode(this.f79512f);
            long j2 = this.f79513g;
            return ((((hashCode2 + ((hashCode + (((((this.f79509c * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f79510d)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f79514h ? 1 : 0);
        }

        private C30364a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            C30937nf.m31567a(iArr.length == uriArr.length);
            this.f79508b = j;
            this.f79509c = i;
            this.f79511e = iArr;
            this.f79510d = uriArr;
            this.f79512f = jArr;
            this.f79513g = j2;
            this.f79514h = z;
        }

        /* renamed from: a */
        public final int m33923a(@IntRange(from = -1) int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f79511e;
                if (i3 >= iArr.length || this.f79514h || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        @CheckResult
        /* renamed from: a */
        public final C30364a m33924a() {
            int[] iArr = this.f79511e;
            int length = iArr.length;
            int max = Math.max(0, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            long[] jArr = this.f79512f;
            int length2 = jArr.length;
            int max2 = Math.max(0, length2);
            long[] copyOf2 = Arrays.copyOf(jArr, max2);
            Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
            return new C30364a(this.f79508b, 0, copyOf, (Uri[]) Arrays.copyOf(this.f79510d, 0), copyOf2, this.f79513g, this.f79514h);
        }
    }

    private C30363g5(@Nullable Object obj, C30364a[] c30364aArr, long j, long j2, int i) {
        this.f79501b = obj;
        this.f79503d = j;
        this.f79504e = j2;
        this.f79502c = c30364aArr.length + i;
        this.f79506g = c30364aArr;
        this.f79505f = i;
    }

    /* renamed from: a */
    public static C30363g5 m33926a(Bundle bundle) {
        C30364a[] c30364aArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            c30364aArr = new C30364a[0];
        } else {
            C30364a[] c30364aArr2 = new C30364a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                c30364aArr2[i] = C30364a.f79507i.fromBundle((Bundle) parcelableArrayList.get(i));
            }
            c30364aArr = c30364aArr2;
        }
        return new C30363g5(null, c30364aArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    /* renamed from: b */
    public static /* synthetic */ C30363g5 m33925b(Bundle bundle) {
        return m33926a(bundle);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C30363g5.class != obj.getClass()) {
            return false;
        }
        C30363g5 c30363g5 = (C30363g5) obj;
        if (y32.m27076a(this.f79501b, c30363g5.f79501b) && this.f79502c == c30363g5.f79502c && this.f79503d == c30363g5.f79503d && this.f79504e == c30363g5.f79504e && this.f79505f == c30363g5.f79505f && Arrays.equals(this.f79506g, c30363g5.f79506g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.f79502c * 31;
        Object obj = this.f79501b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i + hashCode) * 31) + ((int) this.f79503d)) * 31) + ((int) this.f79504e)) * 31) + this.f79505f) * 31) + Arrays.hashCode(this.f79506g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f79501b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f79503d);
        sb2.append(", adGroups=[");
        for (int i = 0; i < this.f79506g.length; i++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f79506g[i].f79508b);
            sb2.append(", ads=[");
            for (int i2 = 0; i2 < this.f79506g[i].f79511e.length; i2++) {
                sb2.append("ad(state=");
                int i3 = this.f79506g[i].f79511e[i2];
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    sb2.append('?');
                                } else {
                                    sb2.append('!');
                                }
                            } else {
                                sb2.append('P');
                            }
                        } else {
                            sb2.append('S');
                        }
                    } else {
                        sb2.append('R');
                    }
                } else {
                    sb2.append('_');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f79506g[i].f79512f[i2]);
                sb2.append(')');
                if (i2 < this.f79506g[i].f79511e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i < this.f79506g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    /* renamed from: a */
    public final C30364a m33927a(@IntRange(from = 0) int i) {
        int i2 = this.f79505f;
        if (i < i2) {
            return f79499i;
        }
        return this.f79506g[i - i2];
    }
}
