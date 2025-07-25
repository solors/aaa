package com.mbridge.msdk.foundation.same.net.p447e;

import com.mbridge.msdk.foundation.same.net.p443a.CommonError;
import com.mbridge.msdk.foundation.same.net.p446d.C21991a;

/* renamed from: com.mbridge.msdk.foundation.same.net.e.a */
/* loaded from: classes6.dex */
public final class CommonHttpConfig {
    /* renamed from: a */
    public static String m52203a(CommonError commonError) {
        int i;
        if (commonError == null) {
            return "Network error,Load failed";
        }
        try {
            int i2 = commonError.f56579a;
            C21991a c21991a = commonError.f56581c;
            if (c21991a != null) {
                i = c21991a.f56590d;
            } else {
                i = 0;
            }
            if (i2 != -2) {
                if (i2 != 15) {
                    if (i2 != 880023) {
                        if (i2 != 880041) {
                            switch (i2) {
                                case 1:
                                    return "Network error,Load failed";
                                case 2:
                                    return "Network error,I/O exception";
                                case 3:
                                    return "Network error,timeout exception";
                                case 4:
                                    return "Network unknown error";
                                case 5:
                                    return "Network error，https is not work,please check your phone time";
                                case 6:
                                    if (i != 0) {
                                        return "Network error,please check state code " + i;
                                    }
                                    return "Network error,please check ";
                                case 7:
                                    if (i != 0) {
                                        return "The server returns an exception state code " + i;
                                    }
                                    return "The server returns an exception ";
                                case 8:
                                    return "Cast exception, return data can not be casted correctly";
                                default:
                                    switch (i2) {
                                        case 10:
                                            return "Network error,socket timeout exception";
                                        case 11:
                                            return "Network error，sslp exception";
                                        case 12:
                                            return "Network error,ConnectException";
                                        case 13:
                                            if (c21991a != null) {
                                                byte[] bArr = c21991a.f56587a;
                                                if (bArr != null) {
                                                    return new String(bArr);
                                                }
                                                return "Socket exception message is NULL";
                                            }
                                            return "Unknown socket exception";
                                        default:
                                            return "Network error,unknown";
                                    }
                            }
                        }
                        return "Network error,UnknownHostException";
                    }
                    return "timeout";
                }
                return "Network error,I/O exception contents null";
            }
            return "Network is canceled";
        } catch (Exception e) {
            e.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
