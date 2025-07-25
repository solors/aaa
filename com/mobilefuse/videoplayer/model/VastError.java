package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;

/* compiled from: enums.kt */
@Metadata
/* loaded from: classes7.dex */
public enum VastError {
    XML_PARSING_FAILED(100),
    VAST_VALIDATION_FAILED(101),
    URI_UNAVAILABLE_OR_TIMEOUT(301),
    WRAPPER_LIMIT_REACHED(302),
    NO_VAST_RESPONSE(303),
    MEDIAFILE_NOT_FOUND(401),
    MEDIAFILE_TIMEOUT(402),
    MEDIAFILES_UNSUPPORTED(403),
    GENERAL_PLAYBACK_FAILURE(405),
    COMPANION_GENERAL_ERROR(600),
    UNABLE_TO_DISPLAY_REQUIRED_COMPANION(602),
    COMPANION_RESOURCE_LOAD_FAILED(603),
    UNIDENTIFIED(900);
    
    private final int errorCode;

    VastError(int i) {
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
