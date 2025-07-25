package com.explorestack.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFormatEscaper {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface ByteSequence {
        byte byteAt(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    static String escapeBytes(ByteSequence byteSequence) {
        StringBuilder sb2 = new StringBuilder(byteSequence.size());
        for (int i = 0; i < byteSequence.size(); i++) {
            byte byteAt = byteSequence.byteAt(i);
            if (byteAt == 34) {
                sb2.append("\\\"");
            } else if (byteAt == 39) {
                sb2.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb2.append("\\a");
                        continue;
                    case 8:
                        sb2.append("\\b");
                        continue;
                    case 9:
                        sb2.append("\\t");
                        continue;
                    case 10:
                        sb2.append("\\n");
                        continue;
                    case 11:
                        sb2.append("\\v");
                        continue;
                    case 12:
                        sb2.append("\\f");
                        continue;
                    case 13:
                        sb2.append("\\r");
                        continue;
                    default:
                        if (byteAt >= 32 && byteAt <= 126) {
                            sb2.append((char) byteAt);
                            continue;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((byteAt & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeBytes(final ByteString byteString) {
        return escapeBytes(new ByteSequence() { // from class: com.explorestack.protobuf.TextFormatEscaper.1
            @Override // com.explorestack.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return ByteString.this.byteAt(i);
            }

            @Override // com.explorestack.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return ByteString.this.size();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeBytes(final byte[] bArr) {
        return escapeBytes(new ByteSequence() { // from class: com.explorestack.protobuf.TextFormatEscaper.2
            @Override // com.explorestack.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return bArr[i];
            }

            @Override // com.explorestack.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return bArr.length;
            }
        });
    }
}
