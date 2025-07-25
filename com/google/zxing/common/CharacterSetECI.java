package com.google.zxing.common;

import com.google.android.exoplayer2.C15633C;
import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum CharacterSetECI {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, C15633C.ISO88591_NAME),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, StringUtils.GB2312, "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    

    /* renamed from: d */
    private static final Map<Integer, CharacterSetECI> f44347d = new HashMap();

    /* renamed from: f */
    private static final Map<String, CharacterSetECI> f44348f = new HashMap();

    /* renamed from: b */
    private final int[] f44350b;

    /* renamed from: c */
    private final String[] f44351c;

    static {
        CharacterSetECI[] values;
        for (CharacterSetECI characterSetECI : values()) {
            for (int i : characterSetECI.f44350b) {
                f44347d.put(Integer.valueOf(i), characterSetECI);
            }
            f44348f.put(characterSetECI.name(), characterSetECI);
            for (String str : characterSetECI.f44351c) {
                f44348f.put(str, characterSetECI);
            }
        }
    }

    CharacterSetECI(int i) {
        this(new int[]{i}, new String[0]);
    }

    public static CharacterSetECI getCharacterSetECIByName(String str) {
        return f44348f.get(str);
    }

    public static CharacterSetECI getCharacterSetECIByValue(int i) throws FormatException {
        if (i >= 0 && i < 900) {
            return f44347d.get(Integer.valueOf(i));
        }
        throw FormatException.getFormatInstance();
    }

    public int getValue() {
        return this.f44350b[0];
    }

    CharacterSetECI(int i, String... strArr) {
        this.f44350b = new int[]{i};
        this.f44351c = strArr;
    }

    CharacterSetECI(int[] iArr, String... strArr) {
        this.f44350b = iArr;
        this.f44351c = strArr;
    }
}
