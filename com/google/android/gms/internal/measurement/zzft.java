package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzft {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
    /* loaded from: classes5.dex */
    public static final class zza extends zzjk<zza, C45363zza> implements zzkv {
        private static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private zzjt<zzb> zze = zzjk.zzcg();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* renamed from: com.google.android.gms.internal.measurement.zzft$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C45363zza extends zzjk.zzb<zza, C45363zza> implements zzkv {
            private C45363zza() {
                super(zza.zzc);
            }

            /* synthetic */ C45363zza(zzfu zzfuVar) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjk.zza(zza.class, zzaVar);
        }

        private zza() {
        }

        public static zza zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zze.size();
        }

        public final List<zzb> zzd() {
            return this.zze;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfu.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C45363zza(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzb.class});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zza> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zza.class) {
                            zzlcVar = zzd;
                            if (zzlcVar == null) {
                                zzlcVar = new zzjk.zza<>(zzc);
                                zzd = zzlcVar;
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
    /* loaded from: classes5.dex */
    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        private static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzjt<zzd> zzg = zzjk.zzcg();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public static final class zza extends zzjk.zzb<zzb, zza> implements zzkv {
            private zza() {
                super(zzb.zzc);
            }

            /* synthetic */ zza(zzfu zzfuVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjk.zza(zzb.class, zzbVar);
        }

        private zzb() {
        }

        public final String zzb() {
            return this.zzf;
        }

        public final List<zzd> zzc() {
            return this.zzg;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfu.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzb> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzb.class) {
                            zzlcVar = zzd;
                            if (zzlcVar == null) {
                                zzlcVar = new zzjk.zza<>(zzc);
                                zzd = zzlcVar;
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
    /* loaded from: classes5.dex */
    public static final class zzc extends zzjk<zzc, zza> implements zzkv {
        private static final zzc zzc;
        private static volatile zzlc<zzc> zzd;
        private int zze;
        private zzjt<zzd> zzf = zzjk.zzcg();
        private zza zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
            }

            /* synthetic */ zza(zzfu zzfuVar) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjk.zza(zzc.class, zzcVar);
        }

        private zzc() {
        }

        public final zza zza() {
            zza zzaVar = this.zzg;
            return zzaVar == null ? zza.zzc() : zzaVar;
        }

        public final List<zzd> zzc() {
            return this.zzf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfu.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzd.class, "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzc> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzc.class) {
                            zzlcVar = zzd;
                            if (zzlcVar == null) {
                                zzlcVar = new zzjk.zza<>(zzc);
                                zzd = zzlcVar;
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
    /* loaded from: classes5.dex */
    public static final class zzd extends zzjk<zzd, zzb> implements zzkv {
        private static final zzd zzc;
        private static volatile zzlc<zzd> zzd;
        private int zze;
        private int zzf;
        private zzjt<zzd> zzg = zzjk.zzcg();
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public enum zza implements zzjp {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);
            
            private final int zzg;

            zza(int i) {
                this.zzg = i;
            }

            public static zzjo zzb() {
                return zzfw.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int zza() {
                return this.zzg;
            }

            public static zza zza(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return STATEMENT;
                            }
                            return BOOLEAN;
                        }
                        return NUMBER;
                    }
                    return STRING;
                }
                return UNKNOWN;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public static final class zzb extends zzjk.zzb<zzd, zzb> implements zzkv {
            private zzb() {
                super(zzd.zzc);
            }

            /* synthetic */ zzb(zzfu zzfuVar) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjk.zza(zzd.class, zzdVar);
        }

        private zzd() {
        }

        public final double zza() {
            return this.zzk;
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            if (zza2 == null) {
                return zza.UNKNOWN;
            }
            return zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzi;
        }

        public final List<zzd> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfu.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzd> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzd.class) {
                            zzlcVar = zzd;
                            if (zzlcVar == null) {
                                zzlcVar = new zzjk.zza<>(zzc);
                                zzd = zzlcVar;
                            }
                        }
                    }
                    return zzlcVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
