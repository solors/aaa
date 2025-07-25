package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class VastException extends Exception {
    private final int mVastErrorCode;
    private short telemetryErrorCode;

    public VastException(int i) {
        this.mVastErrorCode = i;
    }

    private final void convertVastErrorToTelemetryErrorCode() {
        short s;
        int i = this.mVastErrorCode;
        if (i != 100) {
            if (i != 101) {
                if (i != 201) {
                    if (i != 405) {
                        if (i != 900) {
                            if (i != 600) {
                                if (i != 601) {
                                    if (i != 603) {
                                        if (i != 604) {
                                            switch (i) {
                                                case 300:
                                                    s = 63;
                                                    break;
                                                case 301:
                                                    s = 72;
                                                    break;
                                                case 302:
                                                    s = 73;
                                                    break;
                                                case 303:
                                                    s = 74;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 400:
                                                            s = 62;
                                                            break;
                                                        case 401:
                                                            s = 64;
                                                            break;
                                                        case 402:
                                                            s = 65;
                                                            break;
                                                        case 403:
                                                            s = 68;
                                                            break;
                                                        default:
                                                            s = 0;
                                                            break;
                                                    }
                                            }
                                        } else {
                                            s = 67;
                                        }
                                    } else {
                                        s = 60;
                                    }
                                } else {
                                    s = 23;
                                }
                            } else {
                                s = 61;
                            }
                        } else {
                            s = 70;
                        }
                    } else {
                        s = 66;
                    }
                } else {
                    s = 71;
                }
            } else {
                s = 69;
            }
        } else {
            s = 59;
        }
        this.telemetryErrorCode = s;
    }

    public final short getTelemetryErrorCode() {
        convertVastErrorToTelemetryErrorCode();
        return this.telemetryErrorCode;
    }

    public static /* synthetic */ void getTelemetryErrorCode$annotations() {
    }
}
