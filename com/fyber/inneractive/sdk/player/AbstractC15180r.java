package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.external.InneractiveVideoError;

/* renamed from: com.fyber.inneractive.sdk.player.r */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC15180r {

    /* renamed from: a */
    public static final /* synthetic */ int[] f30006a;

    static {
        int[] iArr = new int[InneractiveVideoError.Error.values().length];
        f30006a = iArr;
        try {
            iArr[InneractiveVideoError.Error.ERROR_NO_MEDIA_FILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30006a[InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30006a[InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f30006a[InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f30006a[InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
