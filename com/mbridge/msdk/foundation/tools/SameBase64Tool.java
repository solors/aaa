package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.foundation.tools.z */
/* loaded from: classes6.dex */
public class SameBase64Tool {

    /* renamed from: a */
    private static final String f57034a = "z";

    /* renamed from: b */
    private static Map<Character, Character> f57035b;

    /* renamed from: c */
    private static Map<Character, Character> f57036c;

    /* renamed from: d */
    private static byte[] f57037d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: e */
    private static char[] f57038e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap hashMap = new HashMap();
        f57035b = hashMap;
        hashMap.put('v', 'A');
        f57035b.put('S', 'B');
        f57035b.put('o', 'C');
        f57035b.put('a', 'D');
        f57035b.put('j', 'E');
        f57035b.put('c', 'F');
        f57035b.put('7', 'G');
        f57035b.put('d', 'H');
        f57035b.put('R', 'I');
        f57035b.put('z', 'J');
        f57035b.put('p', 'K');
        f57035b.put('W', 'L');
        f57035b.put('i', 'M');
        f57035b.put('f', 'N');
        f57035b.put('G', 'O');
        f57035b.put('y', 'P');
        f57035b.put('N', 'Q');
        f57035b.put('x', 'R');
        f57035b.put('Z', 'S');
        f57035b.put('n', 'T');
        f57035b.put('V', 'U');
        f57035b.put('5', 'V');
        f57035b.put('k', 'W');
        f57035b.put('+', 'X');
        f57035b.put('D', 'Y');
        f57035b.put('H', 'Z');
        f57035b.put('L', 'a');
        f57035b.put('Y', 'b');
        f57035b.put('h', 'c');
        f57035b.put('J', 'd');
        f57035b.put('4', 'e');
        f57035b.put('6', 'f');
        f57035b.put('l', 'g');
        f57035b.put('t', 'h');
        f57035b.put('0', 'i');
        f57035b.put('U', 'j');
        f57035b.put('3', 'k');
        f57035b.put('Q', 'l');
        f57035b.put('r', 'm');
        f57035b.put('g', 'n');
        f57035b.put('E', 'o');
        f57035b.put('u', 'p');
        f57035b.put('q', 'q');
        f57035b.put('8', 'r');
        f57035b.put('s', 's');
        f57035b.put('w', 't');
        f57035b.put('/', 'u');
        f57035b.put('X', 'v');
        f57035b.put('M', 'w');
        f57035b.put('e', 'x');
        f57035b.put('B', 'y');
        f57035b.put('A', 'z');
        f57035b.put('T', '0');
        f57035b.put('2', '1');
        f57035b.put('F', '2');
        f57035b.put('b', '3');
        f57035b.put('9', '4');
        f57035b.put('P', '5');
        f57035b.put('1', '6');
        f57035b.put('O', '7');
        f57035b.put('I', '8');
        f57035b.put('K', '9');
        f57035b.put('m', '+');
        f57035b.put('C', '/');
        HashMap hashMap2 = new HashMap();
        f57036c = hashMap2;
        hashMap2.put('A', 'v');
        f57036c.put('B', 'S');
        f57036c.put('C', 'o');
        f57036c.put('D', 'a');
        f57036c.put('E', 'j');
        f57036c.put('F', 'c');
        f57036c.put('G', '7');
        f57036c.put('H', 'd');
        f57036c.put('I', 'R');
        f57036c.put('J', 'z');
        f57036c.put('K', 'p');
        f57036c.put('L', 'W');
        f57036c.put('M', 'i');
        f57036c.put('N', 'f');
        f57036c.put('O', 'G');
        f57036c.put('P', 'y');
        f57036c.put('Q', 'N');
        f57036c.put('R', 'x');
        f57036c.put('S', 'Z');
        f57036c.put('T', 'n');
        f57036c.put('U', 'V');
        f57036c.put('V', '5');
        f57036c.put('W', 'k');
        f57036c.put('X', '+');
        f57036c.put('Y', 'D');
        f57036c.put('Z', 'H');
        f57036c.put('a', 'L');
        f57036c.put('b', 'Y');
        f57036c.put('c', 'h');
        f57036c.put('d', 'J');
        f57036c.put('e', '4');
        f57036c.put('f', '6');
        f57036c.put('g', 'l');
        f57036c.put('h', 't');
        f57036c.put('i', '0');
        f57036c.put('j', 'U');
        f57036c.put('k', '3');
        f57036c.put('l', 'Q');
        f57036c.put('m', 'r');
        f57036c.put('n', 'g');
        f57036c.put('o', 'E');
        f57036c.put('p', 'u');
        f57036c.put('q', 'q');
        f57036c.put('r', '8');
        f57036c.put('s', 's');
        f57036c.put('t', 'w');
        f57036c.put('u', '/');
        f57036c.put('v', 'X');
        f57036c.put('w', 'M');
        f57036c.put('x', 'e');
        f57036c.put('y', 'B');
        f57036c.put('z', 'A');
        f57036c.put('0', 'T');
        f57036c.put('1', '2');
        f57036c.put('2', 'F');
        f57036c.put('3', 'b');
        f57036c.put('4', '9');
        f57036c.put('5', 'P');
        f57036c.put('6', '1');
        f57036c.put('7', 'O');
        f57036c.put('8', 'I');
        f57036c.put('9', 'K');
        f57036c.put('+', 'm');
        f57036c.put('/', 'C');
    }

    private SameBase64Tool() {
    }

    /* renamed from: a */
    public static String m51603a(String str) {
        return SameMVEncoder.m51819a(str);
    }

    /* renamed from: b */
    public static String m51602b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return SameMVEncoder.m51816b(str);
    }
}
