package com.maticoo.sdk.utils.error;

/* loaded from: classes6.dex */
public interface ErrorCode {
    public static final int CODE_INIT_DEVICE_ERROR = 141;
    public static final int CODE_INIT_INVALID_PARAMS = 112;
    public static final int CODE_INIT_INVALID_REQUEST = 111;
    public static final int CODE_INIT_REQUEST_ERROR = 135;
    public static final int CODE_INIT_RESPONSE_CHECK_ERROR = 132;
    public static final int CODE_INIT_RESPONSE_PARSE_ERROR = 133;
    public static final int CODE_INIT_SERVER_ERROR = 131;
    public static final int CODE_INIT_UNKNOWN_ERROR = 151;
    public static final int CODE_NOT_TRACK_STATUS = 152;
    public static final String MSG_INIT_DEVICE_ERROR = "Init Device Error, Can not obtain aid";
    public static final String MSG_INIT_INVALID_PARAMS = "Init Invalid Params, Params is null or Empty";
    public static final String MSG_INIT_INVALID_REQUEST = "Init Invalid Request, AppKey is Empty";
    public static final String MSG_INIT_REQUEST_ERROR = "Init Request Error: ";
    public static final String MSG_INIT_RESPONSE_CHECK_ERROR = "Init Error: Response data check error";
    public static final String MSG_INIT_RESPONSE_PARSE_ERROR = "Init Error: Response data parse error";
    public static final String MSG_INIT_SERVER_ERROR = "Init Server Error, Response Code: ";
    public static final String MSG_INIT_UNKNOWN_ERROR = "Init Unknown Error: ";
    public static final String MSG_NOT_TRACK_STATUS = "Current user has not authorized data collection.";
}
