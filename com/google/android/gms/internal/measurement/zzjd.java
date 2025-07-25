package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzjd<T extends zzjf<T>> {
    private static final zzjd zzb = new zzjd(true);
    final zzlm<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzjd() {
        this.zza = new zzlp();
    }

    public static int zza(zzmn zzmnVar, int i, Object obj) {
        int zzi = zzit.zzi(i);
        if (zzmnVar == zzmn.zzj) {
            zzjm.zza((zzkt) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzmnVar, obj);
    }

    public static <T extends zzjf<T>> zzjd<T> zzb() {
        return zzb;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzjd zzjdVar = new zzjd();
        for (int i = 0; i < this.zza.zza(); i++) {
            Map.Entry<T, Object> zza = this.zza.zza(i);
            zzjdVar.zzb(zza.getKey(), zza.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzb()) {
            zzjdVar.zzb(entry.getKey(), entry.getValue());
        }
        zzjdVar.zzd = this.zzd;
        return zzjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjd)) {
            return false;
        }
        return this.zza.equals(((zzjd) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzjy(this.zza.zzc().iterator());
        }
        return this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzjy(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zza(); i++) {
            Map.Entry<T, Object> zza = this.zza.zza(i);
            if (zza.getValue() instanceof zzjk) {
                ((zzjk) zza.getValue()).zzck();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i = 0; i < this.zza.zza(); i++) {
            if (!zzc(this.zza.zza(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.zza.zzb()) {
            if (!zzc(entry)) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzkt zzai;
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzjx;
        if (key.zze()) {
            if (!z) {
                Object zza = zza((zzjd<T>) key);
                if (zza == null) {
                    zza = new ArrayList();
                }
                for (Object obj : (List) value) {
                    ((List) zza).add(zza(obj));
                }
                this.zza.zza((zzlm<T, Object>) key, (T) zza);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (key.zzc() == zzmx.MESSAGE) {
            Object zza2 = zza((zzjd<T>) key);
            if (zza2 == null) {
                this.zza.zza((zzlm<T, Object>) key, (T) zza(value));
                if (z) {
                    this.zzd = true;
                }
            } else if (!z) {
                if (zza2 instanceof zzky) {
                    zzai = key.zza((zzky) zza2, (zzky) value);
                } else {
                    zzai = key.zza(((zzkt) zza2).zzci(), (zzkt) value).zzai();
                }
                this.zza.zza((zzlm<T, Object>) key, (T) zzai);
            } else {
                zzjx zzjxVar = (zzjx) value;
                throw new NoSuchMethodError();
            }
        } else {
            if (!z) {
                this.zza.zza((zzlm<T, Object>) key, (T) zza(value));
                return;
            }
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private zzjd(zzlm<T, Object> zzlmVar) {
        this.zza = zzlmVar;
        zze();
    }

    private static int zza(zzmn zzmnVar, Object obj) {
        switch (zzjc.zzb[zzmnVar.ordinal()]) {
            case 1:
                return zzit.zza(((Double) obj).doubleValue());
            case 2:
                return zzit.zza(((Float) obj).floatValue());
            case 3:
                return zzit.zzd(((Long) obj).longValue());
            case 4:
                return zzit.zzg(((Long) obj).longValue());
            case 5:
                return zzit.zzf(((Integer) obj).intValue());
            case 6:
                return zzit.zzc(((Long) obj).longValue());
            case 7:
                return zzit.zze(((Integer) obj).intValue());
            case 8:
                return zzit.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzit.zzb((zzkt) obj);
            case 10:
                if (obj instanceof zzjx) {
                    return zzit.zza((zzjx) obj);
                }
                return zzit.zzc((zzkt) obj);
            case 11:
                if (obj instanceof zzia) {
                    return zzit.zzb((zzia) obj);
                }
                return zzit.zzb((String) obj);
            case 12:
                if (obj instanceof zzia) {
                    return zzit.zzb((zzia) obj);
                }
                return zzit.zza((byte[]) obj);
            case 13:
                return zzit.zzj(((Integer) obj).intValue());
            case 14:
                return zzit.zzg(((Integer) obj).intValue());
            case 15:
                return zzit.zze(((Long) obj).longValue());
            case 16:
                return zzit.zzh(((Integer) obj).intValue());
            case 17:
                return zzit.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzjp) {
                    return zzit.zzd(((zzjp) obj).zza());
                }
                return zzit.zzd(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0020, code lost:
        if ((r6 instanceof com.google.android.gms.internal.measurement.zzjx) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0029, code lost:
        if ((r6 instanceof com.google.android.gms.internal.measurement.zzjp) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0032, code lost:
        if ((r6 instanceof byte[]) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.zzmn r0 = r5.zzb()
            com.google.android.gms.internal.measurement.zzjm.zza(r6)
            int[] r1 = com.google.android.gms.internal.measurement.zzjc.zza
            com.google.android.gms.internal.measurement.zzmx r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = r2
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzkt
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzjx
            if (r0 == 0) goto L18
            goto L34
        L23:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzjp
            if (r0 == 0) goto L18
            goto L34
        L2c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzia
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
        L34:
            r0 = r1
            goto L47
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.measurement.zzmn r5 = r5.zzb()
            com.google.android.gms.internal.measurement.zzmx r5 = r5.zzb()
            r3[r1] = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r6 = 2
            r3[r6] = r5
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjd.zzc(com.google.android.gms.internal.measurement.zzjf, java.lang.Object):void");
    }

    private zzjd(boolean z) {
        this(new zzlp());
        zze();
    }

    private static <T extends zzjf<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == zzmx.MESSAGE) {
            if (key.zze()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!zzb(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return zzb(entry.getValue());
        }
        return true;
    }

    private final void zzb(T t, Object obj) {
        if (t.zze()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    zzc(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t, obj);
        }
        if (obj instanceof zzjx) {
            this.zzd = true;
        }
        this.zza.zza((zzlm<T, Object>) t, (T) obj);
    }

    public static int zza(zzjf<?> zzjfVar, Object obj) {
        zzmn zzb2 = zzjfVar.zzb();
        int zza = zzjfVar.zza();
        if (zzjfVar.zze()) {
            List<Object> list = (List) obj;
            int i = 0;
            if (zzjfVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                for (Object obj2 : list) {
                    i += zza(zzb2, obj2);
                }
                return zzit.zzi(zza) + i + zzit.zzj(i);
            }
            for (Object obj3 : list) {
                i += zza(zzb2, zza, obj3);
            }
            return i;
        }
        return zza(zzb2, zza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzkv) {
            return ((zzkv) obj).zzcm();
        }
        if (obj instanceof zzjx) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zza(); i2++) {
            i += zza((Map.Entry) this.zza.zza(i2));
        }
        for (Map.Entry<T, Object> entry : this.zza.zzb()) {
            i += zza((Map.Entry) entry);
        }
        return i;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzmx.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzjx) {
                return zzit.zza(entry.getKey().zza(), (zzjx) value);
            }
            return zzit.zzb(entry.getKey().zza(), (zzkt) value);
        }
        return zza((zzjf<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzky) {
            return ((zzky) obj).zza();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (obj instanceof zzjx) {
            zzjx zzjxVar = (zzjx) obj;
            throw new NoSuchMethodError();
        }
        return obj;
    }

    public final void zza(zzjd<T> zzjdVar) {
        for (int i = 0; i < zzjdVar.zza.zza(); i++) {
            zzb((Map.Entry) zzjdVar.zza.zza(i));
        }
        for (Map.Entry<T, Object> entry : zzjdVar.zza.zzb()) {
            zzb((Map.Entry) entry);
        }
    }

    public static void zza(zzit zzitVar, zzmn zzmnVar, int i, Object obj) throws IOException {
        if (zzmnVar == zzmn.zzj) {
            zzkt zzktVar = (zzkt) obj;
            zzjm.zza(zzktVar);
            zzitVar.zzc(i, 3);
            zzktVar.zza(zzitVar);
            zzitVar.zzc(i, 4);
            return;
        }
        zzitVar.zzc(i, zzmnVar.zza());
        switch (zzjc.zzb[zzmnVar.ordinal()]) {
            case 1:
                zzitVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzitVar.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzitVar.zzb(((Long) obj).longValue());
                return;
            case 4:
                zzitVar.zzb(((Long) obj).longValue());
                return;
            case 5:
                zzitVar.zzb(((Integer) obj).intValue());
                return;
            case 6:
                zzitVar.zza(((Long) obj).longValue());
                return;
            case 7:
                zzitVar.zza(((Integer) obj).intValue());
                return;
            case 8:
                zzitVar.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzkt) obj).zza(zzitVar);
                return;
            case 10:
                zzitVar.zza((zzkt) obj);
                return;
            case 11:
                if (obj instanceof zzia) {
                    zzitVar.zza((zzia) obj);
                    return;
                } else {
                    zzitVar.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzia) {
                    zzitVar.zza((zzia) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzitVar.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzitVar.zzc(((Integer) obj).intValue());
                return;
            case 14:
                zzitVar.zza(((Integer) obj).intValue());
                return;
            case 15:
                zzitVar.zza(((Long) obj).longValue());
                return;
            case 16:
                zzitVar.zzk(((Integer) obj).intValue());
                return;
            case 17:
                zzitVar.zzh(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzjp) {
                    zzitVar.zzb(((zzjp) obj).zza());
                    return;
                } else {
                    zzitVar.zzb(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
