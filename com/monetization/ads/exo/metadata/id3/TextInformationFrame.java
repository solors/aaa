package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.C31014o3;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.y32;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C25541a();
    @Nullable

    /* renamed from: c */
    public final String f66294c;

    /* renamed from: d */
    public final String f66295d;

    /* renamed from: com.monetization.ads.exo.metadata.id3.TextInformationFrame$a */
    /* loaded from: classes7.dex */
    final class C25541a implements Parcelable.Creator<TextInformationFrame> {
        C25541a() {
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f66294c = str2;
        this.f66295d = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.monetization.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo44375a(mt0.C30881a c30881a) {
        char c;
        String str = this.f66283b;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    c30881a.m31819b(this.f66295d);
                    return;
                case 1:
                case 11:
                    c30881a.m31811d(this.f66295d);
                    return;
                case 2:
                case '\f':
                    c30881a.m31820b(Integer.valueOf(Integer.parseInt(this.f66295d.substring(2, 4)))).m31824a(Integer.valueOf(Integer.parseInt(this.f66295d.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    c30881a.m31815c(this.f66295d);
                    return;
                case 4:
                case 18:
                    c30881a.m31823a(this.f66295d);
                    return;
                case 5:
                case 19:
                    c30881a.m31807e(this.f66295d);
                    return;
                case 6:
                case 20:
                    String str2 = this.f66295d;
                    int i = y32.f88010a;
                    String[] split = str2.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                    c30881a.m31796h(Integer.valueOf(Integer.parseInt(split[0]))).m31800g(split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null);
                    return;
                case 7:
                case 16:
                    c30881a.m31792i(this.f66295d);
                    return;
                case '\b':
                case 15:
                    c30881a.m31789j(this.f66295d);
                    return;
                case '\t':
                case 21:
                    c30881a.m31816c(Integer.valueOf(Integer.parseInt(this.f66295d)));
                    return;
                case '\r':
                    ArrayList m44374a = m44374a(this.f66295d);
                    int size = m44374a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            }
                            c30881a.m31824a((Integer) m44374a.get(2));
                        }
                        c30881a.m31820b((Integer) m44374a.get(1));
                    }
                    c30881a.m31816c((Integer) m44374a.get(0));
                    return;
                case 14:
                    ArrayList m44374a2 = m44374a(this.f66295d);
                    int size2 = m44374a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            }
                            c30881a.m31812d((Integer) m44374a2.get(2));
                        }
                        c30881a.m31808e((Integer) m44374a2.get(1));
                    }
                    c30881a.m31804f((Integer) m44374a2.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (y32.m27076a(this.f66283b, textInformationFrame.f66283b) && y32.m27076a(this.f66294c, textInformationFrame.f66294c) && y32.m27076a(this.f66295d, textInformationFrame.f66295d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int m31189a = C31014o3.m31189a(this.f66283b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f66294c;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (m31189a + i) * 31;
        String str2 = this.f66295d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.monetization.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f66283b + ": description=" + this.f66294c + ": value=" + this.f66295d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66283b);
        parcel.writeString(this.f66294c);
        parcel.writeString(this.f66295d);
    }

    TextInformationFrame(Parcel parcel) {
        super((String) y32.m27077a(parcel.readString()));
        this.f66294c = parcel.readString();
        this.f66295d = (String) y32.m27077a(parcel.readString());
    }

    /* renamed from: a */
    private static ArrayList m44374a(String str) {
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
}
