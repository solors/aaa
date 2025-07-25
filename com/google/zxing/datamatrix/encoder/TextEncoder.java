package com.google.zxing.datamatrix.encoder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class TextEncoder extends C40Encoder {
    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    /* renamed from: b */
    int mo65911b(char c, StringBuilder sb2) {
        if (c == ' ') {
            sb2.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb2.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            sb2.append((char) ((c - 'a') + 14));
            return 1;
        } else if (c < ' ') {
            sb2.append((char) 0);
            sb2.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb2.append((char) 1);
            sb2.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb2.append((char) 1);
            sb2.append((char) ((c - '[') + 22));
            return 2;
        } else if (c == '`') {
            sb2.append((char) 2);
            sb2.append((char) (c - '`'));
            return 2;
        } else if (c >= 'A' && c <= 'Z') {
            sb2.append((char) 2);
            sb2.append((char) ((c - 'A') + 1));
            return 2;
        } else if (c >= '{' && c <= 127) {
            sb2.append((char) 2);
            sb2.append((char) ((c - '{') + 27));
            return 2;
        } else {
            sb2.append("\u0001\u001e");
            return mo65911b((char) (c - 128), sb2) + 2;
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 2;
    }
}
