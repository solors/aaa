package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.i1 */
/* loaded from: classes4.dex */
public abstract class AbstractC15308i1 {
    /* renamed from: a */
    public static String m76848a(AbstractC15336s abstractC15336s) {
        StringBuilder sb2 = new StringBuilder(abstractC15336s.size());
        for (int i = 0; i < abstractC15336s.size(); i++) {
            byte mo76828c = abstractC15336s.mo76828c(i);
            if (mo76828c != 34) {
                if (mo76828c != 39) {
                    if (mo76828c != 92) {
                        switch (mo76828c) {
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
                                if (mo76828c >= 32 && mo76828c <= 126) {
                                    sb2.append((char) mo76828c);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((mo76828c >>> 6) & 3) + 48));
                                    sb2.append((char) (((mo76828c >>> 3) & 7) + 48));
                                    sb2.append((char) ((mo76828c & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
