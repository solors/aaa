package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzff {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
    /* loaded from: classes5.dex */
    public static final class zza extends zzjk<zza, C45357zza> implements zzkv {
        private static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private int zze;
        private int zzf;
        private zzjt<zze> zzg = zzjk.zzcg();
        private zzjt<zzb> zzh = zzjk.zzcg();
        private boolean zzi;
        private boolean zzj;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* renamed from: com.google.android.gms.internal.measurement.zzff$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C45357zza extends zzjk.zzb<zza, C45357zza> implements zzkv {
            private C45357zza() {
                super(zza.zzc);
            }

            public final int zza() {
                return ((zza) this.zza).zzb();
            }

            public final int zzb() {
                return ((zza) this.zza).zzc();
            }

            /* synthetic */ C45357zza(zzfg zzfgVar) {
                this();
            }

            public final C45357zza zza(int i, zzb.zza zzaVar) {
                zzak();
                ((zza) this.zza).zza(i, (zzb) ((zzjk) zzaVar.zzai()));
                return this;
            }

            public final zze zzb(int i) {
                return ((zza) this.zza).zzb(i);
            }

            public final C45357zza zza(int i, zze.zza zzaVar) {
                zzak();
                ((zza) this.zza).zza(i, (zze) ((zzjk) zzaVar.zzai()));
                return this;
            }

            public final zzb zza(int i) {
                return ((zza) this.zza).zza(i);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjk.zza(zza.class, zzaVar);
        }

        private zza() {
        }

        public final int zza() {
            return this.zzf;
        }

        public final int zzb() {
            return this.zzh.size();
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List<zzb> zze() {
            return this.zzh;
        }

        public final List<zze> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final zzb zza(int i) {
            return this.zzh.get(i);
        }

        public final zze zzb(int i) {
            return this.zzg.get(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C45357zza(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzb zzbVar) {
            zzbVar.getClass();
            zzjt<zzb> zzjtVar = this.zzh;
            if (!zzjtVar.zzc()) {
                this.zzh = zzjk.zza(zzjtVar);
            }
            this.zzh.set(i, zzbVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zze zzeVar) {
            zzeVar.getClass();
            zzjt<zze> zzjtVar = this.zzg;
            if (!zzjtVar.zzc()) {
                this.zzg = zzjk.zza(zzjtVar);
            }
            this.zzg.set(i, zzeVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
    /* loaded from: classes5.dex */
    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        private static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzjt<zzc> zzh = zzjk.zzcg();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public static final class zza extends zzjk.zzb<zzb, zza> implements zzkv {
            private zza() {
                super(zzb.zzc);
            }

            public final int zza() {
                return ((zzb) this.zza).zza();
            }

            public final String zzb() {
                return ((zzb) this.zza).zzf();
            }

            /* synthetic */ zza(zzfg zzfgVar) {
                this();
            }

            public final zza zza(String str) {
                zzak();
                ((zzb) this.zza).zza(str);
                return this;
            }

            public final zza zza(int i, zzc zzcVar) {
                zzak();
                ((zzb) this.zza).zza(i, zzcVar);
                return this;
            }

            public final zzc zza(int i) {
                return ((zzb) this.zza).zza(i);
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjk.zza(zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zzc() {
            return zzc.zzcb();
        }

        public final int zza() {
            return this.zzh.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final zzd zze() {
            zzd zzdVar = this.zzj;
            if (zzdVar == null) {
                return zzd.zzc();
            }
            return zzdVar;
        }

        public final String zzf() {
            return this.zzg;
        }

        public final List<zzc> zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzl() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzm() {
            if ((this.zze & 64) != 0) {
                return true;
            }
            return false;
        }

        public final zzc zza(int i) {
            return this.zzh.get(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i, zzc zzcVar) {
            zzcVar.getClass();
            zzjt<zzc> zzjtVar = this.zzh;
            if (!zzjtVar.zzc()) {
                this.zzh = zzjk.zza(zzjtVar);
            }
            this.zzh.set(i, zzcVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
    /* loaded from: classes5.dex */
    public static final class zzc extends zzjk<zzc, zza> implements zzkv {
        private static final zzc zzc;
        private static volatile zzlc<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
            }

            public final zza zza(String str) {
                zzak();
                ((zzc) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(zzfg zzfgVar) {
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

        public static zzc zzb() {
            return zzc;
        }

        public final zzd zzc() {
            zzd zzdVar = this.zzg;
            if (zzdVar == null) {
                return zzd.zzc();
            }
            return zzdVar;
        }

        public final zzf zzd() {
            zzf zzfVar = this.zzf;
            if (zzfVar == null) {
                return zzf.zzd();
            }
            return zzfVar;
        }

        public final String zze() {
            return this.zzi;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzh() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 8;
            this.zzi = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
    /* loaded from: classes5.dex */
    public static final class zze extends zzjk<zze, zza> implements zzkv {
        private static final zze zzc;
        private static volatile zzlc<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public static final class zza extends zzjk.zzb<zze, zza> implements zzkv {
            private zza() {
                super(zze.zzc);
            }

            public final zza zza(String str) {
                zzak();
                ((zze) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(zzfg zzfgVar) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjk.zza(zze.class, zzeVar);
        }

        private zze() {
        }

        public static zza zzc() {
            return zzc.zzcb();
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzc zzb() {
            zzc zzcVar = this.zzh;
            if (zzcVar == null) {
                return zzc.zzb();
            }
            return zzcVar;
        }

        public final String zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 32) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zze> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zze.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze |= 2;
            this.zzg = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
    /* loaded from: classes5.dex */
    public static final class zzf extends zzjk<zzf, zzb> implements zzkv {
        private static final zzf zzc;
        private static volatile zzlc<zzf> zzd;
        private int zze;
        private int zzf;
        private boolean zzh;
        private String zzg = "";
        private zzjt<String> zzi = zzjk.zzcg();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public enum zza implements zzjp {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            
            private final int zzi;

            zza(int i) {
                this.zzi = i;
            }

            public static zzjo zzb() {
                return zzfj.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int zza() {
                return this.zzi;
            }

            public static zza zza(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public static final class zzb extends zzjk.zzb<zzf, zzb> implements zzkv {
            private zzb() {
                super(zzf.zzc);
            }

            /* synthetic */ zzb(zzfg zzfgVar) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjk.zza(zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static zzf zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzi.size();
        }

        public final zza zzb() {
            zza zza2 = zza.zza(this.zzf);
            if (zza2 == null) {
                return zza.UNKNOWN_MATCH_TYPE;
            }
            return zza2;
        }

        public final String zze() {
            return this.zzg;
        }

        public final List<String> zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzf> zzlcVar = zzd;
                    if (zzlcVar == null) {
                        synchronized (zzf.class) {
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
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public enum zza implements zzjp {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            
            private final int zzg;

            zza(int i) {
                this.zzg = i;
            }

            public static zzjo zzb() {
                return zzfh.zza;
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
                                return BETWEEN;
                            }
                            return EQUAL;
                        }
                        return GREATER_THAN;
                    }
                    return LESS_THAN;
                }
                return UNKNOWN_COMPARISON_TYPE;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
        /* loaded from: classes5.dex */
        public static final class zzb extends zzjk.zzb<zzd, zzb> implements zzkv {
            private zzb() {
                super(zzd.zzc);
            }

            /* synthetic */ zzb(zzfg zzfgVar) {
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

        public static zzd zzc() {
            return zzc;
        }

        public final zza zza() {
            zza zza2 = zza.zza(this.zzf);
            return zza2 == null ? zza.UNKNOWN_COMPARISON_TYPE : zza2;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzj;
        }

        public final String zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzi() {
            if ((this.zze & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzj() {
            if ((this.zze & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzk() {
            if ((this.zze & 16) != 0) {
                return true;
            }
            return false;
        }

        public final boolean zzl() {
            if ((this.zze & 8) != 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzfg.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzjk.zza(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", "zzh", "zzi", "zzj"});
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
