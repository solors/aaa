package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C5631ud;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.zn */
/* loaded from: classes2.dex */
public final class C5986zn extends AbstractC5837xa {
    public static final Parcelable.Creator<C5986zn> CREATOR = new C5987a();

    /* renamed from: b */
    public final String f12601b;

    /* renamed from: c */
    public final String f12602c;

    /* renamed from: com.applovin.impl.zn$a */
    /* loaded from: classes2.dex */
    class C5987a implements Parcelable.Creator {
        C5987a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5986zn[] newArray(int i) {
            return new C5986zn[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5986zn createFromParcel(Parcel parcel) {
            return new C5986zn(parcel);
        }
    }

    C5986zn(Parcel parcel) {
        super((String) AbstractC5863xp.m93017a((Object) parcel.readString()));
        this.f12601b = parcel.readString();
        this.f12602c = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
    }

    /* renamed from: a */
    private static List m92340a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5986zn.class != obj.getClass()) {
            return false;
        }
        C5986zn c5986zn = (C5986zn) obj;
        if (AbstractC5863xp.m93016a((Object) this.f11957a, (Object) c5986zn.f11957a) && AbstractC5863xp.m93016a((Object) this.f12601b, (Object) c5986zn.f12601b) && AbstractC5863xp.m93016a((Object) this.f12602c, (Object) c5986zn.f12602c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f11957a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f12601b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f12602c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.applovin.impl.AbstractC5837xa
    public String toString() {
        return this.f11957a + ": description=" + this.f12601b + ": value=" + this.f12602c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11957a);
        parcel.writeString(this.f12601b);
        parcel.writeString(this.f12602c);
    }

    public C5986zn(String str, String str2, String str3) {
        super(str);
        this.f12601b = str2;
        this.f12602c = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.applovin.impl.C4061af.InterfaceC4063b
    /* renamed from: a */
    public void mo92341a(C5631ud.C5633b c5633b) {
        String str = this.f11957a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    c5633b.m94131b(this.f12602c);
                    return;
                case 1:
                case 11:
                    c5633b.m94122e(this.f12602c);
                    return;
                case 2:
                case '\f':
                    c5633b.m94124d(Integer.valueOf(Integer.parseInt(this.f12602c.substring(2, 4)))).m94127c(Integer.valueOf(Integer.parseInt(this.f12602c.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    c5633b.m94128c(this.f12602c);
                    return;
                case 4:
                case 18:
                    c5633b.m94139a(this.f12602c);
                    return;
                case 5:
                case 19:
                    c5633b.m94119f(this.f12602c);
                    return;
                case 6:
                case 20:
                    String[] m93013a = AbstractC5863xp.m93013a(this.f12602c, RemoteSettings.FORWARD_SLASH_STRING);
                    c5633b.m94103k(Integer.valueOf(Integer.parseInt(m93013a[0]))).m94106j(m93013a.length > 1 ? Integer.valueOf(Integer.parseInt(m93013a[1])) : null);
                    return;
                case 7:
                case 16:
                    c5633b.m94104k(this.f12602c);
                    return;
                case '\b':
                case 15:
                    c5633b.m94101l(this.f12602c);
                    return;
                case '\t':
                case 21:
                    c5633b.m94121e(Integer.valueOf(Integer.parseInt(this.f12602c)));
                    return;
                case '\r':
                    List m92340a = m92340a(this.f12602c);
                    int size = m92340a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            }
                            c5633b.m94127c((Integer) m92340a.get(2));
                        }
                        c5633b.m94124d((Integer) m92340a.get(1));
                    }
                    c5633b.m94121e((Integer) m92340a.get(0));
                    return;
                case 14:
                    List m92340a2 = m92340a(this.f12602c);
                    int size2 = m92340a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            }
                            c5633b.m94118f((Integer) m92340a2.get(2));
                        }
                        c5633b.m94115g((Integer) m92340a2.get(1));
                    }
                    c5633b.m94112h((Integer) m92340a2.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
