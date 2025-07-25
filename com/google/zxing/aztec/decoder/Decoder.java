package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.ProxyConfig;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.ironsource.C21114v8;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p552ot.pubsub.p553a.C26485b;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.Arrays;
import net.pubnative.lite.sdk.models.Protocol;

/* loaded from: classes5.dex */
public final class Decoder {

    /* renamed from: b */
    private static final String[] f44189b = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, C26485b.f69244a, "C", "D", ExifInterface.LONGITUDE_EAST, "F", RequestConfiguration.MAX_AD_CONTENT_RATING_G, C26485b.f69245b, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f44190c = {"CTRL_PS", " ", "a", "b", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", "e", InneractiveMediationDefs.GENDER_FEMALE, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", CampaignEx.JSON_KEY_AD_Q, "r", "s", "t", ApsMetricsDataMap.APSMETRICS_FIELD_URL, "v", POBNativeConstants.NATIVE_IMAGE_WIDTH, "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f44191d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", SignedToken.f2767c, "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f44192e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", C21114v8.C21123i.f54135c, "'", "(", ")", ProxyConfig.MATCH_ALL_SCHEMES, "+", ",", "-", ".", RemoteSettings.FORWARD_SLASH_STRING, ":", ";", "<", "=", ">", "?", C21114v8.C21123i.f54137d, C21114v8.C21123i.f54139e, "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f44193f = {"CTRL_PS", " ", "0", "1", "2", "3", Protocol.VAST_1_0_WRAPPER, "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private AztecDetectorResult f44194a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.zxing.aztec.decoder.Decoder$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C177091 {

        /* renamed from: a */
        static final /* synthetic */ int[] f44195a;

        static {
            int[] iArr = new int[Table.values().length];
            f44195a = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44195a[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44195a[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44195a[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44195a[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    static byte[] m66132a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m66126g(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean[] m66131b(boolean[] zArr) throws FormatException {
        int i;
        GenericGF genericGF;
        boolean z;
        boolean z2;
        if (this.f44194a.getNbLayers() <= 2) {
            genericGF = GenericGF.AZTEC_DATA_6;
            i = 6;
        } else {
            i = 8;
            if (this.f44194a.getNbLayers() <= 8) {
                genericGF = GenericGF.AZTEC_DATA_8;
            } else if (this.f44194a.getNbLayers() <= 22) {
                genericGF = GenericGF.AZTEC_DATA_10;
                i = 10;
            } else {
                genericGF = GenericGF.AZTEC_DATA_12;
                i = 12;
            }
        }
        int nbDatablocks = this.f44194a.getNbDatablocks();
        int length = zArr.length / i;
        if (length >= nbDatablocks) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m66125h(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new ReedSolomonDecoder(genericGF).decode(iArr, length - nbDatablocks);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < nbDatablocks; i5++) {
                    int i6 = iArr[i5];
                    if (i6 != 0 && i6 != i3) {
                        if (i6 == 1 || i6 == i3 - 1) {
                            i4++;
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
                boolean[] zArr2 = new boolean[(nbDatablocks * i) - i4];
                int i7 = 0;
                for (int i8 = 0; i8 < nbDatablocks; i8++) {
                    int i9 = iArr[i8];
                    if (i9 != 1 && i9 != i3 - 1) {
                        int i10 = i - 1;
                        while (i10 >= 0) {
                            int i11 = i7 + 1;
                            if (((1 << i10) & i9) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i7] = z2;
                            i10--;
                            i7 = i11;
                        }
                    } else {
                        int i12 = (i7 + i) - 1;
                        if (i9 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i7, i12, z);
                        i7 += i - 1;
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e) {
                throw FormatException.getFormatInstance(e);
            }
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: c */
    private boolean[] m66130c(BitMatrix bitMatrix) {
        int i;
        int i2;
        boolean isCompact = this.f44194a.isCompact();
        int nbLayers = this.f44194a.getNbLayers();
        if (isCompact) {
            i = 11;
        } else {
            i = 14;
        }
        int i3 = i + (nbLayers << 2);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[m66124i(nbLayers, isCompact)];
        int i4 = 2;
        if (isCompact) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) * 2)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < nbLayers) {
            int i12 = (nbLayers - i10) << i4;
            if (isCompact) {
                i2 = 9;
            } else {
                i2 = 12;
            }
            int i13 = i12 + i2;
            int i14 = i10 << 1;
            int i15 = (i3 - 1) - i14;
            int i16 = 0;
            while (i16 < i13) {
                int i17 = i16 << 1;
                int i18 = 0;
                while (i18 < i4) {
                    int i19 = i14 + i18;
                    int i20 = i14 + i16;
                    zArr[i11 + i17 + i18] = bitMatrix.get(iArr[i19], iArr[i20]);
                    int i21 = iArr[i20];
                    int i22 = i15 - i18;
                    boolean z = isCompact;
                    zArr[(i13 * 2) + i11 + i17 + i18] = bitMatrix.get(i21, iArr[i22]);
                    int i23 = iArr[i22];
                    int i24 = i15 - i16;
                    zArr[(i13 * 4) + i11 + i17 + i18] = bitMatrix.get(i23, iArr[i24]);
                    zArr[(i13 * 6) + i11 + i17 + i18] = bitMatrix.get(iArr[i24], iArr[i19]);
                    i18++;
                    nbLayers = nbLayers;
                    isCompact = z;
                    i4 = 2;
                }
                i16++;
                i4 = 2;
            }
            i11 += i13 << 3;
            i10++;
            i4 = 2;
        }
        return zArr;
    }

    /* renamed from: d */
    private static String m66129d(Table table, int i) {
        int i2 = C177091.f44195a[table.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return f44193f[i];
                        }
                        throw new IllegalStateException("Bad table");
                    }
                    return f44192e[i];
                }
                return f44191d[i];
            }
            return f44190c[i];
        }
        return f44189b[i];
    }

    /* renamed from: e */
    private static String m66128e(boolean[] zArr) {
        int i;
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        Table table2 = table;
        int i2 = 0;
        while (i2 < length) {
            if (table == Table.BINARY) {
                if (length - i2 < 5) {
                    break;
                }
                int m66125h = m66125h(zArr, i2, 5);
                i2 += 5;
                if (m66125h == 0) {
                    if (length - i2 < 11) {
                        break;
                    }
                    m66125h = m66125h(zArr, i2, 11) + 31;
                    i2 += 11;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= m66125h) {
                        break;
                    } else if (length - i2 < 8) {
                        i2 = length;
                        break;
                    } else {
                        sb2.append((char) m66125h(zArr, i2, 8));
                        i2 += 8;
                        i3++;
                    }
                }
                table = table2;
            } else {
                if (table == Table.DIGIT) {
                    i = 4;
                } else {
                    i = 5;
                }
                if (length - i2 < i) {
                    break;
                }
                int m66125h2 = m66125h(zArr, i2, i);
                i2 += i;
                String m66129d = m66129d(table, m66125h2);
                if (m66129d.startsWith("CTRL_")) {
                    table2 = m66127f(m66129d.charAt(5));
                    if (m66129d.charAt(6) != 'L') {
                        table2 = table;
                        table = table2;
                    }
                } else {
                    sb2.append(m66129d);
                }
                table = table2;
            }
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private static Table m66127f(char c) {
        if (c != 'B') {
            if (c != 'D') {
                if (c != 'P') {
                    if (c != 'L') {
                        if (c != 'M') {
                            return Table.UPPER;
                        }
                        return Table.MIXED;
                    }
                    return Table.LOWER;
                }
                return Table.PUNCT;
            }
            return Table.DIGIT;
        }
        return Table.BINARY;
    }

    /* renamed from: g */
    private static byte m66126g(boolean[] zArr, int i) {
        int m66125h;
        int length = zArr.length - i;
        if (length >= 8) {
            m66125h = m66125h(zArr, i, 8);
        } else {
            m66125h = m66125h(zArr, i, length) << (8 - length);
        }
        return (byte) m66125h;
    }

    /* renamed from: h */
    private static int m66125h(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return m66128e(zArr);
    }

    /* renamed from: i */
    private static int m66124i(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 88;
        } else {
            i2 = 112;
        }
        return (i2 + (i << 4)) * i;
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
        this.f44194a = aztecDetectorResult;
        boolean[] m66131b = m66131b(m66130c(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(m66132a(m66131b), m66128e(m66131b), null, null);
        decoderResult.setNumBits(m66131b.length);
        return decoderResult;
    }
}
