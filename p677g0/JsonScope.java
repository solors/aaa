package p677g0;

/* renamed from: g0.d */
/* loaded from: classes2.dex */
final class JsonScope {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m24519a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb2.append('.');
                    String str = strArr[i2];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i2]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }
}
