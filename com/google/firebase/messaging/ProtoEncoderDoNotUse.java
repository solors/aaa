package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;
import java.io.OutputStream;

@Encodable
/* loaded from: classes4.dex */
public abstract class ProtoEncoderDoNotUse {

    /* renamed from: a */
    private static final ProtobufEncoder f43227a = ProtobufEncoder.builder().configureWith(AutoProtoEncoderDoNotUseEncoder.CONFIG).build();

    private ProtoEncoderDoNotUse() {
    }

    public static byte[] encode(Object obj) {
        return f43227a.encode(obj);
    }

    public abstract MessagingClientEventExtension getMessagingClientEventExtension();

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        f43227a.encode(obj, outputStream);
    }
}
