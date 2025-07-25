package com.vungle.ads.internal.protos;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: Sdk.java */
/* renamed from: com.vungle.ads.internal.protos.d */
/* loaded from: classes7.dex */
public interface InterfaceC29435d extends MessageLiteOrBuilder {
    long getAt();

    String getConnectionType();

    ByteString getConnectionTypeBytes();

    String getConnectionTypeDetail();

    String getConnectionTypeDetailAndroid();

    ByteString getConnectionTypeDetailAndroidBytes();

    ByteString getConnectionTypeDetailBytes();

    String getCreativeId();

    ByteString getCreativeIdBytes();

    String getEventId();

    ByteString getEventIdBytes();

    long getIsHbPlacement();

    String getMake();

    ByteString getMakeBytes();

    String getMessage();

    ByteString getMessageBytes();

    String getModel();

    ByteString getModelBytes();

    String getOs();

    ByteString getOsBytes();

    String getOsVersion();

    ByteString getOsVersionBytes();

    String getPlacementReferenceId();

    ByteString getPlacementReferenceIdBytes();

    Sdk$SDKError.EnumC29425b getReason();

    int getReasonValue();

    String getSessionId();

    ByteString getSessionIdBytes();
}
