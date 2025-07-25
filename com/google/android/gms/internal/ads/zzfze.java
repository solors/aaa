package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfze extends zzfxq {
    static final zzfxq zza = new zzfze(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzfze(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static zzfze zzj(int i, Object[] objArr, zzfxp zzfxpVar) {
        short[] sArr;
        char c;
        char c2;
        byte[] bArr;
        Object[] objArr2;
        int i2 = i;
        Object[] objArr3 = objArr;
        if (i2 == 0) {
            return (zzfze) zza;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            Object obj2 = objArr3[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr3[1];
            Objects.requireNonNull(obj3);
            zzfwk.zzb(obj2, obj3);
            return new zzfze(null, objArr3, 1);
        }
        zzfun.zzb(i2, objArr3.length >> 1, FirebaseAnalytics.Param.INDEX);
        int zzh = zzfxs.zzh(i);
        if (i2 == 1) {
            Object obj4 = objArr3[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr3[1];
            Objects.requireNonNull(obj5);
            zzfwk.zzb(obj4, obj5);
            i2 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i4 = zzh - 1;
            char c3 = 65535;
            if (zzh <= 128) {
                byte[] bArr2 = new byte[zzh];
                Arrays.fill(bArr2, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj6 = objArr3[i8];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr3[i8 ^ i3];
                    Objects.requireNonNull(obj7);
                    zzfwk.zzb(obj6, obj7);
                    int zza2 = zzfxf.zza(obj6.hashCode());
                    while (true) {
                        int i9 = zza2 & i4;
                        int i10 = bArr2[i9] & 255;
                        if (i10 == 255) {
                            bArr2[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArr3[i7] = obj6;
                                objArr3[i7 ^ 1] = obj7;
                            }
                            i6++;
                        } else if (obj6.equals(objArr3[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj8 = objArr3[i11];
                            Objects.requireNonNull(obj8);
                            zzfxo zzfxoVar = new zzfxo(obj6, obj7, obj8);
                            objArr3[i11] = obj7;
                            obj = zzfxoVar;
                            break;
                        } else {
                            zza2 = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    bArr = bArr2;
                } else {
                    obj = new Object[]{bArr2, Integer.valueOf(i6), obj};
                    c2 = 2;
                    c = 1;
                }
            } else {
                if (zzh <= 32768) {
                    sArr = new short[zzh];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        int i14 = i12 + i12;
                        int i15 = i13 + i13;
                        Object obj9 = objArr3[i15];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr3[i15 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzfwk.zzb(obj9, obj10);
                        int zza3 = zzfxf.zza(obj9.hashCode());
                        while (true) {
                            int i16 = zza3 & i4;
                            char c4 = (char) sArr[i16];
                            if (c4 == 65535) {
                                sArr[i16] = (short) i14;
                                if (i12 < i13) {
                                    objArr3[i14] = obj9;
                                    objArr3[i14 ^ 1] = obj10;
                                }
                                i12++;
                            } else if (obj9.equals(objArr3[c4])) {
                                int i17 = c4 ^ 1;
                                Object obj11 = objArr3[i17];
                                Objects.requireNonNull(obj11);
                                zzfxo zzfxoVar2 = new zzfxo(obj9, obj10, obj11);
                                objArr3[i17] = obj10;
                                obj = zzfxoVar2;
                                break;
                            } else {
                                zza3 = i16 + 1;
                            }
                        }
                    }
                    if (i12 != i2) {
                        Integer valueOf = Integer.valueOf(i12);
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    bArr = sArr;
                } else {
                    int i18 = 1;
                    sArr = new int[zzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i2) {
                        int i21 = i20 + i20;
                        int i22 = i19 + i19;
                        Object obj12 = objArr3[i22];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr3[i22 ^ i18];
                        Objects.requireNonNull(obj13);
                        zzfwk.zzb(obj12, obj13);
                        int zza4 = zzfxf.zza(obj12.hashCode());
                        while (true) {
                            int i23 = zza4 & i4;
                            ?? r15 = sArr[i23];
                            if (r15 == c3) {
                                sArr[i23] = i21;
                                if (i20 < i19) {
                                    objArr3[i21] = obj12;
                                    objArr3[i21 ^ 1] = obj13;
                                }
                                i20++;
                            } else if (obj12.equals(objArr3[r15])) {
                                int i24 = r15 ^ 1;
                                Object obj14 = objArr3[i24];
                                Objects.requireNonNull(obj14);
                                zzfxo zzfxoVar3 = new zzfxo(obj12, obj13, obj14);
                                objArr3[i24] = obj13;
                                obj = zzfxoVar3;
                                break;
                            } else {
                                zza4 = i23 + 1;
                                c3 = 65535;
                            }
                        }
                        i19++;
                        i18 = 1;
                        c3 = 65535;
                    }
                    if (i20 != i2) {
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i20), obj};
                        obj = objArr2;
                    }
                    bArr = sArr;
                }
                c = 1;
            }
            c2 = 2;
            obj = bArr;
            c = 1;
        }
        if (obj instanceof Object[]) {
            Object[] objArr4 = (Object[]) obj;
            zzfxo zzfxoVar4 = (zzfxo) objArr4[c2];
            if (zzfxpVar != null) {
                zzfxpVar.zzc = zzfxoVar4;
                Object obj15 = objArr4[0];
                int intValue = ((Integer) objArr4[c]).intValue();
                objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
                obj = obj15;
                i2 = intValue;
            } else {
                throw zzfxoVar4.zza();
            }
        }
        return new zzfze(obj, objArr3, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzfxq, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfxf.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfxf.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzfxf.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfze.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    final zzfxi zza() {
        return new zzfzd(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    final zzfxs zzf() {
        return new zzfzb(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    final zzfxs zzg() {
        return new zzfzc(this, new zzfzd(this.zzb, 0, this.zzd));
    }
}
