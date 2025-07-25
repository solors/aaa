package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.IOException;
import java.io.OutputStream;

@Encodable
/* loaded from: classes4.dex */
public abstract class ProtoEncoderDoNotUse {

    /* renamed from: a */
    private static final ProtobufEncoder f31053a = ProtobufEncoder.builder().configureWith(AutoProtoEncoderDoNotUseEncoder.CONFIG).build();

    private ProtoEncoderDoNotUse() {
    }

    public static byte[] encode(Object obj) {
        return f31053a.encode(obj);
    }

    public abstract ClientMetrics getClientMetrics();

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        f31053a.encode(obj, outputStream);
    }
}
