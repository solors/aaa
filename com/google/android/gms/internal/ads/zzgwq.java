package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgwq implements zzgzp {
    private final zzgwp zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgwq(zzgwp zzgwpVar) {
        zzgye.zzc(zzgwpVar, "input");
        this.zza = zzgwpVar;
        zzgwpVar.zzc = this;
    }

    private final void zzO(Object obj, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgzvVar.zzh(obj, this, zzgxbVar);
            if (this.zzb == this.zzc) {
                return;
            }
            throw new zzgyg("Failed to parse the message.");
        } finally {
            this.zzc = i;
        }
    }

    private final void zzP(Object obj, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        zzgwp zzgwpVar;
        zzgwp zzgwpVar2 = this.zza;
        int zzm = zzgwpVar2.zzm();
        if (zzgwpVar2.zza < zzgwpVar2.zzb) {
            int zzd = zzgwpVar2.zzd(zzm);
            this.zza.zza++;
            zzgzvVar.zzh(obj, this, zzgxbVar);
            this.zza.zzy(0);
            zzgwpVar.zza--;
            this.zza.zzz(zzd);
            return;
        }
        throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    private final void zzQ(int i) throws IOException {
        if (this.zza.zzc() == i) {
            return;
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final void zzR(int i) throws IOException {
        if ((this.zzb & 7) == i) {
            return;
        }
        throw new zzgyf("Protocol message tag had invalid wire type.");
    }

    private static final void zzS(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw new zzgyg("Failed to parse the message.");
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw new zzgyg("Failed to parse the message.");
    }

    public static zzgwq zzq(zzgwp zzgwpVar) {
        zzgwq zzgwqVar = zzgwpVar.zzc;
        if (zzgwqVar != null) {
            return zzgwqVar;
        }
        return new zzgwq(zzgwpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzA(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = zzm + this.zza.zzc();
                    do {
                        zzgyrVar.zzg(this.zza.zzn());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyrVar.zzg(this.zza.zzn());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = zzm2 + this.zza.zzc();
                    do {
                        list.add(Long.valueOf(this.zza.zzn()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzB(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxi) {
            zzgxi zzgxiVar = (zzgxi) list;
            int i2 = this.zzb & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        zzgxiVar.zzh(this.zza.zzb());
                        if (!this.zza.zzA()) {
                            i = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (i == this.zzb);
                } else {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            } else {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxiVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        list.add(Float.valueOf(this.zza.zzb()));
                        if (!this.zza.zzA()) {
                            zzl = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (zzl == this.zzb);
                    i = zzl;
                } else {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            } else {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    @Deprecated
    public final void zzC(List list, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        int zzl;
        int i = this.zzb;
        if ((i & 7) == 3) {
            do {
                Object zze = zzgzvVar.zze();
                zzO(zze, zzgzvVar, zzgxbVar);
                zzgzvVar.zzf(zze);
                list.add(zze);
                if (!this.zza.zzA() && this.zzd == 0) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == i);
            this.zzd = zzl;
            return;
        }
        throw new zzgyf("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzD(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgwp zzgwpVar = this.zza;
                    int zzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                    do {
                        zzgxsVar.zzi(this.zza.zzg());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxsVar.zzi(this.zza.zzg());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgwp zzgwpVar2 = this.zza;
                    int zzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzg()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzE(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgwp zzgwpVar = this.zza;
                    int zzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                    do {
                        zzgyrVar.zzg(this.zza.zzo());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyrVar.zzg(this.zza.zzo());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgwp zzgwpVar2 = this.zza;
                    int zzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzo()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzF(List list, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        int zzl;
        int i = this.zzb;
        if ((i & 7) == 2) {
            do {
                Object zze = zzgzvVar.zze();
                zzP(zze, zzgzvVar, zzgxbVar);
                zzgzvVar.zzf(zze);
                list.add(zze);
                if (!this.zza.zzA() && this.zzd == 0) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == i);
            this.zzd = zzl;
            return;
        }
        throw new zzgyf("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzG(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        zzgxsVar.zzi(this.zza.zzj());
                        if (!this.zza.zzA()) {
                            i = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (i == this.zzb);
                } else {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            } else {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxsVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                return;
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        list.add(Integer.valueOf(this.zza.zzj()));
                        if (!this.zza.zzA()) {
                            zzl = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (zzl == this.zzb);
                    i = zzl;
                } else {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            } else {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzH(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = zzm + this.zza.zzc();
                    do {
                        zzgyrVar.zzg(this.zza.zzs());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyrVar.zzg(this.zza.zzs());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = zzm2 + this.zza.zzc();
                    do {
                        list.add(Long.valueOf(this.zza.zzs()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzI(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgwp zzgwpVar = this.zza;
                    int zzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                    do {
                        zzgxsVar.zzi(this.zza.zzk());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxsVar.zzi(this.zza.zzk());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgwp zzgwpVar2 = this.zza;
                    int zzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzk()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzJ(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgwp zzgwpVar = this.zza;
                    int zzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                    do {
                        zzgyrVar.zzg(this.zza.zzt());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyrVar.zzg(this.zza.zzt());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgwp zzgwpVar2 = this.zza;
                    int zzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzt()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    public final void zzK(List list, boolean z) throws IOException {
        String zzr;
        int zzl;
        int i;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzgyo) && !z) {
                zzgyo zzgyoVar = (zzgyo) list;
                do {
                    zzp();
                    zzgyoVar.zzb();
                    if (!this.zza.zzA()) {
                        i = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                do {
                    if (z) {
                        zzr = zzs();
                    } else {
                        zzr = zzr();
                    }
                    list.add(zzr);
                    if (this.zza.zzA()) {
                        return;
                    }
                    zzl = this.zza.zzl();
                } while (zzl == this.zzb);
                i = zzl;
            }
            this.zzd = i;
            return;
        }
        throw new zzgyf("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzL(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgwp zzgwpVar = this.zza;
                    int zzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                    do {
                        zzgxsVar.zzi(this.zza.zzm());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxsVar.zzi(this.zza.zzm());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgwp zzgwpVar2 = this.zza;
                    int zzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzm()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzM(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgwp zzgwpVar = this.zza;
                    int zzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                    do {
                        zzgyrVar.zzg(this.zza.zzu());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyrVar.zzg(this.zza.zzu());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgwp zzgwpVar2 = this.zza;
                    int zzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzu()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzl();
            this.zzb = i;
        }
        if (i != 0 && i != this.zzc) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final zzgwj zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzt(Object obj, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        zzR(3);
        zzO(obj, zzgzvVar, zzgxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzu(Object obj, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        zzR(2);
        zzP(obj, zzgzvVar, zzgxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzv(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgvz) {
            zzgvz zzgvzVar = (zzgvz) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgwp zzgwpVar = this.zza;
                    int zzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                    do {
                        zzgvzVar.zzg(this.zza.zzB());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgvzVar.zzg(this.zza.zzB());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgwp zzgwpVar2 = this.zza;
                    int zzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                    do {
                        list.add(Boolean.valueOf(this.zza.zzB()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzw(List list) throws IOException {
        int zzl;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzA()) {
                    return;
                }
                zzl = this.zza.zzl();
            } while (zzl == this.zzb);
            this.zzd = zzl;
            return;
        }
        throw new zzgyf("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzx(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgwy) {
            zzgwy zzgwyVar = (zzgwy) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = zzm + this.zza.zzc();
                    do {
                        zzgwyVar.zzh(this.zza.zza());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgwyVar.zzh(this.zza.zza());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = zzm2 + this.zza.zzc();
                    do {
                        list.add(Double.valueOf(this.zza.zza()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzy(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgwp zzgwpVar = this.zza;
                    int zzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                    do {
                        zzgxsVar.zzi(this.zza.zze());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxsVar.zzi(this.zza.zze());
                if (!this.zza.zzA()) {
                    i = this.zza.zzl();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgwp zzgwpVar2 = this.zza;
                    int zzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zze()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i = zzl;
        }
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzz(List list) throws IOException {
        int zzl;
        int i;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i2 = this.zzb & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        zzgxsVar.zzi(this.zza.zzf());
                        if (!this.zza.zzA()) {
                            i = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (i == this.zzb);
                } else {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            } else {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgxsVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                return;
            }
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        list.add(Integer.valueOf(this.zza.zzf()));
                        if (!this.zza.zzA()) {
                            zzl = this.zza.zzl();
                        } else {
                            return;
                        }
                    } while (zzl == this.zzb);
                    i = zzl;
                } else {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
            } else {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
        }
        this.zzd = i;
    }
}
