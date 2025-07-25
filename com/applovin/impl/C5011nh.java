package com.applovin.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.InterfaceC5044o2;

/* renamed from: com.applovin.impl.nh */
/* loaded from: classes2.dex */
public class C5011nh extends Exception implements InterfaceC5044o2 {

    /* renamed from: c */
    public static final InterfaceC5044o2.InterfaceC5045a f8585c = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.xz
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return new C5011nh(bundle);
        }
    };

    /* renamed from: a */
    public final int f8586a;

    /* renamed from: b */
    public final long f8587b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5011nh(Bundle bundle) {
        this(bundle.getString(m96967b(2)), m96970a(bundle), bundle.getInt(m96967b(0), 1000), bundle.getLong(m96967b(1), SystemClock.elapsedRealtime()));
    }

    /* renamed from: a */
    public static String m96971a(int i) {
        if (i != 5001) {
            if (i != 5002) {
                switch (i) {
                    case 1000:
                        return "ERROR_CODE_UNSPECIFIED";
                    case 1001:
                        return "ERROR_CODE_REMOTE_ERROR";
                    case 1002:
                        return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    case 1003:
                        return "ERROR_CODE_TIMEOUT";
                    case 1004:
                        return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    default:
                        switch (i) {
                            case 2000:
                                return "ERROR_CODE_IO_UNSPECIFIED";
                            case 2001:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            case 2002:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            case 2003:
                                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            case 2004:
                                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            case 2005:
                                return "ERROR_CODE_IO_FILE_NOT_FOUND";
                            case 2006:
                                return "ERROR_CODE_IO_NO_PERMISSION";
                            case 2007:
                                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            case 2008:
                                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            default:
                                switch (i) {
                                    case 3001:
                                        return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    case 3002:
                                        return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    case 3003:
                                        return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    case 3004:
                                        return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case 4001:
                                                return "ERROR_CODE_DECODER_INIT_FAILED";
                                            case 4002:
                                                return "ERROR_CODE_DECODER_QUERY_FAILED";
                                            case 4003:
                                                return "ERROR_CODE_DECODING_FAILED";
                                            case 4004:
                                                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            case 4005:
                                                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            default:
                                                switch (i) {
                                                    case 6000:
                                                        return "ERROR_CODE_DRM_UNSPECIFIED";
                                                    case 6001:
                                                        return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                    case 6002:
                                                        return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                    case 6003:
                                                        return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                    case 6004:
                                                        return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                    case 6005:
                                                        return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                    case 6006:
                                                        return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                    case 6007:
                                                        return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                    case 6008:
                                                        return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                    default:
                                                        return i >= 1000000 ? "custom error code" : "invalid error code";
                                                }
                                        }
                                }
                        }
                }
            }
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static String m96967b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    private static Throwable m96969a(Class cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    /* renamed from: a */
    private static Throwable m96970a(Bundle bundle) {
        String string = bundle.getString(m96967b(3));
        String string2 = bundle.getString(m96967b(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C5011nh.class.getClassLoader());
            Throwable m96969a = Throwable.class.isAssignableFrom(cls) ? m96969a(cls, string2) : null;
            if (m96969a != null) {
                return m96969a;
            }
        } catch (Throwable unused) {
        }
        return m96968a(string2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C5011nh(String str, Throwable th, int i, long j) {
        super(str, th);
        this.f8586a = i;
        this.f8587b = j;
    }

    /* renamed from: a */
    public final String m96972a() {
        return m96971a(this.f8586a);
    }

    /* renamed from: a */
    private static RemoteException m96968a(String str) {
        return new RemoteException(str);
    }
}
